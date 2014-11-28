<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<script src="<c:url value="/angular/angular.min.js" />"></script>


<!-- <script src= "http://ajax.googleapis.com/ajax/libs/angularjs/1.2.26/angular.min.js"></script> -->
</head>

<body>

<div ng-app="">
 
<p>Input something in the input box:</p>
<p>Name: <input type="text" ng-model="name" value="John"></p>
<p ng-bind="name"></p>

</div>

</body>
</html>
