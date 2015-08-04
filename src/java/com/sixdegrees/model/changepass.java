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
public class changepass {
    public static boolean change(String name,String oldpass,String newpass) throws SQLException, ClassNotFoundException
    {
        boolean flag=false;
        int a=0;
        Connection con=dbconnection.getconnected();
        Statement st=con.createStatement();
        String query="select * from admin where email='"+name+"' and pass='"+oldpass+"'";
        System.out.println(query);
        ResultSet rs=st.executeQuery(query);
        if(rs.next())
        {
            String q1="update admin set pass='"+newpass+"' where email='"+name+"';";
            a=st.executeUpdate(q1);
            System.out.println("query......"+q1);
        }
        if(a==1)
        {
            flag=true;
        }
        return flag;
    }
}

