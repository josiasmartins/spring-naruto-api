CREATE TABLE USUARIO (
    ID INTEGER KEY AUTO_INCREMENT,
    LOGIN VARCHAR(50) NOT NULL,
    SENHA VARCHAR(255) NOT NULL,
    ADMIN BOOL DEFAULT FALSE
);