const addReaderForm = document.getElementById('addReaderForm');
const firstNameInput = document.getElementById('firstName');
const middleNameInput = document.getElementById('middleName');
const lastNameInput = document.getElementById('lastName');
const klassInput = document.getElementById('klass');
const addButton = document.getElementById('addBtn');

// TODO:add validation and prevent submitting empty forms
addButton.addEventListener('click', async function(ev) {
    ev.preventDefault();

    const data = {
        firstName: firstNameInput.value,
        middleName: middleNameInput.value,
        lastName: lastNameInput.value,
        klass: klassInput.value
    };

    try {
        const response = await fetch('/api/readers/add', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        });

        if (response.ok) {
            // Handle successful response
            showAlert('Успех! Читателят е добавен успешно!', 'alert-success');
            addReaderForm.reset(); // Reset the form fields after successful submission
        } else {
            // Handle error response
            showAlert('Грешка! Грешка при добавяне на читател!', 'alert-danger');
        }
    } catch (error) {
        // Handle fetch error
        showAlert('Грешка! Грешка при изпращане на заявка!', 'alert-danger');
        console.error(error);
    }
});

function showAlert(message, alertType) {
    const alertDiv = document.createElement('div');
    alertDiv.className = `alert ${alertType}`;
    alertDiv.textContent = message;
    document.body.appendChild(alertDiv);
    setTimeout(() => {
        alertDiv.remove();
    }, 3000);
}
