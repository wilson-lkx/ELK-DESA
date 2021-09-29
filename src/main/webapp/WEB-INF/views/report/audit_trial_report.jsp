<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">

		  <!-- Bootstrap CSS -->
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">


        <script src="/js/ajax-request.js"></script>
        <script src="/js/serialize-form.js"></script>

    	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
    	<script src="https://use.fontawesome.com/releases/v5.15.4/js/all.js" data-auto-replace-svg="nest"></script>
    	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.serializeJSON/3.2.1/jquery.serializejson.min.js"></script>
    	<link rel="stylesheet" type="text/css" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.min.css">
    	<link rel="stylesheet" type="text/css" href="https://code.jquery.com/ui/1.12.1/themes/blitzer/jquery-ui.min.css">
        <script src="https://cdn.datatables.net/1.11.2/js/jquery.dataTables.min.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.2/css/jquery.dataTables.min.css">
        <link rel="stylesheet" type="text/css" href="/css/dataView.css">

	<title>Account Journal Report</title>
	<script type="text/javascript">

	function getCurrentDate(now) {
    		var month = (now.getMonth() + 1);
    		var day = now.getDate();
    		if(month < 10) month = "0" + month;
    		if(day < 10) day = "0" + day;
    		var today = now.getFullYear() + '-' + month + '-' + day;
    		return today;
    	}


var json = {
  sample : [{"id":1,"formNo":"202109_000001","companyName":"ELK Desa Resources Bhd","documentNo": "test","documentDate": "01-09-2021","description": "Opening Undue HP interest","raisedBy": "LiWanHo","assignedUser": "Chang Sook Ling","status": "pending"},
                    {"id":2,"formNo":"202109_000002","companyName":"ELK Desa Resources Bhd","documentNo": "test","documentDate": "01-09-2021","description": "Transfer To Stock","raisedBy": "Izziana","assignedUser": "Chang Sook Ling","status": "completed"},
                    {"id":3,"formNo":"202109_000003","companyName":"ELK Desa Capital Sdn Bhd","documentNo": "test","documentDate": "06-09-2021","description": "Salary","raisedBy": "LiWanHo","assignedUser": "Chang Sook Ling","status": "completed"},
                    {"id":4,"formNo":"202109_000004","companyName":"ELK Desa Resources Bhd","documentNo": "test","documentDate": "07-09-2021","description": "Bank charges","raisedBy": "LiWanHo","assignedUser": "Chang Sook Ling","status": "pending"},
                    {"id":5,"formNo":"202109_000005","companyName":"ELK Desa Risk Agency Sdn Bhd","documentNo": "test","documentDate": "07-09-2021","description": "Closing Undue HP interest","raisedBy": "LiWanHo","assignedUser": "Chang Sook Ling","status": "pending"},
                    {"id":6,"formNo":"202109_000006","companyName":"ELK Desa Resources Bhd","documentNo": "test","documentDate": "10-09-2021","description": "Opening Undue HP interest","raisedBy": "Izziana","assignedUser": "Chang Sook Ling","status": "completed"}
                  ,{"id":7,"formNo":"202109_000007","companyName":"Premier Auto Asset Bhd","documentNo": "test","documentDate": "11-09-2021","description": "Opening Undue HP interest","raisedBy": "LiWanHo","assignedUser": "Chang Sook Ling","status": "pending"}]
};

$(document).ready(function() {
var now = new Date();
		$('#datePicker').val(getCurrentDate(now));

var table = $('#table').DataTable({
			dom: 'Bfrtip',
			data:json.sample,
			dataSrc: '',

			columns: [{
             	data: "id",
             	visible: false,
             	searchable: false
            },
             	{data: "formNo",
             	width:'10%',
             	className: "text-center"},
             	{data: "companyName",
             	width:'10%',
             	className: "text-center"},
             	{data: "documentNo",
             	width:'15%',
             	className: "text-center"},
             	{data: "documentDate",
             	width:'10%',
             	className: "text-center"},
             	{data: "description",
             	width:'15%',
             	className: "text-center"},
             	{data: "raisedBy",
             	width:'15%',
             	className: "text-center"},
             	{data: "assignedUser",
             	width:'15%',
             	className: "text-center"},
             	{data: "status",
             	width:'10%',
             	className: "text-center"}],

			buttons: getExportButtons()

	});
        $('#search_form').submit(function(event) {
			event.preventDefault();
			$('#tableDiv').show();

			});

	});

	</script>

	<style type="text/css">

	#search {
		margin-top: 2%;
		width: 10em;
		height: 2em;
		font-family: Arial, Helvetica, sans-serif;
		text-align: center;
		font-weight: normal;
	}


	</style>
</head>

<body id ="body">

<%@ include file="../include/button.html" %>
 <%@ include file="../include/menu.html" %>

<br>
	<h2 id="title">Audit Trial Report</h2>
	<div class="container-xl">
		<div style="border: 1px solid black; padding: 15px 15px 15px;>
			<form id="search_form" name="search_form">
				<div class="row">
					<div class="col">
						<label for="companies" class="fw">Company:</label>
						<select class="form-select form-select-sm" id="company" aria-label=".form-select-sm" name="company">
							<c:forEach items="${companies}" var="company">
								<option value="">All</option>
								<option value="">ELK Desa Resources Bhd</option>
								<option value="">ELK Desa Capital Sdn Bhd</option>
								<option value="">ELK Desa Risk Agency Sdn Bhd</option>
								<option value="">Premier Auto Assets Bhd</option>
							</c:forEach>
						</select>
					</div>
					<div class="col">
						<label for="raisedBy" class="fw">Raised By:</label>
						<select class="form-select form-select-sm" id="raisedby" aria-label=".form-select-sm" name="raisedby">
							<option value="">All</option>
							<option value="">LiWanHo</option>
							<option value="">Chang Sook Ling</option>
							<option value="">Izziana</option>
							<option value="">Peh Bee Chin</option>
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
					<div class="col-4">
						<div id="dailyDiv">
							<label for="datePicker" class="fw">Date From:</label>
							<input type="date" class="form-control form-control-sm" id="datePicker" name="datePicker">
							</div>

					</div>
					<div class="col-4">
						<div id="dailyDiv">
							<label for="datePicker" class="fw">Date To:</label>
							<input type="date" class="form-control form-control-sm" id="datePicker" name="datePicker">
							</div>
						</div>
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
        <div id="tableDiv">
				<table id="table" class="table table-striped table-hover table-bordered table align-middle" cellspacing="0" width="100%">
					<thead class="table table align-middle text-white" style="background-image:linear-gradient(#1976D2, #1A237E); font-weight:normal;">
						<tr>
						    <th class='notexport'>Id</th>
							<th>Form No</th>
							<th>Company</th>
							<th>Document No. (JV No)</th>
							<th>Document Date</th>
							<th>Description (Journal Type)</th>
							<th>Raised By</th>
							<th>Assigned User</th>
							<th>Status</th>
						</tr>
					</thead>
				</table>
		</div>
</div>
 <!-- Option 1: Bootstrap Bundle with Popper -->
     	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>

</html>