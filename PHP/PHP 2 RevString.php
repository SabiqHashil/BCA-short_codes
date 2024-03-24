<!--
    Write a PHP function to reverse a string.
-->

<html>
<head>
    <title>Reverse a String</title>
</head>
<body>
    <form action="" method="POST">
        <input type="text" name="str">
        <input type="submit">
    </form>
</body>
</html>

<?php
if ($_POST) {
    function rev_str($str)
    {
        $length = strlen($str);

        for ($i = ($length - 1); $i >= 0; $i--) {
            echo $str[$i];
        }
    }

    $string = $_POST['str'];
    rev_str($string);
}