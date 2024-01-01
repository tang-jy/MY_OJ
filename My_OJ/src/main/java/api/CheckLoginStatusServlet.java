package  api;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/CheckLoginStatusServlet")
public class CheckLoginStatusServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应内容类型为文本
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");

        // 获取 HttpSession 对象
        HttpSession session = request.getSession(false);

        // 检查 session 是否存在且是否有用户信息
        if (session != null && session.getAttribute("username") != null) {
            // 用户已登录
            System.out.println("login");
            response.getWriter().write("loggedIn");
        } else {
            // 用户未登录
            System.out.println("wrong name");
            response.getWriter().write("notLoggedIn");
        }
    }
}
