/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.64
 * Generated at: 2015-09-04 08:42:17 UTC
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
import edu.scit.ssd2015.attendance.Subject;
import edu.scit.ssd2015.attendance.Division;

public final class ViewCourse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

Course course;
int courseID;
int divisionID;
int subjectID;
if (request.getAttribute("courseID") != null) {
	courseID = Integer.valueOf(request.getAttribute("courseID").toString());
	course = Course.getCourseByID(courseID);
} else {
	divisionID = Integer.valueOf(request.getAttribute("divisionID").toString());
	subjectID = Integer.valueOf(request.getAttribute("subjectID").toString());
	course = Course.getCourseByIDs(divisionID, subjectID);
	courseID = course.getCourseID();
}
ArrayList<Attendance> attendances = Attendance.getAttendanceByCourseID(courseID); 
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Course Information</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1>Course - ");
      out.print( course.getSubject().getName() );
      out.write('\n');
      out.write(':');
      out.write(' ');
      out.print( course.getDivision().getName() );
      out.write(" </h1>\n");

if (attendances.isEmpty()) {
	out.println("<h4>No attendance has taken yet.</h4>");
} else {
	out.println("<ul>");
	for (Attendance attendance: attendances) {
    	String attendanceID = String.valueOf(attendance.getAttendanceID());
   		Date attendanceDate = attendance.getAttendanceDate();
    	String option = "<li><a href='/TestTomcat/ViewAttendance?attendanceID=" + attendanceID + "'>" + attendanceDate.toString() + "</a></li>";
    	out.println(option);
	}
	out.println("</ul>");
}

      out.write("\n");
      out.write("<h4>Take New Attendance</h4>\n");
      out.write("\n");
      out.write("<form action=\"TakeAttendance\" method=\"get\">\n");
      out.write("<input type=\"date\" name=\"attendanceDate\">\n");
      out.write("<input type=\"hidden\" name=\"courseID\" value=\"");
      out.print( courseID );
      out.write("\">\n");
      out.write("<input type=\"submit\" value=\"Take New Attendance\" />\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body>\n");
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
