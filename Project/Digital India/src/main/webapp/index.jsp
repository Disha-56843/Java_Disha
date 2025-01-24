<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en" class="no-js">
<head>
<title>HotMagazine</title>

<script>
        document.addEventListener("DOMContentLoaded", function () {
            const newsContainer = document.getElementById("news-container");

            // Fetch news data passed from the Servlet
            const newsData = JSON.parse('<%= request.getAttribute("newsData") %>');

            if (newsData.articles) {
                newsData.articles.forEach(article => {
                    const newsItem = document.createElement("div");
                    newsItem.classList.add("news-item");
                    newsItem.innerHTML = `
                        <h3>${article.title}</h3>
                        <img src="${article.urlToImage}" alt="News Image" style="max-width:100%; height:auto;" />
                        <p>${article.description || "No description available."}</p>
                        <a href="${article.url}" target="_blank">Read more</a>
                    `;
                    newsContainer.appendChild(newsItem);
                });
            } else {
                newsContainer.innerHTML = "<p>No news available at the moment.</p>";
            }
        });
    </script>

<meta charset="utf-8">

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<link
	href='http://fonts.googleapis.com/css?family=Lato:300,400,700,900,400italic'
	rel='stylesheet' type='text/css'>
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet">

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"
	media="screen">
<link rel="stylesheet" type="text/css" href="css/jquery.bxslider.css"
	media="screen">
<link rel="stylesheet" type="text/css" href="css/font-awesome.css"
	media="screen">
<link rel="stylesheet" type="text/css" href="css/magnific-popup.css"
	media="screen">
<link rel="stylesheet" type="text/css" href="css/owl.carousel.css"
	media="screen">
<link rel="stylesheet" type="text/css" href="css/owl.theme.css"
	media="screen">
<link rel="stylesheet" type="text/css" href="css/ticker-style.css" />
<link rel="stylesheet" type="text/css" href="css/style.css"
	media="screen">

