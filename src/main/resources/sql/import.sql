INSERT INTO book (id, title, author, date_added, date_published, price, signature, section, donated_by, description)
VALUES (1000, 'Книга на приключенията', 'Петър Петров', PARSEDATETIME('2023-07-21', 'yyyy-MM-dd'), 1998, 29.99, 'ABC123', 0, 'Иван Иванов', 'Това е примерно описание за Книга на приключенията.');

INSERT INTO book (id, title, author, date_added, date_published, price, signature, section, donated_by, description)
VALUES (2000, 'Тайният живот на котките', 'Мария Георгиева', PARSEDATETIME('2023-07-21', 'yyyy-MM-dd'), 2000, 19.99, 'XYZ456', 0, 'Петър Петров', 'Кратко описание за Тайният живот на котките.');

INSERT INTO book (id, title, author, date_added, date_published, price, signature, section, donated_by, description)
VALUES (3000, 'Загадъчният замък', 'Елена Андреева', PARSEDATETIME('2023-07-21', 'yyyy-MM-dd'), 2014, 12.99, 'DEF789', 0, 'Ивана Иванова', 'Тайнствена книга с неизвестен автор.');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (1, 'ДИМИТЪР', 'ПЕТРОВ', 'ГЕОРГИЕВ', '12а');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (2, 'МАРИЯ', 'ИВАНОВА', 'ДИМИТРОВА', '10б');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (3, 'ПЕТЪР', NULL, 'ПЕТКОВ', '7в');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (4, 'ИВАН', 'ГЕОРГИЕВ', 'МАРИНОВ', '7а');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (25, 'ГЕОРГИ', 'ИВАНОВ', 'ПЕТРОВ', '12а');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (26, 'МАРИЯ', 'ИВАНОВА', 'ГЕОРГИЕВА', '10б');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (27, 'ИВАН', 'ГЕОРГИЕВ', 'МАРИНОВ', '11в');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (28, 'ЕЛЕНА', 'ПЕТРОВА', 'СТОЯНОВА', '9г');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (29, 'ПЕТЪР', 'ИВАНОВ', 'ГЕОРГИЕВ', '12в');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (30, 'АНА', 'МАРИНОВА', 'ГЕОРГИЕВА', '10а');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (31, 'СТОЯН', 'ПЕТРОВ', 'ИВАНОВ', '11б');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (32, 'МАРИН', 'ГЕОРГИЕВ', 'ПЕТРОВ', '9а');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (33, 'ЕЛИЗАБЕТ', 'СТОЯНОВА', 'МАРИНОВА', '12в');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (34, 'ГЕОРГИНА', 'ЕЛЕНОВА', 'ИВАНОВА', '10г');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (35, 'ИВАНА', 'ГЕОРГИЕВА', 'ПЕТРОВА', '11г');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (36, 'ПЕТЯ', 'ИВАНОВА', 'ГЕОРГИЕВА', '9а');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (37, 'МАРИНА', 'ПЕТРОВА', 'СТОЯНОВА', '12а');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (38, 'СТОЯНА', 'ИВАНОВА', 'ГЕОРГИЕВА', '10б');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (39, 'ГЕОРГИ', 'МАРИНОВ', 'ПЕТРОВ', '11б');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (40, 'ЕЛЕН', 'ГЕОРГИЕВ', 'СТОЯНОВ', '9а');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (41, 'ИВАН', 'ПЕТРОВ', 'ИВАНОВ', '12г');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (42, 'ЕЛЕНА', 'МАРИНОВА', 'ГЕОРГИЕВА', '10а');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (43, 'ПЕТЪР', 'ГЕОРГИЕВ', 'ПЕТРОВ', '11а');

INSERT INTO reader (id, first_name, middle_name, last_name, klass)
VALUES (44, 'МАРИЯ', 'ПЕТРОВА', 'ИВАНОВА', '9в');

INSERT INTO loan (id, book_id, reader_id, loan_date, due_date, returned)
VALUES (1, 1000, 2, PARSEDATETIME('2023-07-20', 'yyyy-MM-dd'), PARSEDATETIME('2023-08-03', 'yyyy-MM-dd'), 0);

INSERT INTO loan (id, book_id, reader_id, loan_date, due_date, returned)
VALUES (2, 3000, 1, PARSEDATETIME('2023-07-21', 'yyyy-MM-dd'), PARSEDATETIME('2023-08-10', 'yyyy-MM-dd'), 1);

INSERT INTO loan (id, book_id, reader_id, loan_date, due_date, returned)
VALUES (3, 2000, 3, PARSEDATETIME('2023-07-21', 'yyyy-MM-dd'), PARSEDATETIME('2023-08-05', 'yyyy-MM-dd'), 0);







