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
public class showallposts {
    public static ResultSet show() throws SQLException, ClassNotFoundException
    {    
        Connection con=dbconnection.getconnected();
        Statement st=con.createStatement();
        String q="select * from allposts where status='posted';";
        System.out.println(q);
        ResultSet rs=st.executeQuery(q);
        return rs;
       
    }
}
