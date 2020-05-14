DROP TABLE CarsTable;

CREATE TABLE CarsTable
(
	CarID INT NOT NULL GENERATED ALWAYS AS IDENTITY,
	CarMake VARCHAR (10) NOT NULL,
	CarModel VARCHAR (15) NOT NULL,
	CarYear VARCHAR (4) NOT NULL,
	CarMileage DECIMAL (6) NOT NULL
);

INSERT INTO CarsTable (CarMake,CarModel,CarYear,CarMileage) 
VALUES  ('Honda','Civic','1998',135647),
        ('Honda','Accord','2009',46877),
	('Nissan','Pickup','1997',235444),
        ('Toyota','4Runner','1998',221076),
        ('Volkswagon','Golf','2015',112087);