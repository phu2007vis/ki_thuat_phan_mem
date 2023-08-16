CREATE TABLE member (
	 id INT(11) PRIMARY KEY,
     userName VARCHAR(45) NOT NULL, 
     passWord VARCHAR(45) NOT NULL, 
     name VARCHAR(45) NOT NULL, 
     phoneNumber VARCHAR(45) NOT NULL, 
     privilege_Id INT(11) NOT NULL
);

CREATE TABLE bank (
	id INT(11) PRIMARY KEY,
    nameBank VARCHAR(45) NOT NULL, 
    address VARCHAR(45) NOT NULL, 
    phoneNumber VARCHAR(45) NOT NULL, 
    taxCode VARCHAR(45) NOT NULL
);

CREATE TABLE project (
    id INT(11) PRIMARY KEY,
    nameProject VARCHAR(45) NOT NULL,
    timeLimit INT(11) NOT NULL, 
    timeSave INT(11) NOT NULL,
    finishStatus VARCHAR(45) NOT NULL
);

CREATE TABLE privilege (
	id INT(11) PRIMARY KEY,
    content VARCHAR(45) NOT NULL
);

CREATE TABLE partner (
	id INT(11) PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    address VARCHAR(45) NOT NULL, 
    phoneNumber VARCHAR(45) NOT NULL
);

CREATE TABLE transaction (
	id INT(11) PRIMARY KEY,
    money INT(11) NOT NULL, 
    timeDisplay VARCHAR(45) NOT NULL,
    content VARCHAR(45) NOT NULL,
    Member_Id INT(11) NOT NULL,

);

CREATE TABLE message (
	id INT(11) PRIMARY KEY,
    idSend INT(11) NOT NULL, 
    idReceive INT(11) NOT NULL, 
    nameProject VARCHAR(45) NOT NULL,
    idProject INT(11) NOT NULL, 
    money INT(11) NOT NULL, 
    content VARCHAR(45) NOT NULL,
    agree VARCHAR(45) NOT NULL
);

CREATE TABLE note (
	id INT(11) PRIMARY KEY,
    head VARCHAR(45) NOT NULL,
    content VARCHAR(45) NOT NULL,
    date VARCHAR(45) NOT NULL, 
    member VARCHAR(45) NOT NULL
);

CREATE TABLE member_has_bank (
	acountBank VARCHAR(45) NOT NULL, 
	Member_Id INT(11) NOT NULL,
    Bank_Id INT(11) NOT NULL,
    money INT(11) NOT NULL, 
    PRIMARY KEY (Member_Id, Bank_Id), 
    FOREIGN KEY (Bank_Id) REFERENCES bank(id), 
    FOREIGN KEY (Member_Id) REFERENCES member(id)
);

ALTER TABLE member
ADD FOREIGN KEY (privilege_Id) REFERENCES privilege(id);

ALTER TABLE transaction
ADD FOREIGN KEY (Member_Id) REFERENCES member(id);

ALTER TABLE transaction
ADD FOREIGN KEY (Project_Id) REFERENCES project(id);

ALTER TABLE transaction
ADD FOREIGN KEY (Partner_Id) REFERENCES partner(id);

-- ALTER TABLE member_has_bank 
-- ADD FOREIGN KEY (Member_Id) REFERENCES member(id);

-- ALTER TABLE member_has_bank 
-- ADD FOREIGN KEY (Bank_Id) REFERENCES bank(id);
