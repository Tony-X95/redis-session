package simple;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {


        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;


        request.getSession().setAttribute("testKey", "742981086@qq.com");
       
        //设置session失效时间单位为(s)，优先级最高。还可以在web.xml和web服务器中设置失效时间，优先级一次递减
        //session在tomcat重启后不会失效，关闭浏览器后，session失效
        request.getSession().setMaxInactiveInterval(60);

        response.sendRedirect(request.getContextPath() + "/session");
        
    }

}
