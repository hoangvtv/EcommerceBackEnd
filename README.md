# EcommerceBackEnd
Java, SrpingBoot


Data test file: https://drive.google.com/file/d/1fVPqmlPunRw6_7Lqtaf-BvvWnmloTz1P/view?usp=sharing

Tải file SQL giải nén và tạo database trong mysql sau đó chạy từng file sql trong tệp tải về


Cấu hình file application.properties:
  



## databaseName là data vừa tạo ở trên.. chú ý  đường dẫn đến database
spring.datasource.url=jdbc:mysql://localhost:3306/{{databaseName}}?useSSL=false 

## tài khoản và mất khẩu trong sql-workbech
spring.datasource.username=root
spring.datasource.password=04062001
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true

## tạo server với port 8081
server.port=8081
## Hibernate Properties
# The SQL dialect makes Hebernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
# Hibernate ddl auto (create, create-drop, validate, update, none)
spring.jpa.hibernate.ddl-auto=update
