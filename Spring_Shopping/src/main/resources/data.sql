insert into product values(null,'まぐろ',100);

/* ユーザーマスタのデータ（ADMIN権限） */
INSERT INTO m_user (user_id, password, user_name, birthday, age, marriage, role)
VALUES('yamada@xxx.co.jp', 'password', '山田太郎', '1990-01-01', 28, false, 'ROLE_ADMIN');