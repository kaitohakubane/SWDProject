
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

CREATE TABLE Product (
  productID   INT NOT NULL IDENTITY,
  productName NVARCHAR(255),
  price       VARCHAR(255),
  picture     VARCHAR(255),
  size        NVARCHAR(50),
  color       NVARCHAR(100),
  nation      NVARCHAR(100),
  description NVARCHAR(255),
  quantity    INT,
  type        VARCHAR(100),
  enabled     BIT,
  PRIMARY KEY (productID)
);

CREATE TABLE Bill (
  billID     INT NOT NULL IDENTITY,
  accountID NVARCHAR(255),
  totalPrice VARCHAR(255),
  date       DATE,
  status     VARCHAR(80),
  enabled    BIT,
  PRIMARY KEY (billId)
);

CREATE TABLE BillDetail (
  billID       INT,
  productID    INT,
  quantity     INT,
  price     VARCHAR(255),
  PRIMARY KEY (billID,productID)
);

CREATE TABLE SaleProduct (
  saleID      INT NOT NULL IDENTITY,
  productID   INT,
  PRIMARY KEY (saleID,productID)
);

CREATE TABLE Sale (
  saleID      INT NOT NULL IDENTITY,
  salePercent INT,
  fromDate    DATE,
  toDate      DATE,
  enabled     BIT,
  PRIMARY KEY (saleID)
);

CREATE TABLE Import (
  importID        INT NOT NULL IDENTITY,
  importDate      DATE,
  Supplier        NVARCHAR(255),
  PRIMARY KEY (importID)
);

CREATE TABLE ImportDetail (
  importID       INT NOT NULL IDENTITY,
  productID      INT,
  price          NVARCHAR(255),
  quantity	 INT,
  PRIMARY KEY (importID,ProductID)
);


ALTER TABLE Bill
  ADD FOREIGN KEY (accountID) REFERENCES Account (accountID);

ALTER TABLE BillDetail
  ADD FOREIGN KEY (billID) REFERENCES Bill (billID);

ALTER TABLE BillDetail
  ADD FOREIGN KEY (productId) REFERENCES Product (productId);

ALTER TABLE SaleProduct
  ADD FOREIGN KEY (saleID) REFERENCES Sale (saleID);

ALTER TABLE SaleProduct
  ADD FOREIGN KEY (productID) REFERENCES Product (productID);

ALTER TABLE ImportDetail
  ADD FOREIGN KEY (productID) REFERENCES Product (productID);
  

ALTER TABLE ImportDetail
  ADD FOREIGN KEY (importID) REFERENCES Import (importID);