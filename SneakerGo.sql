
CREATE DATABASE SneakerGo;

USE SneakerGo;

CREATE TABLE Account (
  accountID NVARCHAR(255) NOT NULL ,
  password NVARCHAR(255),
  name  NVARCHAR(255),
  address   NVARCHAR(255),
  birthday  DATE,
  phone     VARCHAR(20),
  email     VARCHAR(255),
  role      VARCHAR(20),
  enabled   BIT,
  PRIMARY KEY (accountId)
);

CREATE TABLE Attribute(
attributeID INT NOT NULL AUTO_INCREMENT,
size		VARCHAR(30),
PRIMARY KEY (attributeID)
);

CREATE TABLE Stock(
stockID INT NOT NULL AUTO_INCREMENT,
attributeID INT,
productID	INT,
quantity	INT,
enabled     BIT,
PRIMARY KEY (stockID)
);

CREATE TABLE Product (
  productID   INT NOT NULL AUTO_INCREMENT,
  productName NVARCHAR(255),
  price       VARCHAR(255),
  picture     VARCHAR(255),
  nation      NVARCHAR(100),
  description NVARCHAR(255),
  enabled     BIT,
  PRIMARY KEY (productID)
);

CREATE TABLE Bill (
  billID     INT NOT NULL AUTO_INCREMENT,
  accountID NVARCHAR(255),
  totalPrice VARCHAR(255),
  date       DATE,
  enabled    BIT,
  PRIMARY KEY (billId)
);

CREATE TABLE BillDetail (
  billDetailID INT NOT NULL AUTO_INCREMENT,
  billID       INT,
  stockID    INT,
  quantity     INT,
  price     VARCHAR(255),
  PRIMARY KEY (billDetailID)
);


CREATE TABLE Sale (
  saleID      INT NOT NULL AUTO_INCREMENT,
  productID   INT,
  salePercent INT,
  fromDate    DATE,
  toDate      DATE,
  enabled     BIT,
  PRIMARY KEY (saleID)
);

CREATE TABLE Import (
  importID        INT NOT NULL AUTO_INCREMENT,
  stockID  	      INT,
  price			  NVARCHAR(255),
  quantity		  INT,
  importDate      DATE,
  Supplier        NVARCHAR(255),
  PRIMARY KEY (importID)
);

ALTER TABLE Bill
  ADD FOREIGN KEY (accountID) REFERENCES Account (accountID);

ALTER TABLE BillDetail
  ADD FOREIGN KEY (billID) REFERENCES Bill (billID);

ALTER TABLE BillDetail
  ADD FOREIGN KEY (stockID) REFERENCES Stock (stockID);

ALTER TABLE Import
ADD FOREIGN KEY (stockID) REFERENCES Stock(stockID);
  
ALTER TABLE Stock
ADD FOREIGN KEY (attributeID) REFERENCES Attribute(attributeID);

ALTER TABLE Stock
ADD FOREIGN KEY (productID) REFERENCES Product(productID);

INSERT INTO Account (accountID, password,name,address,birthday, phone, email, role, enabled)
VALUES ('hungmc', '$2a$06$GuAywy4wXpX5GwH8mHv3wu/iyILUGOW0n4oScztdewpd5L3iP3vmK','Hung Akai',
        'Ho Chi Minh City','1995-10-17', '+84946469554', 'hungmc@sneaker.com', 'ROLE_ADMIN', 1);
        
INSERT INTO Account (accountID, password,name,address,birthday, phone, email, role, enabled)
VALUES ('kietta', '$2a$06$GuAywy4wXpX5GwH8mHv3wu/iyILUGOW0n4oScztdewpd5L3iP3vmK','Tran Anh Kiet',
        'Ho Chi Minh City','1995-10-17', '+84946469554', 'kietta@sneaker.com', 'ROLE_USER', 1);
        
INSERT INTO Account (accountID, password,name,address,birthday, phone, email, role, enabled)
VALUES ('trungtq', '$2a$06$GuAywy4wXpX5GwH8mHv3wu/iyILUGOW0n4oScztdewpd5L3iP3vmK','Tran Quang Trung',
        'Ho Chi Minh City','1995-10-17', '+84946469554', 'trungtq@sneaker.com', 'ROLE_USER', 1);

INSERT INTO Product (productName,price,picture,nation,description,enabled) 
VALUES ('Nike Flynit','1000',NULL,'China','',1);

INSERT INTO Product (productName,price,picture,nation,description,enabled) 
VALUES ('Nike Air Force','1200',NULL,'VietNam','',1);  

INSERT INTO Product (productName,price,picture,nation,description,enabled) 
VALUES ('Nike Air Max','1800',NULL,'USA','',1);  

