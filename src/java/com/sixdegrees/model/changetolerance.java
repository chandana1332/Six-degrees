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
public class changetolerance {
    public static boolean change(String name,String tolerance) throws SQLException, ClassNotFoundException
    {    
        boolean flag=false;
        int a=0;
        System.out.println(flag);
        Connection con=dbconnection.getconnected();
        Statement st=con.createStatement();
        ResultSet rs=null;
        String q1="update user set tolerance='"+tolerance+"' where email='"+name+"';";
        System.out.println("query......"+q1);
        a=st.executeUpdate(q1);
        System.out.println(q1);
        if(a==1)
        {
            flag=true;
        }
        return flag;
       
    }    
}
