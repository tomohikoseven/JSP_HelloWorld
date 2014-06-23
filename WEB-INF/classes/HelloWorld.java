public class HelloWorld extends HttpServlet {
    public void doGet(HttpServletRequest request,
                        HttpServletResponse response)
                            throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World!</h1>");
        out.println("</body>");
        out.println("</html>");

        out.close();
    }

    public void doPost(HttpServletRequest request,
                        HttpServletResponse response)
                            throws IOException, ServletException
    {

    }
}