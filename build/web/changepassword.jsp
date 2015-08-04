<%-- 
    Document   : chngpass
    Created on : 26 Feb, 2014, 1:05:58 PM
    Author     : Nitin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script language="javascript">
        function checkFormValidator()
 	{
 		var p1=document.forms["apassmatch"]["newpass1"].value;
                var p2=document.forms["apassmatch"]["newpass2"].value;
                if(p1==null || p1=="" || p2==null || p2=="")
                    {
                        alert("Password fields can not be left blank");
                        return false;
                    }
                else if(p1!=p2)
                    {
                        alert("Passwords do not match");
                        return false;
                    }
        }
        </script>
    </head>
    <body>
        <center>
            <font face="Arial" size="+3">CHANGE PASSWORD</font>
            <br/>
            <br/>                
            <br/>
            <br/>
            <form name="apassmatch" action="changepassword"  method="post" onsubmit="return checkFormValidator()">
            <table>
                <tr>    
                    <td> <font face="Arial" size="+1.5">OLD PASSWORD</font><br/><br/></td>
                    <td><input type="password" name="oldpass"/><br/><br/></td>
                </tr>

                <tr>
                    <td> <font face="Arial" size="+1.5">NEW PASSWORD</font><br/><br/></td>
                    <td><input type="password" name="newpass1"/><br/><br/></td>
                </tr>
                
                <tr>
                    <td> <font face="Arial" size="+1.5">CONFIRM NEW PASSWORD</font><br/><br/></td>
                    <td><input type="password" name="newpass2" /><br/><br/></td>
                </tr>
            </table>
            <%  
            String name=(String)session.getAttribute("username");
            %>
            <input type="text" name="name" value="<%=name%>" style="display:none;"/>
            <br/>
            <input type="submit" value="SUBMIT"/>
            <br/>
            <input type="reset" value="RESET"/>
            </form>
        </center>
    </body>
</html>
