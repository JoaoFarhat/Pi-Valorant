/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
<<<<<<< Updated upstream
 * Generated at: 2023-06-01 02:12:49 UTC
=======
 * Generated at: 2023-06-01 03:53:56 UTC
>>>>>>> Stashed changes
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user.agents;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Agents_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<html lang=\"pt-BR\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Agents</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"user/agents/style.css\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"user/Images/valorant-transparente.png\" type=\"image/x-icon\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("            <a href=\"../../\" class=\"\" id=\"logo-ancora\"><img class=\"\" id=\"logo-navbar\" src=\"/user/agents/Images/logo.png\" alt=\"logo\"></a>\r\n");
      out.write("            <nav class=\"nav_links\">\r\n");
      out.write("                <a href=\"../../\">Home</a>\r\n");
      out.write("                <a href=\"/\">Agentes</a>\r\n");
      out.write("                <a href=\"/armas\">Armas</a>\r\n");
      out.write("                <a href=\"/maps\">Mapas</a>\r\n");
      out.write("                <a href=\"/skins\">Skins</a>  \r\n");
      out.write("            </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("    <h1 class=\"title\">AGENTES</h1>\r\n");
      out.write("    <img class=\"barra\" src=\"/user/agents/Images/linha-de-titulo-branca.png\">\r\n");
      out.write("    \r\n");
      out.write("    <h1 class=\"subtitle\">Duelistas</h1>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <h1 class=\"subtitle\">Iniciadores</h1>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <h1 class=\"subtitle\">Controladores</h1>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <h1 class=\"subtitle\">Sentinelas</h1>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <footer>\r\n");
      out.write("        dsadsa\r\n");
      out.write("    </footer>\r\n");
      out.write("    <script src=\"user/agents/script.js\"></script>\r\n");
      out.write("<body>");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /user/agents/Agents.jsp(28,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("duelista");
    // /user/agents/Agents.jsp(28,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/user/agents/Agents.jsp(28,8) '${duelistas}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${duelistas}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <div class=\"box\" onclick=\"openOverlay()\">\r\n");
          out.write("                <img class=\"images\" src=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duelista.pathagent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(">\r\n");
          out.write("                <h1 class=\"name\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duelista.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h1>\r\n");
          out.write("            </div>\r\n");
          out.write("            <div class=\"overlay\" id=\"myOverlay\">\r\n");
          out.write("                <div class=\"overlay-item\">\r\n");
          out.write("                    <div class=\"overlay-coluna-1\">\r\n");
          out.write("                        <h1 class=\"overlay-name\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duelista.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h1>\r\n");
          out.write("                        <img class=\"image-overlay\" src=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duelista.pathagent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(">\r\n");
          out.write("                        <div class=\"overlay-div-role\">\r\n");
          out.write("                            <img class=\"overlay-img-role\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duelista.pathrole}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" alt=\"\">\r\n");
          out.write("                            <h2 class=\"overlay-role\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duelista.role}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h2>\r\n");
          out.write("                        </div>\r\n");
          out.write("                        <h4 class=\"overlay-ultimatepoints\">Ultimate Points: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duelista.ultimatePoints}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(" Points</h4>\r\n");
          out.write("                        <div class=\"overlay-div-lore\">\r\n");
          out.write("                            <h3 class=\"overlay-lore-titulo\">Lore</h3>\r\n");
          out.write("                            <h4 class=\"overlay-lore\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duelista.lore}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h4>\r\n");
          out.write("                        </div> \r\n");
          out.write("                    </div>\r\n");
          out.write("                    <div class=\"overlay-coluna-2\">\r\n");
          out.write("                        <button class=\"overlay-button\" onclick=\"closeOverlay()\">Fechar</button>\r\n");
          out.write("                    </div>\r\n");
          out.write("                </div>\r\n");
          out.write("            </div>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /user/agents/Agents.jsp(58,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("iniciador");
    // /user/agents/Agents.jsp(58,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/user/agents/Agents.jsp(58,8) '${iniciadores}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${iniciadores}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <div class=\"box\">\r\n");
          out.write("                <img class=\"images\" src=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${iniciador.pathagent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(">\r\n");
          out.write("                <h1 class=\"name\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${iniciador.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h1>\r\n");
          out.write("            </div>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /user/agents/Agents.jsp(68,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("controlador");
    // /user/agents/Agents.jsp(68,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/user/agents/Agents.jsp(68,8) '${controladores}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${controladores}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <div class=\"box\" onclick=\"openOverlay()\">\r\n");
          out.write("                <img class=\"images\" src=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${controlador.pathagent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(">\r\n");
          out.write("                <h1 class=\"name\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${controlador.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h1>\r\n");
          out.write("            </div>\r\n");
<<<<<<< Updated upstream
          out.write("            \r\n");
=======
          out.write("            <div class=\"overlay\" id=\"myOverlay\">\r\n");
          out.write("                <div class=\"overlay-item\">\r\n");
          out.write("                    <div id=\"overlay-coluna-1\">\r\n");
          out.write("                        <h1 id=\"overlay-name\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${controlador.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h1>\r\n");
          out.write("                        <img class=\"images-overlay\" src=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${controlador.pathagent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(">\r\n");
          out.write("                        <div>\r\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${controlador.pathrole}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" alt=\"\">\r\n");
          out.write("                            <h2 id=\"overlay-role\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${controlador.role}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h2>\r\n");
          out.write("                        </div>\r\n");
          out.write("                        <h4 id=\"overlay-ultimatepoints\">Ultimate Points: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${controlador.ultimatePoints}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(" Points</h4>\r\n");
          out.write("                        <h3 id=\"overlay-lore-titulo\">Lore</h3>\r\n");
          out.write("                        <h4 id=\"overlay-lore\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${controlador.lore}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h4>\r\n");
          out.write("                        <button onclick=\"closeOverlay()\">Fechar</button>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    <div id=\"overlay-coluna-2\">\r\n");
          out.write("\r\n");
          out.write("                    </div>\r\n");
          out.write("                </div>\r\n");
          out.write("            </div>\r\n");
>>>>>>> Stashed changes
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent(null);
<<<<<<< Updated upstream
    // /user/agents/Agents.jsp(59,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("sentinela");
    // /user/agents/Agents.jsp(59,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/user/agents/Agents.jsp(59,8) '${sentinelas}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${sentinelas}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
=======
    // /user/agents/Agents.jsp(97,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("sentinela");
    // /user/agents/Agents.jsp(97,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/user/agents/Agents.jsp(97,8) '${sentinelas}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${sentinelas}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
>>>>>>> Stashed changes
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <div class=\"box\">\r\n");
          out.write("                <img class=\"images\" src=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sentinela.pathagent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(">\r\n");
          out.write("                <h1 class=\"name\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sentinela.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h1>\r\n");
          out.write("            </div>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }
}
