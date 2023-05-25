/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-25 04:04:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Adm.CreateSkin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CreateSkin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Skins</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CreateSkin.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("            <div id=\"header-up\">\r\n");
      out.write("                <a href=\"http://localhost:8080/\" class=\"logo-ancora\" id=\"\"><img class=\"\" id=\"logo-navbar\" src=\"images/logo.png\" alt=\"logo\"></a>\r\n");
      out.write("                <a href=\"http://localhost:8080/\" class=\"logo-ancora\" id=\"\"><h2 id=\"titulo-header\">Visão Administrativa</h2></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <nav class=\"nav_links\">\r\n");
      out.write("                <div class=\"nav_link\">\r\n");
      out.write("                    <a href=\"../CreateAgent/CreateAgent.jsp\"><img id=\"agent-icon\" class=\"icon\" src=\"images/agent-icon.png\">Agentes</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"nav_link\">\r\n");
      out.write("                    <a href= \"../CreateWeapon/CreateWeapon.jsp\" ><img id=\"weapon-icon\" class=\"icon\" src=\"images/weapon-icon.png\">Armas</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"nav_link\">\r\n");
      out.write("                    <a href=\"../CreateMap/CreateMap.jsp\"><img id=\"map-icon\" class=\"icon\" src=\"images/map-icon.png\">Mapas</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"nav_link\">\r\n");
      out.write("                    <a href=\"../CreateSkin/CreateSkin.jsp\"><img id=\"skin-icon\" class=\"icon\" src=\"images/skin-icon.jpg\">Skins</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <div id=\"header-down\">\r\n");
      out.write("            <a href=\"../../User/Home-User/index.jsp\" id=\"ancora-button\"><button id=\"button_logout\" class=\"button\">LOG OUT</button></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("    <div id=\"form-create-skin\">\r\n");
      out.write("        <form action=\"/create-skin\" method=\"post\">\r\n");
      out.write("            <label>Name</label>\r\n");
      out.write("            <input type=\"text\" name=\"skin-name\" id=\"skin-name\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Season</label>\r\n");
      out.write("                <input type=\"number\" name=\"skin-season\" id=\"skin-season\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Act</label>\r\n");
      out.write("                <input type=\"number\" name=\"skin-act\" id=\"skin-act\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Date</label>\r\n");
      out.write("                <input type=\"date\" name=\"skin-date\" id=\"skin-date\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Price</label>\r\n");
      out.write("                <input type=\"number\" name=\"skin-price\" id=\"skin-price\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Recolors</label>\r\n");
      out.write("                <input type=\"number\" name=\"skin-recolors\" id=\"skin-recolors\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Path</label>\r\n");
      out.write("                    <input type=\"text\" name=\"skin-path\" id=\"skin-path\">\r\n");
      out.write("                <br>\r\n");
      out.write("            <button type=\"submit\">Register</button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
