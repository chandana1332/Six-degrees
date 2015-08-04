<%-- 
    Document   : home
    Created on : 16 Feb, 2014, 12:18:19 PM
    Author     : Nitin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! String userid; %>
        <% userid=(String)session.getAttribute("username"); %>
        <h2>Admin ID: <%= userid %></h2>
        <center>
            <a href="regusers.jsp"><font size="+2.0">SHOW REGISTERED USERS</font></a>
            <br/>
            <br/>
            <br/>
            <a href="admindetails.jsp"><font size="+2.0">SHOW ADMIN DETAILS</font></a>
            <br/>
            <br/>
            <br/>
            <a href="changepassword.jsp"><font size="+2.0">CHANGE PASSWORD</font></a>
            </center>
    </body>
</html>
