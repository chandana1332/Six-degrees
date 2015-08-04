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
public class showrequests {
    public static ResultSet show(String user) throws SQLException, ClassNotFoundException
    {    
        Connection con=dbconnection.getconnected();
        Statement st=con.createStatement();
        String q="select req from frequest where name='"+user+"';";
        System.out.println(q);
        ResultSet rs=st.executeQuery(q);
        return rs;
       
    }   
}
