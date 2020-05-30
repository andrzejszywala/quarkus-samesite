package pl.andrzejszywala;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("samesite")
public class SameSite extends HttpServlet {
    
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
        resp.getWriter().write(req.getSession(true).getId());
    }
}