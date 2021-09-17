<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>Company</title>

	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
	<script src="https://cdn.datatables.net/1.11.0/js/jquery.dataTables.min.js"></script>
	<script src="https://cdn.datatables.net/select/1.3.3/js/dataTables.select.min.js"></script>
	<script src="https://cdn.datatables.net/datetime/1.1.1/js/dataTables.dateTime.min.js"></script>
	<script src="https://cdn.datatables.net/colreorder/1.5.4/js/dataTables.colReorder.min.js"></script>
	<script src="https://cdn.datatables.net/buttons/2.0.0/js/dataTables.buttons.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js"></script>
	<script src="https://cdn.datatables.net/buttons/2.0.0/js/buttons.html5.min.js"></script>
	<script src="https://cdn.datatables.net/buttons/2.0.0/js/buttons.print.min.js"></script>
    <script type="text/javascript" src="/js/dataTables.editor.js"></script>
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.0/css/jquery.dataTables.min.css">
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/buttons/2.0.0/css/buttons.dataTables.min.css">
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/select/1.3.3/css/select.dataTables.min.css">
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/datetime/1.1.1/css/dataTables.dateTime.min.css">
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/colreorder/1.5.4/css/colReorder.dataTables.min.css">
	<link rel="stylesheet" type="text/css" href="/css/editor.dataTables.css">
	<script type="text/javascript">
	var editor; // use a global for the submit and return data rendering in the examples
	$(document).ready(function() {
		editor = new $.fn.dataTable.Editor({
			ajax: {
				create: {
					type: 'POST',
					url: '${pageContext.request.contextPath}/administrator/company'
				},
				edit: {
					type: 'PUT',
					url: '${pageContext.request.contextPath}/administrator/company'
				},
				remove: {
					type: 'DELETE',
					url: '${pageContext.request.contextPath}/administrator/company'
				}
			},
			table: "#table",
			fields: [{
				label: "Company Name:",
				name: "companyName"
			}]
		});
		$('#table').DataTable({
			dom: 'Bfrtip',
			ajax: {
				url: '${pageContext.request.contextPath}/administrator/company',
				type: 'GET',
				dataSrc: ''
			},
			columns: [{
				data: "companyName"
			}],
			select: true,
			colReorder: true,
			buttons: [{
				extend: 'create',
				editor: editor
			}, {
				extend: 'edit',
				editor: editor
			}, {
				extend: 'remove',
				editor: editor
			}, {
				extend: 'collection',
				text: 'Export',
				buttons: ['excel', 'csv', 'pdf', 'print']
			}]
		});
	});
	</script>
</head>

<body>
	<%@ include file="../include/menu.html" %>
	<br>
		<table id="table" class="display" style="width:100%">
			<thead>
				<tr>
					<th>Company Name</th>
				</tr>
			</thead>
		</table>
</body>

</html>