um leitor pode pegar varios livros - o livro so pode pertencer a um leitor
um empresto pertence a um leior e um livro

create table leitor(
nome varchar(100) not null,
id_leitor int auto_increment primary key,
telefone varchar(11) not null,
email varchar(100) not null
);

CREATE TABLE emprestimos (
    id_emprestimo INT AUTO_INCREMENT PRIMARY KEY, 
    status VARCHAR(100) NOT NULL,
    data_emprestimo DATE NOT NULL, 
    data_devolucao DATE NOT NULL
);

create table livro(
id_livro int auto_increment primary key,
nome_livro VARCHAR(100) NOT NULL
);


alter table emprestimos
add id_livro int not null;

alter table emprestimos 
add foreign key (id_leitor)
references leitor (id_leitor);

alter table emprestimos 
add foreign key (id_livro)
references livro (id_livro);

INSERT INTO leitor (id_leitor, nome, telefone, email)
VALUES (001, "João Silva", "11912345678", "joao.silva@email.com"),
(002, "Maria Oliveira", "11923456789", "maria.oliveira@email.com"),
(003, "Carlos Souza", "11934567890", "carlos.souza@email.com"),
(004, "Ana Pereira", "11945678901", "ana.pereira@email.com"),
(005, "Lucas Santos", "11956789012", "lucas.santos@email.com");

INSERT INTO livro (id_livro, nome_livro)
VALUES
(101, "Dom Casmurro"),
(102, "O Pequeno Príncipe"),
(103, "A Revolução dos Bichos"),
(104, "Capitães da Areia"),
(105, "Memórias Póstumas de Brás Cubas");

INSERT INTO Emprestimos (id_leitor, id_livro, status, data_emprestimo, data_devolucao)
VALUES
(2, 105, 'emprestado', '2024-03-01', '2024-03-10'),
(2, 102, 'emprestado', '2024-03-03', '2024-03-12'),
(1, 103, 'devolvido',  '2024-02-20', '2024-02-28'),
(4, 104, 'emprestado', '2024-03-05', '2024-03-14'),
(3, 105, 'atrasado',   '2024-02-15', '2024-02-25'),
(3, 101, 'emprestado', '2024-03-07', '2024-03-16'),
(2, 103, 'devolvido',  '2024-02-10', '2024-02-18'),
(5, 104, 'emprestado', '2024-03-08', '2024-03-17');
UPDATE Leitor
SET telefone = '16999999999',
    email = 'leitor@email.com'
WHERE id_leitor = 1;
DELETE FROM Emprestimos
WHERE id_emprestimo = 5;
DELETE FROM Leitor
WHERE id_leitor = 3
AND id_leitor NOT IN (
    SELECT id_leitor FROM Emprestimos
);
DELETE FROM Livro
WHERE id_livro = 4
AND id_livro NOT IN (
    SELECT id_livro FROM Emprestimos
);
SELECT * 
FROM Leitor;
SELECT *
FROM Livro;
SELECT *
FROM Emprestimos;

SELECT 
    Leitor.nome,
    Livro.nome_livro,
    Emprestimos.data_emprestimo,
    Emprestimos.status
FROM Emprestimos
JOIN Leitor ON Emprestimos.id_leitor = Leitor.id_leitor
JOIN Livro ON Emprestimos.id_livro = Livro.id_livro;
SELECT *
FROM Emprestimos
WHERE status = 'emprestado';