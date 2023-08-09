const searchInput = document.getElementById("searchInput");


document.addEventListener('DOMContentLoaded', fetchAll);

searchInput.addEventListener('input', async function(event) {
    const typedValue = event.target.value;
    const readerTableBody = document.getElementById('readerTableBody');
    readerTableBody.innerHTML = ''; // Clear the table body on each input change

    if (typedValue.length >= 3) {
        try {
            const response = await fetch(`/api/readers?name=${typedValue}`);
            const data = await response.json();

            data.forEach((reader) => {
                const row = readerTableBody.insertRow();
                const firstNameCell = row.insertCell(0);
                const middleNameCell = row.insertCell(1);
                const lastNameCell = row.insertCell(2);
                const klassNameCell = row.insertCell(3);


                row.addEventListener('click', () => {
                    window.location.href = `/readers/${reader.id}`; // Navigate to the reader's details page
                });

                // Add CSS class to indicate the row is clickable

                // Set the cell values
                row.id = reader.id
                firstNameCell.textContent = reader.firstName;
                middleNameCell.textContent = reader.middleName;
                lastNameCell.textContent = reader.lastName;
                klassNameCell.textContent = reader.klass;
            });
        } catch (error) {
            console.log(error);
        }
    }
    else {
        fetchAll();
        }

})


async function fetchAll() {
    try {
        const response = await fetch(`/api/readers/all`);
        const data = await response.json();

        data.forEach((reader) => {
            const row = readerTableBody.insertRow();
            const firstNameCell = row.insertCell(0);
            const middleNameCell = row.insertCell(1);
            const lastNameCell = row.insertCell(2);
            const klassNameCell = row.insertCell(3);


            row.addEventListener('click', () => {
                window.location.href = `/readers/${reader.id}`; // Navigate to the reader's details page
            });

            // Add CSS class to indicate the row is clickable

            // Set the cell values
            firstNameCell.textContent = reader.firstName;
            middleNameCell.textContent = reader.middleName;
            lastNameCell.textContent = reader.lastName;
            klassNameCell.textContent = reader.klass;
        });
    } catch (error) {
        console.log(error);
    }
}
