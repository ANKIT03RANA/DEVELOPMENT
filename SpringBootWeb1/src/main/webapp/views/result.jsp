<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
</body>
        <h2>Result is : <%= session.getAttribute("result")%></h2>

        <!-- JSTL- JSP Standard Library -->
        <h2>Result is : ${result}</h2> 
        <h2>${alien}</h2> 
        <p>Welcome to ${course} world</p>
    </body>
</html>