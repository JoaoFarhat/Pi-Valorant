/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-06-02 21:26:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.adm.create_002dskin;

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
      out.write("    <link rel=\"stylesheet\" href=\"../../adm/create-skin/CreateSkin.css\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/valorant-transparent.png\" type=\"image/x-icon\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("        <div id=\"header-up\">\r\n");
      out.write("            <a href=\"../home/home.jsp\" class=\"logo-ancora\" id=\"\"><img class=\"\" id=\"logo-navbar\" src=\"images/logo.png\" alt=\"logo\"></a>\r\n");
      out.write("            <a href=\"../home/home.jsp\" class=\"logo-ancora\" id=\"\"><h2 id=\"titulo-header\">Visão Administrativa</h2></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <nav class=\"nav_links\">\r\n");
      out.write("            <div class=\"nav_link\">\r\n");
      out.write("                <a href=\"/agents\"><img id=\"agent-icon\" class=\"icon\" src=\"../../adm/create-skin/images/agent-icon.png\">Agentes</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"nav_link\">\r\n");
      out.write("                <a href= \"/armas\" ><img id=\"weapon-icon\" class=\"icon\" src=\"../../adm/create-skin/images/weapon-icon.png\">Armas</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"nav_link\">\r\n");
      out.write("                <a href=\"/maps\"><img id=\"map-icon\" class=\"icon\" src=\"../../adm/create-skin/images/map-icon.png\">Mapas</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"nav_link\">\r\n");
      out.write("                <a href=\"/skins\"><img id=\"skin-icon\" class=\"icon\" src=\"../../adm/create-skin/images/skin-icon.jpg\">Skins</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div id=\"header-down\">\r\n");
      out.write("            <div id=\"div-ancora-button\">\r\n");
      out.write("                <a href=\"/logout\" id=\"ancora-button\"><button id=\"button_logout\">LOG OUT</button></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <div id=\"div-right\">\r\n");
      out.write("        <div id=\"div-form\">\r\n");
      out.write("            <h2 id=\"form-title\">Skins</h2>\r\n");
      out.write("            <form id=\"form-create-skin\" action=\"/create-skin\" method=\"post\">\r\n");
      out.write("                <div id=\"colunas\">\r\n");
      out.write("                    <div id=\"coluna-1\">\r\n");
      out.write("                        <label>Name</label>\r\n");
      out.write("                        <input type=\"text\" name=\"skin-name\" id=\"skin-name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"   required>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <label>Type</label>\r\n");
      out.write("                        <input type=\"text\" name=\"skin-type\" id=\"skin-type\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"   required>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <label>Season</label>\r\n");
      out.write("                            <input type=\"number\" name=\"skin-season\" id=\"skin-season\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.season}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"  required>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <label>Name Season</label>\r\n");
      out.write("                            <input type=\"text\" name=\"skin-nameSeason\" id=\"skin-nameSeason\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.nameSeason}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"  required>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <label>Date</label>\r\n");
      out.write("                            <input type=\"date\" name=\"skin-date\" id=\"skin-date\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.date}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"  required>\r\n");
      out.write("                        <br>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"coluna-2\">\r\n");
      out.write("                        <label>Act</label>\r\n");
      out.write("                            <input type=\"number\" name=\"skin-act\" id=\"skin-act\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.act}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"  required>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <label>Price</label>\r\n");
      out.write("                            <input type=\"number\" name=\"skin-price\" id=\"skin-price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"  required>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <label>Recolors</label>\r\n");
      out.write("                            <input type=\"number\" name=\"skin-recolors\" id=\"skin-recolors\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.recolors}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"  required>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <label>Path</label>\r\n");
      out.write("                            <input type=\"text\" name=\"skin-path\" id=\"skin-path\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"  required>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <label>Path Type</label>\r\n");
      out.write("                            <input type=\"text\" name=\"skin-pathType\" id=\"skin-pathType\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.pathType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"  required>\r\n");
      out.write("                            <input type=\"hidden\" name=\"skin-id\" id=\"skin-id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                        <br>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"submit\" id=\"button-register\" class=\"button\" >REGISTRAR</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
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
