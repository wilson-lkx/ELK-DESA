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

<%@ include file="../include/button.html" %>
 <%@ include file="../include/menu.html" %>


	<h2 align="center" style="font-weight:normal; color:#0230FF;">Journal Entry Report</h2>
	<div class="container-xl">
		<div style="border: 1px solid blue; padding: 15px 15px 15px; background-image:linear-gradient(#E1F5FE,#FAFAFA)">
			<form id="search_form" name="search_form">
				<div class="row">
					<div class="col">
						<label for="companies" class="fw">Company:</label>
						<select class="form-select form-select-sm" id="company" aria-label=".form-select-sm" name="company">
							<c:forEach items="${companies}" var="company">
								<option value="${company.companyID}">${company.companyName}</option>
							</c:forEach>
						</select>
					</div>
					<div class="col">
						<label for="raisedBy" class="fw">Raised By:</label>
						<select class="form-select form-select-sm" id="raisedby" aria-label=".form-select-sm" name="raisedby">
							<option value="">All</option>
						</select>
					</div>
					<div class="col">
						<label for="journalType" class="fw">Description (Journal Type):</label>
						<select class="form-select form-select-sm" id="description" aria-label=".form-select-sm" name="description">
							<option value="">All</option>
						</select>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="mode" class="fw">Mode:</label>
						<select class="form-select form-select-sm" id="mode" aria-label=".form-select-sm" name="mode">
							<option value="1">Daily</option>
							<option value="2">Monthly</option>
							<option value="3">Yearly</option>
						</select>
					</div>
					<div class="col">
						<div id="dailyDiv" style="display: block;">
							<label for="datePicker" class="fw">Date From:</label>
							<input type="date" class="form-control form-control-sm" id="datePicker" name="datePicker"> </div>
						<div id="yearlyDiv" style="display: none;">
							<label for="yearPicker" class="fw">Year:</label>
							<select class="form-select form-select-sm" id="yearPicker" aria-label=".form-select-sm" name="yearPicker"></select>
						</div>
					</div>
					<div class="col">
						<div id="dailyDiv" style="display: block;">
							<label for="datePicker" class="fw">Date To:</label>
							<input type="date" class="form-control form-control-sm" id="datePicker" name="datePicker"> </div>
						<div id="monthlyDiv" style="display: none;">
							<label for="monthlyDiv" class="fw">Monthly:</label>
							<input type="date" class="form-control form-control-sm" id="monthlyPicker" name="monthlyPicker"> </div>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="formNo" class="fw">Form No:</label>
						<input class="form-control form-control-sm" type="text" aria-label=".form-control-sm example"> </div>
					<div class="col">
						<label for="documentNo" class="fw">Document No. (JV No.):</label>
						<input class="form-control form-control-sm" type="text" aria-label=".form-control-sm example">
					</div>
					<div class="col">
						<label for="documentDate" class="fw">Document Date:</label>
						<input class="form-control form-control-sm" type="text" aria-label=".form-control-sm example"> </div>
				</div>
				<div class="row" style="height:50px">
					<div class="col">
						<input id="search" type="submit" class="btn btn-dark" value="Search" style="float:right; background-image:linear-gradient(#1976D2, #1A237E)">
					</div>
				</div>
			</form>
		</div>
	</div>
	<br>
	<div class="container-xl">
		<div id="tableDiv" style="border: 1px solid blue; padding: 15px; background-image:linear-gradient(#E1F5FE,#FAFAFA);  margin-top: 20px;">
			<div class="table-responsive-xxl">
				<table id="reportTable" class="table table-striped table-hover table-bordered table align-middle" cellspacing="0" width="100%">
					<thead class="table table align-middle text-white" style="background-image:linear-gradient(#1976D2, #1A237E); font-weight:normal;">
						<tr class="align-middle">
							<th style="font-weight:normal;">Form No</th>
							<th style="font-weight:normal;">Company</th>
							<th style="font-weight:normal;">Document No. (JV No)</th>
							<th style="font-weight:normal;">Document Date</th>
							<th style="font-weight:normal;">Description (Journal Type)</th>
							<th style="font-weight:normal;">Raised By</th>
							<th style="font-weight:normal;">Assigned User</th>
							<th style="font-weight:normal;">Status</th>
						</tr>
					</thead>
				</table>
			</div>
		</div>
	</div>
</body>

</html>