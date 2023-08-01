const bookIdInput = document.getElementById('bookId');
const tbody = document.querySelector("tbody");

let loanId
bookIdInput.addEventListener('input', async function(event) {
    // Get the typed value from the input field
    const typedValue = event.target.value;

    // Check if the typed value has at least 3 characters
    if (typedValue.length >= 3) {
        try {
            tbody.innerHTML = '';
            // Make a fetch call to the API endpoint
            const response = await fetch(`/api/loans?bookId=${typedValue}`);
            const data = await response.json();
            if (data){
                const row = tbody.insertRow();
                const book = row.insertCell(0);
                const reader = row.insertCell(1);
                const returnBtn = row.insertCell(2);
                loanId = data.id;
                book.textContent = data.book.title;
                if (data.reader.middleName==null){
                    data.reader.middleName='';
                }
                reader.textContent = data.reader.firstName + " " + data.reader.middleName + " " + data.reader.lastName;
                returnBtn.innerHTML = "     <button type=\"button\" class=\"btn btn-primary\" id=\'returnBtn\'>\n" +
                    "           <i class=\"bi bi-journal-check\"></i>\n" +
                    "                Върни \n" +
                    "              </button>"
            }

        } catch (error) {
        console.log(error);
        }

    }
});

//return book

    tbody.addEventListener("click", async function(event){
        if (event.target.matches('#returnBtn') || event.target.matches('.bi')){
                try{
            const response = await fetch(`api/loans/${loanId}`, {
                method: 'PATCH',

            });
            if (response.ok){
                bookIdInput.value='';
                tbody.innerHTML = '';
                showAlert('Успех! Книгата е върната успешно!', 'alert-success');
            }
            else {showAlert('Грешка!', 'alert-danger');}

        }
        catch (error){
            showAlert('Грешка!', 'alert-danger');
            console.log(error);
        }
        }



    })


function showAlert(message, className) {
    // Show the alert with the specified message and class
    alertMessage.textContent = message;
    alertMessage.classList.add(className);
    alertMessage.style.display = 'block';

    // Hide the alert after 5 seconds
    setTimeout(() => {
        alertMessage.style.display = 'none';
        alertMessage.classList.remove(className);
    }, 5000); // Adjust the duration as needed
}
