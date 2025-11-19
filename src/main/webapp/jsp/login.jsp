<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Đăng nhập</h2>
    <form action="login" method="post">   <!-- login = tên Mapping của Servlet -->
        Username: <input type="text" name="username" /><br><br>
        Password: <input type="password" name="password" /><br><br>
        <button type="submit">Login</button>
    </form>
</body>
</html>
>