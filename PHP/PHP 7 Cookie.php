<!-- 
    PHP program to store current date-time in a cookie and display the Last visited
    date-time on the web page upon revisiting the same web page. 
-->

<html>
    <head>
        <title>
            Last Visited Time
        </title>
    </head>
    <body>
        <h1>Welcome to the web page</h1>
        <?php
        function setLastVisitedCookie()
        {
            $currentDateTime = date("Y-m-d H:i:s");
            setcookie('last_visited', $currentDateTime, time() + 3600 * 24 * 30);
        }

        if (isset($_COOKIE['last_visited'])) {
            $lastVisited = $_COOKIE['last_visited'];
        } else {
            setLastVisitedCookie();
            $lastVisited = "This is your first visit";
        }

        echo "Last Visited: " . $lastVisited;

        ?>
    </body>
</html>