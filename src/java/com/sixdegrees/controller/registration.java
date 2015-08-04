/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sixdegrees.controller;

import com.sixdegrees.dbcon.dbconnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nitin
 */
public class registration extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        //processRequest(request, response);
        try {
            String s2 = null, s3 = null, s3a = null, s4 = null, s5 = null, s6 = null, s7 = null, s8 = null;
            String s11 = null;
            PrintWriter P = res.getWriter();
            res.setContentType("Text/html");
            String s1 = req.getParameter("Firstname");
            s2 = req.getParameter("Lastname");
            s3 = req.getParameter("DOB");
            s4 = req.getParameter("Sex");
            s5 = req.getParameter("email");
            s6 = req.getParameter("Password1");
            s7 = req.getParameter("Password2");

            Statement stmt1 = null;
            Connection con = dbconnection.getconnected();
            stmt1 = con.createStatement();
            P.println("connected and statement created");
            ResultSet rs = null;
            String q = "insert into user values('" + s5 + "','" + s6 + "','" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s11 + "','" + s11 + "','" + s11 + "','" + s11 + "','" + s11 + "','" + s11 + "','" + s11 + "','" + s11 + "','" + s11 + "','" + s11 + "','0')";
            P.println("query......" + q);
            RequestDispatcher rd = null;
            try {
                int a = stmt1.executeUpdate(q);
                boolean b = false;
                if (a == 1) {
                    b = true;
                }
                if (b) {
                    req.setAttribute("name", s1);
                    rd = req.getRequestDispatcher("/login.jsp");
                    rd.forward(req, res);
                } else {
                    req.setAttribute("name", s1);
                    rd = req.getRequestDispatcher("/registration.jsp");
                    rd.forward(req, res);
                }
            } catch (Exception e) {
                System.out.println("error is" + e);
                req.setAttribute("name", s1);
                rd = req.getRequestDispatcher("/error.jsp");
                rd.forward(req, res);
            }
        } catch (Exception e) {
            System.out.println("error is" + e);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
