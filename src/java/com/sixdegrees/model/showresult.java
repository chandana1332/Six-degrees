/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sixdegrees.model;

import com.sixdegrees.dbcon.dbconnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nitin
 */
public class showresult {
    public static ResultSet show(String name,String username) throws SQLException, ClassNotFoundException
    {    
      
        Connection con=dbconnection.getconnected();
        Statement st=con.createStatement();
        String q="select email from user where email LIKE '"+name+"%';";
        System.out.println(q);
        ResultSet rs=st.executeQuery(q);
        return rs;
       
    }
    
    
}
