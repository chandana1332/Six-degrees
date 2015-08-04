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
public class getdetails {
    public static ResultSet get(String email) throws SQLException, ClassNotFoundException
    {    
       boolean flag=false;
       System.out.println(flag);
       Connection con=dbconnection.getconnected();
       Statement st=con.createStatement();
       String query1="select fname,lname from user where email='"+email+"'";
       System.out.println(query1);
       ResultSet rs=st.executeQuery(query1);
       return rs;
       
    }
    
}
    
