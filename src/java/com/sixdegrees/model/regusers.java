/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sixdegrees.model;

import com.sixdegrees.dbcon.dbconnection;
import java.sql.*;

/**
 *
 * @author Nitin
 */
public class regusers {
    public static ResultSet showusers() throws SQLException, ClassNotFoundException
    {    
        Connection con=dbconnection.getconnected();
        Statement st=con.createStatement();
        String q="select email,fname,lname,dob,gender from user;";
        System.out.println(q);
        ResultSet rs=st.executeQuery(q);
        return rs;
       
    }
    
}
