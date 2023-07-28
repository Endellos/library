const bookIdInput = document.getElementById('bookId');
const bookNameP = document.getElementById('bookName');



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
 readerNameInput.addEventListener('input', async function(event)
 {
     const typedValue = event.target.value;

     // Check if the typed value has at least 3 characters
     if (typedValue.length >= 3) {

         try {
             tbody.innerHTML = '';
             const response = await fetch(`/api/reader?name=${typedValue}`);
             const data = await response.json();

            data.forEach((reader) =>{
                const row = tbody.insertRow();
                const firstNameCell = row.insertCell(0);
                const middleNameCell = row.insertCell(1);
                const lastNameCell = row.insertCell(2);
                const klassNameCell = row.insertCell();

                // Set the cell values
                firstNameCell.textContent = reader.firstName;
                middleNameCell.textContent = reader.middleName
                lastNameCell.textContent = reader.lastName;
                klassNameCell.textContent = reader.klass;
            })
             readerTable.style.display = 'block';
         }
         catch (error){}
     }
     else {readerTable.style.display = 'none';}
 })
