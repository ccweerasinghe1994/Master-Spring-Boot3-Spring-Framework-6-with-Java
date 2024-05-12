<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>To Dos</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.css">
    <link rel="stylesheet" href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css">
</head>
<body>
<div class="container">

    <h1>Enter Todo Details</h1>
    <hr>


    <form:form method="post" modelAttribute="todo">

        <fieldset>
            <form:label path="description" cssClass="form-label">Description:</form:label>
            <form:input type="text" path="description" required="true"/>
            <form:errors path="description" cssClass="text-danger"/>
        </fieldset>
        <fieldset>
            <form:label path="targetDate" cssClass="form-label">target Date:</form:label>
            <form:input type="text" path="targetDate" required="true"/>
            <form:errors path="targetDate" cssClass="text-danger"/>
        </fieldset>
        <form:input path="id" type="hidden"/>
        <form:input path="username" type="hidden"/>
        <form:input path="done" type="hidden"/>
        <input type="submit" class="btn btn-success mt-3">
    </form:form>
</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
<script src="webjars/jquery/3.7.1/jquery.js"></script>
<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.js"></script>
<script type="text/javascript">
    $('#targetDate').datepicker({
        format: 'yyyy-mm-dd',
        startDate: '-3d'
    });
</script>
</body>
</html>

