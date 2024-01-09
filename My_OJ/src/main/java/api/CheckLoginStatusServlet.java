package  api;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/CheckLoginStatusServlet")
public class CheckLoginStatusServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应内容类型为文本
        System.out.println("已经开始运行check");
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");

        // 获取 HttpSession 对象
        HttpSession session = request.getSession(false);

        // 检查 session 是否存在且是否有用户信息
        if (session != null && session.getAttribute("username") != null) {
            String username = (String) session.getAttribute("username");
            // 返回JSON响应，包含登录状态和用户名
            response.getWriter().write("{\"status\":\"loggedIn\", \"username\":\"" + username + "\"}");
        } else {
            response.getWriter().write("{\"status\":\"notLoggedIn\"}");
        }
    }
}
