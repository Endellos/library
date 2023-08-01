const bookIdInput = document.getElementById('bookId');
const bookNameP = document.getElementById('bookName');
const form  = document.getElementById("form");


//GET bookName
bookIdInput.addEventListener('input', async function(event) {
    // Get the typed value from the input field
    const typedValue = event.target.value;

    // Check if the typed value has at least 3 characters
    if (typedValue.length >= 3) {
        try {
            // Make a fetch call to the API endpoint
            const response = await fetch(`/api/books?id=${typedValue}`);
            const data = await response.json();
            bookNameP.textContent = data.title;
            bookNameP.style.display = 'block';
        } catch (error) {
            bookNameP.style.display = 'none';
        }

    }
});


//GET reader
    //Name search
const readerNameInput = document.getElementById('readerName');
const readerTable = document.getElementById('readerTable');
const tbody = document.querySelector("#readerTable tbody");

let selectedRowId = null;

 readerNameInput.addEventListener('input', async function(event)
 {
     const typedValue = event.target.value;

     // Check if the typed value has at least 3 characters
     if (typedValue.length >= 3) {

         try {
             tbody.innerHTML = '';
             const response = await fetch(`/api/readers?name=${typedValue}`);
             const data = await response.json();

            data.forEach((reader) =>{
                const row = tbody.insertRow();
                const firstNameCell = row.insertCell(0);
                const middleNameCell = row.insertCell(1);
                const lastNameCell = row.insertCell(2);
                const klassNameCell = row.insertCell();

                // Set the cell values
                row.id = reader.id;
                firstNameCell.textContent = reader.firstName;
                middleNameCell.textContent = reader.middleName
                lastNameCell.textContent = reader.lastName;
                klassNameCell.textContent = reader.klass;
                row.addEventListener('click', () => selectRow(row, reader.id));
            })
             readerTable.style.display = 'block';
         }
         catch (error){}
     }
     else {readerTable.style.display = 'none';}
 });

function selectRow(row, id) {
    // If the same row is clicked again, deselect it
    if (selectedRowId === id) {
        row.classList.remove('selected');
        selectedRowId = null;
    } else {
        // Deselect the previously selected row, if any
        const previouslySelectedRow = document.querySelector(`tr[id="${selectedRowId}"]`);
        if (previouslySelectedRow) {
            previouslySelectedRow.classList.remove('selected');
        }

        // Select the clicked row
        row.classList.add('selected');
        selectedRowId = id;
        console.log(selectedRowId)
    }
}

//submitting the form


const submitBtn = document.getElementById("submit");
const dueDate = document.getElementById("dueDate");
const alertMessage = document.getElementById('alertMessage');


submitBtn.addEventListener('click', async function(event){
    if (bookIdInput.value && selectedRowId && dueDate.value){

        try {


        const data = {
            bookId: bookIdInput.value,
            readerId: selectedRowId,
            dueDate: dueDate.value
        };
        const response =  await fetch('/api/loans', {
            method: 'POST', // Set the HTTP method to POST
            headers: {
                'Content-Type': 'application/json', // Set the content type to JSON

            },
            body: JSON.stringify(data), // Convert the data to JSON and set it as the request body
        });
        if (response.ok){
            showAlert('Успех! Книгата е заета успешно!', 'alert-success');
            form.reset();
            bookNameP.style.display="none";
            readerTable.style.display="none";
            selectedRowId = null;
        }
        else {showAlert('Грешка! Книгата вече е заета!', 'alert-danger');
            form.reset();
            bookNameP.style.display="none";
            readerTable.style.display="none";
            selectedRowId = null;
        }

        }

        catch (error){
            showAlert('Грешка! Книгата вече е заета!', 'alert-danger');
            console.log(error);

        }

    }

    }

)


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


