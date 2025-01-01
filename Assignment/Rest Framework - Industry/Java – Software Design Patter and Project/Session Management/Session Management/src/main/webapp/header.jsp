<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <div class="offcanvas-body">
            <ul id="navbar" class="navbar-nav w-100 d-flex justify-content-between align-items-center">

              <ul class="list-unstyled d-lg-flex justify-content-md-between align-items-center">
                <li class="nav-item">
                  <a class="nav-link ms-0" href="about.html">About</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link ms-0" href="shop.html">Shop</a>
                </li>
                <li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle ms-0" data-bs-toggle="dropdown" href="#" role="button"
                    aria-expanded="false">Pages<svg class="bi" width="18" height="18">
                      <use xlink:href="#chevron-down"></use>
                    </svg></a>
                  <ul class="dropdown-menu">
                    <li>
                      <a href="about.jsp" class="dropdown-item fs-5 fw-medium">About</a>
                    </li>
                    <li>
                      <a href="shop.jsp" class="dropdown-item fs-5 fw-medium">Shop</a>
                    </li>
                    <li>
                      <a href="single-product.jsp" class="dropdown-item fs-5 fw-medium">Single Product</a>
                    </li>
                    <li>
                      <a href="login.jsp" class="dropdown-item fs-5 fw-medium">Account</a>
                    </li>
                    
                    <% if(session.getAttribute("project")!=null)
                    {
                    	%>
                    
                    <li>
                      <a href="cart.jsp" class="dropdown-item fs-5 fw-medium">Cart</a>
                    </li>
                    <li>
                      <a href="wishlist.jsp" class="dropdown-item fs-5 fw-medium">Wishlist</a>
                    </li>
                    
                    <% } %>
                    <li>
                      <a href="checkout.jsp" class="dropdown-item fs-5 fw-medium">Checkout</a>
                    </li>
                    <li>
                      <a href="blog.jsp" class="dropdown-item fs-5 fw-medium">Blog</a>
                    </li>
                    <li>
                      <a href="single-post.jsp" class="dropdown-item fs-5 fw-medium">Single Post</a>
                    </li>
                    <li>
                      <a href="contact.jsp" class="dropdown-item fs-5 fw-medium">Contact</a>
                    </li>
                  </ul>
                </li>
              </ul>

              <a class="navbar-brand d-none d-lg-block me-0 ms-3" href="index.jsp">
                <img src="Image/logo.png" class="logo img-fluid w-50 ms-5">
              </a>

              <ul class="list-unstyled d-lg-flex justify-content-between align-items-center">
                <li class="nav-item search-item">
                  <div id="search-bar" class="border-right d-none d-lg-block">
                    <form action="" autocomplete="on">
                      <input id="search" class="text-dark" name="search" type="text" placeholder="Search Here...">
                      <a type="submit" class="nav-link me-0" href="#">Search</a>
                    </form>
                  </div>
                </li>
                <%
                if(session.getAttribute("project")!=null)
                {
                %>
                <li class="nav-item">
                  <a class="nav-link text-decoration-underline me-0" href="logout.jsp">Logout</a>
                </li>
                <%
                }
                %>
                <li class="cart-dropdown nav-item dropdown">
                  <a class="nav-link dropdown-toggle me-0" data-bs-toggle="dropdown" href="#" role="button"
                    aria-expanded="false">Cart(2)</a>
                  <div class="dropdown-menu dropdown-menu-end p-3">
                    <h4 class="d-flex justify-content-between align-items-center mb-3">
                      <span class="text-primary">Your cart</span>
                      <span class="badge bg-primary rounded-pill">2</span>
                    </h4>
                    <ul class="list-group mb-3">
                      <li class="list-group-item bg-transparent border-dark d-flex justify-content-between lh-sm">
                        <div>
                          <h5 class="card-title fs-3 text-capitalize">
                            <a href="single-product.html">Matt Black</a>
                          </h5>
                          <small class="text-body-secondary">Soft texture matt coated.</small>
                        </div>
                        <span class="text-primary">$120</span>
                      </li>
                      <li class="list-group-item bg-transparent border-dark d-flex justify-content-between">
                        <span class="text-uppercase"><b>Total (USD)</b></span>
                        <strong>$990</strong>
                      </li>
                    </ul>
                    <div class="d-flex flex-wrap justify-content-center">
                      <a class="w-100 btn btn-dark mb-1" href="cart.jsp" type="submit">View Cart</a>
                      <a class="w-100 btn btn-primary" type="submit">Go to checkout</a>
                    </div>
                  </div>
                </li>
              </ul>
            </ul>
          </div>
        </div>