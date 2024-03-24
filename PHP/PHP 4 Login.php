<!--
    Create a login page using databse
-->

<html>
<head>
    <title>Login Page</title>
</head>
    <body>
        <form action="" method="POST">
            Username: <input type="text" name="usr"> <br> <br>
            Password: <input type="password" name="pass"> <br> <br>
            <input type="submit" value="login">
        </form>
    </body>
</html>

<?php
if ($_POST) {
    $usr = $_POST['usr'];
    $paswd = $_POST['pass'];

    $con = mysqli_connect('localhost', 'sabiq', '123', 'college');
    if ($con) {
        echo "Successfully Connected. <br>";
        $qry = "SELECT username, password FROM login WHERE username = '$usr' AND password = '$paswd'";
        $result = mysqli_query($con, $qry);
        $nos = mysqli_num_rows($result);

        if ($nos) {
            echo "Login Successful.";
        } else {
            echo "Login Failed.";
        }
    }
}


?>