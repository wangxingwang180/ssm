<%--
  Created by IntelliJ IDEA.
  User: wangxingwang
  Date: 2017/1/20
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>中国旺旺科技有限公司</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
    <link href="${pageContext.request.contextPath}/css/style.css" type="text/css" rel="stylesheet" media="all">
    <!-- Custom Theme files -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script type="application/x-javascript">
        addEventListener("load", function() {
            setTimeout(hideURLbar, 0);
        }, false);
        function hideURLbar(){
            window.scrollTo(0,1);
        }
    </script>
    <!-- //Custom Theme files -->
    <!-- js -->
    <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
    <link href="${pageContext.request.contextPath}/css/gallery.css" rel='stylesheet' type='text/css' />
    <!-- //js -->
    <!--fonts-->
    <%--<link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,200italic,300,300italic,400italic,600,600italic,700,700italic,900' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Signika+Negative:300,400,600,700' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,300,600,700,800,400' rel='stylesheet' type='text/css'>--%>
    <!--/fonts-->
    <!-- start-smoth-scrolling-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/move-top.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easing.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function($) {
            $(".scroll").click(function(event){
                event.preventDefault();
                $('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
            });
        });
    </script>
    <!--//end-smoth-scrolling-->
</head>
<body>
<!--banner-->
<div class="banner">
    <!--header-->
    <div class="headder">
        <nav class="navbar navbar-default">
            <!-- Brand and toggle get grouped for better mobile display -->
            <%--<div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"> </span>
                    <span class="icon-bar"> </span>
                    <span class="icon-bar"> </span>
                </button>
            </div>--%>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#home" class="active">首页</a></li>
                    <li><a href="#about" class="scroll">关于我们</a></li>
                    <li><a href="#services" class="scroll">服务</a></li>
                    <li><a href="#gallery" class="scroll">画廊</a></li>
                    <li><a href="#contact" class="scroll">联系方式</a></li>
                </ul>
            </div>
        </nav>
        <div class="logo">
           <%-- <a class="navbar-brand" href="javascript:void(0);"><img src="images/logo.png" /></a>--%>
        </div>
        <div class="header-right-text" style="float: right;">
            <h3><span>登录&nbsp;注册</span></h3>
        </div>
        <div class="clearfix"> </div>
    </div>
    <!--//header-->
    <h1>IMMOVABLE</h1>
</div>
<!--//banner-->
<!--about-->
<div class="about" id="about">
    <div class="container">
        <h6>About Us</h6>
        <div class="about-grids">
            <div class="col-md-6 about-info">
                <img src="images/img1.jpg" alt=""/>
            </div>
            <div class="col-md-6 about-info">
                <h3>Real Estate Info</h3>
                <p>A wonderful designs has takenpossession of lorem Ipsum is simply dummy text of the printing and typesetting industry In sit amet sapien eros Integer  in tincidunt labore et dolore magna aliqua  remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages.</p>
                <p class="ab-text">A wonderful designs has takenpossession of lorem Ipsum It has survived not only five centuries, but also the leap into electronic typesetting, is simply dummy text of the printing and typesetting industry  It was popularised in the 1960s with the release </p>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>
<!--/abouot-->
<!--services-->
<div class="services" id="services">
    <!-- container -->
    <div class="container">
        <h6>Our Services</h6>
        <div class="serve-grids">
            <div class="serve-grids-top">
                <div class="col-md-3 service-box">
                    <figure class="icon">
                        <i class="glyphicon glyphicon-modal-window"> </i>
                    </figure>
                    <h5>Amet Dolor</h5>
                    <p>Sed ut perspiciis iste natus error sit voluptatem accusantium doloremque laudantium.</p>
                </div>
                <div class="col-md-3 service-box">
                    <figure class="icon">
                        <i class="glyphicon glyphicon-tent"> </i>
                    </figure>
                    <h5>Amet Dolor</h5>
                    <p>Sed ut perspiciis iste natus error sit voluptatem accusantium doloremque laudantium.</p>
                </div>
                <div class="col-md-3 service-box">
                    <figure class="icon">
                        <i class="glyphicon glyphicon-asterisk"> </i>
                    </figure>
                    <h5>Amet Dolor</h5>
                    <p>Sed ut perspiciis iste natus error sit voluptatem accusantium doloremque laudantium.</p>
                </div>
                <div class="col-md-3 service-box">
                    <figure class="icon">
                        <i class="glyphicon glyphicon-map-marker"> </i>
                    </figure>
                    <h5>Amet Dolor</h5>
                    <p>Sed ut perspiciis iste natus error sit voluptatem accusantium doloremque laudantium.</p>
                </div>
                <div class="clearfix"> </div>
            </div>
        </div>
        <!-- //container -->
    </div>
