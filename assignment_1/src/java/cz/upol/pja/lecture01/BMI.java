package cz.upol.pja.lecture01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BMIServlet", urlPatterns = {"/bmi"})
public class BMI extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>BMI calculator</title>");
            out.println("</head>");
            out.println("<body>");

            String weight = request.getParameter("weight");
            String height = request.getParameter("height");
                        
            if (weight != "" && height != "" && weight != null && height != null) {
                double weightInt = Double.parseDouble(weight);
                double heightInt = Double.parseDouble(height);
                double bmi = weightInt / ((heightInt / 100) * (heightInt / 100));

                String category;
                if (bmi <= 16.5) {
                    category = "těžká podvýživa";
                } else if (bmi > 16.5 && bmi <= 18.5) {
                    category = "podváha";
                } else if (bmi > 18.5 && bmi <= 25) {
                    category = "ideální váha";
                } else if (bmi > 25 && bmi <= 30) {
                    category = "nadváha";
                } else if (bmi > 30 && bmi <= 35) {
                    category = "obezita prvního stupně";
                } else if (bmi > 35 && bmi <= 40) {
                    category = "obezita druhého stupně";
                } else {
                    category = "obezita třetího stupně";
                }

                out.println("<h1>Vaše BMI je " + bmi + ".<br>Spadáte do kategorie: " + category + "</h1>");
            } else {
                out.println("<h1>BMI kalkulačka</h1>");
                out.println("<form action=\"bmi\">");
                out.println("Váha: <input type=\"text\" name=\"weight\" />");
                out.println("Výška: <input type=\"text\" name=\"height\" />");
                out.println("<input type=\"submit\" value=\"Vypočítat\" />");
                out.println("</form>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
