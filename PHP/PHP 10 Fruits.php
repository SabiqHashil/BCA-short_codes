<!-- 
    Write an HTML page to display a list of fruits in a list box. Write php program to
    display the selected fruits in a webpage. 
-->

<html>
    <head>
        <title>Select a Fruit</title>
    </head>
    <body>
        <form action="" method="POST">
            Choose your facorite fruit: <br> <br>
            <select name="f">
                <option value="Grape">Grape</option>
                <option value="Banana">Banana</option>
                <option value="Apple">Apple</option>
            </select>
            <br> <br>
            <input type="submit" value="Select">
        </form>
    </body>
</html>

<?php
    if($_POST){
        echo "<h2> You have indicated that you like </h2>";
        echo $_POST['f'];
    }
?>