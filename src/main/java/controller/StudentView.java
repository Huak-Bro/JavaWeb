package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/student/list")
public class StudentListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        StudentDAO dao = new StudentDAO();
        List<Student> list = dao.getAllStudents();

        req.setAttribute("students", list);
        req.getRequestDispatcher("/jsp/student-list.jsp").forward(req, resp);
    }
}
