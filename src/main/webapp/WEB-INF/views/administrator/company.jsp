<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdn.datatables.net/1.11.0/js/jquery.dataTables.min.js"></script>
	<script src="https://cdn.datatables.net/buttons/2.0.0/js/dataTables.buttons.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js"></script>
	<script src="https://cdn.datatables.net/buttons/2.0.0/js/buttons.html5.min.js"></script>
	<script src="https://cdn.datatables.net/buttons/2.0.0/js/buttons.print.min.js"></script>
	<!-- Bootstrap CSS -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	<!-- <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>-->
	<!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> -->
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.0/css/jquery.dataTables.min.css">
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/buttons/2.0.0/css/buttons.dataTables.min.css">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<title>Account Journal Report</title>
	<script type="text/javascript">

    function onFormSubmit(){
        var formData= readFormData();
        insertNewRecord(formData);

    }


    function readFormData() {
        var formData ={};
        formData["companyNo"] = document.getElementById ("companyNo").value;
        formData["companyName"] = document.getElementById ("companyName").value;
        return formData;

    }

function insertNewRecord(data){
    var table =document.getElementById("companyTable").getElementsByTagName('tbody')[0];
    var newRow = table.insertRow(table.length);
    cell1 = newRow.insertCell(0);
    cell1.innerHTML = data.companyNo;
    cell2 = newRow.insertCell(1);
    cell2.innerHTML = data.companyName;
    cell3= newRow.insertCell(2);
    cell3.innerHTML = `<a>Edit</a>
                      <a>Delete</a>`;

}
	</script>
	<style type="text/css">
	.dropdown:hover .dropdown-menu {
		display: block;
	}

	.hidden {
		display: none;
	}

	#search {
		margin-top: 2%;
		width: 10em;
		height: 2em;
		font-family: Arial, Helvetica, sans-serif;
		text-align: center;
		font-weight: normal;
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

<body style="background-color: #EDEDED;">
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
	<!-- https://www.youtube.com/watch?v=J6jrLZ3Ah5g -->
    <br>
	<h2 align="center" style="font-weight:normal; color:#0230FF;">List Of Companies</h2>
    <br>
	<div class="container-xl">
	<div id="AddTable" style="border: 1px solid blue; padding: 15px; background-image:linear-gradient(#E1F5FE,#FAFAFA);  margin-top: 20px;">
	<form onsubmit="event.preventDefault(); onFormSubmit();" autocomplete="off">
	<div class="col">
        <label for="companyNo" class="form-label">No:</label>
        <input type="text" class="form-control" id="companyNo" placeholder="companyNo">
    </div>
    <div class="col">
            <label for="companyName" class="form-label">Company Name:</label>
            <input type="text" class="form-control" id="companyName" placeholder="Company Name">
        </div>
    <br>
        <div class="col">
            <button type="submit" class="btn btn-primary">Add</button>
         </div>


	</form>
	</div>
	</div>
	<div class="container-xl">
		<div id="tableDiv" style="border: 1px solid blue; padding: 15px; background-image:linear-gradient(#E1F5FE,#FAFAFA);  margin-top: 20px;">
			<div class="table-responsive-xxl">
				<table id="companyTable" class="table table-striped table-hover table-bordered table align-middle" cellspacing="0" width="100%">
					<thead class="table table align-middle text-white" style="background-image:linear-gradient(#1976D2, #1A237E); font-weight:normal;">
						<tr class="align-middle">
						     <th style="font-weight:normal;">No</th>
                             <th style="font-weight:normal;">Company Name</th>
                             <th style="font-weight:normal;">Action</th>

						</tr>
					</thead>
					<tbody>

					</tbody>

				</table>
			</div>
		</div>
	</div>
</body>

</html>