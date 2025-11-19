<%@ page import="java.util.*, model.Student" %>
    <html>

    <head>
        <title>Danh sách sinh viên</title>
    </head>

    <body>
        <h2>Danh sách sinh viên</h2>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Tên</th>
                <th>Email</th>
                <th>Ngành học</th>
            </tr>
            <% List<Student> list = (List<Student>) request.getAttribute("students");
                    for(Student s : list) {
                    %>
                    <tr>
                        <td>
                            <%=s.getId()%>
                        </td>
                        <td>
                            <%=s.getName()%>
                        </td>
                        <td>
                            <%=s.getEmail()%>
                        </td>
                        <td>
                            <%=s.getMajor()%>
                        </td>
                    </tr>
                    <% } %>
        </table>
    </body>

    </html>