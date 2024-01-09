package  api;
// AddProblemServlet.java
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.ProblemDAO;
import dao.Problem;
@WebServlet("/AddProblemServlet")
public class AddProblemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String level = request.getParameter("level");
        String codeTest = request.getParameter("codeTest");
        String codeTemplate = request.getParameter("codeTemplate");
        // 将题目添加到数据库的逻辑
        ProblemDAO.insert(new Problem(title,level, description,codeTest,codeTemplate));

        response.setContentType("text/html");
        response.getWriter().write("Problem added successfully");
    }
}
