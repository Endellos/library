INSERT INTO book (id, title, author, date_added, date_published, price, signature, section, donated_by, description)
VALUES (1000, 'Книга на приключенията', 'Петър Петров', PARSEDATETIME('2023-07-21', 'yyyy-MM-dd'), 1998, 29.99, 'ABC123', 0, 'Иван Иванов', 'Това е примерно описание за Книга на приключенията.');

INSERT INTO book (id, title, author, date_added, date_published, price, signature, section, donated_by, description)
VALUES (2000, 'Тайният живот на котките', 'Мария Георгиева', PARSEDATETIME('2023-07-21', 'yyyy-MM-dd'), 2000, 19.99, 'XYZ456', 0, 'Петър Петров', 'Кратко описание за Тайният живот на котките.');

INSERT INTO book (id, title, author, date_added, date_published, price, signature, section, donated_by, description)
VALUES (3000, 'Загадъчният замък', 'Елена Андреева', PARSEDATETIME('2023-07-21', 'yyyy-MM-dd'), 2014, 12.99, 'DEF789', 0, 'Ивана Иванова', 'Тайнствена книга с неизвестен автор.');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'ДИМИТЪР', 'ПЕТРОВ', 'ГЕОРГИЕВ', '12а');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'МАРИЯ', 'ИВАНОВА', 'ДИМИТРОВА', '10б');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'ПЕТЪР', NULL, 'ПЕТКОВ', '7в');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'ИВАН', 'ГЕОРГИЕВ', 'МАРИНОВ', '7а');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'ГЕОРГИ', 'ИВАНОВ', 'ПЕТРОВ', '12а');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'МАРИЯ', 'ИВАНОВА', 'ГЕОРГИЕВА', '10б');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'ИВАН', 'ГЕОРГИЕВ', 'МАРИНОВ', '11в');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'ЕЛЕНА', 'ПЕТРОВА', 'СТОЯНОВА', '9г');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'ПЕТЪР', 'ИВАНОВ', 'ГЕОРГИЕВ', '12в');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'АНА', 'МАРИНОВА', 'ГЕОРГИЕВА', '10а');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'СТОЯН', 'ПЕТРОВ', 'ИВАНОВ', '11б');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'МАРИН', 'ГЕОРГИЕВ', 'ПЕТРОВ', '9а');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'ЕЛИЗАБЕТ', 'СТОЯНОВА', 'МАРИНОВА', '12в');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'ГЕОРГИНА', 'ЕЛЕНОВА', 'ИВАНОВА', '10г');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'ИВАНА', 'ГЕОРГИЕВА', 'ПЕТРОВА', '11г');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'ПЕТЯ', 'ИВАНОВА', 'ГЕОРГИЕВА', '9а');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'МАРИНА', 'ПЕТРОВА', 'СТОЯНОВА', '12а');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'СТОЯНА', 'ИВАНОВА', 'ГЕОРГИЕВА', '10б');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'ГЕОРГИ', 'МАРИНОВ', 'ПЕТРОВ', '11б');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'ЕЛЕН', 'ГЕОРГИЕВ', 'СТОЯНОВ', '9а');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'ИВАН', 'ПЕТРОВ', 'ИВАНОВ', '12г');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'ЕЛЕНА', 'МАРИНОВА', 'ГЕОРГИЕВА', '10а');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'ПЕТЪР', 'ГЕОРГИЕВ', 'ПЕТРОВ', '11а');

INSERT INTO reader (  first_name, middle_name, last_name, klass)
VALUES (  'МАРИЯ', 'ПЕТРОВА', 'ИВАНОВА', '9в');


--
-- INSERT INTO loan ( book_id, reader_id, loan_date, due_date, returned)
-- VALUES ( 1000, 2, PARSEDATETIME('2023-07-20', 'yyyy-MM-dd'), PARSEDATETIME('2023-08-03', 'yyyy-MM-dd'), 0);

INSERT INTO loan ( book_id, reader_id, loan_date, due_date, returned)
VALUES ( 3000, 1, PARSEDATETIME('2023-07-21', 'yyyy-MM-dd'), PARSEDATETIME('2023-08-10', 'yyyy-MM-dd'), 1);

INSERT INTO loan ( book_id, reader_id, loan_date, due_date, returned)
VALUES ( 2000, 3, PARSEDATETIME('2023-07-21', 'yyyy-MM-dd'), PARSEDATETIME('2023-08-05', 'yyyy-MM-dd'), 0);

--
--
--



