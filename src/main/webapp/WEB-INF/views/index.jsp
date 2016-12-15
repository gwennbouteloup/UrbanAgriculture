<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="utf-8">
<title>Urban agriculture: how to create your own business.</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="author" content="Gwennaël Bouteloup design">

<!-- google web fonts -->
<link
	href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,300italic,500,400italic,700'
	rel='stylesheet' type='text/css'>

<!-- CSS Styles -->

<!-- bootstrap css -->
<link href='<c:url value="/resources/css/bootstrap.css"/>'
	rel="stylesheet">

<!-- custom css -->
<link href='<c:url value="/resources/css/custom.css"/>' rel="stylesheet">

<!-- standart theme css -->
<link rel="stylesheet" id="theme"
	href='<c:url value="/resources/css/theme1.css"/>' type="text/css" />

<!-- Font Awesome Icons css -->
<link rel="stylesheet"
	href='<c:url value="/resources/font-awesome/css/font-awesome.min.css"/>'>

<!-- BxSlider and Sequence Slider css -->
<link rel="stylesheet"
	href='<c:url value="/resources/css/jquery.bxslider.css"/>'
	type="text/css" />
<link rel="stylesheet" media="screen"
	href='<c:url value="/resources/css/sequence-slider.css"/>'>

<!-- Magnific Popup core CSS file -->
<link rel="stylesheet"
	href='<c:url value="/resources/css/magnific-popup.css"/>'>

<!-- Color Switch Panel css -->
<link rel="stylesheet"
	href='<c:url value="/resources/css/color.switch.css"/>' type="text/css" />

<!-- Back to Top Button css -->
<link rel="stylesheet" href='<c:url value="/resources/css/top.css"/>'
	type="text/css" />

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="../js/html5shiv.js"></script>
    <![endif]-->

<!-- Fav and touch icons -->
<link rel="shortcut icon"
	href='<c:url value="/resources/img/favicon.ico"/>'>
<link rel="apple-touch-icon"
	href='<c:url value="/resources/img/apple-touch-icon.png"/>'>
<link rel="apple-touch-icon" sizes="72x72"
	href='<c:url value="/resources/img/apple-touch-icon-72x72.png"/>'>
<link rel="apple-touch-icon" sizes="114x114"
	href='<c:url value="/resources/img/apple-touch-icon-114x114.png" />'>

</head>
<body>

	<!-- START PRIMARY LAYOUT
