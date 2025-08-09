// Select elements
const ip = document.getElementById('taskInput');
const btn = document.getElementById('add');
const todolist = document.getElementById('list');

// Add task on button click
btn.addEventListener('click', function () {
    const taskText = ip.value.trim();
    
    if (taskText === "") {
        alert("Please enter the task");
        return;
    }
    
    // Create list item
    const taskItem = document.createElement('li');
    taskItem.textContent = taskText;
    
    // Toggle done on click
    taskItem.addEventListener('click', function () {
        taskItem.classList.toggle('done');
    });
    
    // Add to list
    todolist.appendChild(taskItem);
    
    // Clear input
    ip.value = "";
});
