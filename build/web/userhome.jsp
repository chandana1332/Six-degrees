<%-- 
    Document   : userhome
    Created on : 18 May, 2014, 1:13:07 PM
    Author     : Nitin
--%>

<%@page import="com.sixdegrees.dbcon.dbconnection"%>
<!DOCTYPE HTML>
<!--
	Prologue 1.2 by HTML5 UP
	html5up.net | @n33co
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<%@page import="com.sixdegrees.model.showallposts"
         import="com.sixdegrees.model.getdetails"%>
<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.io.*"
        import="java.sql.*"%>
<html>
	<head>
		<title>Home</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600" rel="stylesheet" type="text/css" />
		<!--[if lte IE 8]><script src="js/html5shiv.js"></script><![endif]-->
		<script src="js/jquery.min.js"></script>
		<script src="js/skel.min.js">{
      prefix: "profile/css/style",
      breakpoints: {
        wide: { range: "1200-", containers: 1140, grid: { gutters: 40 } },
        narrow: { range: "481-1199", containers: 960 },
        mobile: { range: "-480", containers: "fluid", lockViewport: true, grid: { collapse: true } }
      }
    }</script>
		<script src="js/skel-panels.min.js"></script>
		<script src="js/init.js"></script>
		<noscript>
			<link rel="stylesheet" href="css/skel-noscript.css" />
			<link rel="stylesheet" href="css/style.css" />
			<link rel="stylesheet" href="css/style-wide.css" />
		</noscript>
		<!--[if lte IE 9]><link rel="stylesheet" href="css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie8.css" /><![endif]-->
	</head>
	<body>
            <%String d1=null,d2=null,u1=null,u2=null;
            String name=(String)session.getAttribute("username");
            System.out.println(name);
            ResultSet rs=getdetails.get(name);
            while(rs.next())
            {
                d1=rs.getString(1);
                d2=rs.getString(2);
                System.out.println(d1+d2);
            }
            u1=d1.toUpperCase();
            u2=d2.toUpperCase();
            %>

		<!-- Header -->
			<div id="header" class="skel-panels-fixed">

				<div class="top">

					<!-- Logo -->
						<div id="logo">
							<span class="image avatar48"><img src="images/avatar.jpg" alt="" /></span>
                                                        <a href="myprofile.jsp"><h1 id="title"><%=u1%> <%=u2%></h1></a>
							<span class="byline"><%=name%></span>
						</div>

					<!-- Nav -->
						<nav id="nav">
							<!--
							
								Prologue's nav expects links in one of two formats:
								
								1. Hash link (scrolls to a different section within the page)
								
								   <li><a href="#foobar" id="foobar-link" class="skel-panels-ignoreHref"><span class="fa fa-whatever-icon-you-want">Foobar</span></a></li>

								2. Standard link (sends the user to another page/site)

								   <li><a href="http://foobar.tld"><span class="fa fa-whatever-icon-you-want">Foobar</span></a></li>
							
							-->
							<ul>
								<li><a href="userhome.jsp" id="top-link" class="skel-panels-ignoreHref"><span class="fa fa-home">Home</span></a></li>
								<li><a href="myprofile.jsp" id="about-link" class="skel-panels-ignoreHref"><span class="fa fa-user">My Profile</span></a></li>
                                                                <li><a href="showfriends.jsp?name=<%=name%>" id="portfolio-link" class="skel-panels-ignoreHref"><span class="fa fa-th">Friends</span></a></li>
                                                                <li><a href="showrequests.jsp" id="about-link" class="skel-panels-ignoreHref"><span class="fa fa-user">Friend Requests</span></a></li>
								<li><a href="editprofile.jsp" id="contact-link" class="skel-panels-ignoreHref"><span class="fa fa-envelope">Edit Profile</span></a></li>
                                                                <li><form action="showresult.jsp"><input type="text" name="name"/><input type="submit" value="SEARCH"/></form></li>
                                                                <li><a href="viewblocked.jsp" id="portfolio-link" class="skel-panels-ignoreHref"><span class="fa fa-th">Block History</span></a></li>
                                                                <li><a href="logout" id="contact-link" class="skel-panels-ignoreHref"><span class="fa fa-envelope">Log Out</span></a></li>

							</ul>
						</nav>
						
				</div>
				
				<div class="bottom">

					<!-- Social Icons -->
						<ul class="icons">
							<li><a href="#" class="fa fa-twitter solo"><span>Twitter</span></a></li>
							<li><a href="#" class="fa fa-facebook solo"><span>Facebook</span></a></li>
							<li><a href="#" class="fa fa-github solo"><span>Github</span></a></li>
							<li><a href="#" class="fa fa-dribbble solo"><span>Dribbble</span></a></li>
							<li><a href="#" class="fa fa-envelope solo"><span>Email</span></a></li>
						</ul>
				
				</div>
			
			</div>

		<!-- Main -->
			<div id="main">
			
				<!-- Intro -->
					<section id="top" class="one">
						<div class="container">

							<a href="http://ineedchemicalx.deviantart.com/art/Moonscape-381829905" class="image featured"><img src="images/pic01.jpg" alt="" /></a>

							<header>
                                                            <center>
								<h2 class="alt"><strong>News Feed</strong></h2>
                                                            </center>
							</header>
                                                        <table cellspacing="1" cellpadding="4">
    
 <%  String s1=null,s2=null,s3=null;
              boolean flag=false; 
    Statement stmt=null;
    int i=0;
    String s[]=new  String[100];
    PrintWriter P=response.getWriter();
//      rs=showallposts.show();
         Connection con=dbconnection.getconnected();
       Statement st=con.createStatement();
       String q1="select friend from friends where email='"+name+"';";
       rs=st.executeQuery(q1);
       System.out.println(q1);
        while(rs.next())
                    {
            s[i]=rs.getString(1);
            i++;
                       }
       int ssize=s.length;
       for(i=0;i<ssize;i++)
                     {
String q="select src,dest,msg from allposts where status='posted' and src='"+s[i]+"' union select src,dest,msg from allposts where status='posted' and dest='"+s[i]+"';";
rs=st.executeQuery(q);
System.out.println(q);
      
               while(rs.next())
                    {
                   flag=true;
                            s1=rs.getString(1);
                             s2=rs.getString(2);
                              s3=rs.getString(3);
                                                                                                                                       
          %> 
             
             <tr><td><%=s1%>><%=s2%></td>
                 <td><%=s3%></td></tr>

<%}}
             if(!flag)
             {
       %>
       <br/>
                                                <br/>
                                                <br/>
            <font size="+2.0">SORRY! NO POSTS</font>
            <%
}     
               %>


</table>
                                                        
						</div>
					</section>
                        </div>
		<!-- Footer -->
			<div id="footer">
				
				<!-- Copyright -->
					<div class="copyright">
						<p>&copy; 2014 SixDegrees. All rights reserved.</p>
						<ul class="menu">
							<li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
							<li>Images: <a href="http://ineedchemicalx.deviantart.com">Felicia Simion</a></li>
						</ul>
					</div>
				
			</div>

	</body>
</html>
