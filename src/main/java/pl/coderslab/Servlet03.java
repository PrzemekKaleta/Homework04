package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/Servlet03")
public class Servlet03 extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        HttpSession sess = request.getSession();

        //tutaj wrzucam doGeta bo to z tej metody ma się wyświetlać element ponownie z dodanymi danymi - części 2
        doGet(request,response);

        String name = request.getParameter("area1");
        String surname = request.getParameter("area2");
        String age = request.getParameter("area3");
        String address = request.getParameter("area4");

        sess.setAttribute("area1", name);
        sess.setAttribute("area2", surname);
        sess.setAttribute("area3", age);
        sess.setAttribute("area4", address);


        response.getWriter().println("Nazywasz się" + name + " " + surname + ", masz " + age + " lat i pochodzisz z " + address + ".");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();

        if (session.isNew()) {

            String form = "<form action='/Servlet03' method='post'>" +
                    "Imię: <input type='text' name='area1'><BR>" +
                    "Nazwisko: <input type='text' name='area2'><BR>" +
                    "Wiek: <input type='text' name='area3'><BR>" +
                    "Płeć: <input type='text' name='area4'><BR>" +
                    "<input type='submit' value='Przeslij dane'></form>";

            //tutaj - doadałem aby wiedzieć która część się wyświetla
            response.getWriter().println("--1--");

            response.getWriter().write(form);


        } else {

            String getSess1 = (String) session.getAttribute("area1");
            String getSess2 = (String) session.getAttribute("area2");
            String getSess3 = (String) session.getAttribute("area3");
            String getSess4 = (String) session.getAttribute("area4");

            String form2 = "<form action='/Servlet03' method='post'>" +
                    "Imię: <input type='text' name='" + getSess1 + "'><BR>" +
                    "Nazwisko: <input type='text' name='" + getSess2 + "'><BR>" +
                    // tutaj na końcu brakowało ' i się linijka nie wyświetlała
                    "Wiek: <input type='text' name='" + getSess3 + "'><BR>" +
                    "Płeć: <input type='text' name='" + getSess4 + "'><BR>" +
                    "<input type='submit' value='Przeslij dane'></form>";

            //tutaj - doadałem aby wiedzieć która część się wyświetla
            response.getWriter().println("--2--");

            response.getWriter().write(form2);

        }
    }
}

