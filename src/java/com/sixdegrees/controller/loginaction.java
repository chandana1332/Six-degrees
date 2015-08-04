/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sixdegrees.controller;

import com.sixdegrees.model.blogic;
import com.sixdegrees.model.blogic1;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class loginaction extends HttpServlet {

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String email = request.getParameter("id");
        String passw = request.getParameter("pass");
        PrintWriter p = response.getWriter();
        HttpSession hs = request.getSession(true);
        p.println("values=" + email + "," + passw);
        System.out.println("values=" + email + "," + passw);
        try {
            RequestDispatcher rd;
            boolean flag = blogic.checklogin(email, passw);
            if (flag) {
                hs.setAttribute("username", email);
                System.out.println("valid user");
                rd = request.getRequestDispatcher("adminhome.jsp");
                rd.forward(request, response);
            } else {
                flag = blogic1.checklogin(email, passw);
                if (flag) {
                    hs.setAttribute("username", email);
                    System.out.println("valid user");
                    rd = request.getRequestDispatcher("userhome.jsp");
                    rd.forward(request, response);
                } else {
                    request.setAttribute("loginstat", "failed");
                    rd = request.getRequestDispatcher("login.jsp");
                    rd.forward(request, response);

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(loginaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loginaction.class.getName()).log(Level.SEVERE, null, ex);
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