======================== -->

	<!-- Back to Top Button (visible after scrolling 1200px down) Change Styles at the top.css file -->
	<div class="button-top" id="top-bt">

		<a href="#about"><i class="fa fa-sort-desc fa-3x"></i></a>

	</div>
	<!-- Back to Top Button END -->

	<!-- NAVBAR -->
	<!-- Wrap the .navbar in .container to center it within the absolutely positioned parent. -->
	<nav class="navbar navbar-inverse navbar-static-top" role="navigation"
		id="menu">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"> <img
					src='<c:url value="/resources/img/logo.png"/>' alt="" class="logo">
				</a>
			</div>
			<!-- MENU LINKS -->
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav" id="navigation">
					<li><a href="#about">About</a></li>
					<li><a href="#team">The developper</a></li>
					<li><a href="#contact">Contact</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- NAVBAR END -->

	<!-- SEQUENCE SLIDER Change Styles at the sequence-slider.css file -->
	<div id="top-slider">
		<div class="slider-bg"></div>
		<div class="container">

			<div id="sequence">

				<img class="sequence-prev"
					src='<c:url value="/resources/img/button-previous.svg"/>'
					alt="Previous Frame" /> <img class="sequence-next"
					src='<c:url value="/resources/img/button-next.svg"/>'
					alt="Next Frame" />

				<ul class="sequence-canvas">
					<li class="animate-in">
						<h2 class="title">Bootstrap 3</h2>
						<h3 class="subtitle">Super Flat and modern One Page Website
							Template</h3> <img class="slider-image"
						src='<c:url value="/resources/img/slider/1.png"/>' alt="Image" />
					</li>
					<li>
						<h2 class="title">Responsive Design</h2>
						<h3 class="subtitle">Design is automatically adapted on all
							Devices, with clean HTML5 and CSS3 Code</h3> <img class="slider-image"
						src='<c:url value="/resources/img/slider/2.png"/>' alt="Image" />
					</li>
					<li>
						<h2 class="title">Cross Browser</h2>
						<h3 class="subtitle">Supports modern browsers, touch devices
							and responsive designs</h3> <img class="slider-image"
						src='<c:url value="/resources/img/slider/3.png"/>' alt="Image" />
					</li>
					<li>
						<h2 class="title">Innovation inside</h2>
						<h3 class="subtitle">Connected to a Spring MVC hibernate
							architecture with a MySQL database</h3> <img class="slider-image"
						src='<c:url value="/resources/img/slider/2.png"/>' alt="Image" />
					</li>
				</ul>

				<ul class="sequence-pagination">
					<li><img
						src='<c:url value="/resources/img/pagination-dot.svg"/>'
						alt="Image" /></li>
					<li><img
						src='<c:url value="/resources/img/pagination-dot.svg"/>'
						alt="Image" /></li>
					<li><img
						src='<c:url value="/resources/img/pagination-dot.svg"/>'
						alt="Image" /></li>
				</ul>

			</div>

		</div>
	</div>
	<!-- SEQUENCE SLIDER END -->

	<!-- ABOUT THE PROJECT -->
	<div id="about">
		<div class="container">
			<div class="row">
				<div class="center-block head">
					<div class="col-lg-12 col-md-12 col-xs-12">

						<h1 class="">About the project</h1>
						<hr class="head-border-white">
						<p class="subhead" style="font-size: 20px;">The goal of the
							project is to help people to build their own urban agriculture
							business. The first thing to do, is to have a clear idea of what
							is possible to do, and how is it possible to do it. These first
							steps are very important, and we will try to provide you a clear
							process to begin your business in the best conditions.</p>
						<p class="subhead" style="font-size: 20px;">From a technical
							point of view, this responsive website use the last web design
							frameworks: bootstrap, HTML 5, CSS3 and the last versions of J2EE
							technologies: java 1.8, maven 3.3.9, hibernate 5.2.4,
							javax.servlet 3.1.0, mysql 6, slf4j 1.7.21. The architecture
							follows a web mvc standard approach, using annotations without
							xml for the entity beans. The Mysql database is composed of 24
							tables.</p>
					</div>

				</div>

				<div align="center">
					<h1 style="font-size: 20px;">Following table gather
						information from the database from the entity relationship
						{Business;InstallationType;CompanyLocation}</</h1>

					<table style="border: 1px solid black;" align="center">
						<tbody style="font-size: 12px !important;">
							<th style="border: 1px solid black;">Id company</th>
							<th style="border: 1px solid black;">Id company location</th>
							<th style="border: 1px solid black;">Id business</th>
							<th style="border: 1px solid black;">Id installation type</th>

							<c:forEach var="businessInst"
								items="${viewListBusinessInstTypeOnGround}" varStatus="status">
								<tr>
									<td style="border: 1px solid black;">${businessInst.idCompany}</td>
									<td style="border: 1px solid black;">${businessInst.idCompanyLocation}</td>
									<td style="border: 1px solid black;">${businessInst.idBusiness}</td>
									<td style="border: 1px solid black;">${businessInst.idInstallationType}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>

			</div>
		</div>
	</div>
	<!-- ABOUT END -->


	<!-- TEAM  -->
	<div id="team">
		<div class="container">

			<div class="row">

				<div class="center-block head">

					<div class="col-lg-12 col-md-12 col-xs-12">

						<h1 class="">About the developer</h1>
						<hr class="head-border-white">
						<p class="subhead">"L'art commence en imitant et s'achève en
							innovant." - Mason Cooley, auteur américain -</p>
						<p class="subhead">"L'innovation n'est pas un flash de génie.
							C'est un travail difficile. Et ce travail devrait être organisé
							comme une activité régulière de chaque unité de l'entreprise et
							ce à chaque niveau du management" - Peter Drucker, théoricien du
							management -</p>
					</div>

				</div>

				<!-- TEAM MEMBER -->
				<section id="about" class="container content-section text-center">
					<div class="row">
						<div class="col-lg-8 col-lg-offset-2">
							<h1 style="font-size: 20px;">Gwennaël Bouteloup</h1>
							<p>Information system specialist with almost 10 years of
								experience. Gwennaël has used several technologies like .Net,
								Flex, C, C++, C#, VB, VBA, Netbeans, Eclipse, Visual Studio,
								Oracle, PostgreSQL... He has a deep knowledge in object oriented
								and model driven technologies. His favorite technologies are
								inside J2EE world (Java, EJB, Spring, Hibernate, ...). He has
								also a good knowledge in several methodologies (Merise, UML,
								SOA, Scrum, ...) and in PLM (Windchill). He is also experienced
								in Business Consulting and in project management. To know more
								about Gwennaël expertise, go on his linkedin profile.</p>
							<p class="social-team">
								</a> <a class="linkedin"
									href="https://www.linkedin.com/profile/preview?trk=prof-0-sb-preview-primary-button&locale=fr_FR"><i
									class="fa fa-linkedin-square fa-1-5x"></i></a>
							</p>
						</div>
					</div>
				</section>

			</div>
		</div>
	</div>
	<!-- TEAM  END-->

	<!-- CONTACT -->
	<div id="contact">

		<div class="container">
			<div class="row">

				<div class="center-block head">

					<div class="col-lg-12 col-md-12 col-xs-12">

						<h1>Get in Touch</h1>
						<hr class="head-border-grey">
						<p class="center"></p>

					</div>

				</div>

				<!-- CONTACT FORM -->
				<div class="col-lg-8 col-md-8 col-lg-offset-2 col-md-offset-2 form">
					<!--FORM -->
					<form action="/resources/contact.php" class="form-horizontal"
						role="form" id="contactForm" method="post" name="contactForm">

						<div class="form-group">

							<div class="col-sm-12">
								<input type="text" class="form-control input-lg" name="name"
									id="name" placeholder="Name*">
							</div>
						</div>

						<div class="form-group">

							<div class="col-sm-12">
								<input type="email" class="form-control input-lg" name="email"
									id="email" placeholder="Email*">
							</div>
						</div>

						<div class="form-group">

							<div class="col-sm-12">
								<input type="text" class="form-control input-lg" name="phone"
									id="phone" placeholder="Phone">
							</div>
						</div>

						<div class="form-group">

							<div class="col-sm-12">
								<textarea class="form-control input-lg" rows="10" name="message"
									id="message" placeholder="Message*"></textarea>
							</div>
						</div>

						<!-- 						<div class="control-group submit center"> -->
						<!-- 							<input class="btn btn-lg btn-primary" type="submit" -->
						<!-- 								value="Submit" -->
						<!-- 								onclick="window.location='https://www.google.com';"> -->
						<!-- 						</div> -->

					</form>

					<p class="d-grey requi">* Required</p>

				</div>

			</div>
		</div>
	</div>
	<!-- CONTACT END -->

	<!-- GOING UP ARROW -->
	<div class="col-lg-12">
		<div class="up">
			<a href="#about"><span class="glyphicon glyphicon-chevron-up"></span></a>
		</div>
	</div>
	<!-- GOING UP ARROW END -->

	<!-- BOTTOM -->
	<div id="foot">
		<div class="container">
			<div class="row">

				<div class="col-lg-4 col-md-4">
					<div class="bottom-con">

						<h5>Visit Us</h5>
						<hr class="head-border-white">

						<div class="">
							<p>
								<i class="fa fa-location-arrow"><span> Martigues</span></i>
							</p>
							<p>
								<i class="fa fa-map-marker"><span> Somewhere</span></i>
							</p>
							<p>
								<i class="fa fa-flag"><span> France</span></i>
							</p>
						</div>

					</div>
				</div>

				<div class="col-lg-4 col-md-4">
					<div class="bottom-con">

						<h5>Write Us</h5>
						<hr class="head-border-white">

						<div class="">
							<p>
								<i class="fa fa-phone"><span> TBD</span></i>
							</p>
							<p>
								<i class="fa fa-envelope"><span>
										gwennbouteloup@gmail.com</span></i>
							</p>
							<p>
								<i class="fa fa-print"><span> TBD</span></i>
							</p>
						</div>

					</div>
				</div>

				<div class="col-lg-4 col-md-4">

					<div class="bottom-con">

						<h5>Newsletter</h5>
						<hr class="head-border-white">

						<form action="#" method="post" class="newsletter">
							<div class="input-group">
								<span class="input-group-addon .glyphicon-envelope"><i
									class="fa fa-envelope orange"></i></span> <input type="email"
									class="form-control input-md" placeholder="Enter email">
							</div>
							<br>

							<div class="control-group submit center">
								<input type="submit" value="Subscribe Now!"
									class="btn btn-md btn-primary" />
							</div>

						</form>

					</div>

				</div>

				<div class="col-lg-12 col-md-12 footer">
					<p class="pull-right">
						<a href="#about">Back to top</a>
					</p>
					<p>
						&copy; 2016 © Gwennaël Bouteloup . &middot; <a href="#">Privacy</a>
						&middot; <a href="#">Terms</a>
					</p>
				</div>

			</div>
		</div>
	</div>
	<!-- FOOTER END -->

	<!-- COLOR SWITCH. Change Styles at the color.switch.css file -->
	<div class="editor">

		<div class="panel">

			<h5>Choose your Color</h5>

			<div id="changecss">

				<div class="row">

					<div class="circle-skin">
						<a href="javascript: void(0)" title="switch styling" id="theme1"><div
								class="left skin1-l"></div>
							<div class="right skin1-r"></div></a>
					</div>

					<div class="circle-skin">
						<a href="javascript: void(0)" title="switch styling" id="theme2"><div
								class="left skin2-l"></div>
							<div class="right skin2-r"></div></a>
					</div>

					<div class="circle-skin">
						<a href="javascript: void(0)" title="switch styling" id="theme3"><div
								class="left skin3-l"></div>
							<div class="right skin3-r"></div></a>
					</div>

					<div class="circle-skin">
						<a href="javascript: void(0)" title="switch styling" id="theme4"><div
								class="left skin4-l"></div>
							<div class="right skin4-r"></div></a>
					</div>

					<div class="circle-skin">
						<a href="javascript: void(0)" title="switch styling" id="theme5"><div
								class="left skin5-l"></div>
							<div class="right skin5-r"></div></a>
					</div>

					<div class="circle-skin">
						<a href="javascript: void(0)" title="switch styling" id="theme6"><div
								class="left skin6-l"></div>
							<div class="right skin6-r"></div></a>
					</div>

				</div>

			</div>

			<div class="clearfix"></div>


		</div>

		<div class="switch">
			<i class="fa fa-cog fa-spin fa-2x"></i>
		</div>

	</div>
	<!-- COLOR SWITCH END -->
	<!-- END PRIMARY LAYOUT
