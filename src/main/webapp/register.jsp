<%@ page contentType="text/html; charset=UTF-8" language="java" %>
    <html>

    <head>
        <title>Register</title>
    </head>

    <body>
        <h2>Đăng ký tài khoản</h2>

<form action="register" method="post">

            Username: <input type="text" name="username" required><br><br>
            Password: <input type="password" name="password" required><br><br>
            <button type="submit">Đăng ký</button>
        </form>

        <% String error=(String) request.getAttribute("error"); if (error !=null) { %>
            <p style="color:red;">
                <%= error %>
            </p>
            <% } %>

    </body>

    </html>