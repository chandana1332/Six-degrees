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
public class blockpost {
    public static boolean block(String message,String sender,String receiver,String option) throws SQLException, ClassNotFoundException
    {    
            boolean flag=false;
            int a=0,i=0;
            ResultSet rs=null;
            System.out.println(flag);
            Connection con=dbconnection.getconnected();
            Statement st=con.createStatement();
            message=message.toLowerCase();
            String post=message.replaceAll("\\n+", " "); 
            post=post.replaceAll("[^a-zA-Z]"," ");
            post=post.replaceAll("\\s+", " "); 
            //post=post.replaceAll("(?i) it| it |it | hey| hey |hey | hi| hi |hi | are| are |are | but| but |but | you| you |you | we| we |we | us| us |us | will| will |will | me| me |me | I| I |I ", " ");
            System.out.println("after punc:"+post);
            String s[]=post.split(" ");
            int size=s.length;
            for(i=0;i<size;i++)
                System.out.println(s[i]);
            for(i=0;i<size;i++)
            {
                String query1="select * from words where word='"+s[i]+"' ";
                System.out.println(query1);
                rs=st.executeQuery(query1);
                if(rs.next())
                {
                    flag=updatevalues.update(s[i],option); 
                }
                else
                {
                    String query="insert into words(word) values('"+s[i]+"');";
                    System.out.println(query);
                    a=st.executeUpdate(query);
                    flag=updatevalues.update(s[i],option); 
                }
            }
                String query2="update allposts set status='blocked' where msg='"+message+"' and friend='"+sender+"' and dest='"+receiver+"';";
                System.out.println(query2);
                a=st.executeUpdate(query2);
                if(a==1)
                {
                    flag=true;
                }
                else
                {
                    flag=false;
                }
     // String query="insert into words values('"+s[0]+"');";
      //flag=updatevalues.update(s[0],option);
      return flag;
    }
    
}