INSERT INTO Product (productName,price,picture,nation,description,enabled) 
VALUES ('Nike Air Zoom','1600',NULL,'VietNam','',1);  

INSERT INTO Product (productName,price,picture,nation,description,enabled) 
VALUES ('Nike Air Huarache','1500',NULL,'China','',1); 

INSERT INTO Attribute(size) 
VALUES ('0');   
INSERT INTO Attribute(size) 
VALUES ('3');   
INSERT INTO Attribute(size) 
VALUES ('5');   
INSERT INTO Attribute(size) 
VALUES ('6');   
INSERT INTO Attribute(size) 
VALUES ('7');   
INSERT INTO Attribute(size) 
VALUES ('8');   
INSERT INTO Attribute(size) 
VALUES ('9');   
INSERT INTO Attribute(size) 
VALUES ('10');   
INSERT INTO Attribute(size) 
VALUES ('11');   


 INSERT INTO Stock(attributeID,productID,quantity,enabled) 
VALUES (4,1,10,1); 

INSERT INTO Stock(attributeID,productID,quantity,enabled) 
VALUES (1,3,0,1);  

INSERT INTO Stock(attributeID,productID,quantity,enabled) 
VALUES (2,4,30,1);

INSERT INTO Stock(attributeID,productID,quantity,enabled) 
VALUES (2,5,10,1);

INSERT INTO Stock(attributeID,productID,quantity,enabled) 
VALUES (5,1,10,1);


INSERT INTO Bill(accountID,totalPrice,date,enabled) 
VALUES ('kietta','2500','2016-11-20',1);

INSERT INTO Bill(accountID,totalPrice,date,enabled) 
VALUES ('trungtq','4000','2016-11-14',1);

INSERT INTO Bill(accountID,totalPrice,date,enabled) 
VALUES ('kietta','3100','2016-10-18',1);

INSERT INTO Bill(accountID,totalPrice,date,enabled) 
VALUES ('kietta','3000','2016-10-16',1);

INSERT INTO Bill(accountID,totalPrice,date,enabled) 
VALUES ('trungtq','3400','2016-11-20',1);

INSERT INTO BillDetail(billID,stockID,quantity,price) 
VALUES (1,1,1,'1000');

INSERT INTO BillDetail(billID,stockID,quantity,price) 
VALUES (1,5,1,'1500');

INSERT INTO BillDetail(billID,stockID,quantity,price) 
VALUES (2,5,2,'3000');

INSERT INTO BillDetail(billID,stockID,quantity,price) 
VALUES (2,1,2,'1000');

INSERT INTO BillDetail(billID,stockID,quantity,price) 
VALUES (3,4,1,'1600');

INSERT INTO BillDetail(billID,stockID,quantity,price) 
VALUES (3,5,1,'1500');

INSERT INTO BillDetail(billID,stockID,quantity,price) 
VALUES (4,5,2,'1600');

INSERT INTO BillDetail(billID,stockID,quantity,price) 
VALUES (5,3,1,'1800');

INSERT INTO BillDetail(billID,stockID,quantity,price) 
VALUES (5,4,1,'1600');

INSERT INTO Sale(productID,salePercent,fromDate,toDate,enabled) 
VALUES (1,10,'2016-11-30','2016-12-28',1);

INSERT INTO Sale(productID,salePercent,fromDate,toDate,enabled) 
VALUES (1,15,'2016-12-10','2016-12-28',1);

INSERT INTO Sale(productID,salePercent,fromDate,toDate,enabled) 
VALUES (2,20,'2016-12-10','2016-12-28',1);

INSERT INTO Sale(productID,salePercent,fromDate,toDate,enabled) 
VALUES (3,40,'2016-12-25','2016-12-28',1);

INSERT INTO Sale(productID,salePercent,fromDate,toDate,enabled) 
VALUES (4,15,'2016-12-10','2016-12-25',1);


INSERT INTO Import(stockID,price,quantity,importDate,Supplier) 
VALUES (1,'20000','25','2016-10-25','Nike Distribution');

INSERT INTO Import(stockID,price,quantity,importDate,Supplier) 
VALUES (1,'10000','15','2016-11-15','Brand Distribution');

INSERT INTO Import(stockID,price,quantity,importDate,Supplier) 
VALUES (2,'20000','10','2016-10-25','Morgana Company');

INSERT INTO Import(stockID,price,quantity,importDate,Supplier) 
VALUES (3,'16000','5','2016-10-16','Ahri Company');

INSERT INTO Import(stockID,price,quantity,importDate,Supplier) 
VALUES (4,'14000','6','2016-10-18','Veigar Distribution');