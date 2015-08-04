<%-- 
    Document   : admindetails
    Created on : 26 Feb, 2014, 1:05:21 PM
    Author     : Nitin
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.io.*"
        import="java.sql.*"
        import="com.sixdegrees.model.admindetails"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h2>ALL ADMIN DETAILS</h2>
        <br />
        <br />
        <br />
        <br />
        <table cellpadding="5" cellspacing="5" border="1">
            <tr>
                <th>USER</th>
                <th>DOB</th>
                <th>ROLE</th>
                <th>PHONE</th>
                <th>EMAIL</th>
                <th>CITY</th>
            </tr>
            
              <%  String s1,s2,s3,s4,s5,s6,s7,s8;
              ResultSet rs=admindetails.showadmins();
              while(rs.next())
              {
                    s1=rs.getString(1);
                    s2=rs.getString(2);
                    s3=rs.getString(3);
                    s4=rs.getString(4);
                    s5=rs.getString(5);
                    s6=rs.getString(6);
                    s7=rs.getString(7);
                    s8=rs.getString(8);
              %>
              <tr>
                <td><%=s3%> <%=s4%></td> 
                <td><%=s5%></td>
                <td><%=s6%></td>
                <td><%=s7%></td>
                <td><%=s1%></td>
                <td><%=s8%></td>
            </tr>
            <%
             }
            %>
        </table>
    </center>
    </body>
</html>
