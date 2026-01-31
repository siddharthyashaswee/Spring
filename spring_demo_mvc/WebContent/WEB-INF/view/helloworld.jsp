<!DOCTYPE html>
<html>

<body>

<h2>Hello World of Spring!</h2><br>

<!-- Version 1 Can read the GET request params directly that come to this page like this -->
Student name:${param.studentName}

<br>

<!-- Version two, mapping through the model. not using request param like above-->
<!--the view now gets server computed data directly from the model, not dependent on request params-->
The message :  ${message}


</body>

</html>