</head>
<body>

	<!-- Container -->
	<div id="container">

		<!-- Header
		    ================================================== -->

		<jsp:include page="header.jsp" />

		<!-- End Header -->

		<!-- block-wrapper-section
			================================================== -->
		<section class="block-wrapper shadow-white">

			<div class="list-line-posts">
				<div class="container">

					<div class="owl-wrapper">
						<div class="owl-carousel" data-num="4">

							<div class="item list-post">
								<img src="upload/news-posts/listw5.jpg" alt="">
								<div class="post-content">
									<a href="tech-category.html">News</a>
									<h2>
										<a href="single-post.html">Donec odio. Quisque volutpat
											mattis eros. </a>
									</h2>
									<ul class="post-tags">
										<li><i class="fa fa-clock-o"></i>27 may 2013</li>
									</ul>
								</div>
							</div>

							<div class="item list-post">
								<img src="upload/news-posts/listw4.jpg" alt="">
								<div class="post-content">
									<a href="tech-category.html">Business</a>
									<h2>
										<a href="single-post.html">Nullam malesuada erat ut
											turpis. </a>
									</h2>
									<ul class="post-tags">
										<li><i class="fa fa-clock-o"></i>27 may 2013</li>
									</ul>
								</div>
							</div>

							<div class="item list-post">
								<img src="upload/news-posts/listw3.jpg" alt="">
								<div class="post-content">
									<a href="tech-category.html">Mobile</a>
									<h2>
										<a href="single-post.html">Aliquam porttitor mauris sit
											amet orci. </a>
									</h2>
									<ul class="post-tags">
										<li><i class="fa fa-clock-o"></i>27 may 2013</li>
									</ul>
								</div>
							</div>

							<div class="item list-post">
								<img src="upload/news-posts/listw2.jpg" alt="">
								<div class="post-content">
									<a href="tech-category.html">Software</a>
									<h2>
										<a href="single-post.html">Morbi in sem quis dui placerat
											ornare. </a>
									</h2>
									<ul class="post-tags">
										<li><i class="fa fa-clock-o"></i>27 may 2013</li>
									</ul>
								</div>
							</div>

							<div class="item list-post">
								<img src="upload/news-posts/listw1.jpg" alt="">
								<div class="post-content">
									<a href="tech-category.html">News</a>
									<h2>
										<a href="single-post.html">Morbi in sem quis dui placerat
											ornare. </a>
									</h2>
									<ul class="post-tags">
										<li><i class="fa fa-clock-o"></i>27 may 2013</li>
									</ul>
								</div>
							</div>

						</div>
					</div>

				</div>
			</div>
		</section>

		<!-- block-wrapper-section
			================================================== -->
		<section class="block-wrapper">
			<div class="container">
				<div class="row">

					<div class="col-md-2 col-sm-0">

						<!-- sidebar -->
						<div class="sidebar small-sidebar">

							<div class="widget review-widget">
								<h1>Top Reviews</h1>
								<ul class="review-posts-list">
									<li><img src="upload/news-posts/rev1.jpg" alt="">
										<h2>
											<a href="single-post.html">Donec nec justo eget felis
												facilisis fermentum.</a>
										</h2> <span class="date"><i class="fa fa-clock-o"></i>27 may
											2013</span> <span class="post-rating"> <i class="fa fa-star"></i>
											<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i>
									</span></li>
									<li><img src="upload/news-posts/rev2.jpg" alt="">
										<h2>
											<a href="single-post.html">Donec nec justo eget felis
												facilisis fermentum.</a>
										</h2> <span class="date"><i class="fa fa-clock-o"></i>27 may
											2013</span> <span class="post-rating"> <i class="fa fa-star"></i>
											<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star-o"></i>
									</span></li>
									<li><img src="upload/news-posts/rev3.jpg" alt="">
										<h2>
											<a href="single-post.html">Donec nec justo eget felis
												facilisis fermentum.</a>
										</h2> <span class="date"><i class="fa fa-clock-o"></i>27 may
											2013</span> <span class="post-rating"> <i class="fa fa-star"></i>
											<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star-o"></i> <i class="fa fa-star-o"></i>
									</span></li>
									<li><img src="upload/news-posts/rev4.jpg" alt="">
										<h2>
											<a href="single-post.html">Donec nec justo eget felis
												facilisis fermentum.</a>
										</h2> <span class="date"><i class="fa fa-clock-o"></i>27 may
											2013</span> <span class="post-rating"> <i class="fa fa-star"></i>
											<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star-o"></i>
									</span></li>
									<li><img src="upload/news-posts/rev5.jpg" alt="">
										<h2>
											<a href="single-post.html">Donec nec justo eget felis
												facilisis fermentum.</a>
										</h2> <span class="date"><i class="fa fa-clock-o"></i>27 may
											2013</span> <span class="post-rating"> <i class="fa fa-star"></i>
											<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i>
									</span></li>
									<li><img src="upload/news-posts/rev6.jpg" alt="">
										<h2>
											<a href="single-post.html">Donec nec justo eget felis
												facilisis fermentum.</a>
										</h2> <span class="date"><i class="fa fa-clock-o"></i>27 may
											2013</span> <span class="post-rating"> <i class="fa fa-star"></i>
											<i class="fa fa-star"></i> <i class="fa fa-star-o"></i> <i
											class="fa fa-star-o"></i> <i class="fa fa-star-o"></i>
									</span></li>
								</ul>
							</div>

							<div class="advertisement">
								<div class="desktop-advert">
									<span>Advertisement</span> <img
										src="upload/addsense/160x600.jpg" alt="">
								</div>
							</div>

							<div class="widget categories-widget">
								<div class="title-section">
									<h1>
										<span>Hot Categories</span>
									</h1>
								</div>
								<ul class="category-list">
									<li><a href="#">IT Management <span>12</span></a></li>
									<li><a href="#">Internet <span>26</span></a></li>
									<li><a href="#">Computer Hardware <span>55</span></a></li>
									<li><a href="#">Mobile &amp; Wireless <span>37</span></a>
									</li>
									<li><a href="#">Operating Systems <span>62</span></a></li>
									<li><a href="#">Reviews <span>10</span></a></li>
									<li><a href="#">News <span>43</span></a></li>
									<li><a href="#">App Development <span>74</span></a></li>
									<li><a href="#">Entertainment <span>11</span></a></li>
									<li><a href="#">Mobile Apps <span>41</span></a></li>
									<li><a href="#">Tablets <span>11</span></a></li>
									<li><a href="#">Web Apps <span>29</span></a></li>
								</ul>
							</div>

							<div class="widget flickr-widget">
								<div class="title-section">
									<h1>
										<span> Flickr Photos</span>
									</h1>
								</div>
								<ul class="flickr-list">
									<li><a href="#"><img src="upload/flickr/1.jpg" alt=""></a></li>
									<li><a href="#"><img src="upload/flickr/2.jpg" alt=""></a></li>
									<li><a href="#"><img src="upload/flickr/3.jpg" alt=""></a></li>
									<li><a href="#"><img src="upload/flickr/4.jpg" alt=""></a></li>
									<li><a href="#"><img src="upload/flickr/5.jpg" alt=""></a></li>
									<li><a href="#"><img src="upload/flickr/6.jpg" alt=""></a></li>
									<li><a href="#"><img src="upload/flickr/1.jpg" alt=""></a></li>
									<li><a href="#"><img src="upload/flickr/2.jpg" alt=""></a></li>
									<li><a href="#"><img src="upload/flickr/3.jpg" alt=""></a></li>
									<li><a href="#"><img src="upload/flickr/4.jpg" alt=""></a></li>
								</ul>
								<a href="#">View more photos >></a>
							</div>

						</div>

					</div>

					<div class="col-md-7 col-sm-8">

						<!-- block content -->
						<div class="block-content">

							<!-- slider-caption-box -->
							<div class="slider-caption-box">
								<ul class="filter-slider-posts">
									<li><a href="#">Today</a></li>
									<li><a class="active" href="#">Software</a></li>
									<li><a href="#">Internet</a></li>
									<li><a href="#">Mobile</a></li>
									<li><a href="#">Gadgets</a></li>
									<li><a href="#">Tech Industry</a></li>
								</ul>
								<div class="slider-holder">
									<span>top Stories</span>
									<ul class="slider-call">
										<li>
											<div class="news-post standard-post">
												<div class="post-gallery">
													<img src="${news.imageUrl}" alt="${news.title}">
												</div>
												<div class="post-content">
													<h2>
														<a href="single-post.html">Nam dui mi, tincidunt quis,
															accumsan porttitor, facilisis luctus, metus.</a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
														<li><i class="fa fa-user"></i>by <a href="#">John
																Doe</a></li>
														<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
														<li><i class="fa fa-eye"></i>872</li>
													</ul>
												</div>
											</div>
										</li>
										<li>
											<div class="news-post standard-post">
												<div class="post-gallery">
													<img src="upload/news-posts/large2.jpg" alt="">
												</div>
												<div class="post-content">
													<h2>
														<a href="single-post.html">Pellentesque odio nisi,
															euismod in, pharetra a, ultricies in, diam. </a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
														<li><i class="fa fa-user"></i>by <a href="#">John
																Doe</a></li>
														<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
														<li><i class="fa fa-eye"></i>872</li>
													</ul>
												</div>
											</div>
										</li>
										<li>
											<div class="news-post standard-post">
												<div class="post-gallery">
													<img src="upload/news-posts/large3.jpg" alt="">
												</div>
												<div class="post-content">
													<h2>
														<a href="single-post.html">Sed arcu. Cras consequat.</a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
														<li><i class="fa fa-user"></i>by <a href="#">John
																Doe</a></li>
														<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
														<li><i class="fa fa-eye"></i>872</li>
													</ul>
												</div>
											</div>
										</li>
										<li>
											<div class="news-post standard-post">
												<div class="post-gallery">
													<img src="upload/news-posts/large4.jpg" alt="">
												</div>
												<div class="post-content">
													<h2>
														<a href="single-post.html">Aliquam erat volutpat. </a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
														<li><i class="fa fa-user"></i>by <a href="#">John
																Doe</a></li>
														<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
														<li><i class="fa fa-eye"></i>872</li>
													</ul>
												</div>
											</div>
										</li>
									</ul>
								</div>
								<div id="bx-pager">
									<a data-slide-index="0" href=""> Nam dui mi, tincidunt
										quis, accumsan porttitor, facilisis luctus, metus. <span><i
											class="fa fa-clock-o"></i>27 may 2013</span>
									</a> <a data-slide-index="1" href=""> Pellentesque odio nisi,
										euismod in, pharetra a, ultricies in, diam. <span><i
											class="fa fa-clock-o"></i>27 may 2013</span>
									</a> <a data-slide-index="2" href=""> Sed arcu. Cras consequat.
										<span><i class="fa fa-clock-o"></i>27 may 2013</span>
									</a> <a data-slide-index="3" href=""> Aliquam erat volutpat. <span><i
											class="fa fa-clock-o"></i>27 may 2013</span>
									</a>
								</div>
								<div class="center-butt">
									<a class="more-news" href="tech-category.html">More
										Software News</a>
								</div>
							</div>
							<!-- End slider-caption-box -->

							<!-- grid box -->
							<div class="grid-box">

								<div class="title-section">
									<h1>
										<span>Today's Featured</span>
									</h1>
								</div>

								<ul class="category-filter-posts">
									<li><a class="active" href="#">All</a></li>
									<li><a href="#">Software</a></li>
									<li><a href="#">Internet</a></li>
									<li><a href="#">Mobile</a></li>
									<li><a href="#">Gadgets</a></li>
								</ul>

								<div class="row">
									<div class="col-md-6">
										<div class="news-post standard-post2">
											<div class="post-gallery">
												<img src="upload/news-posts/1.jpg" alt="">
											</div>
											<div class="post-title">
												<h2>
													<a href="single-post.html">LPellentesque odio nisi,
														euismod in, pharetra a, ultricies in, diam.</a>
												</h2>
												<ul class="post-tags">
													<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													<li><i class="fa fa-user"></i>by <a href="#">John
															Doe</a></li>
													<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
													<li><i class="fa fa-eye"></i>87</li>
												</ul>
											</div>
										</div>
										<ul class="list-posts">
											<li>
												<div class="post-content">
													<h2>
														<a href="single-post.html">Pellentesque odio nisi,
															euismod in, pharetra a, ultricies in, diam.</a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													</ul>
												</div>
											</li>

											<li>
												<div class="post-content">
													<h2>
														<a href="single-post.html">Aliquam porttitor mauris
															sit amet orci. Aenean dignissim pellentesque felis.</a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													</ul>
												</div>
											</li>
										</ul>
									</div>
									<div class="col-md-6">
										<ul class="list-posts">
											<li><img src="upload/news-posts/list1.jpg" alt="">
												<div class="post-content">
													<h2>
														<a href="single-post.html">Donec odio. Quisque
															volutpat mattis eros. Nullam malesuada erat ut turpis. </a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													</ul>
												</div></li>

											<li><img src="upload/news-posts/list2.jpg" alt="">
												<div class="post-content">
													<h2>
														<a href="single-post.html">Nullam malesuada erat ut
															turpis. Suspendisse urna nibh, viverra non</a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													</ul>
												</div></li>

											<li><img src="upload/news-posts/list3.jpg" alt="">
												<div class="post-content">
													<h2>
														<a href="single-post.html">Suspendisse urna nibh </a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													</ul>
												</div></li>

											<li><img src="upload/news-posts/list4.jpg" alt="">
												<div class="post-content">
													<h2>
														<a href="single-post.html">Suspendisse urna nibh,
															viverra non, semper suscipit</a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													</ul>
												</div></li>

											<li><img src="upload/news-posts/list5.jpg" alt="">
												<div class="post-content">
													<h2>
														<a href="single-post.html">Donec nec justo eget felis
															facilisis fermentum. </a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													</ul>
												</div></li>
										</ul>
									</div>
								</div>
							</div>
							<!-- End grid box -->

							<!-- google addsense -->
							<div class="advertisement">
								<div class="desktop-advert">
									<span>Advertisement</span> <img
										src="upload/addsense/600x80.jpg" alt="">
								</div>
								<div class="tablet-advert">
									<span>Advertisement</span> <img
										src="upload/addsense/468x60-white.jpg" alt="">
								</div>
								<div class="mobile-advert">
									<span>Advertisement</span> <img
										src="upload/addsense/300x250.jpg" alt="">
								</div>
							</div>
							<!-- End google addsense -->

							<!-- grid box -->
							<div class="grid-box">

								<div class="title-section">
									<h1>
										<span>Gatgets &amp; Apps</span>
									</h1>
								</div>

								<div class="row">

									<div class="col-md-4">
										<div class="news-post standard-post">
											<div class="post-gallery">
												<img src="upload/news-posts/st1.jpg" alt="">
											</div>
											<div class="post-content">
												<h2>
													<a href="single-post.html">Nam nulla quam, gravida non,
														commodo</a>
												</h2>
												<ul class="post-tags">
													<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
												</ul>
											</div>
										</div>
									</div>

									<div class="col-md-4">
										<div class="news-post standard-post">
											<div class="post-gallery">
												<img src="upload/news-posts/st2.jpg" alt="">
											</div>
											<div class="post-content">
												<h2>
													<a href="single-post.html">Aliquam quam lectus,
														facilisis auctor, ultrices ut, elementum vulputate, nunc.</a>
												</h2>
												<ul class="post-tags">
													<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
												</ul>
											</div>
										</div>
									</div>

									<div class="col-md-4">
										<div class="news-post standard-post">
											<div class="post-gallery">
												<img src="upload/news-posts/st3.jpg" alt="">
											</div>
											<div class="post-content">
												<h2>
													<a href="single-post.html">Phasellus ultrices nulla
														quis nibh. Quisque a lectus.</a>
												</h2>
												<ul class="post-tags">
													<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
												</ul>
											</div>
										</div>
									</div>

								</div>

								<div class="row">

									<div class="col-md-4">
										<div class="news-post standard-post">
											<div class="post-gallery">
												<img src="upload/news-posts/st4.jpg" alt="">
											</div>
											<div class="post-content">
												<h2>
													<a href="single-post.html">Pellentesque egestas sem.
														Suspendisse commodo </a>
												</h2>
												<ul class="post-tags">
													<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
												</ul>
											</div>
										</div>
									</div>

									<div class="col-md-4">
										<div class="news-post standard-post">
											<div class="post-gallery">
												<img src="upload/news-posts/st5.jpg" alt="">
											</div>
											<div class="post-content">
												<h2>
													<a href="single-post.html">Nulla vitae mauris non felis
														mollis faucibus.</a>
												</h2>
												<ul class="post-tags">
													<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
												</ul>
											</div>
										</div>
									</div>

									<div class="col-md-4">
										<div class="news-post standard-post">
											<div class="post-gallery">
												<img src="upload/news-posts/st6.jpg" alt="">
											</div>
											<div class="post-content">
												<h2>
													<a href="single-post.html">Lorem ipsum dolor sit amet,
														consectetuer adipiscing elit.</a>
												</h2>
												<ul class="post-tags">
													<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
												</ul>
											</div>
										</div>
									</div>

								</div>

							</div>
							<!-- End grid box -->

							<!-- galery box -->
							<div class="galery-box">

								<div class="title-section">
									<h1>
										<span>Video News</span>
									</h1>
								</div>

								<ul class="slider-call2">
									<li>
										<div class="news-post video-post">
											<img alt="" src="upload/news-posts/im-large1.jpg"> <a
												href="https://www.youtube.com/watch?v=LL59es7iy8Q"
												class="video-link"><i class="fa fa-play"></i></a>
											<div class="hover-box">
												<h2>
													<a href="single-post.html">Donec nec justo eget felis
														facilisis fermentum. Aliquam porttitor mauris sit amet
														orci. </a>
												</h2>
												<ul class="post-tags">
													<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
												</ul>
											</div>
										</div>
									</li>
									<li>
										<div class="news-post video-post">
											<img alt="" src="upload/news-posts/im-large2.jpg"> <a
												href="https://www.youtube.com/watch?v=LL59es7iy8Q"
												class="video-link"><i class="fa fa-play"></i></a>
											<div class="hover-box">
												<h2>
													<a href="single-post.html">Donec nec justo eget felis
														facilisis fermentum. Aliquam porttitor mauris sit amet
														orci. </a>
												</h2>
												<ul class="post-tags">
													<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
												</ul>
											</div>
										</div>
									</li>
									<li>
										<div class="news-post video-post">
											<img alt="" src="upload/news-posts/im-large3.jpg"> <a
												href="https://www.youtube.com/watch?v=LL59es7iy8Q"
												class="video-link"><i class="fa fa-play"></i></a>
											<div class="hover-box">
												<h2>
													<a href="single-post.html">Donec nec justo eget felis
														facilisis fermentum. Aliquam porttitor mauris sit amet
														orci. </a>
												</h2>
												<ul class="post-tags">
													<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
												</ul>
											</div>
										</div>
									</li>
								</ul>
								<div id="bx-pager2">
									<a data-slide-index="0" href=""><img
										src="upload/news-posts/im-thumb1.jpg" alt="" /></a> <a
										data-slide-index="1" href=""><img
										src="upload/news-posts/im-thumb2.jpg" alt="" /></a> <a
										data-slide-index="2" href=""><img
										src="upload/news-posts/im-thumb3.jpg" alt="" /></a>
								</div>
							</div>
							<!-- End galery box -->

							<!-- article box -->
							<div class="article-box">
								<div class="title-section">
									<h1>
										<span>Latest Articles</span>
									</h1>
								</div>

								<div class="news-post standard-post2">
									<div class="post-gallery">
										<img src="upload/news-posts/art1.jpg" alt="">
									</div>
									<div class="post-title">
										<h2>
											<a href="single-post.html">Praesent dapibus, neque id
												cursus faucibus, tortor neque egestas augue, eu vulputate
												magna eros eu erat. </a>
										</h2>
										<ul class="post-tags">
											<li><i class="fa fa-clock-o"></i>27 may 2013</li>
											<li><i class="fa fa-user"></i>by <a href="#">John
													Doe</a></li>
											<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
											<li><i class="fa fa-eye"></i>872</li>
										</ul>
									</div>
									<div class="post-content">
										<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
											elit. Phasellus hendrerit. Pellentesque aliquet nibh nec
											urna. In nisi neque, aliquet vel, dapibus id, mattis vel,
											nisi. Sed pretium, ligula sollicitudin laoreet viverra,
											tortor libero sodales leo, eget blandit nunc tortor eu nibh.
											Nullam mollis. Ut justo. Suspendisse potenti.</p>
										<a href="single-post.html" class="read-more-button"><i
											class="fa fa-angle-right"></i><span>Read More</span></a>
									</div>
								</div>

								<div class="news-post standard-post2">
									<div class="post-gallery">
										<img src="upload/news-posts/art2.jpg" alt="">
									</div>
									<div class="post-title">
										<h2>
											<a href="single-post.html">Aliquam erat volutpat. Nam dui
												mi, tincidunt quis, accumsan porttitor, facilisis luctus,
												metus.</a>
										</h2>
										<ul class="post-tags">
											<li><i class="fa fa-clock-o"></i>27 may 2013</li>
											<li><i class="fa fa-user"></i>by <a href="#">John
													Doe</a></li>
											<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
											<li><i class="fa fa-eye"></i>872</li>
										</ul>
									</div>
									<div class="post-content">
										<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
											elit. Phasellus hendrerit. Pellentesque aliquet nibh nec
											urna. In nisi neque, aliquet vel, dapibus id, mattis vel,
											nisi. Sed pretium, ligula sollicitudin laoreet viverra,
											tortor libero sodales leo, eget blandit nunc tortor eu nibh.
											Nullam mollis. Ut justo. Suspendisse potenti.</p>
										<a href="single-post.html" class="read-more-button"><i
											class="fa fa-angle-right"></i><span>Read More</span></a>
									</div>
								</div>

								<div class="news-post standard-post2">
									<div class="post-gallery">
										<img src="upload/news-posts/art3.jpg" alt="">
									</div>
									<div class="post-title">
										<h2>
											<a href="single-post.html">Nullam malesuada erat ut
												turpis. Suspendisse urna nibh, viverra non, semper suscipit,
												posuere a, pede.</a>
										</h2>
										<ul class="post-tags">
											<li><i class="fa fa-clock-o"></i>27 may 2013</li>
											<li><i class="fa fa-user"></i>by <a href="#">John
													Doe</a></li>
											<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
											<li><i class="fa fa-eye"></i>872</li>
										</ul>
									</div>
									<div class="post-content">
										<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
											elit. Phasellus hendrerit. Pellentesque aliquet nibh nec
											urna. In nisi neque, aliquet vel, dapibus id, mattis vel,
											nisi. Sed pretium, ligula sollicitudin laoreet viverra,
											tortor libero sodales leo, eget blandit nunc tortor eu nibh.
											Nullam mollis. Ut justo. Suspendisse potenti.</p>
										<a href="single-post.html" class="read-more-button"><i
											class="fa fa-angle-right"></i><span>Read More</span></a>
									</div>
								</div>

								<div class="news-post standard-post2">
									<div class="post-gallery">
										<img src="upload/news-posts/art4.jpg" alt="">
									</div>
									<div class="post-title">
										<h2>
											<a href="single-post.html">Donec nec justo eget felis
												facilisis fermentum. Aliquam porttitor mauris sit amet orci.
												Aenean dignissim pellentesque felis.</a>
										</h2>
										<ul class="post-tags">
											<li><i class="fa fa-clock-o"></i>27 may 2013</li>
											<li><i class="fa fa-user"></i>by <a href="#">John
													Doe</a></li>
											<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
											<li><i class="fa fa-eye"></i>872</li>
										</ul>
									</div>
									<div class="post-content">
										<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
											elit. Phasellus hendrerit. Pellentesque aliquet nibh nec
											urna. In nisi neque, aliquet vel, dapibus id, mattis vel,
											nisi. Sed pretium, ligula sollicitudin laoreet viverra,
											tortor libero sodales leo, eget blandit nunc tortor eu nibh.
											Nullam mollis. Ut justo. Suspendisse potenti.</p>
										<a href="single-post.html" class="read-more-button"><i
											class="fa fa-angle-right"></i><span>Read More</span></a>
									</div>
								</div>

							</div>
							<!-- End article box -->

							<!-- Pagination box -->
							<div class="pagination-box">
								<ul class="pagination-list">
									<li><a class="active" href="#">1</a></li>
									<li><a href="#">2</a></li>
									<li><a href="#">3</a></li>
									<li><span>...</span></li>
									<li><a href="#">9</a></li>
									<li><a href="#">Next</a></li>
								</ul>
								<p>Page 1 of 9</p>
							</div>
							<!-- End Pagination box -->

						</div>
						<!-- End block content -->

					</div>

					<div class="col-md-3 col-sm-4">

						<!-- sidebar -->
						<div class="sidebar large-sidebar">

							<div class="widget social-widget">
								<div class="title-section">
									<h1>
										<span>Stay Connected</span>
									</h1>
								</div>
								<ul class="social-share">
									<li><a href="#" class="rss"><i class="fa fa-rss"></i></a>
										<span class="number">9,455</span> <span>Subscribers</span></li>
									<li><a href="#" class="facebook"><i
											class="fa fa-facebook"></i></a> <span class="number">56,743</span>
										<span>Fans</span></li>
									<li><a href="#" class="twitter"><i
											class="fa fa-twitter"></i></a> <span class="number">43,501</span>
										<span>Followers</span></li>
									<li><a href="#" class="google"><i
											class="fa fa-google-plus"></i></a> <span class="number">35,003</span>
										<span>Followers</span></li>
								</ul>
							</div>

							<div class="widget tab-posts-widget">

								<ul class="nav nav-tabs" id="myTab">
									<li class="active"><a href="#option1" data-toggle="tab">Popular</a>
									</li>
									<li><a href="#option2" data-toggle="tab">Recent</a></li>
								</ul>

								<div class="tab-content">
									<div class="tab-pane active" id="option1">
										<ul class="list-posts">
											<li><img src="upload/news-posts/listw1.jpg" alt="">
												<div class="post-content">
													<h2>
														<a href="single-post.html">Pellentesque odio nisi,
															euismod in, pharetra a, ultricies in, diam. </a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													</ul>
												</div></li>

											<li><img src="upload/news-posts/listw2.jpg" alt="">
												<div class="post-content">
													<h2>
														<a href="single-post.html">Sed arcu. Cras consequat. </a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													</ul>
												</div></li>

											<li><img src="upload/news-posts/listw3.jpg" alt="">
												<div class="post-content">
													<h2>
														<a href="single-post.html">Phasellus ultrices nulla
															quis nibh. Quisque a lectus. </a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													</ul>
												</div></li>

											<li><img src="upload/news-posts/listw4.jpg" alt="">
												<div class="post-content">
													<h2>
														<a href="single-post.html">Donec consectetuer ligula
															vulputate sem tristique cursus. </a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													</ul>
												</div></li>

											<li><img src="upload/news-posts/listw5.jpg" alt="">
												<div class="post-content">
													<h2>
														<a href="single-post.html">Nam nulla quam, gravida
															non, commodo a, sodales sit amet, nisi. </a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													</ul>
												</div></li>
										</ul>
									</div>
									<div class="tab-pane" id="option2">
										<ul class="list-posts">

											<li><img src="upload/news-posts/listw3.jpg" alt="">
												<div class="post-content">
													<h2>
														<a href="single-post.html">Phasellus ultrices nulla
															quis nibh. Quisque a lectus. </a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													</ul>
												</div></li>

											<li><img src="upload/news-posts/listw4.jpg" alt="">
												<div class="post-content">
													<h2>
														<a href="single-post.html">Donec consectetuer ligula
															vulputate sem tristique cursus. </a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													</ul>
												</div></li>

											<li><img src="upload/news-posts/listw5.jpg" alt="">
												<div class="post-content">
													<h2>
														<a href="single-post.html">Nam nulla quam, gravida
															non, commodo a, sodales sit amet, nisi.</a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													</ul>
												</div></li>
											<li><img src="upload/news-posts/listw1.jpg" alt="">
												<div class="post-content">
													<h2>
														<a href="single-post.html">Pellentesque odio nisi,
															euismod in, pharetra a, ultricies in, diam. </a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													</ul>
												</div></li>

											<li><img src="upload/news-posts/listw2.jpg" alt="">
												<div class="post-content">
													<h2>
														<a href="single-post.html">Sed arcu. Cras consequat.</a>
													</h2>
													<ul class="post-tags">
														<li><i class="fa fa-clock-o"></i>27 may 2013</li>
													</ul>
												</div></li>
										</ul>
									</div>
								</div>
							</div>

							<div class="widget post-widget">
								<div class="title-section">
									<h1>
										<span>Most Read</span>
									</h1>
								</div>
								<ul class="list-posts">
									<li>
										<div class="post-content">
											<h2>
												<a href="single-post.html">Sed arcu. Cras consequat.</a>
											</h2>
											<ul class="post-tags">
												<li><i class="fa fa-clock-o"></i>27 may 2013</li>
											</ul>
										</div>
									</li>

									<li>
										<div class="post-content">
											<h2>
												<a href="single-post.html">Aenean dignissim pellentesque
													felis. Morbi in sem quis dui placerat ornare. </a>
											</h2>
											<ul class="post-tags">
												<li><i class="fa fa-clock-o"></i>27 may 2013</li>
											</ul>
										</div>
									</li>

									<li>
										<div class="post-content">
											<h2>
												<a href="single-post.html">Pellentesque odio nisi,
													euismod in, pharetra a, ultricies in, diam. </a>
											</h2>
											<ul class="post-tags">
												<li><i class="fa fa-clock-o"></i>27 may 2013</li>
											</ul>
										</div>
									</li>
									<li>
										<div class="post-content">
											<h2>
												<a href="single-post.html">Phasellus ultrices nulla quis
													nibh. Quisque a lectus.</a>
											</h2>
											<ul class="post-tags">
												<li><i class="fa fa-clock-o"></i>27 may 2013</li>
											</ul>
										</div>
									</li>

									<li>
										<div class="post-content">
											<h2>
												<a href="single-post.html">Pellentesque fermentum dolor.</a>
											</h2>
											<ul class="post-tags">
												<li><i class="fa fa-clock-o"></i>27 may 2013</li>
											</ul>
										</div>
									</li>
								</ul>
							</div>

							<div class="widget features-slide-widget">
								<div class="title-section">
									<h1>
										<span>Special Reports</span>
									</h1>
								</div>
								<div class="news-post standard-post2">
									<div class="post-gallery">
										<img src="upload/news-posts/im1.jpg" alt="">
									</div>
									<div class="post-title">
										<h2>
											<a href="single-post.html">Donec nec justo eget felis
												facilisis fermentum. </a>
										</h2>
										<ul class="post-tags">
											<li><i class="fa fa-clock-o"></i>27 may 2013</li>
											<li><i class="fa fa-user"></i>by <a href="#">John
													Doe</a></li>
											<li><a href="#"><i class="fa fa-comments-o"></i><span>23</span></a></li>
										</ul>
									</div>
								</div>
								<ul class="list-posts">

									<li><img src="upload/news-posts/listw5.jpg" alt="">
										<div class="post-content">
											<h2>
												<a href="single-post.html">Nam nulla quam, gravida non,
													commodo a, sodales sit amet, nisi.</a>
											</h2>
											<ul class="post-tags">
												<li><i class="fa fa-clock-o"></i>27 may 2013</li>
											</ul>
										</div></li>
									<li><img src="upload/news-posts/listw1.jpg" alt="">
										<div class="post-content">
											<h2>
												<a href="single-post.html">Pellentesque odio nisi,
													euismod in, pharetra a, ultricies in, diam. </a>
											</h2>
											<ul class="post-tags">
												<li><i class="fa fa-clock-o"></i>27 may 2013</li>
											</ul>
										</div></li>

									<li><img src="upload/news-posts/listw2.jpg" alt="">
										<div class="post-content">
											<h2>
												<a href="single-post.html">Sed arcu. Cras consequat.</a>
											</h2>
											<ul class="post-tags">
												<li><i class="fa fa-clock-o"></i>27 may 2013</li>
											</ul>
										</div></li>
								</ul>
							</div>

							<div class="advertisement">
								<div class="desktop-advert">
									<span>Advertisement</span> <img
										src="upload/addsense/250x250.jpg" alt="">
								</div>
								<div class="tablet-advert">
									<span>Advertisement</span> <img
										src="upload/addsense/200x200.jpg" alt="">
								</div>
								<div class="mobile-advert">
									<span>Advertisement</span> <img
										src="upload/addsense/300x250.jpg" alt="">
								</div>
							</div>

							<div class="widget post-widget">
								<div class="title-section">
									<h1>
										<span>Featured Video</span>
									</h1>
								</div>
								<div class="news-post video-post">
									<img alt="" src="upload/news-posts/video-sidebar.jpg"> <a
										href="https://www.youtube.com/watch?v=LL59es7iy8Q"
										class="video-link"><i class="fa fa-play-circle-o"></i></a>
									<div class="hover-box">
										<h2>
											<a href="single-post.html">Donec odio. Quisque volutpat
												mattis eros. Nullam malesuada erat ut turpis. </a>
										</h2>
										<ul class="post-tags">
											<li><i class="fa fa-clock-o"></i>27 may 2013</li>
										</ul>
									</div>
									<p></p>
								</div>
							</div>

							<div class="widget subscribe-widget">
								<form class="subscribe-form">
									<h1>Subscribe to RSS Feeds</h1>
									<input type="text" name="sumbscribe" id="subscribe"
										placeholder="Email" />
									<button id="submit-subscribe">
										<i class="fa fa-arrow-circle-right"></i>
									</button>
									<p>Get all latest content delivered to your email a few
										times a month.</p>
								</form>
							</div>

						</div>
						<!-- End sidebar -->

					</div>

				</div>

			</div>
		</section>
		<!-- End block-wrapper-section -->

		<!-- footer 
			================================================== -->

		<jsp:include page="footer.jsp" />

		<!-- End footer -->

	</div>
	<!-- End Container -->

	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.migrate.js"></script>
	<script type="text/javascript" src="js/jquery.bxslider.min.js"></script>
	<script type="text/javascript" src="js/jquery.magnific-popup.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/jquery.ticker.js"></script>
	<script type="text/javascript" src="js/jquery.imagesloaded.min.js"></script>
	<script type="text/javascript" src="js/jquery.isotope.min.js"></script>
	<script type="text/javascript" src="js/owl.carousel.min.js"></script>
	<script type="text/javascript" src="js/retina-1.1.0.min.js"></script>
	<script type="text/javascript" src="js/script.js"></script>

</body>
</html>