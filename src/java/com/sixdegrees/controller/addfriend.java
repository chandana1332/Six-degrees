/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sixdegrees.controller;

import com.sixdegrees.model.addfren;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nitin
 */
public class addfriend extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {
            String s2 = null, s3 = null, s3a = null, s4 = null;
            res.setContentType("Text/html");
            HttpSession hs = req.getSession();
            String name = (String) hs.getAttribute("username");
            String s1 = req.getParameter("user");
            System.out.println(s1);
            RequestDispatcher rd = null;
            boolean flag = addfren.add(name, s1);
            if (flag) {
                req.setAttribute("friend", s1);
                rd = req.getRequestDispatcher("/showrequests.jsp");
                rd.forward(req, res);
            } else {
                req.setAttribute("friend", s1);
                rd = req.getRequestDispatcher("/showrequests.jsp");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
