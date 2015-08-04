/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sixdegrees.controller;

import com.sixdegrees.model.personaledit;
import java.io.IOException;
import java.io.PrintWriter;
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
public class personaldetails extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
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
            boolean flag = false;
            PrintWriter P = res.getWriter();
            res.setContentType("Text/html");
            String s1 = req.getParameter("email");
            s2 = req.getParameter("status");
            s3 = req.getParameter("religion");
            s4 = req.getParameter("city");
            s5 = req.getParameter("hometown");
            s6 = req.getParameter("political");
            s7 = req.getParameter("nationality");
            boolean b = false;
            RequestDispatcher rd = null;
            Statement stmt = null;
            flag = personaledit.editdetails(s1, s2, s3, s4, s5, s6, s7);
            System.out.println(flag);
            if (flag) {
                rd = req.getRequestDispatcher("/editprofile.jsp");
                rd.forward(req, res);
            } else {

                rd = req.getRequestDispatcher("/personaldetails.jsp");
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
