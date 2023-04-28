package ValorantSSP.com.br.Servlet;

import ValorantSSP.com.br.Dao.WeaponDao;
import ValorantSSP.com.br.Model.Weapon;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-weapons")
public class ListWeaponServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Weapon> weapons = new WeaponDao().findAllWeapon();

        req.setAttribute("weapons", weapons);

        req.getRequestDispatcher("dashboard.jsp").forward(req, resp);

    }
}