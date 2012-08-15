<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>CityDetail</title>
</head>
<body>
<h1>
	Hello from ${city.name}!  
</h1>

<P>  Detail for cityId ${cityId} </P>
<P>  Detail for cityId ${city.id} </P>
<P>  Detail for cityId ${city.name} </P>
<P>  Detail for cityId ${city.population} </P>
<P>  Detail for cityId ${city.countryCode} </P>
<P>  Detail for cityId ${city.charterDocument.yearOfCharter} </P>

</body>
</html>
