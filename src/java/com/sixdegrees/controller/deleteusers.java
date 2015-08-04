/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sixdegrees.controller;

import com.sixdegrees.model.deleteuser;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nitin
 */
public class deleteusers extends HttpServlet {

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
        try {
            PrintWriter P = res.getWriter();
            res.setContentType("Text/html");
            String name = req.getParameter("user");
            boolean flag = deleteuser.delete(name);
            RequestDispatcher rd = null;
            if (flag) {
                req.setAttribute("name", name);
                rd = req.getRequestDispatcher("/regusers.jsp");
                rd.forward(req, res);
            } else {
                req.setAttribute("name", name);
                rd = req.getRequestDispatcher("/Blank.jsp");
                rd.forward(req, res);
            }
        } catch (Exception e) {
            System.out.println("error is" + e);
        }
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
