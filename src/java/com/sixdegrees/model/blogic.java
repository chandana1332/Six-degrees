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
public class blogic {
    public static boolean checklogin(String email,String password) throws SQLException, ClassNotFoundException
    {
       boolean flag=false;
       System.out.println(email+password);
       Connection con=dbconnection.getconnected();
       Statement st=con.createStatement();
       String query="select * from admin where email='"+email+"' and pass='"+password+"'";
       System.out.println(query);
       ResultSet rs=st.executeQuery(query);
       if(rs.next())
       {
          flag=true; 
       }
     
       return flag;
       
    }
    
}
