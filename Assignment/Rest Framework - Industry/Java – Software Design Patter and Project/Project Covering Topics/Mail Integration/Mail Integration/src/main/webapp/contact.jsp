<%@ page import="Dao.Dao" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="m" class="model.Contactmodel" />
<jsp:setProperty property="*" name="m"/>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <!-- Bootstrap CSS CDN  -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <!-- External CSS  -->
    <link rel="stylesheet" href="CSS/style.css">
    <link rel="stylesheet" href="CSS/media.css">
    <link rel="stylesheet" href="CSS/style1.css">

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
                <div class="offcanvas offcanvas-end" tabindex="-1" id="bdNavbar"
                    aria-labelledby="bdNavbarOffcanvasLabel">
                    <div class="offcanvas-header px-4 pb-0">
                        <a class="navbar-brand w-50" href="index.html">
                            <img src="Image/logo.png" class="logo w-75">
                        </a>
                        <button type="button" class="btn-close btn-close-black me-2" data-bs-dismiss="offcanvas"
                            aria-label="Close" data-bs-target="#bdNavbar"></button>
                    </div>
                    
                    <jsp:include page="header.jsp"></jsp:include>
                    
                    <h2 class="text-center fw-light mt-5">Contact</h2>
                    <nav style="--bs-breadcrumb-divider: '>';" aria-label="breadcrumb" id="breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="#">Home</a></li>
                            <li class="breadcrumb-item active" aria-current="page">Contact</li>
                        </ol>
                    </nav>
                </div>
            </div>
        </nav>
    </header>


    <div class="container">
        <div class="row mt-5 mb-5">
            <div class="col-md-6">
                <h3>Contact Info</h3>
                <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Incidunt, qui.</p>
                <div class="row">
                    <div class="col-md-6">
                        <h4 class="fs-3 text-decoration-underline">OFFICE</h4>
                        <p>730 Glenstone Ave 65802, <br> Springfield, US </p>
                        <p>+123 987 321</p>
                        <p>+123 123 654</p>
                        <p>prisha@yourinfo.com</p>
                    </div>
                    <div class="col-md-6">
                        <h4 class="fs-3 text-decoration-underline">MANAGEMENT</h4>
                        <p>730 Glenstone Ave 65802, <br> Springfield, US </p>
                        <p>+123 987 321</p>
                        <p>+123 123 654</p>
                        <p>prisha@yourinfo.com</p>

                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <h3>Any Questions?</h3>
                <p>Use theform below to get in touch with us.</p>
                <form action="contactinsert.jsp">
                    <label for="">Your Name *</label><br>
                    <input type="text"
                        class="border border-end-0 border-start-0 border-top-0 border-1 border-secondary w-75"
                        placeholder="Write your name here"
                        name="name"><br><br>
                    <label for="">Your Email *</label><br>
                    <input type="text"
                        class="border border-end-0 border-start-0 border-top-0 border-1 border-secondary w-75"
                        placeholder="Write your email here"
                        name="email"><br><br>
                    <label for="">Phone Number</label><br><br>
                    <input type="text"
                        class="border border-end-0 border-start-0 border-top-0 border-1 border-secondary w-75"
                        placeholder="Write your Phone Number"
                        name="number"><br><br>
                    <label for="">Subject *</label><br>
                    <input type="text"
                        class="border border-end-0 border-start-0 border-top-0 border-1 border-secondary w-75"
                        placeholder="Write your subject here"
                        name="subject"><br><br>
                    <label for="">Your Message *</label><br>
                    <input type="text"
                        class="border border-end-0 border-start-0 border-top-0 border-1 border-secondary w-75"
                        name="message"><br> <br>
                    <input type="submit" value="Submit" class="bg-dark text-white w-75">
                </form>

            </div>
        </div>
        <div class="container">
            <div class="row mb-5">
                <div class="col-md-6">
                    <img src="Image/contact.jpg" class="w-75 h-75" alt="">
                </div>
                <div class="col-md-6">
                    <h3>Our Stores</h3>
                    <p>You can also directly buy products from our stores.</p>
                    <div class="row">
                        <div class="col-md-6">
                            <h4 class="fs-3 text-decoration-underline">OFFICE</h4>
                            <p>730 Glenstone Ave 65802, <br> Springfield, US </p>
                            <p>+123 987 321</p>
                            <p>+123 123 654</p>
                            <p>prisha@yourinfo.com</p>
                        </div>
                        <div class="col-md-6">
                            <h4 class="fs-3 text-decoration-underline">USA</h4>
                            <p>730 Glenstone Ave 65802, <br> Springfield, US </p>
                            <p>+123 987 321</p>
                            <p>+123 123 654</p>
                            <p>prisha@yourinfo.com</p>

                        </div>
                    </div>
                </div>
            </div>
        </div>

        <section id="part2">
            <div class="row mx-auto ms-4 p-5">
                <div class="col-md-6">
                    <h2 class="">Subscribe To Our Newsletter</h2>
                    <p>Get latest news, updates and deals directly mailed to your inbox.</p>
                </div>
                <div class="col-md-4 ms-5 mt-5">
                    <div class="border border-2 border-top-0 border-start-0 border-end-0 border-secondary mt-3">
                        <input type="text" placeholder="Your email address here" class="border border-0"><span
                            class="float-end mt-2">Subscribe</span>
                    </div>
                </div>
            </div>
        </section>


		<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>