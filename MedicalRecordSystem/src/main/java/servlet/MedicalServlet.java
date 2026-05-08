package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DBConnection;
import model.PatientRecord;

@WebServlet("/MedicalServlet")
public class MedicalServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        int patientId = Integer.parseInt(
                request.getParameter("patientId"));

        String name = request.getParameter("name");

        int age = Integer.parseInt(
                request.getParameter("age"));

        String history =
                request.getParameter("medicalHistory");

        String diagnosis =
                request.getParameter("diagnosis");

        String treatment =
                request.getParameter("treatment");

        PatientRecord record =
                new PatientRecord(patientId,
                                  name,
                                  age,
                                  history,
                                  diagnosis,
                                  treatment);

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO patient_records VALUES (?,?,?,?,?,?)");

            ps.setInt(1, patientId);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, history);
            ps.setString(5, diagnosis);
            ps.setString(6, treatment);

            ps.executeUpdate();

        } catch(Exception e) {
            e.printStackTrace();
        }

        Cookie cookie =
                new Cookie("patient",
                           name.replace(" ", "_"));

        response.addCookie(cookie);

        request.setAttribute("record", record);

        request.getRequestDispatcher("result.jsp")
               .forward(request, response);
    }
}