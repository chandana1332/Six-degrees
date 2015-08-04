<%-- 
    Document   : showfriend
    Created on : 18 May, 2014, 9:47:15 PM
    Author     : Nitin
--%>

<!DOCTYPE HTML>
<!--
	Prologue 1.2 by HTML5 UP
	html5up.net | @n33co
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<%@page import="com.sixdegrees.model.showfriends"
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
            String name=(String)request.getParameter("name");
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
								<li><a href="showdetails.jsp?name=<%=name%>" id="about-link" class="skel-panels-ignoreHref"><span class="fa fa-user"><%=d1%>'s Wall</span></a></li>
                                                                <li><a href="showfriend.jsp?name=<%=name%>" id="portfolio-link" class="skel-panels-ignoreHref"><span class="fa fa-th"><%=d1%>'s Friends</span></a></li>
								<li><a href="friendprofile.jsp?name=<%=name%>" id="contact-link" class="skel-panels-ignoreHref"><span class="fa fa-envelope"><%=d1%>'s Profile</span></a></li>
                                                                <li><a href="login.jsp" id="contact-link" class="skel-panels-ignoreHref"><span class="fa fa-envelope">Log Out</span></a></li>
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
			
				
					
				<!-- Portfolio -->
					<section id="portfolio" class="two">
						<div class="container">
					
							<header>
								<h2>Friends</h2>
							</header>
							
							<table cellpadding="5" cellspacing="5" border="1">
          
              <%  String s1=null,s2=null;
              boolean flag=false; 
    Statement stmt=null;
    PrintWriter P=response.getWriter();
   rs=showfriends.show(name);
               while(rs.next())
                    {
                   flag=true;
                            s1=rs.getString(1);
                            System.out.println(s1);
                                                                                                                                     
             %>  
         <div class="row">
            <div class="4u">
                    <article class="item">
                            <a href="http://ineedchemicalx.deviantart.com/art/A-million-suns-384369739" class="image full"><img src="images/pic02.jpg" alt="" /></a>
                            <header>
                                    <h3>Ipsum Feugiat</h3>
                            </header>
                    </article>
                    <article class="item">
                            <a href="http://ineedchemicalx.deviantart.com/art/Mind-is-a-clear-stage-375431607" class="image full"><img src="images/pic03.jpg" alt="" /></a>
                            <header>
                                    <h3>Rhoncus Semper</h3>
                            </header>
                    </article>
            </div>
         </div>
    <tr>
        <td><a href="showdetails.jsp?name=<%=s1%>"><%=s1%></a></td>
       
    </tr>
            
    <%
       }
   if(!flag)
             {
       %>
       <br/>
                                                <br/>
                                                <br/>
            <font size="+2.0">SORRY! NO FRIENDS</font>
            <%
}     
               %>
               
                
               
                  </table>
						
							<!--<div class="row">
								<div class="4u">
									<article class="item">
										<a href="http://ineedchemicalx.deviantart.com/art/A-million-suns-384369739" class="image full"><img src="images/pic02.jpg" alt="" /></a>
										<header>
											<h3>Ipsum Feugiat</h3>
										</header>
									</article>
									<article class="item">
										<a href="http://ineedchemicalx.deviantart.com/art/Mind-is-a-clear-stage-375431607" class="image full"><img src="images/pic03.jpg" alt="" /></a>
										<header>
											<h3>Rhoncus Semper</h3>
										</header>
									</article>
								</div>
								<div class="4u">
									<article class="item">
										<a href="http://ineedchemicalx.deviantart.com/art/You-really-got-me-345249340" class="image full"><img src="images/pic04.jpg" alt="" /></a>
										<header>
											<h3>Magna Nullam</h3>
										</header>
									</article>
									<article class="item">
										<a href="http://ineedchemicalx.deviantart.com/art/Ad-infinitum-354203162" class="image full"><img src="images/pic05.jpg" alt="" /></a>
										<header>
											<h3>Natoque Vitae</h3>
										</header>
									</article>
								</div>
								<div class="4u">
									<article class="item">
										<a href="http://ineedchemicalx.deviantart.com/art/Elysium-355393900" class="image full"><img src="images/pic06.jpg" alt="" /></a>
										<header>
											<h3>Dolor Penatibus</h3>
										</header>
									</article>
									<article class="item">
										<a href="http://ineedchemicalx.deviantart.com/art/Emperor-of-the-Stars-370265193" class="image full"><img src="images/pic07.jpg" alt="" /></a>
										<header>
											<h3>Orci Convallis</h3>
										</header>
									</article>
								</div>
							</div>

						</div>
					</section>-->

				

		<!-- Footer -->
			<div id="footer">
				
				<!-- Copyright -->
					<div class="copyright">
						<p>&copy; 2013 SixDegrees. All rights reserved.</p>
						<ul class="menu">
							<li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
							<li>Images: <a href="http://ineedchemicalx.deviantart.com">Felicia Simion</a></li>
						</ul>
					</div>
				
			</div>

	</body>
</html>

