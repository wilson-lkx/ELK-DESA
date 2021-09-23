<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">

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


<script type="text/javascript">

	$(document).ready(function() {
        var targetUrl = '${pageContext.request.contextPath}/account/rejected_reasons';
        $('.dialog').dialog({
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
				data: "rejectedReason",
				width: '80%'
			}, {
				targets: -2,
				data: null,
				defaultContent: '<button id="btnEdit" class="btn"><i class="fas fa-edit"></i></button>',
				orderable: false,
				width: '10%'
			}, {
				targets: -1,
				data: null,
				defaultContent: '<button class="btn"><i class="fas fa-trash"></i></button>',
				orderable: false,
				width: '10%'
			}],
			buttons: getExportButtons()
		});
		$('#table tbody').on('click', 'button', function() {
		    var buttonId = this.id;
			var tr = $(this).closest('tr');
            var data = $('#table').DataTable().row(tr).data(); //json
			var rejectedReasonId = data.id;
			var rejectedReason = data.rejectedReason;

			if(buttonId == "btnEdit") {
                $('#dialogEdit').dialog('open');
                $('#formEdit #id').val(rejectedReasonId);
                $('#formEdit #rejectedReason').val(rejectedReason);
			} else {
                deleteRecord(targetUrl, rejectedReasonId);
			}
		});
		$('#btnCreate').click(function(){
            $('#dialogCreate').dialog('open');
		});
	});
	</script>
</head>

<body>
 <%@ include file="../include/button.html" %>
 <%@ include file="../include/menu.html" %>

 	<h2> Rejected Reason List </h2>
 	<br>
 	<button id="btnCreate" class="btn"><i class="fas fa-file"></i> New Record</button>
 	<table id="table" class="display" style="width:100%">
 		<thead>
 			<tr>
 				<th class='notexport'>Id</th>
 				<th>Rejected Reason</th>
 				<th class='notexport'>Edit</th>
 				<th class='notexport'>Delete</th>
 			</tr>
 		</thead>
 	</table>
 	<div id="dialogEdit" class="dialog" style="display: none" align = "center">
 		<form id="formEdit" class="dialogForm" name="formEdit">
 			<h3>Edit Rejected Reason Form</h3>
 			<hr/>
 			<input type="text" id="id" name="id" style="display: none">
 			<br/>
 			<label>Rejected Reason: <span>*</span></label>
 			<br/>
 			<input type="text" id="rejectedReason"  name="rejectedReason">
 			<br/>
 		</form>
 	</div>
 	<div id="dialogCreate" class="dialog" style="display: none" align = "center">
 		<form id="formCreate" class="dialogForm" name="formCreate">
 			<h3>Create New Rejected Reason Form</h3>
 			<hr/>
 			<input type="text" id="id" name="id" style="display: none">
 			<br/>
 			<label>Rejected Reason: <span>*</span></label>
 			<br/>
 			<input type="text" id="rejectedReason" name="rejectedReason">
 			<br/>
 		</form>
 	</div>
 </body>

 </html>