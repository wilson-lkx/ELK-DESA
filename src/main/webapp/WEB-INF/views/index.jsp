<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
   <!-- <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>-->
    <!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> -->

    <title>ELKDESA</title>

<style type="text/css">
	.dropdown:hover .dropdown-menu {
		display: block;
	}

	.hidden {
		display: none;
	}

	a {
		text-decoration: none;
		font-weight: normal;
		font-size: 20px;
	}

	a:hover {
		color: #e74c3c;
	}

	ul {
		list-style-type: none;
	}

</style>

</head>

<!--
  sample: https://community.splunk.com/t5/Community/ct-p/en-us
-->

<body style>
<nav class="navbar navbar-expand-lg navbar-dark" style="background-image:linear-gradient(#1A237E,#08073B)">
  <div class="container-fluid">
    <a class="navbar-brand" href="http://localhost:8101/"> <img src="/images/logo.png" alt="ELKDESA Logo" width="165" height="65" class="d-inline-block align-top" /> <span class="hidden"> ELKDESA </span> </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0 ">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="http://localhost:8099/jsp/login.jsp?DFS__Redirect=1">Home</a>
        </li>
        <li class="nav-item dropdown">
                          <a class="nav-link dropdown-toggle" id="navbarDropdown" data-bs-toggle="dropdown" aria-expanded="false">
                            Administrator
                          </a>
                          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="../administrator/company">Company</a></li>
                          </ul>
                        </li>
        <li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle" id="navbarDropdown" data-bs-toggle="dropdown" aria-expanded="false">
                    Account
                  </a>
                  <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <li><a class="dropdown-item" href="../account/journal_type">Journal Type</a></li>
                  </ul>
                </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" id="navbarDropdown" data-bs-toggle="dropdown" aria-expanded="false">
            Report
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="../report/account">Account Journal Report</a></li>
            <li><a class="dropdown-item" href="#">Finance Report</a></li>
            <li><a class="dropdown-item" href="#">EDP Report</a></li>
          </ul>
        </li>

      </ul>

    </div>
  </div>
</nav>



</body>
</html>