</div>
<!--/services-->
<!--spl-grid-->
<div class="container">
    <div class="banner-bottom2">
        <div class="banner-bottom-right1">
            <div class="banner-bottom-right-info">
                <h2 class="voluptatum">exercitation voluptatum</h2>
                <p class="quis">Lorem ipsum dolor sit amet, consectetur adipiscing elit,
                    sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. <span>
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi
						ut aliquip ex ea commodo consequat.</span></p>
                <a href="#" class="hvr-rectangle-in"><i class="glyphicon glyphicon-chevron-right"> </i></a>
            </div>
            <div class="cate Nam">
                <h2>Categories</h2>
                <ul>
                    <li><a href="#">Placeat facere possimus voluptas assumenda</a></li>
                    <li><a href="#">Voluptatibus maiores alias aut perferendis</a></li>
                    <li><a href="#">Itaque earum rerum hic tenetur a sapiente</a></li>
                    <div class="no-text">
                        <li><a href="#">Consequatur aut perferendis doloribus</a></li>
                        <li><a href="#">Distinctio. Nam libero cum soluta nobis</a></li>
                        <li><a href="#">Reiciendis voluptatibus maiores consequatur</a></li>
                    </div>
                </ul>
            </div>
        </div>
        <div class="banner-bottom-left1">
            <div class="banner-bottom-left-grids">
                <div class="banner-bottom-left-grid iusto">
                    <img src="images/4.jpg" alt=" " class="mnb img-responsive">
                    <div class="cap1 cum">
                        <span> </span>
                    </div>
                </div>
                <div class="banner-bottom-left-grid txt1">
                    <h3>Nemo enim ipsam voluptatem quia aspernatur</h3>
                    <p class="asd">At vero eos et accusamus et iusto odio dignissimos ducimus
                        qui blanditiis praesentium voluptatum deleniti atque.<span>
							Duis aute irure dolor in cum soluta voluptatibus maiores
							consequatur nobis voluptate  repudiandae sint et molestiae.</span></p>
                </div>
                <div class="banner-bottom-left-grid iusto">
                    <img src="images/5.jpg" alt=" " class="mnb img-responsive">
                    <div class="cap">
                        <span> </span>
                    </div>
                </div>
                <div class="clearfix"> </div>
            </div>
            <div class="banner-bottom-left-grids">
                <div class="banner-bottom-left-grid txt1">
                    <h3>Nemo enim ipsam voluptatem quia aspernatur</h3>
                    <p class="asd">At vero eos et accusamus et iusto odio dignissimos ducimus
                        qui blanditiis praesentium voluptatum deleniti atque.<span>
							Duis aute irure dolor in cum soluta voluptatibus
							maiores consequatur nobis voluptate repudiandae sint et molestiae.</span></p>
                </div>
                <div class="banner-bottom-left-grid iusto">
                    <img src="images/6.jpg" alt=" " class="mnb img-responsive">
                    <div class="cap3">
                        <span> </span>
                    </div>
                </div>
                <div class="banner-bottom-left-grid txt1">
                    <h3>Nemo enim ipsam voluptatem quia aspernatur</h3>
                    <p class="asd">At vero eos et accusamus et iusto odio dignissimos ducimus
                        qui blanditiis praesentium voluptatum deleniti atque.<span>
							Duis aute irure dolor in cum soluta voluptatibus maiores
							consequatur nobis voluptate repudiandae sint et molestiae.</span></p>
                </div>
                <div class="clearfix"> </div>
            </div>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
<!--/spl-grid-->
<div class="mid-section">
    <div class="container">
        <div class="mid-top">
            <h2>We are Always There at Your Services</h2>
            <p>Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incidi- dunt ut labore et dolore magna aliqua. Ut enim ad minim veniam. Ut enim ad minim veniam.</p>
        </div>
    </div>
