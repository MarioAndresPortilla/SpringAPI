
CREATE TABLE weapon (
  id INT AUTO_INCREMENT NOT NULL ,
  name varchar(255) DEFAULT NULL,
  description varchar(255) DEFAULT NULL,
  price INT DEFAULT 0.0,
  status varchar(20) DEFAULT 'available',
  PRIMARY KEY (id)
);

