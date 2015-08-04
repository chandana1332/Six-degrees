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
public class updatevalues {
    public static boolean update(String word,String option) throws SQLException, ClassNotFoundException
    {
        int a=0;
        boolean flag=false;
        ResultSet rs=null;
       System.out.println(flag);
       Connection con=dbconnection.getconnected();
       Statement st=con.createStatement();
        if(option.equalsIgnoreCase("spam"))
       {
       String query="update words set markedspam=markedspam+1, used=used+1 where word='"+word+"';";
       System.out.println(query);
      a=st.executeUpdate(query);
       }
       else  if(option.equalsIgnoreCase("abuse"))
       {
       String query="update words set markedabuse=markedabuse+1, used=used+1 where word='"+word+"';";
       System.out.println(query);
      a=st.executeUpdate(query);
       }
       else  if(option.equalsIgnoreCase("violence"))
       {
       String query="update words set markedviolence=markedviolence+1, used=used+1 where word='"+word+"';";
       System.out.println(query);
      a=st.executeUpdate(query);
       }
       else  if(option.equalsIgnoreCase("politics"))
       {
       String query="update words set markedpolitics=markedpolitics+1,used=used+1 where word='"+word+"';";
       System.out.println(query);
      a=st.executeUpdate(query);
      }
        String query1="update words set abusepercentage=(markedabuse/(used))*100,politicspercentage=(markedpolitics/(used))*100,violencepercentage=(markedviolence/(used))*100,spampercentage=(markedspam/(used))*100 where word='"+word+"';";
       System.out.println(query1);
      a=st.executeUpdate(query1);    
      
        if(a==1)
        {
            flag=true;
        }
        return flag;
    }   
}
