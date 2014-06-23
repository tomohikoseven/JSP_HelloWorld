import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Sample1 extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{

    response.setContentType("text/html; charset=Shift_JIS");
    PrintWriter out = response.getWriter();

    out.println(createHTML("GET"));

    out.close();
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{

    response.setContentType("text/html; charset=Shift_JIS");
    PrintWriter out = response.getWriter();

    out.println(createHTML("POST"));

    out.close();
  }

  protected String createHTML(String methodType){
    StringBuffer sb = new StringBuffer();

    sb.append("<html>");
    sb.append("<head>");
    sb.append("<title>�T���v��</title>");
    sb.append("</head>");
    sb.append("<body>");

    sb.append("<p>");
    sb.append(methodType);
    sb.append("���\�b�h�ł�т�����܂����B</p>");

    sb.append("<p><a href=\"/sample/Sample1\">�����N</a></p>");

    sb.append("<form action=\"/sample/Sample1\" method=\"get\">");
    sb.append("<input type=\"submit\" value=\"GET�ő��M\">");
    sb.append("</form>");

    sb.append("<form action=\"/sample/Sample1\" method=\"post\">");
    sb.append("<input type=\"submit\" value=\"POST�ő��M\">");
    sb.append("</form>");

    sb.append("</body>");
    sb.append("</html>");

    return (new String(sb));
  }
}