<!-- 
    Create a table student with fields roll no., name, mark, grade. Insert same records in the table.
    Write a PHP program to display the mark list of a student by accepting the register no. of the student. 
-->

<html>
    <head>
        <title>Student Details</title>
    </head>
    <body>
        <h1>Student Details</h1>
        <form action="" method="POST">
            Reg Number: <input type="text" name="reg">
            <input type="submit" value="Get Result">
        </form>
    </body>
</html>

<?php
if ($_POST) {
    $rg = $_POST['reg'];
    $con = mysqli_connect('localhost', 'sabiq', '123', 'college');

    if ($con) {
        echo "Successfully Connected. <br>";
        $qry = "SELECT * FROM student WHERE reg = '$rg'";
        $result = mysqli_query($con, $qry);
        $nos = mysqli_num_rows($result);
        while ($row = mysqli_fetch_row($result)) {
            echo "<br>";
            echo "Roll no.: '$row[0]'  Name: '$row[1]'  Mark: '$row[2]'  Grade: '$row[3]' ";

        }
    }
}
?>