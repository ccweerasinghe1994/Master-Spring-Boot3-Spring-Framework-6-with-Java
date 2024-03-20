<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>To Dos</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.css">
</head>
<body>
<h1>Well come ${name}</h1>
<hr>
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>description</th>
        <th>target date</th>
        <th>done</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${todos}" var="todo">
        <tr>
            <td>${todo.id}</td>
            <td>${todo.username}</td>
            <td>${todo.description}</td>
            <td>${todo.targetDate}</td>
            <td>${todo.done}</td>
        </tr>
    </c:forEach>
    </tbody>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
    <script src="webjars/jquery/3.7.1/jquery.js"></script>
</table>
</body>
</html>