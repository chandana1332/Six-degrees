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
public class addfren {
    public static boolean add(String name,String friend) throws SQLException, ClassNotFoundException
    {    
       boolean flag=false;
       int a=0,a1=0,a2=0;
       System.out.println(flag);
       Connection con=dbconnection.getconnected();
       Statement st=con.createStatement();
       String query="insert into friends values('"+name+"','"+friend+"');";
       System.out.println(query);
       a=st.executeUpdate(query);
        String query1="insert into friends values('"+friend+"','"+name+"');";
       System.out.println(query1);
       a1=st.executeUpdate(query1);
       String query2="delete from frequest where name='"+name+"' and req='"+friend+"';";
       System.out.println(query2);
       a2=st.executeUpdate(query2);
       if(a==1&&a1>1&&a2==1)
       {
          flag=true; 
       }      
       return flag;      
    }   
}
