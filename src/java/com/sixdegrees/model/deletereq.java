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
public class deletereq {
     public static boolean delete(String name,String user) throws SQLException, ClassNotFoundException
    {    
       boolean flag=false;
       int a=0;
       System.out.println(user+name);
       Connection con=dbconnection.getconnected();
       Statement st=con.createStatement();
       String query="delete from frequest where name='"+user+"' and req='"+name+"';";
       System.out.println(query);
       a=st.executeUpdate(query);
       if(a==1)
       {
          flag=true; 
       }      
       return flag;       
    }    
}
