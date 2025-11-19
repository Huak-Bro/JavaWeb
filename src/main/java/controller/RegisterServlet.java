package controller;

import dao.UserDAO;
import model.User;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.annotation.WebServlet;


import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        UserDAO dao = new UserDAO();

        // kiểm tra username có tồn tại chưa
        if (dao.findByUsername(username) != null) {
            req.setAttribute("error", "Username đã tồn tại!");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
            return;
        }

        User u = new User(username, password);
        if (dao.insert(u)) {
            resp.sendRedirect("login.jsp");
        } else {
            req.setAttribute("error", "Đăng ký thất bại!");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
        }
    }
}
