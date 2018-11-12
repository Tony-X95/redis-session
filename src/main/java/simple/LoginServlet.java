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
       
        //����sessionʧЧʱ�䵥λΪ(s)�����ȼ���ߡ���������web.xml��web������������ʧЧʱ�䣬���ȼ�һ�εݼ�
        //session��tomcat�����󲻻�ʧЧ���ر��������sessionʧЧ
        request.getSession().setMaxInactiveInterval(60);

        response.sendRedirect(request.getContextPath() + "/session");
        
    }

}
