<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="shortcut icon" href="./Image/Favicon.png" type="image/x-icon">

  <title>Prisha Pottery</title>
  <!-- Bootstrap CSS CDN  -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  <!-- External CSS  -->
  <link rel="stylesheet" href="CSS/style.css">
  <link rel="stylesheet" href="CSS/media.css">

  <!-- Bootstrap JS CDN  -->
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
    integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
    crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
    integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
    crossorigin="anonymous"></script>

  <!-- Bootstrap icon CDN  -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">

  <!-- Fontawsome CDN  -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
    integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="
    crossorigin="anonymous" referrerpolicy="no-referrer" />

  <script src="JS/plugins.js"></script>
  <!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
  <link rel="stylesheet" type="text/css" href="engine1/style.css" />
  <script type="text/javascript" src="engine1/jquery.js"></script>
  <!-- End WOWSlider.com HEAD section -->

</head>

<body>
  
  <header id="header" class="site-header">
    <nav id="header-nav" class="navbar navbar-expand-lg px-3">
      <div class="container">
        <a class="navbar-brand d-lg-none w-50" href="index.html">
          <img src="Image/logo.png" class="logo w-75">
        </a>
        <button class="navbar-toggler d-flex d-lg-none order-3 p-2" type="button" data-bs-toggle="offcanvas"
          data-bs-target="#bdNavbar" aria-controls="bdNavbar" aria-expanded="false"
          aria-label="Toggle navigation">Menu</button>
        <div class="offcanvas offcanvas-end" tabindex="-1" id="bdNavbar" aria-labelledby="bdNavbarOffcanvasLabel">
          <div class="offcanvas-header px-4 pb-0">
            <a class="navbar-brand w-50" href="index.html">
              <img src="Image/logo.png" class="logo w-75">
            </a>
            <button type="button" class="btn-close btn-close-black me-2" data-bs-dismiss="offcanvas" aria-label="Close"
              data-bs-target="#bdNavbar"></button>
          </div>
			<jsp:include page="header.jsp"></jsp:include>
        </div>
      </div>
    </nav>
  </header>

  <!-- Banner start  -->
  <section id="billboard" class="position-relative overflow-hidden">
    <div id="wowslider-container1">
      <div class="ws_images">
        <ul>
          <li><img src="./data1/images/bannerimage.jpg" class="img-fluid" alt="" title="" id="wows1_0" />
            <div class="container-fluid ">
              <div class="row" id="ban1">
                <div class="offset-md-2 col-md-6">
                  <h2 style="position:absolute; z-index : 155; top: 190px; left: 80px;">Ceramic soft pot</h2>
                  <p class="fs-3" style="position:absolute; z-index : 155; top: 290px; left: 80px;">This ceramic pot is
                    specially designed by concept of traditional.</p>
                  <a href="single-product.html" class="fs-4 text-dark text-decoration-underline"
                    style="position:absolute; z-index : 165; top: 320px; left: 80px;">Shop Now</a>
                </div>
              </div>
            </div>
          </li>
          <li><img src="data1/images/bannerimage1.jpg" class="img-fluid" title="banner-image1" id="wows1_1" />
            <div class="row" id="ban1">
              <div class="offset-md-6 col-md-6">
                <h2 style="position:absolute; z-index : 155; top: 180px;">Shiny Black Pot</h2>
                <p class="fs-3" style="position:absolute; z-index : 155; top: 290px;">Beautiful shiny black pot is
                  designed for minimalist decors.</p>
                <a href="single-product.html" class="text-dark fs-4 text-decoration-underline"
                  style="position:absolute; z-index : 165; top: 330px; right: 0; left: 645px;">Shop Now</a>
              </div>
            </div>

          </li>
          <li><img src="data1/images/bannerimage2.jpg" class="img-fluid" alt="banner-image2" title="banner-image2"
              id="wows1_2" />
            <div class="row" id="ban1">
              <div class="offset-md-1 col-md-6">
                <h2 style="position:absolute; z-index : 155; top: 180px; left: 80px;">Shell Shape Decor</h2>
                <p class="fs-3" style="position:absolute; z-index : 155; top: 290px; left: 80px;">Buy this beautiful
                  shell shape vase decors for your plants of room.
                </p>
                <a href="single-product.html" class="text-dark fs-4 text-decoration-underline"
                  style="position:absolute; z-index : 155; top: 320px; left: 80px;">Shop Now</a>
              </div>
            </div>
          </li>
        </ul>
      </div>
      <div class="ws_bullets">
        <div>
          <a href="#" title=""><span>1</span></a>
          <a href="#" title="banner-image1"><span>2</span></a>
          <a href="#" title="banner-image2"><span>3</span></a>
        </div>
      </div>
    </div>
    <script type="text/javascript" src="engine1/wowslider.js"></script>
    <script type="text/javascript" src="engine1/script.js"></script>

  </section>

  <!-- Banner end  -->

  <!-- About section start  -->
  <section id="about" class="padding-xlarge">
    <div class="container">
      <div class="row">
        <div class="offset-md-2 col-md-8">
          <span class="title-accent fs-6 text-uppercase" data-aos="fade" data-aos-easing="ease-in"
            data-aos-duration="1000" data-aos-once="true">About us</span>
          <h3 class="py-3" data-aos="fade" data-aos-easing="ease-in" data-aos-duration="1500" data-aos-once="true">Vaso
            is the only best online store for varieties of collection of clean and beautiful vases.</h3>
          <p data-aos="fade" data-aos-easing="ease-in" data-aos-duration="1800" data-aos-once="true">Et id sapien id
            enim, sit tempor cursus elit, fusce. Nunc tristique facilisis consectetur at vivamus ut porta porta. Ut
            nisl, tortor, aliquam blandit vitae vehicula vivamus leo nullam urna, scelerisque unc lectus phasellus
            adipiscing arcu. Tristique facilisis nunc consectetur at tempor cursusut porta.</p>
        </div>
      </div>
    </div>
  </section>

  <!-- About section end  -->

  <!-- Product section start  -->
  <section id="products" class="product-store position-relative">
    <div class="container display-header d-flex flex-wrap justify-content-between pb-4">
      <h3 class="mt-3">Best selling Items</h3>
      <div class="btn-right d-flex flex-wrap align-items-center">
        <a href="shop.html" class="btn me-5">View all items</a>
        <div class="swiper-buttons">
          <button class="swiper-prev product-carousel-prev me-2">
            <svg width="41" height="41">
              <use xlink:href="#angle-left"></use>
            </svg>
          </button>
          <button class="swiper-next product-carousel-next">
            <svg width="41" height="41">
              <use xlink:href="#angle-right"></use>
            </svg>
          </button>
        </div>
      </div>
    </div>
    <div class="swiper product-swiper">
      <div class="swiper-wrapper">
        <div class="container">
          <div class="row">
            <div class="col-md-3">
              <div class="swiper-slide">
                <div class="product-card position-relative">
                  <div class="image-holder zoom-effect">
                    <img src="Image/product-item1.jpg" alt="product-item" class="img-fluid zoom-in">
                    <div class="cart-concern position-absolute">
                      <div class="cart-button ">
                        <a href="#" class="btn">Add to Cart</a>
                      </div>
                    </div>
                  </div>
                  <div class="card-detail text-center pt-3 pb-2">
                    <h5 class="card-title fs-3 text-capitalize">
                      <a href="single-product.html">Matt Black</a>
                    </h5>
                    <span class="item-price text-primary fs-3 fw-light">$870</span>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="swiper-slide">
                <div class="product-card position-relative">
                  <div class="image-holder zoom-effect">
                    <img src="image/product-item2.jpg" alt="product-item" class="img-fluid zoom-in">
                    <div class="cart-concern position-absolute">
                      <div class="cart-button">
                        <a href="#" class="btn">Add to Cart</a>
                      </div>
                    </div>
                  </div>
                  <div class="card-detail text-center pt-3 pb-2">
                    <h5 class="card-title fs-3 text-capitalize">
                      <a href="single-product.html">Oldie Off-White</a>
                    </h5>
                    <span class="item-price text-primary fs-3 fw-light">$680</span>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="swiper-slide">
                <div class="product-card position-relative">
                  <div class="image-holder zoom-effect">
                    <img src="Image/product-item3.jpg" alt="product-item" class="img-fluid zoom-in">
                    <div class="cart-concern position-absolute">
                      <div class="cart-button">
                        <a href="#" class="btn">Add to Cart</a>
                      </div>
                    </div>
                  </div>
                  <div class="card-detail text-center pt-3 pb-2">
                    <h5 class="card-title fs-3 text-capitalize">
                      <a href="single-product.html">Vintage With Handle</a>
                    </h5>
                    <span class="item-price text-primary fs-3 fw-light">$750</span>
                  </div>

                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="swiper-slide">
                <div class="product-card position-relative">
                  <div class="image-holder zoom-effect">
                    <img src="Image/product-item4.jpg" alt="product-item" class="img-fluid zoom-in">
                    <div class="cart-concern position-absolute">
                      <div class="cart-button">
                        <a href="#" class="btn">Add to Cart</a>
                      </div>
                    </div>
                  </div>
                  <div class="card-detail text-center pt-3 pb-2">
                    <h5 class="card-title fs-3 text-capitalize">
                      <a href="single-product.html">Opposite Pattern</a>
                    </h5>
                    <span class="item-price text-primary fs-3 fw-light">$650</span>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="row">
            <div class="col-md-3">
              <div class="swiper-slide">
                <div class="product-card position-relative">
                  <div class="image-holder zoom-effect">
                    <img src="Image/product-item5.jpg" alt="product-item" class="img-fluid zoom-in">
                    <div class="cart-concern position-absolute">
                      <div class="cart-button">
                        <a href="#" class="btn">Add to Cart</a>
                      </div>
                    </div>
                  </div>
                  <div class="card-detail text-center pt-3 pb-2">
                    <h5 class="card-title fs-3 text-capitalize">
                      <a href="single-product.html">Shell Shape</a>
                    </h5>
                    <span class="item-price text-primary fs-3 fw-light">$750</span>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="swiper-slide">
                <div class="product-card position-relative">
                  <div class="image-holder zoom-effect">
                    <img src="Image/product-item2.jpg" alt="product-item" class="img-fluid zoom-in">
                    <div class="cart-concern position-absolute">
                      <div class="cart-button">
                        <a href="#" class="btn">Add to Cart</a>
                      </div>
                    </div>
                  </div>
                  <div class="card-detail text-center pt-3 pb-2">
                    <h5 class="card-title fs-3 text-capitalize">
                      <a href="single-product.html">Oldie Off-White</a>
                    </h5>
                    <span class="item-price text-primary fs-3 fw-light">$750</span>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="swiper-slide">
                <div class="product-card position-relative">
                  <div class="image-holder zoom-effect">
                    <img src="Image/product-item4.jpg" alt="product-item" class="img-fluid zoom-in">
                    <div class="cart-concern position-absolute">
                      <div class="cart-button">
                        <a href="#" class="btn">Add to Cart</a>
                      </div>
                    </div>
                  </div>
                  <div class="card-detail text-center pt-3 pb-2">
                    <h5 class="card-title fs-3 text-capitalize">
                      <a href="single-product.html">Opposite Pattern</a>
                    </h5>
                    <span class="item-price text-primary fs-3 fw-light">$750</span>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="swiper-slide">
                <div class="product-card position-relative">
                  <div class="image-holder zoom-effect">
                    <img src="Image/product-item3.jpg" alt="product-item" class="img-fluid zoom-in">
                    <div class="cart-concern position-absolute">
                      <div class="cart-button">
                        <a href="#" class="btn">Add to Cart</a>
                      </div>
                    </div>
                  </div>
                  <div class="card-detail text-center pt-3 pb-2">
                    <h5 class="card-title fs-3 text-capitalize">
                      <a href="single-product.html">Vintage With Handle</a>
                    </h5>
                    <span class="item-price text-primary fs-3 fw-light">$750</span>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- Product sectiion end  -->


  <section id="testimonials" class="position-relative padding-xlarge">
    <div class="container">
      <div class="row">
        <div class="offset-md-2 col-md-8">
          <h3 class="text-center mb-5" data-aos="fade" data-aos-easing="ease-in" data-aos-duration="1000"
            data-aos-once="true">What our customers says</h3>
          <div class="review-content position-relative" data-aos="fade" data-aos-easing="ease-in"
            data-aos-duration="1500" data-aos-once="true">
            <div class="swiper testimonial-swiper">
              <div class="swiper-wrapper">
                <div class="swiper-slide text-center d-flex justify-content-center">
                  <div class="review-item">
                    <blockquote class="fs-1 fw-light">“A pellen tesque pretium feugiat vel morbi sagittis lorem habi
                      tasse cursus. Suspen dise tempus oncu enim pellen tesque este pretium in neque, elit morbi
                      sagittis lorem habi mattis.”</blockquote>
                    <div class="author-detail">
                      <div class="name fw-bold text-uppercase pt-2">Anna garcia</div>
                    </div>
                  </div>
                </div>
                <div class="swiper-slide text-center d-flex justify-content-center">
                  <div class="review-item">
                    <blockquote class="fs-1 fw-light">“A pellen tesque pretium feugiat vel morbi sagittis lorem habi
                      tasse cursus. Suspen dise tempus oncu enim pellen tesque este pretium in neque, elit morbi
                      sagittis lorem habi mattis.”</blockquote>
                    <div class="author-detail">
                      <div class="name fw-bold text-uppercase pt-2">Anna garcia</div>
                    </div>
                  </div>
                </div>
                <div class="swiper-slide text-center d-flex justify-content-center">
                  <div class="review-item">
                    <blockquote class="fs-1 fw-light">“A pellen tesque pretium feugiat vel morbi sagittis lorem habi
                      tasse cursus. Suspen dise tempus oncu enim pellen tesque este pretium in neque, elit morbi
                      sagittis lorem habi mattis.”</blockquote>
                    <div class="author-detail">
                      <div class="name fw-bold text-uppercase pt-2">Anna garcia</div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="swiper-buttons text-center mt-5" data-aos="fade" data-aos-easing="ease-in"
            data-aos-duration="1800" data-aos-once="true">
            <button class="swiper-prev testimonial-arrow-prev me-2">
              <svg width="41" height="41">
                <use xlink:href="#arrow-left"></use>
              </svg>
            </button>
            <span>|</span>
            <button class="swiper-next testimonial-arrow-next ms-2">
              <svg width="41" height="41">
                <use xlink:href="#arrow-right"></use>
              </svg>
            </button>
          </div>
        </div>
      </div>
    </div>
  </section>
  <section id="our-video">
    <div class="video-section jarallax d-flex align-items-center justify-content-center" id="our-video1">
      <div class="video-player text-center">
        <a type="button" data-bs-toggle="modal" data-src="https://www.youtube.com/embed/W_tIumKa8VY"
          data-bs-target="#myModal" class="play-btn position-relative">
          <svg class="position-absolute top-0 bottom-0 start-0 end-0 m-auto" width="41" height="41">
            <use xlink:href="#play"></use>
          </svg>
          <img src="Image/text-pattern.png" alt="pattern" class="text-pattern img-fluid">
        </a>
      </div>
    </div>
  </section>
  <section id="faqs" class="padding-xlarge">
    <div class="container">
      <div class="row">
        <div class="offset-md-2 col-md-8">
          <h3 class="text-center mb-5" data-aos="fade" data-aos-easing="ease-in" data-aos-duration="1000"
            data-aos-once="true">Some FAQs</h3>
          <div class="accordion accordion-flush" id="accordionFlush" data-aos="fade" data-aos-easing="ease-in"
            data-aos-duration="1500" data-aos-once="true">
            <div class="accordion-item">
              <h4 class="accordion-header" id="flush-headingOne3">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                  data-bs-target="#flush-collapseOne" aria-expanded="true" aria-controls="flush-collapseOne">
                  I got my vase but some items are broken, what to do?
                </button>
              </h4>
              <div id="flush-collapseOne" class="accordion-collapse collapse" aria-labelledby="flush-headingOne"
                data-bs-parent="#accordionFlushExample">
                <div class="accordion-body">
                  <p>Et id sapien id enim, sit tempor cursus elit, fusce. Nunc tristique facilisis consectetur at
                    vivamus ut porta porta aliquam blandit vitae vehicula leo nullam urna, scelerisque unc lectus.</p>
                </div>
              </div>
            </div>

            <div class="accordion-item">
              <h4 class="accordion-header" id="flush-headingTwo3">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                  data-bs-target="#flush-collapseTwo" aria-expanded="true" aria-controls="flush-collapseTwo">
                  Can i return them if I don't like the items I bought?
                </button>
              </h4>
              <div id="flush-collapseTwo" class="accordion-collapse collapse" aria-labelledby="flush-headingTwo"
                data-bs-parent="#accordionFlushExample">
                <div class="accordion-body">
                  <p>Et id sapien id enim, sit tempor cursus elit, fusce. Nunc tristique facilisis consectetur at
                    vivamus ut porta porta aliquam blandit vitae vehicula leo nullam urna, scelerisque unc lectus.</p>
                </div>
              </div>
            </div>

            <div class="accordion-item">
              <h4 class="accordion-header" id="flush-headingThree3">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                  data-bs-target="#flush-collapseThree" aria-expanded="true" aria-controls="flush-collapseThree">
                  Will we get discount if we will order many vase?
                </button>
              </h4>
              <div id="flush-collapseThree" class="accordion-collapse collapse" aria-labelledby="flush-headingThree"
                data-bs-parent="#accordionFlushExample">
                <div class="accordion-body">
                  <p>Et id sapien id enim, sit tempor cursus elit, fusce. Nunc tristique facilisis consectetur at
                    vivamus ut porta porta aliquam blandit vitae vehicula leo nullam urna, scelerisque unc lectus.</p>
                </div>
              </div>
            </div>

            <div class="accordion-item">
              <h4 class="accordion-header" id="flush-headingFour3">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                  data-bs-target="#flush-collapseFour" aria-expanded="true" aria-controls="flush-collapseFour">
                  Are there refunds for sale items or some special orders?
                </button>
              </h4>
              <div id="flush-collapseFour" class="accordion-collapse collapse" aria-labelledby="flush-headingFour"
                data-bs-parent="#accordionFlushExample">
                <div class="accordion-body">
                  <p>Et id sapien id enim, sit tempor cursus elit, fusce. Nunc tristique facilisis consectetur at
                    vivamus ut porta porta aliquam blandit vitae vehicula leo nullam urna, scelerisque unc lectus.</p>
                </div>
              </div>
            </div>

            <div class="accordion-item">
              <h4 class="accordion-header" id="flush-headingFive3">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                  data-bs-target="#flush-collapseFive" aria-expanded="true" aria-controls="flush-collapseFive">
                  How long will it take to get my first order?
                </button>
              </h4>
              <div id="flush-collapseFive" class="accordion-collapse collapse" aria-labelledby="flush-headingFive"
                data-bs-parent="#accordionFlushExample">
                <div class="accordion-body">
                  <p>Et id sapien id enim, sit tempor cursus elit, fusce. Nunc tristique facilisis consectetur at
                    vivamus ut porta porta aliquam blandit vitae vehicula leo nullam urna, scelerisque unc lectus.</p>
                </div>
              </div>
            </div>

          </div>
        </div>
      </div>
    </div>
  </section>
  <section id="banner" class="container" data-aos="fade" data-aos-once="true">
    <div class="banner-content-1 position-relative"
      style="background:url('Image/banner-img1.jpg') no-repeat left; background-size: cover; height: 100%;">
      <div class="banner-content-text position-absolute" data-aos="fade" data-aos-delay="1000" data-aos-easing="ease-in"
        data-aos-duration="1000" data-aos-once="true">
        <h2>Old handmade</h2>
        <a href="shop.html" class="btn">Shop it now</a>
      </div>
    </div>
    <div class="banner-content-2 position-relative"
      style="background:url('Image/banner-img2.jpg') no-repeat left; background-size: cover; height: 100%;">
      <div class="banner-content-text position-absolute" data-aos="fade" data-aos-delay="1000" data-aos-easing="ease-in"
        data-aos-duration="1000" data-aos-once="true">
        <h2>Double handle</h2>
        <a href="shop.html" class="btn">Shop collection</a>
      </div>
    </div>
    <div class="banner-content-3 position-relative"
      style="background:url('Image/banner-img3.jpg') no-repeat left; background-size: cover; height: 100%;">
      <div class="banner-content-text position-absolute" data-aos="fade" data-aos-delay="1000" data-aos-easing="ease-in"
        data-aos-duration="1000" data-aos-once="true">
        <h2>Pumpers</h2>
        <a href="shop.html" class="btn">Shop collection</a>
      </div>
    </div>
  </section>
  <jsp:include page="footer.jsp"></jsp:include>
  

  <!-- Video Popup -->
  <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
    aria-hidden="true">
    <div class="modal-dialog" role="document">

      <div class="modal-content">

        <div class="modal-body">
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"><svg class="bi" width="40"
              height="40">
              <use xlink:href="#close-sharp"></use>
            </svg></button>
          <div class="ratio ratio-16x9">
            <iframe class="embed-responsive-item" src="" id="video" allowscriptaccess="always"
              allow="autoplay"></iframe>
          </div>
        </div>

      </div>

    </div>
  </div>
  <script src="js/jquery-1.11.0.min.js"></script>
  <script type="text/javascript" src="js/bootstrap.bundle.min.js"></script>
  <script type="text/javascript" src="js/plugins.js"></script>
  <script type="text/javascript" src="js/script.js"></script>
</body>

</html>