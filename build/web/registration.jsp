<%-- 
    Document   : Registration
    Created on : 22 Feb, 2014, 11:50:43 PM
    Author     : Nitin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<!--

	Parallelism 1.1 by HTML5 UP
	html5up.net | @n33co
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)

-->
<html>
	<head>
		<title>Parallelism by HTML5 UP</title>
		<meta name="viewport" content="width=1120,user-scalable=no" />
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400" rel="stylesheet" type="text/css" />
		<!--[if lte IE 8]><script src="js/html5shiv.js"></script>-->
		<script src="js/jquery.min.js"></script>
		<script src="js/jquery.poptrox.min.js"></script>
		<script src="js/config.js"></script>
		<script src="js/skel.min.js"></script>
		<noscript>
			<link rel="stylesheet" href="css/skel-noscript.css" />
			<link rel="stylesheet" href="css/style.css" />
			<link rel="stylesheet" href="css/style-desktop.css" />
			<link rel="stylesheet" href="css/style-noscript.css" />
		</noscript>
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie8.css" /><![endif]-->
                <script lanuage="javascript">
 	function checkFormValidator()
        {
            var fname=document.forms["register"]["Firstname"].value;
            var lname=document.forms["register"]["Lastname"].value;
            var dob=document.forms["register"]["DOB"].value;
            var sex=document.forms["register"]["Sex"].value;
            var email=document.forms["register"]["email"].value;
            var p1=document.forms["register"]["Password1"].value;
            var p2=document.forms["register"]["Password2"].value;
            var pattern1=/^\w+[a-z0-9]*[!#$*+-_/?~^]*[a-z0-9]+[@]\w+[.]?\w{0,2}[.]\w{2,3}$/
            if(fname==null || lname==null|| dob==null || sex==null || email==null || fname=="" || lname==""|| dob=="" || sex=="" || email=="")
                {
                    alert("Do not leave any field blank!")
                    return false;
                }
            else if(p1.length<6 || p2.length<6 || p1.length>50 || p2.length>50)
            {
                alert("Password length should be between 6-50 characters");
                return false;
            }
            else if(p1!=p2)
            {
                alert("Passwords do not match");
                return false;
            }
            else
                {
                    if(email.match(pattern1))
                        {
                            return true;
                        }
                    else
                        {
                            alert("Enter proper E-mail id");
                            return false;
                        }
                }
        }
</script>
	</head>
	<body>

		<div id="wrapper">
                    <center>
     <form name="register" action="registration"  method="post" onsubmit="return checkFormValidator()">                   
    <table>
        <tr> <pre>   
            <td> <font face="Arial" size="+1.5">FIRST NAME</font></td>
            <td> <font face="Arial" size="+1.5">LAST NAME</font></td></pre>
        </tr>
        
        <tr>
            <td><input type="text" name="Firstname" class="button style3 scrolly scrolly-centered"/></td>
            <td><input type="text" name="Lastname" class="button style3 scrolly scrolly-centered"></td>
        </tr>
        <tr>
            <td> <font face="Arial" size="+1.5">DATE OF BIRTH</font></td>
            <td> <font face="Arial" size="+1.5">EMAIL</font></td>
            </tr>
         
          <tr>
            <td><input type="date" name="DOB" class="button style3 scrolly scrolly-centered"/></td>
            <td><input type="text" name="email" class="button style3 scrolly scrolly-centered"/></td>
            </tr>
          <tr>
            <td> <font face="Arial" size="+1.5">PASSWORD</font></td>
            <td> <font face="Arial" size="+1.5">CONFIRM PASSWORD</font></td>
            </tr>
          <tr>
            <td><input type="password" name="Password1" class="button style3 scrolly scrolly-centered"/></td>
            <td><input type="password" name="Password2" class="button style3 scrolly scrolly-centered"/></td>
            </tr>
            <tr>
            <td><input type="radio" name="Sex" value="Male"> <font face="Arial" size="+0.5"> Male</font></td>
<td><input type="radio" name="Sex" value="Female"> <font face="Arial" size="+0.5"> Female</font></td>
         </tr>
         <br/><br/>
         <tr>
        <td><input type="submit" value="SUBMIT" align="center" class="button style2 scrolly scrolly-centered"></td>
        <td><input type="reset" value="RESET" class="button style2 scrolly scrolly-centered"></td>
</tr>
        
    </table></form></center>
                                        


<%--<div id="main">
				<div id="reel">
				<!-- ******************************************************************************************** -->
				<!-- ******************************************************************************************** -->
				

					<!-- Header Item -->
					
						<div id="header" class="item" data-width="400">
							<h1>Parallelism</h1>
							<p>A responsive portfolio site<br />
							template by HTML5 UP</p>
						</div>
					
					<!-- Thumb Items -->

						<article class="item thumb" data-width="282">
							<h2>You really got me</h2>
							<a href="images/fulls/01.jpg"><img src="images/thumbs/01.jpg" alt=""></a>
						</article>
						
						<article class="item thumb" data-width="384">
							<h2>Ad Infinitum</h2>
							<a href="images/fulls/02.jpg"><img src="images/thumbs/02.jpg" alt=""></a>
						</article>
						
						<article class="item thumb" data-width="274">
							<h2>Different.</h2>
							<a href="images/fulls/03.jpg"><img src="images/thumbs/03.jpg" alt=""></a>
						</article>
						
						<article class="item thumb" data-width="282">
							<h2>Elysium</h2>
							<a href="images/fulls/04.jpg"><img src="images/thumbs/04.jpg" alt=""></a>
						</article>
						
						<article class="item thumb" data-width="476">
							<h2>Kingdom of the Wind</h2>
							<a href="images/fulls/05.jpg"><img src="images/thumbs/05.jpg" alt=""></a>
						</article>
						
						<article class="item thumb" data-width="232">
							<h2>The Pursuit</h2>
							<a href="images/fulls/06.jpg"><img src="images/thumbs/06.jpg" alt=""></a>
						</article>
						
						<article class="item thumb" data-width="352">
							<h2>Boundless</h2>
							<a href="images/fulls/07.jpg"><img src="images/thumbs/07.jpg" alt=""></a>
						</article>
						
						<article class="item thumb" data-width="348">
							<h2>The Spectators</h2>
							<a href="images/fulls/08.jpg"><img src="images/thumbs/08.jpg" alt=""></a>
						</article>

					<!-- Filler Thumb Items (just for demonstration purposes) -->
						<article class="item thumb" data-width="476"><h2>Kingdom of the Wind</h2><a href="images/fulls/05.jpg"><img src="images/thumbs/05.jpg" alt=""></a></article>
						<article class="item thumb" data-width="232"><h2>The Pursuit</h2><a href="images/fulls/06.jpg"><img src="images/thumbs/06.jpg" alt=""></a></article>
						<article class="item thumb" data-width="352"><h2>Boundless</h2><a href="images/fulls/07.jpg"><img src="images/thumbs/07.jpg" alt=""></a></article>
						<article class="item thumb" data-width="348"><h2>The Spectators</h2><a href="images/fulls/08.jpg"><img src="images/thumbs/08.jpg" alt=""></a></article>
						<article class="item thumb" data-width="282"><h2>You really got me</h2><a href="images/fulls/01.jpg"><img src="images/thumbs/01.jpg" alt=""></a></article>
						<article class="item thumb" data-width="384"><h2>Ad Infinitum</h2><a href="images/fulls/02.jpg"><img src="images/thumbs/02.jpg" alt=""></a></article>
						<article class="item thumb" data-width="274"><h2>Different.</h2><a href="images/fulls/03.jpg"><img src="images/thumbs/03.jpg" alt=""></a></article>
						<article class="item thumb" data-width="282"><h2>Elysium</h2><a href="images/fulls/04.jpg"><img src="images/thumbs/04.jpg" alt=""></a></article>


				<!-- ******************************************************************************************** -->
				<!-- ******************************************************************************************** -->
				</div>
			</div> --%>
		
			<div id="footer">
				<div class="left">
					<p>This is <strong>Parallelism</strong>, a responsive portfolio site template by <a href="http://html5up.net/">HTML5 UP</a>. free for personal<br />
					and commercial use under the <a href="http://html5up.net/license/">CCA 3.0</a>. The awesome demo images used in this design<br />
					are by the amazingly talented <a href="http://ineedchemicalx.deviantart.com/">Felicia Simion</a>. Check out her work at <a href="http://ineedchemicalx.deviantart.com/">deviantART</a>.</p>
				</div>
				<div class="right">
					<ul class="contact">
						<li><a href="#" class="fa fa-twitter solo"><span>Twitter</span></a></li>
						<li><a href="#" class="fa fa-facebook solo"><span>Facebook</span></a></li>
						<li><a href="#" class="fa fa-google-plus solo"><span>Google+</span></a></li>
						<li><a href="#" class="fa fa-dribbble solo"><span>Dribbble</span></a></li>
						<li><a href="#" class="fa fa-pinterest solo"><span>Pinterest</span></a></li>
						<li><a href="#" class="fa fa-envelope solo"><span>Email</span></a></li>
					</ul>
					<div id="copyright">
						&copy; Untitled. Design: <a href="http://html5up.net/">HTML5 UP</a>
					</div>
				</div>
			</div>

		</div>

	</body>
</html>
