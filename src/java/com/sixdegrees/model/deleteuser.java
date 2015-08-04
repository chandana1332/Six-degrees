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
public class deleteuser {
    public static boolean delete(String name) throws SQLException, ClassNotFoundException
    {
        int a=0;
        boolean flag=false;
        Connection con=dbconnection.getconnected();
        Statement st=con.createStatement();
        String q ="delete from user where email='"+name+"'";
        System.out.println(q);
        a=st.executeUpdate(q);  
        if(a>0)
        {
            flag=true; 
        }
        return flag;
    }
}
