CREATE TABLE Student (
    ID INT NOT NULL GENERATED ALWAYS AS IDENTITY,
    StudentID INT NOT NULL,
    FirstName varchar (20) NOT NULL,
    LastName varchar (30) NOT NULL,
    Email varchar (50),
    PhoneNumber varchar(12),
    PRIMARY KEY (ID)
);