<%--
Document   : regusersdetails
Created on : Feb 28, 2014, 1:48:41 PM
Author     : sony
--%>


<%@page import="com.sixdegrees.model.reguserdetails"%>
<%@page contentType="text/html" pageEncoding="UTF-8"
import="java.io.*"
import="java.sql.*"
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <%  String s[]=new String[17];
        Statement stmt=null;
        int i=0;
        String name=request.getParameter("user");
        ResultSet rs=reguserdetails.showdetails(name);
        while(rs.next())
        {
        for(i=1;i<17;i++)
        {
        s[i]=rs.getString(i);
        System.out.println(s[i]);
        }
        %>
        <h2>USER DETAILS OF ID:<%=name%></h2>
        <table cellpadding="5" cellspacing="5" border="1">
            <tr>
                <td>EMAIL</td>
                <td><%=s[1]%></td>
            </tr>
            <tr>
                <td>FIRST NAME</td>
                <td><%=s[3]%></td>
            </tr>
            <tr>
                <td>LAST NAME</td>
                <td><%=s[4]%></td>
            </tr>
            <tr>
                <td>DOB</td>
                <td><%=s[5]%></td>
            </tr>
            <tr>
                <td>GENDER</td>
                <td><%=s[6]%></td>
            </tr>
            <tr>
                <td>RELATIONSHIP STATUS</td>
                <td><%=s[7]%></td>
            </tr>       
            <tr>
                <td>RELIGION</td>
                <td><%=s[8]%></td>
            </tr>
            <tr>
                <td>CURRENT CITY</td>
                <td><%=s[9]%></td>
            </tr>
            <tr>
                <td>HOMETOWN</td>
                <td><%=s[10]%></td>
            </tr>
            <tr>
                <td>POLITICAL VIEW</td>
                <td><%=s[11]%></td>
            </tr>
            <tr>
                <td>NATIONALITY</td>
                <td><%=s[12]%></td>
            </tr>
            <tr>
                <td>INSTITUTION NAME</td>
                <td><%=s[13]%></td>
            </tr>
            <tr>
                <td>YEAR</td>
                <td><%=s[14]%></td>
            </tr>
            <tr>
                <td>COMPANY NAME</td>
                <td><%=s[15]%></td>
            </tr>
            <tr>
                <td>YEAR</td>
                <td><%=s[16]%></td>
            </tr>        
            <%
            }

            %>
        </table> 
        <br/>
        <br/>
        <br/>
        <a href="Deleteusers?user=<%=s[1]%>"><font size="+1.5">DELETE</font></a>
    </center>
</body>
</html>
