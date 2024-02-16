-- @block
CREATE TABLE IF NOT EXISTS Dipendenti (
	ID INT AUTO_INCREMENT PRIMARY KEY,
	Nome VARCHAR(255) NOT NULL,
	Cognome VARCHAR(255) NOT NULL,
	Stipendio INT,
	Reparto VARCHAR(255)
);

-- @block 
DROP TABLE Dipendenti;

-- @block
INSERT INTO Dipendenti (Nome, Cognome, Stipendio, Reparto)
VALUES ('Mario', 'Rossi', 50000.00, 'Amministrazione'),
       ('Anna', 'Verdi', 60000.00, 'Vendite'),
       ('Giuseppe', 'Bianchi', 70000.00, 'Management');

SELECT * FROM Dipendenti;

-- @block
UPDATE Dipendenti SET
Stipendio = Stipendio / 100 * 10;

-- @block
DELETE FROM Dipendenti WHERE ID = 1;

-- @block
--6a
SELECT * FROM Dipendenti WHERE Stipendio >= 55000;
--6b
SELECT * FROM Dipendenti WHERE Stipendio >= 55000 AND Reparto = "Management";
--6c
SELECT * FROM Dipendenti WHERE Reparto = "Management" OR Reparto = "Vendite";

-- @block
--7a
SELECT * FROM Dipendenti ORDER BY Stipendio DESC;
--7b
SELECT * FROM Dipendenti WHERE Reparto = "Management" OR Reparto = "Vendite" ORDER BY Stipendio ASC;

-- @block
--8a
SELECT COUNT(*) FROM Dipendenti;
--8b
SELECT AVG(Stipendio) FROM Dipendenti;
--8c
SELECT MAX(Stipendio) FROM Dipendenti;

-- @block
SELECT * FROM Dipendenti;

-- @block
CREATE TABLE IF NOT EXISTS Progetti (
	P_ID INT AUTO_INCREMENT PRIMARY KEY,
	tipoProgetto VARCHAR(255)
);

-- @block
DROP TABLE Progetti;

-- @block
SELECT * FROM progetti;

-- @block
INSERT INTO progetti (tipoProgetto)
VALUES
	("Progetto grandissimo"),
	("Progettino piccolo");

-- @block
ALTER TABLE dipendenti
ADD P_ID INT,
ADD FOREIGN KEY (P_ID) REFERENCES Progetti(P_ID);

-- @block

UPDATE dipendenti 
SET P_ID = SELECT P_ID WHERE tipoProgetto = "Progetto grandissimo"
WHERE Nome = "Mario";

-- @block
UPDATE dipendenti
SET Tipo_Progetto = SELECT ID FROM Progetti WHERE tipoProgetto = "Progettino piccolo"
WHERE P_ID = NULL;