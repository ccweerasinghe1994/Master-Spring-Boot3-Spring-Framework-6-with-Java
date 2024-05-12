<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>To Dos</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.css">
</head>
<body>
<div class="container">

    <h1>Enter Todo Details</h1>
    <hr>


    <form method="post">
        Description:<input type="text" name="description">
        <br>
        <input type="submit" class="btn btn-success">
    </form>
</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
<script src="webjars/jquery/3.7.1/jquery.js"></script>
</body>
</html>
