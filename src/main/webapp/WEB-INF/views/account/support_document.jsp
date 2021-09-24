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
    var targetUrl = '${pageContext.request.contextPath}/account/document_types';
    function getJournalTypes() {
		$.ajax({
			type: 'GET',
			url: '${pageContext.request.contextPath}/account/journal_types',
			success: function(result) {
			    alert(result);
				var result = JSON.parse(result);
				console.log(result);
				var html = '';
				for(var i = 0; i < result.length; i++) {
					html += '<option value="' + result[i].id + '">' + result[i].journalType + '</option>';
				}
				$('#journalTypes').html(html);
			}
		});
    }
    function testData() {
        var data = '[{"id":5,"journalType":"Accrual and Prepayment Expenses"},{"id":9,"journalType":"Adj on HPD Using EIR Method"},{"id":11,"journalType":"Bank charges"},{"id":18,"journalType":"Block Discount"},{"id":16,"journalType":"Bond interest"},{"id":2,"journalType":"Closing Undue HP interest"},{"id":20,"journalType":"Deferred Tax "},{"id":17,"journalType":"Depreciation charges"},{"id":13,"journalType":"Fixed deposit interest"},{"id":27,"journalType":"HP Proceeds"},{"id":31,"journalType":"ICULS conversion"},{"id":30,"journalType":"ICULS coupon interest"},{"id":8,"journalType":"Impairment Provision HPD "},{"id":15,"journalType":"Insurance premium "},{"id":6,"journalType":"Interest for Term Loan "},{"id":24,"journalType":"Interest waiver"},{"id":25,"journalType":"Loss on Insurance Claims"},{"id":26,"journalType":"New Block Charges"},{"id":1,"journalType":"Opening Undue HP interest"},{"id":12,"journalType":"Other Asset"},{"id":21,"journalType":"Provision for taxation"},{"id":7,"journalType":"Rebate to Hirer on Early Settlement"},{"id":23,"journalType":"Reclassification of accounts "},{"id":28,"journalType":"Repo expenses "},{"id":29,"journalType":"Reversal of Coupon Interest"},{"id":14,"journalType":"Right of use asset MFRS 16"},{"id":4,"journalType":"Salary"},{"id":10,"journalType":"Service and E-Pay charges"},{"id":19,"journalType":"Short term investment"},{"id":22,"journalType":"Suspense lodgement deposit"},{"id":3,"journalType":"Transfer to Stock"}]';
        var result = JSON.parse(data);
        console.log(result);
        var html = '';
        for(var i = 0; i < result.length; i++) {
        	html += '<option value="' + result[i].id + '">' + result[i].journalType + '</option>';
       }
       $('#journalTypes').html(html);
    }

    function getSupportDocuments() {
        var journalTypeId = $('#journalTypes').val();
		$('#table').DataTable({
			dom: 'Bfrtip',
			ajax: {
				url: targetUrl + '?journalType=' + journalTypeId,
				type: 'GET',
				dataSrc: ''
			},
			columns: [{
				data: "id",
				visible: false,
				searchable: false
			}, {
            	data: "documentType",
            	width: '80%'
            }, {
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
    }

	$(document).ready(function() {
        testData();

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
		$('#table tbody').on('click', 'button', function() {
		    var buttonId = this.id;
			var tr = $(this).closest('tr');
            var data = $('#table').DataTable().row(tr).data(); //json
			var supportDocumentId = data.id;
			var documentType = data.documentType;

			if(buttonId == "btnEdit") {
                $('#dialogEdit').dialog('open');
                $('#formEdit #id').val(supportDocumentId);
                $('#formEdit #documentType').val(documentType);
			} else {
                deleteRecord(targetUrl, supportDocumentId);
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
 	<h2 id="title"> Support Document List </h2>
</div>
 	<br>
<div class="container-xl">
    <select id="journalTypes" name="journalTypes"  onchange="getSupportDocuments()"></select>
</div>
 	<br>
 <br>
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
 				<th>Support Document Name</th>
 				<th class='notexport'>Edit</th>
 				<th class='notexport'>Delete</th>
 			</tr>
 		</thead>
 	</table>
 	 	</div>
     	<br>
 	<div id="dialogEdit" class="dialog" style="display: none" align = "center">
 		<form id="formEdit" class="dialogForm" name="formEdit">
 			<h3>Edit Support Document Form</h3>
 			<hr/>
 			<input type="text" id="id" name="id" style="display: none">
 			<br/>
  			<label>Journal Type Id: <span>*</span></label>
  			<br/>
  			<input type="text" id="documentJournalType" name="documentJournalType">
  			<br/>
  			<br/>
  			<label>Support Document Name: <span>*</span></label>
              <br/>
              <input type="text" id="documentType" name="documentType">
              <br/>
 		</form>
 	</div>
 	<div id="dialogCreate" class="dialog" style="display: none" align = "center">
 		<form id="formCreate" class="dialogForm" name="formCreate">
 			<h3>Create New Support Document Form</h3>
 			<hr/>
 			<input type="text" id="id" name="id" style="display: none">
 			<br/>
 			<label>Journal Type Id: <span>*</span></label>
 			<br/>
 			<input type="text" id="documentJournalType" name="documentJournalType">
 			<br/>
 			<br/>
 			<label>Support Document Name: <span>*</span></label>
             <br/>
             <input type="text" id="documentType" name="documentType" autocomplete="off">
             <br/>
 		</form>
 	</div>

 	<!-- Option 1: Bootstrap Bundle with Popper -->
     	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>


 </body>

 </html>