create table product(id int auto_increment primary key,
name varchar(100) not null,
price int not null);

/* ユーザーマスタ */
CREATE TABLE IF NOT EXISTS m_user (
    user_id VARCHAR(50) PRIMARY KEY,
    password VARCHAR(100),
    user_name VARCHAR(50),
    birthday DATE,
    age INT,
    marriage BOOLEAN,
    role VARCHAR(50)
);