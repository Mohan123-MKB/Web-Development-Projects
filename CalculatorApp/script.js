let ip = document.getElementById('ipbox');
let btns = document.querySelectorAll('button');
let string = "";

btns.forEach(button => {
    button.addEventListener('click', (e) => {
        let value = e.target.innerHTML;

        if (value === '=') {
            try {
                string = eval(string); // evaluate expression
                ip.value = string;
            } catch {
                ip.value = "Error";
                string = "";
            }
        } 
        else if (value === 'AC') {
            string = "";
            ip.value = string;
        } 
        else if (value === 'DEL') {
            string = string.substring(0, string.length - 1);
            ip.value = string;
        } 
        else {
            string += value;
            ip.value = string;
        }
    });
});
