// ---- Select DOM elements ----
const taskInput = document.getElementById("taskinput");
const addBtn = document.getElementById("addbtn");
const taskList = document.querySelector("#task-list ul");

// ---- Load tasks from local storage on page load ----
document.addEventListener("DOMContentLoaded", loadTasks);

// ---- Add task on button click ----
addBtn.addEventListener("click", addTask);

// ---- Add task on Enter key ----
taskInput.addEventListener("keypress", function(e) {
    if (e.key === "Enter") {
        addTask();
    }
});

function addTask() {
    const taskText = taskInput.value.trim();
    if (taskText === "") {
        alert("Please enter a task");
        return;
    }
    createTaskElement(taskText);
    saveTaskToLocal(taskText); 
    taskInput.value = "";  
}

// ---- Create Task Element ----
function createTaskElement(taskText, completed = false) {
    const li = document.createElement("li");
    li.textContent = taskText;

    if (completed) li.classList.add("completed");

    // Toggle Complete
    li.addEventListener("click", () => {
        li.classList.toggle("completed");
        updateTaskStatus(taskText, li.classList.contains("completed"));
    });

    // Delete Button
    const deleteBtn = document.createElement("button");
    deleteBtn.textContent = "Delete";
    deleteBtn.classList.add("delete-btn");
    deleteBtn.addEventListener("click", (e) => {
        e.stopPropagation(); // Prevent toggle
        li.remove();
        removeTaskFromLocal(taskText);
    });

    li.appendChild(deleteBtn);
    taskList.appendChild(li);
}

// ---- Save Task to Local Storage ----
function saveTaskToLocal(taskText) {
    let tasks = JSON.parse(localStorage.getItem("tasks")) || [];
    tasks.push({ text: taskText, completed: false });
    localStorage.setItem("tasks", JSON.stringify(tasks));
}

// ---- Load Tasks ----
function loadTasks() {
    let tasks = JSON.parse(localStorage.getItem("tasks")) || [];
    tasks.forEach(task => {
        createTaskElement(task.text, task.completed);
    });
}

// ---- Remove Task ----
function removeTaskFromLocal(taskText) {
    let tasks = JSON.parse(localStorage.getItem("tasks")) || [];
    tasks = tasks.filter(task => task.text !== taskText);
    localStorage.setItem("tasks", JSON.stringify(tasks));
}

// ---- Update Task Completion ----
function updateTaskStatus(taskText, completed) {
    let tasks = JSON.parse(localStorage.getItem("tasks")) || [];
    tasks = tasks.map(task => 
        task.text === taskText ? { ...task, completed } : task
    );
    localStorage.setItem("tasks", JSON.stringify(tasks));
}
