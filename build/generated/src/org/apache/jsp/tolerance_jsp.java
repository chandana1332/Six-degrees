package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sixdegrees.model.showallposts;
import com.sixdegrees.model.getdetails;
import java.io.*;
import java.sql.*;

public final class tolerance_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<!--\n");
      out.write("\tPrologue 1.2 by HTML5 UP\n");
      out.write("\thtml5up.net | @n33co\n");
      out.write("\tFree for personal and commercial use under the CCA 3.0 license (html5up.net/license)\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Home</title>\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t\t<meta name=\"description\" content=\"\" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\" />\n");
      out.write("\t\t<link href=\"http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t\t<!--[if lte IE 8]><script src=\"js/html5shiv.js\"></script><![endif]-->\n");
      out.write("\t\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/skel.min.js\">{\n");
      out.write("      prefix: \"profile/css/style\",\n");
      out.write("      breakpoints: {\n");
      out.write("        wide: { range: \"1200-\", containers: 1140, grid: { gutters: 40 } },\n");
      out.write("        narrow: { range: \"481-1199\", containers: 960 },\n");
      out.write("        mobile: { range: \"-480\", containers: \"fluid\", lockViewport: true, grid: { collapse: true } }\n");
      out.write("      }\n");
      out.write("    }</script>\n");
      out.write("\t\t<script src=\"js/skel-panels.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/init.js\"></script>\n");
      out.write("\t\t<noscript>\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/skel-noscript.css\" />\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/style-wide.css\" />\n");
      out.write("\t\t</noscript>\n");
      out.write("\t\t<!--[if lte IE 9]><link rel=\"stylesheet\" href=\"css/ie9.css\" /><![endif]-->\n");
      out.write("\t\t<!--[if lte IE 8]><link rel=\"stylesheet\" href=\"css/ie8.css\" /><![endif]-->\n");
      out.write("                <script language=\"javascript\">\n");
      out.write("        function checkFormValidator()\n");
      out.write(" \t{\n");
      out.write(" \t\tvar p1=document.forms[\"changetolerance\"][\"tolerance\"].value;\n");
      out.write("                if(p1==null || p1==\"\" || p2==null || p2==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Tolerance fields can not be left blank\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                \n");
      out.write("          }\n");
      out.write("        </script>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("            ");
String d1=null,d2=null,u1=null,u2=null;
            String name=(String)session.getAttribute("username");
            System.out.println(name);
            ResultSet rs=getdetails.get(name);
            while(rs.next())
            {
                d1=rs.getString(1);
                d2=rs.getString(2);
                System.out.println(d1+d2);
            }
            u1=d1.toUpperCase();
            u2=d2.toUpperCase();
            
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- Header -->\n");
      out.write("\t\t\t<div id=\"header\" class=\"skel-panels-fixed\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"top\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Logo -->\n");
      out.write("\t\t\t\t\t\t<div id=\"logo\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"image avatar48\"><img src=\"images/avatar.jpg\" alt=\"\" /></span>\n");
      out.write("                                                        <a href=\"myprofile.jsp\"><h1 id=\"title\">");
      out.print(u1);
      out.write(' ');
      out.print(u2);
      out.write("</h1></a>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"byline\">");
      out.print(name);
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Nav -->\n");
      out.write("\t\t\t\t\t\t<nav id=\"nav\">\n");
      out.write("\t\t\t\t\t\t\t<!--\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\tPrologue's nav expects links in one of two formats:\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t1. Hash link (scrolls to a different section within the page)\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t   <li><a href=\"#foobar\" id=\"foobar-link\" class=\"skel-panels-ignoreHref\"><span class=\"fa fa-whatever-icon-you-want\">Foobar</span></a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t2. Standard link (sends the user to another page/site)\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t   <li><a href=\"http://foobar.tld\"><span class=\"fa fa-whatever-icon-you-want\">Foobar</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t-->\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"userhome.jsp\" id=\"top-link\" class=\"skel-panels-ignoreHref\"><span class=\"fa fa-home\">Home</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"myprofile.jsp\" id=\"about-link\" class=\"skel-panels-ignoreHref\"><span class=\"fa fa-user\">My Profile</span></a></li>\n");
      out.write("                                                                <li><a href=\"showfriends.jsp?name=");
      out.print(name);
      out.write("\" id=\"portfolio-link\" class=\"skel-panels-ignoreHref\"><span class=\"fa fa-th\">Friends</span></a></li>\n");
      out.write("                                                                <li><a href=\"showrequests.jsp\" id=\"about-link\" class=\"skel-panels-ignoreHref\"><span class=\"fa fa-user\">Friend Requests</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"editprofile.jsp\" id=\"contact-link\" class=\"skel-panels-ignoreHref\"><span class=\"fa fa-envelope\">Edit Profile</span></a></li>\n");
      out.write("                                                                <li><form action=\"showresult.jsp\"><input type=\"text\" name=\"name\"/><input type=\"submit\" value=\"SEARCH\"/></form></li>\n");
      out.write("                                                                <li><a href=\"viewblocked.jsp\" id=\"portfolio-link\" class=\"skel-panels-ignoreHref\"><span class=\"fa fa-th\">Block History</span></a></li>\n");
      out.write("                                                                <li><a href=\"login.jsp\" id=\"contact-link\" class=\"skel-panels-ignoreHref\"><span class=\"fa fa-envelope\">Log Out</span></a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"bottom\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Social Icons -->\n");
      out.write("\t\t\t\t\t\t<ul class=\"icons\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"fa fa-twitter solo\"><span>Twitter</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"fa fa-facebook solo\"><span>Facebook</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"fa fa-github solo\"><span>Github</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"fa fa-dribbble solo\"><span>Dribbble</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"fa fa-envelope solo\"><span>Email</span></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Main -->\n");
      out.write("\t\t\t<div id=\"main\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<!-- Intro -->\n");
      out.write("\t\t\t\t\t<section id=\"top\" class=\"one\">\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<a href=\"http://ineedchemicalx.deviantart.com/art/Moonscape-381829905\" class=\"image featured\"><img src=\"images/pic01.jpg\" alt=\"\" /></a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<header>\n");
      out.write("                                                            <center>\n");
      out.write("\t\t\t\t\t\t\t\t<h2 class=\"alt\"><strong>Edit tolerance Level</strong></h2>\n");
      out.write("                                                            </center>\n");
      out.write("\t\t\t\t\t\t\t</header>\n");
      out.write("                                                        <form name=\"changetolerance\" action=\"tolerance\"  method=\"post\" onsubmit=\"return checkFormValidator()\">\n");
      out.write("\n");
      out.write(" <center>\n");
      out.write("                                        \n");
      out.write("                                        <br/>\n");
      out.write("                                        <br/>\n");
      out.write("                                        \n");
      out.write("                                    \n");
      out.write("\n");
      out.write("    <font face=\"Arial\" size=\"+1.5\">tolerance</font><br/><br/>\n");
      out.write("           <input type=\"text\" name=\"tolerance\"/><br/><br/>\n");
      out.write("        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                          ");
  
   name=(String)session.getAttribute("username");
   
      out.write("\n");
      out.write("    <input type=\"text\" name=\"name\" value=\"");
      out.print(name);
      out.write("\"  style=\"display:none;\"/>\n");
      out.write("                                    \n");
      out.write("                                        \n");
      out.write("<br/>\n");
      out.write("                                        <input type=\"submit\" value=\"SUBMIT\"/>\n");
      out.write("<br/>\n");
      out.write("<input type=\"reset\" value=\"RESET\"/>\n");
      out.write("    </center> \n");
      out.write("            </form>\n");
      out.write("                                                \n");
      out.write("\n");
      out.write("                                                                                                  \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</section>\n");
      out.write("                        </div>\n");
      out.write("\t\t<!-- Footer -->\n");
      out.write("\t\t\t<div id=\"footer\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Copyright -->\n");
      out.write("\t\t\t\t\t<div class=\"copyright\">\n");
      out.write("\t\t\t\t\t\t<p>&copy; 2014 SixDegrees. All rights reserved.</p>\n");
      out.write("\t\t\t\t\t\t<ul class=\"menu\">\n");
      out.write("\t\t\t\t\t\t\t<li>Design: <a href=\"http://html5up.net\">HTML5 UP</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li>Images: <a href=\"http://ineedchemicalx.deviantart.com\">Felicia Simion</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
