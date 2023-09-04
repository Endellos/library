// Your fetch call to populate reader and loan information
fetch('/api/readers/{id}') // Replace with the actual endpoint
    .then(response => response.json())
    .then(data => {
        const readerDetails = document.getElementById('readerDetails');
        const loanList = document.getElementById('loanList');

        // Populate reader information
        readerDetails.innerHTML = `
                    <p>Име: ${data.firstName} ${data.middleName || ''} ${data.lastName}</p>
                    <p>Клас: ${data.klass}</p>
                    <!-- Add more reader details as needed -->
                `;
        //
        // // Populate loan information
        // data.loans.forEach(loan => {
        //     const row = document.createElement('tr');
        //     row.innerHTML = `
        //                 <td>${loan.bookTitle}</td>
        //                 <td>${loan.loanDate}</td>
        //                 <td>${loan.dueDate}</td>
        //                 <td>${loan.returned ? 'Да' : 'Не'}</td>
        //             `;
        //     loanList.appendChild(row);
        // });
    })
    .catch(error => {
        console.error('Error:', error);
    });
