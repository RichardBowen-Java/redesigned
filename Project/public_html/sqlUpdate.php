<?php
            require_once 'login.php';

            $conn = new mysqli($hn,$un,$pw,$db);
            if ($conn->connect_error) {
              die('<p>Failed to connect to MySQL: '.mysqli_connect_error().'</p>');
            } else {
              echo '<p>Connection to MySQL server successfully established.</p >';
            }
            
            $firstName = filter_input(INPUT_POST,'firstName');
            $lastName = filter_input(INPUT_POST,'lastName');
            $userName = filter_input(INPUT_POST,'userName');
            $password = filter_input(INPUT_POST,'password');
            $email = filter_input(INPUT_POST,'email');
            $time = date("h:i:sa");
            $permissions = "read";
            $repeat = filter_input(INPUT_POST,'repeat');
            
            echo $userName;
           
            
            if($password!=$repeat)
            {
                echo '<p>Passwords do not match</p>'; 
            }
            else
            {
                if(isset($_POST['Register']))
                {
                $query = "INSERT INTO `Login details` VALUES('$firstName','$lastName','$email','$userName','$password','$time','$permissions')";
                $result = mysqli_query($conn, $query);
                echo '<br>';
                echo $query;
                }
            }    
?>
 
