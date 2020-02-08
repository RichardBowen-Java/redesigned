$(document).ready(function(){

   $("#userName").keyup(function(){

     var username = $(this).val().trim();

     if(username != ''){

        $("#uname_response").show();

        $.ajax({
           url: 'ajaxfile.php',
           type: 'post',
           data: {username:username},
           success: function(response){

              // Show response
              $("#uname_response").html(response);

           }
        });
     }else{
        $("#uname_response").hide();
     }

  });

});

