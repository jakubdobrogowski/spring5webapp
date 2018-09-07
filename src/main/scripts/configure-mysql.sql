## Use to run mysql db docker image, optional if you're not using a local mysqldb
# docker run --name usermySQL -p 3306:3306 -e MYSQL_ROOT_PASSWORD=1771 -d mysql:5.7

# connect to mysql and run as root user
#Create Databases
CREATE DATABASE user_data;

#Create database service accounts
CREATE USER 'userdata'@'%'
  IDENTIFIED BY 'userdata';

#Database grants
GRANT SELECT ON user_data.* to 'userdata'@'%';
GRANT INSERT ON user_data.* to 'userdata'@'%';
GRANT DELETE ON user_data.* to 'userdata'@'%';
GRANT UPDATE ON user_data.* to 'userdata'@'%';