</div>
<div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >手机网站模板</a></div>
<!--start-gallery-->
<div class="gallery" id="gallery">
    <div class="container">
        <h6>Gallery</h6>
        <div class="gallery-bottom">
            <div class="view view-ninth">
                <a href="images/g1.jpg" class="b-link-stripe b-animate-go  swipebox"  title="Image Title"><img src="images/g1.jpg" alt="" class="img-responsive">
                    <div class="mask mask-1"> </div>
                    <div class="mask mask-2"> </div>
                    <div class="content">
                        <h2>Real Estate</h2>
                        <p>A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart.</p>
                        <a href="#" class="info">Read More</a>
                    </div>
            </div>
            <div class="view view-ninth">
                <a href="images/g2.jpg" class="b-link-stripe b-animate-go  swipebox"  title="Image Title"><img src="images/g2.jpg" alt="" class="img-responsive">
                    <div class="mask mask-1"> </div>
                    <div class="mask mask-2"> </div>
                    <div class="content">
                        <h2>Real Estate</h2>
                        <p>A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart.</p>
                        <a href="#" class="info">Read More</a>
                    </div>
            </div>
            <div class="view view-ninth">
                <a href="images/g3.jpg" class="b-link-stripe b-animate-go  swipebox"  title="Image Title"><img src="images/g3.jpg" alt="" class="img-responsive">
                    <div class="mask mask-1"> </div>
                    <div class="mask mask-2"> </div>
                    <div class="content">
                        <h2>Real Estate</h2>
                        <p>A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart.</p>
                        <a href="#" class="info">Read More</a>
                    </div>
            </div>
            <div class="view view-ninth">
                <a href="images/g4.jpg" class="b-link-stripe b-animate-go  swipebox"  title="Image Title"><img src="images/g4.jpg" alt="" class="img-responsive">
                    <div class="mask mask-1"> </div>
                    <div class="mask mask-2"> </div>
                    <div class="content">
                        <h2>Real Estate</h2>
                        <p>A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart.</p>
                        <a href="#" class="info">Read More</a>
                    </div>
            </div>
            <div class="view view-ninth">
                <a href="images/g5.jpg" class="b-link-stripe b-animate-go  swipebox"  title="Image Title"><img src="images/g5.jpg" alt="" class="img-responsive">
                    <div class="mask mask-1"> </div>
                    <div class="mask mask-2"> </div>
                    <div class="content">
                        <h2>Real Estate</h2>
                        <p>A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart.</p>
                        <a href="#" class="info">Read More</a>
                    </div>
            </div>
            <div class="view view-ninth">
                <a href="images/g6.jpg" class="b-link-stripe b-animate-go  swipebox"  title="Image Title"><img src="images/g6.jpg" alt="" class="img-responsive">
                    <div class="mask mask-1"> </div>
                    <div class="mask mask-2"> </div>
                    <div class="content">
                        <h2>Real Estate</h2>
                        <p>A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart.</p>
                        <a href="#" class="info">Read More</a>
                    </div>
            </div>
            <div class="view view-ninth">
                <a href="images/g7.jpg" class="b-link-stripe b-animate-go  swipebox"  title="Image Title"><img src="images/g7.jpg" alt="" class="img-responsive">
                    <div class="mask mask-1"> </div>
                    <div class="mask mask-2"> </div>
                    <div class="content">
                        <h2>Real Estate</h2>
                        <p>A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart.</p>
                        <a href="#" class="info">Read More</a>
                    </div>
            </div>
            <div class="view view-ninth">
                <a href="images/g8.jpg" class="b-link-stripe b-animate-go  swipebox"  title="Image Title"><img src="images/g8.jpg" alt="" class="img-responsive">
                    <div class="mask mask-1"> </div>
                    <div class="mask mask-2"> </div>
                    <div class="content">
                        <h2>Real Estate</h2>
                        <p>A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart.</p>
                        <a href="#" class="info">Read More</a>
                    </div>
            </div>
            <div class="view view-ninth">
                <a href="images/g9.jpg" class="b-link-stripe b-animate-go  swipebox"  title="Image Title"><img src="images/g9.jpg" alt="" class="img-responsive">
                    <div class="mask mask-1"> </div>
                    <div class="mask mask-2"> </div>
                    <div class="content">
                        <h2>Real Estate</h2>
                        <p>A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart.</p>
                        <a href="#" class="info">Read More</a>
                    </div>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>
<link rel="stylesheet" href="css/swipebox.css">
<script src="js/jquery.swipebox.min.js"></script>
<script type="text/javascript">
    jQuery(function($) {
        $(".swipebox").swipebox();
    });
</script>
<!--//gallery-->
<!--contact-->
<div class="contact" id="contact">
    <div class="container">
        <h6>Contact</h6>
        <div class="contact-grids">
            <div class="col-md-7 contact-left">
                <form>
                    <input type="text" value="Name" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Name';}" required="">
                    <input type="email" value="Email" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Email';}" required="">
                    <input type="text" value="Telephone" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Telephone';}" required="">
                    <textarea type="text"  onfocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Message...';}" required="">Message...</textarea>
                    <input type="submit" value="Submit" >
                </form>
            </div>
            <div class="col-md-5 contact-right">
                <p class="cnt-p">Lorem ipsum dolor sit amet, consectetur adipisicing elit,sheets containing Lorem Ipsum passages sed do </p>
                <p>Eiusmod Tempor inc</p>
                <p>2222 St Dolor,London</p>
                <p>Telephone : +2 111 111 1111</p>
                <p>FAX : +1 000 0000 0000</p>
                <p>Email : <a href="mailto:example@mail.com">mail@example.com</a></p>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>
<!--contact-->
<div class="footer">
    <div class="container">
        <p>Copyright &copy; 2015.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
    </div>
</div>
<!--//contact-->
<script type="text/javascript">
    $(document).ready(function() {
        /*
         var defaults = {
         containerID: 'toTop', // fading element id
         containerHoverID: 'toTopHover', // fading element hover id
         scrollSpeed: 1200,
         easingType: 'linear'
         };
         */

        $().UItoTop({ easingType: 'easeOutQuart' });

    });
</script>
<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!--//smooth-scrolling-of-move-up
<!-- Bootstrap core JavaScript
================================================== --->
<!-- Placed at the end of the document so the pages load faster-->
<script src="js/bootstrap.js"> </script>
</body>
</html>