====================== -->


	<!-- JAVASCRIPT
================================================== -->
	<!-- BOOTSTRAP JAVASCRIPT -->
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script type="text/javascript"
		src='<c:url value="/resources/js/bootstrap.min.js"/>'></script>

	<!-- CUSTOM JAVASCRIPT -->
	<!-- Custom Functions -->
	<script type="text/javascript"
		src='<c:url value="/resources/js/functions.js"/>'></script>

	<!-- Portfolio with mixitup filter and prettyphoto -->
	<script type="text/javascript"
		src='<c:url value="/resources/js/jquery.mixitup.min.js"/>'></script>
	<!-- Magnific Popup core JS file -->
	<script type="text/javascript"
		src='<c:url value="/resources/js/magnific.js"/>'></script>

	<!-- BxSlider -->
	<script type="text/javascript"
		src='<c:url value="/resources/js/jquery.bxslider.min.js"/>'></script>

	<!-- Sequence Slider -->
	<script type="text/javascript"
		src='<c:url value="/resources/js/jquery.sequence-min.js"/>'></script>

	<!-- Parallax Background -->
	<script type="text/javascript"
		src='<c:url value="/resources/js/nbw-parallax.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/resources/js/jquery.inview.js"/>'></script>

	<!-- Smooth Scrolling -->
	<script type="text/javascript"
		src='<c:url value="/resources/js/smoothscroll.js"/>'></script>

	<!-- Sticky Navigation -->
	<script type="text/javascript"
		src='<c:url value="/resources/js/jquery.sticky.js"/>'></script>

	<!-- Style Switcher -->
	<script type="text/javascript"
		src='<c:url value="/resources/js/jquery.style-switcher.js"/>'></script>

	<!-- Clients Slider -->
	<script type="text/javascript"
		src='<c:url value="/resources/js/jquery.flexisel.js"/>'></script>

	<!-- Retina JS -->
	<script type="text/javascript"
		src='<c:url value="/resources/js/retina-1.1.0.min.js"/>'></script>
</body>
</html>