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
public class showmyposts {
    public static ResultSet show(String name) throws SQLException, ClassNotFoundException
    {    
        Connection con=dbconnection.getconnected();
        Statement st=con.createStatement();
        String q="select * from allposts where dest='"+name+"' and status='posted';";
        System.out.println(q);
        ResultSet rs=st.executeQuery(q);
        return rs;
       
    }
    
}
