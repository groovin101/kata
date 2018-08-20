$(document).ready(onLoadAffirmation);

function onLoadAffirmation() {
    // bind the ajax reload fn to the ajax button
    $('#ajaxAffirmationLoader').on('click', function () {
        doAjaxAffirmationReload();
    })
}

function doAjaxAffirmationReload() {
    $.ajax({
        type: 'GET',
        url: 'reloadAffirmationViaAjax',
        dataType: 'html',
        cache: false,
        // data: dataString,
        success: function (html) {
            $('#affirmationOfTheDayContainer').html(html + "  <i>[... loaded via Ajax]</i>");
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert('ajax error encountered mi amor');
        },
        complete: function () {
            // ...
        }
    });
}