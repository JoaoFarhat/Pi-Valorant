/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-25 22:26:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user.weapons;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Weapon_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Armas</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("        <a href=\"../../\" class=\"\" id=\"logo-ancora\"><img class=\"\" id=\"logo-navbar\" src=\"/user/skins/Images/logo.png\" alt=\"logo\"></a>\r\n");
      out.write("        <nav class=\"nav_links\">\r\n");
      out.write("            <a href=\"../../\">Home</a>\r\n");
      out.write("            <a href=\"../agents/Agents.jsp\">Agentes</a>\r\n");
      out.write("            <a href=\"../weapons/Weapon.jsp\">Armas</a>\r\n");
      out.write("            <a href=\"../maps/Maps.jsp\">Mapas</a>\r\n");
      out.write("            <a href=\"/skins\">Skins</a>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <h1 class=\"title\">ARMAS</h1>\r\n");
      out.write("    <img class=\"barra\" src=\"/user/weapons/Images/linha-de-titulo-branca.png\">\r\n");
      out.write("    <h1 class=\"subtitle\">PISTOLAS</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <img class=\"images\" src=\"/user/weapons/Images/Classic.png\">\r\n");
      out.write("            <h1 class=\"name\">CLASSIC</h1>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <img class=\"images\" src=\"/user/weapons/Images/Classic.png\">\r\n");
      out.write("            <h1 class=\"name\">CLASSIC</h1>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <h1 class=\"subtitle\">SUBMETRALHADORAS</h1>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <img class=\"images\" src=\"/user/weapons/Images/Classic.png\">\r\n");
      out.write("            <h1 class=\"name\">CLASSIC</h1>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <img class=\"images\" src=\"/user/weapons/Images/Classic.png\">\r\n");
      out.write("            <h1 class=\"name\">CLASSIC</h1>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <h1 class=\"subtitle\">ESCOPETAS</h1>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <img class=\"images\" src=\"/user/weapons/Images/Classic.png\">\r\n");
      out.write("            <h1 class=\"name\">CLASSIC</h1>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <img class=\"images\" src=\"/user/weapons/Images/Classic.png\">\r\n");
      out.write("            <h1 class=\"name\">CLASSIC</h1>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <h1 class=\"subtitle\">FUZIL</h1>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <img class=\"images\" src=\"/user/weapons/Images/Classic.png\">\r\n");
      out.write("            <h1 class=\"name\">CLASSIC</h1>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <img class=\"images\" src=\"/user/weapons/Images/Classic.png\">\r\n");
      out.write("            <h1 class=\"name\">CLASSIC</h1>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <h1 class=\"subtitle\">FUZIL DE PRECISÃO</h1>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <img class=\"images\" src=\"/user/weapons/Images/Classic.png\">\r\n");
      out.write("            <h1 class=\"name\">CLASSIC</h1>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <img class=\"images\" src=\"/user/weapons/Images/Classic.png\">\r\n");
      out.write("            <h1 class=\"name\">CLASSIC</h1>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
