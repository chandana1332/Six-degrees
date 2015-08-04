<%-- 
    Document   : regusers
    Created on : 26 Feb, 2014, 1:05:44 PM
    Author     : Nitin
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.io.*"
        import="java.sql.*"
        import="com.sixdegrees.model.regusers"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head> 
    <body>
    <center>
        <h2>ALL REGISTERED USERS</h2>
        <table cellpadding="5" cellspacing="5" border="1">
           <tr>
                <th>FIRST NAME</th>
                <th>LAST NAME</th>
                <th>DOB</th>
                <th>SEX</th>
                <th>EMAIL</th>
            </tr>
              <%  String s1,s2,s3,s4,s5;
              ResultSet rs=regusers.showusers(); 
                while(rs.next())
                    {
                        s1=rs.getString(1);
                        s2=rs.getString(2);
                        s3=rs.getString(3);
                        s4=rs.getString(4);
                        s5=rs.getString(5);
             %>
             <tr>
                 <td><%=s1%></td>
                 <td><%=s2%></td>
                 <td><%=s3%></td>
                 <td><%=s4%></td>
                 <td><%=s5%></td>
                 <td><a href="reguserdetails.jsp?user=<%=s1%>">SHOW DETAILS</a></td>
                 <td><a href="deleteusers?user=<%=s1%>">DELETE</a></td>
             </tr>
             <%
       }
                             
            %>
        </table>
    </center>
    </body>
</html>
