package ValorantSSP.com.br.Servlet;

import ValorantSSP.com.br.Dao.UserDao;
import ValorantSSP.com.br.Dao.WeaponDao;
import ValorantSSP.com.br.Model.User;
import ValorantSSP.com.br.Model.Weapon;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/armas")
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
public class ListWeaponServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Weapon> weapons = new WeaponDao().findAllWeapons();
        List<Weapon> pistols = new WeaponDao().findAllPistols();

        req.setAttribute("weapons", weapons);
        req.setAttribute("pistols", pistols);

<<<<<<< Updated upstream
        req.getRequestDispatcher("user/weapons/Weapon.jsp").forward(req, resp);
//      req.getRequestDispatcher("adm/dashboard-weapons/Weapons.jsp").forward(req, resp);
=======
        HttpSession session = req.getSession();

        if  (session.getAttribute("loggedUser") == null ) {

            req.getRequestDispatcher("user/weapons/Weapon.jsp").forward(req, resp);

        }  else {

            req.getRequestDispatcher("adm/dashboard-weapons/Weapons.jsp").forward(req, resp);
        }
>>>>>>> Stashed changes

    }
}
