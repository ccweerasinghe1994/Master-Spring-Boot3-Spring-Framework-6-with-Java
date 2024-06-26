<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>To Dos</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.css">
</head>
<body>
<div class="container">

    <h1>Your ToDos</h1>
    <hr>
    <table class="table">
        <thead>
        <tr>
            <th>name</th>
            <th>description</th>
            <th>target date</th>
            <th>done</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.username}</td>
                <td>${todo.description}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.done}</td>
                <td>
                    <a href="delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a>
                    <a href="update-todo?id=${todo.id}" class="btn btn-warning">Update</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="add-todo" class="btn btn-success">Add Todo</a>
</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
<script src="webjars/jquery/3.7.1/jquery.js"></script>
</body>
</html>
