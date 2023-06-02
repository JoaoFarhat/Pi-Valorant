package ValorantSSP.com.br.Servlet;

import ValorantSSP.com.br.Dao.SkinDao;
import ValorantSSP.com.br.Model.Skin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/create-skin")
public class CreateSkinServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/adm/create-skin/CreateSkin.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        String skinId = req.getParameter("skin-id");
        String skinName = req.getParameter("skin-name");
        String skinDate = req.getParameter("skin-date");
        int skinSeason = Integer.parseInt(req.getParameter("skin-season"));
        int skinAct = Integer.parseInt(req.getParameter("skin-act"));
        float skinPrice = Float.parseFloat(req.getParameter("skin-price"));
        int skinRecolors = Integer.parseInt(req.getParameter("skin-recolors"));
        String skinPath = req.getParameter("skin-path");


        Skin skin = new Skin();

        skin.setId(skinId);
        skin.setName(skinName);
        skin.setDate(skinDate);
        skin.setSeason(skinSeason);
        skin.setAct(skinAct);
        skin.setRecolors(skinRecolors);
        skin.setPrice(skinPrice);
        skin.setPath(skinPath);


        SkinDao skinDao = new SkinDao();

        if (skinId.isBlank()) {

            skinDao.createSkin(skin);

        } else {

            skinDao.updateSkin(skin);
        }

        resp.sendRedirect("/skins");

    }

}
