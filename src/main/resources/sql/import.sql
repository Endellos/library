INSERT INTO book (id, title, author, date_added, date_published, price, signature, section, donated_by, description)
VALUES (1, 'Book Title 1', 'Author 1', '2023-07-21', '2022-12-15', 29.99, 'ABC123', 0,'John Doe', 'This is a sample description for Book 1.');

INSERT INTO book (id, title, author, date_added, date_published, price, signature, section, donated_by, description)
VALUES (2, 'Book Title 2', 'Author 2', '2023-07-21', '2023-03-30', 19.99, 'XYZ456', 0, 'Jane Smith', 'A brief description of Book 2.');

INSERT INTO book (id, title, author, date_added, date_published, price, signature, section, donated_by, description)
VALUES (3, 'Book Title 3', 'Author 3', '2023-07-21', '2021-06-10', 12.99, 'DEF789', 0, 'Anonymous', 'A mysterious book with an unknown author.');


INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (1, 'John', 'Michael', 'Smith', 'Grade 9');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (2, 'Jane', 'Elizabeth', 'Doe', 'Grade 11');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (3, 'Alex', NULL, 'Johnson', 'Grade 7');

INSERT INTO loan (id, book_id, reader_id, loan_date, due_date, returned)
VALUES (1, 1, 2, '2023-07-20', '2023-08-03', 0);

INSERT INTO loan (id, book_id, reader_id, loan_date, due_date, returned)
VALUES (2, 3, 1, '2023-07-21', '2023-08-10', 1);

INSERT INTO loan (id, book_id, reader_id, loan_date, due_date, returned)
VALUES (3, 2, 3, '2023-07-21', '2023-08-05', 0);

-- Add more sample data here as needed





