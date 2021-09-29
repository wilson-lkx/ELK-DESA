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


<script type="text/javascript">
	$(document).ready(function() {
        var targetUrl = '${pageContext.request.contextPath}/administrator/users';
        $('.dialog').dialog({
            dialogClass:'dialogTitle',
            modal: true,
            autoOpen: false,
            width: 700,
            height: 400,
            buttons: {
                "Submit": function() {
                    var dialogId = this.id;
                    if (dialogId == "dialogEdit") {
                       var formData = getFormData($('#formEdit'));
                       var json = JSON.stringify(formData);
                       updateRecord(targetUrl, formData.id, json);
                    } else {
                        var formData = getFormData($('#formCreate'));
                        var json = JSON.stringify(formData);
                        createRecord(targetUrl, json);
                    }
                },
                "Cancel": function() {
                    $(this).dialog("close");
                }
            }
        });
		var table = $('#table').DataTable({
			dom: 'Bfrtip',
			ajax: {
				url: targetUrl,
				type: 'GET',
				dataSrc: ''
			},
			columns: [{
				data: "id",
				visible: false,
				searchable: false
			}, {
				data: "userName",
				width: '30%'
			}, {
               	data: "userEmail",
               	width: '25%'
            },{
              	data: "userRole",
              	width: '25%'
            },{
				targets: -2,
				data: null,
				defaultContent: '<button id="btnEdit" class="btn"><i class="fas fa-edit"></i></button>',
				orderable: false,
				width: '10%',
				className: "text-center"
			}, {
				targets: -1,
				data: null,
				defaultContent: '<button class="btn"><i class="fas fa-trash"></i></button>',
				orderable: false,
				width: '10%',
				className: "text-center"
			}],
			buttons: getExportButtons()
		});
		$('#table tbody').on('click', 'button', function() {
		    var buttonId = this.id;
			var tr = $(this).closest('tr');
            var data = $('#table').DataTable().row(tr).data(); //json
			var userId = data.id;
			var userLoginId = data.userLoginId;
			var userPassword = data.userPassword;
			var userName = data.userName;
			var userEmail = data.userEmail;
			var userRole = data.userRole;

			if(buttonId == "btnEdit") {
                $('#dialogEdit').dialog('open');
                $('#formEdit #id').val(userId);
                $('#formEdit #userLoginId').val(userLoginId);
                $('#formEdit #userPassword').val(userPassword);
                $('#formEdit #userName').val(userName);
                $('#formEdit #userEmail').val(userEmail);
                $('#formEdit #userRole').val(userRole);
			} else {
                deleteRecord(targetUrl, companyId);
			}
		});
		$('#btnCreate').click(function(){
            $('#dialogCreate').dialog('open');
		});
	});
	</script>


</head>

<body id="body">
    <%@ include file="../include/button.html" %>
    <%@ include file="../include/menu.html" %>

<br>
<div class="container-xl">
 	<h2 id="title"> User List </h2>
</div>
 	<br>
<div class="container-xl justify-content-md-end">
	<button id="btnCreate" class="btn"><i class="fas fa-file"></i> New Record</button>
</div>
 <br>
 <br>
	<div class="container-xl">
     	<table id="table" class="table table-striped table-hover table-bordered table align-middle" cellspacing="0" width="100%" style="width:100%">
        <thead class="table table align-middle text-white" style="background-image:linear-gradient(#1976D2, #1A237E); font-weight:normal;">
			<tr>
				<th class='notexport'>Id</th>
				<th>User Name</th>
				<th>User Email</th>
				<th>User Role</th>
				<th class='notexport'>Edit</th>
				<th class='notexport'>Delete</th>
			</tr>
		</thead>
	</table>
		</div>
     	<br>
	<div id="dialogEdit" class="dialog" style="display: none" align = "center">
		<form id="formEdit" class="dialogForm" name="formEdit">
			<h3>Edit User Form</h3>
			<input type="text" id="id" name="id" style="display: none">
			<br/>
			<label>User Name: <span>*</span></label>
			<br/>
			<input type="text" id="userName"  name="userName">
			<br/>
			<label>User Email: <span>*</span></label>
            <br/>
            <input type="text" id="userEmail"  name="userEmail">
            <br/>
            <label>User Role: <span>*</span></label>
            <br/>
            <input type="text" id="userRole"  name="userRole">
            <br/>
		</form>
	</div>
	<div id="dialogCreate" class="dialog" style="display: none" align = "center">

		<form id="formCreate" class="dialogForm" name="formCreate">
			<h3>Create New User Form</h3>
			<input type="text" id="id" name="id" style="display: none">
			<br/>
			<label>User Login Id: <span>*</span></label>
			<br/>
            <input type="text" id="userLoginId" name="userLoginId">
            <br/>
            <br/>
            <label>User Password: <span>*</span></label>
            <br/>
            <input type="text" id="userPassword" name="userPassword">
            <br/>
            <br/>
			<label>User Name: <span>*</span></label>
			<br/>
			<input type="text" id="userName" name="userName">
			<br/>
			<br/>
			<label>User Email: <span>*</span></label>
			<br/>
            <input type="text" id="userEmail"  name="userEmail">
            <br/>
            <br/>
            <label>User Role: <span>*</span></label>
            <br/>
            <input type="text" id="userRole"  name="userRole">
            <br/>
		</form>
	</div>

	 <!-- Option 1: Bootstrap Bundle with Popper -->
     	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>



</html>