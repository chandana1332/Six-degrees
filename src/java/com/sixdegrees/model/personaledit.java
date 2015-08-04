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
public class personaledit {
    public static boolean editdetails(String name,String status,String religion,String city,String hometown,String political,String nationality) throws SQLException, ClassNotFoundException
    {    
        boolean flag=false;
        Connection con=dbconnection.getconnected();
        Statement st=con.createStatement();
        String q="update user set rstatus='"+status+"',religion='"+religion+"',city='"+city+"',hometown='"+hometown+"',politicalview='"+political+"',nationality='"+nationality+"'where email='"+name+"';";
        System.out.println(q);
        int a=st.executeUpdate(q);
        if(a==1)
        {
            flag=true;
        }
        return flag;
    }    
}
