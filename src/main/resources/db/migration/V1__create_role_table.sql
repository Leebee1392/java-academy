create table role (
    id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
    roleName varchar(100) NOT NULL,
    location varchar(100) NOT NULL,
    capability varchar(100) NOT NULL,
    band varchar(100) NOT NULL,
    closingDate DATE NOT NULL,
    status varchar(10) NOT NULL
);

INSERT INTO role (`roleName`, `location`, `capability`, `band`, `closingDate`, `status`)
VALUES
	('Sales Engineer','Homeworker - USA ', 'Workday', 'Associate', '2025-01-01', 'open'),
	('Software Engineer', 'Birmingham ', 'Engineering', 'Trainee', '2025-02-01', 'open'),
	('Software Engineer', 'Derry ', 'Engineering', 'Lead', '2025-01-01', 'closed'),
	('Lead Platform Engineer', 'London ', 'Platform', 'Consultant', '2025-02-01', 'open');