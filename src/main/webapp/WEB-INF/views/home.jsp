<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<P>  The dbname is ${dbName}. </P>

<P>  The db contains this many cities: ${dbCities}. </P>

<p>  One of my favorite cities is <a href="/mongo/cityDetail/50242c2518cde00e8416af02"> this one</a>

</body>
</html>
