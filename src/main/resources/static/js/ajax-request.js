function getRedirectUrl(url) {
    return url + '/list';
}

function deleteRecord(url, id) {
    var isConfirmed = confirm("Are you want to delete this record?");
    if (isConfirmed) {
        $.ajax({
            url: url + '/' + id,
            type: 'DELETE',
            contentType:'application/json',
            success: function(result) {
                 alert('Record is deleted successfully.');
                 window.location.href = getRedirectUrl(url);
            },
            error: function(result){
                alert('There was an error.');
            }
        });
    }
}

function updateRecord(url, id, data) {
    var isConfirmed = confirm("Are you want to edit this record?");
    if (isConfirmed) {
        $.ajax({
            url: url + '/' + id,
            type: 'PUT',
            data: data,
            contentType:'application/json',
            success: function(result) {
                 alert('Record is edited successfully.');
                  window.location.href = getRedirectUrl(url);
            },
            error: function(result){
                alert('There was an error.');
            }
        });
    }
}

function createRecord(url, data) {
    var isConfirmed = confirm("Confirm record is correct?");
    if (isConfirmed) {
        $.ajax({
            url: url,
            type: 'POST',
            data: data,
            contentType:'application/json',
            success: function(result) {
                 alert('Record is created successfully.');
                 window.location.href = getRedirectUrl(url);
            },
            error: function(result){
                alert('There was an error.');
            }
        });
    }
}