create table Citizen(
    CID INTEGER AUTO_INCREMENT NOT NULL,
    firstName VARCHAR(50) NOT NULL ,
    surname varchar(50) NOT NULL ,
    DoB DATE NOT NULL ,
    SSN VARCHAR(11) NOT NULL ,
    phoneNr VARCHAR(8) NOT NULL ,
    email VARCHAR(50) NOT NULL ,
    city VARCHAR(50) NOT NULL,
    street VARCHAR(50) NOT NULL,
    PRIMARY KEY (CID)

);