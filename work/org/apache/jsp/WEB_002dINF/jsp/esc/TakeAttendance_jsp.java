/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.64
 * Generated at: 2015-09-04 08:31:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.Date;
import edu.scit.ssd2015.attendance.Course;
import edu.scit.ssd2015.attendance.Attendance;
import edu.scit.ssd2015.attendance.User;

public final class TakeAttendance_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 int courseID = Integer.valueOf(request.getAttribute("courseID").toString()); 
      out.write('\r');
      out.write('\n');
 Course course = Course.getCourseByID(courseID); 
      out.write('\r');
      out.write('\n');
 ArrayList<User> students = course.getStudent(); 
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("        <title>Take Attendance</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Take attendance</h1>\r\n");
      out.write("        <h2>Subject Name:");
      out.print( course.getCourseName() );
      out.write("</h2>\r\n");
      out.write("        <form action=\"CreateAttendance\" method=\"post\">\r\n");
      out.write("        <input type=\"hidden\" name=\"attendanceDate\" value=\"");
      out.print( request.getAttribute("attendanceDate").toString() );
      out.write("\">\r\n");
      out.write("        <input type=\"hidden\" name=\"courseID\" value=\"");
      out.print( courseID );
      out.write("\">\r\n");
       
for (User student: students) {
	System.out.println("Nam:" + student.getName());
	out.println("<p><input type='checkbox' name='students' value='" + student.getID() +
	"' checked>" + student.getName() + "</input></p>");
}
 
      out.write("\r\n");
      out.write(" \t\t<input type=\"submit\" name=\"Submit\">\r\n");
      out.write(" \t\t<input type=\"reset\" name=\"Reset\">\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
