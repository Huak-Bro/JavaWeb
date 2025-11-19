package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        System.out.println(">>> Username: " + user + ", Password: " + pass);

        if ("admin".equals(user) && "123".equals(pass)) {
            System.out.println(">>> Đăng nhập thành công");
            response.sendRedirect("http://localhost:8080/study/welcome.jsp");
        } else {
            System.out.println(">>> Sai tài khoản hoặc mật khẩu");
            response.sendRedirect("http://localhost:8080/study/login.jsp?error=1");
        }
    }
}


