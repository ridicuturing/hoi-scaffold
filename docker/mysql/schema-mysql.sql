create database chat;
CREATE USER 'chat'@'%' IDENTIFIED WITH mysql_native_password BY 'stAvCeUPHMmR7ojU';
GRANT ALL PRIVILEGES ON *.* TO 'chat'@'%';
FLUSH PRIVILEGES;