package ValorantSSP.com.br;

import org.h2.tools.RunScript;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet(loadOnStartup = 1)
public class DataBaseServlet extends HttpServlet {

    public DataBaseServlet() {
        loadDatabase();
    }

    public void loadDatabase() {

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            RunScript.execute(connection, new FileReader("src/main/resources/sql/db.sql"));

            System.out.println("Success on load database tables");

        } catch (Exception e) {

            System.out.println("Failed on load database tables");
            System.out.printf("Cause: " + e.getMessage());

        }

    }

}
