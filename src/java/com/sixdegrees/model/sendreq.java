/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sixdegrees.model;

import com.sixdegrees.dbcon.dbconnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nitin
 */
public class sendreq {
    public static boolean send(String name,String user) throws SQLException, ClassNotFoundException
    {    
       boolean flag=false;
       int a=0;
       System.out.println(flag);
       Connection con=dbconnection.getconnected();
       Statement st=con.createStatement();
       String query="insert into frequest values('"+user+"','"+name+"');";
       System.out.println(query);
       a=st.executeUpdate(query);
       if(a==1)
       {
          flag=true; 
       }
      
       return flag;
       
    }   
}
