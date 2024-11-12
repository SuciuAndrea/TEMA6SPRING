<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Laptop Info</title></head>
<body>
    <h1>Informații Laptop</h1>
    <p>Brand: <c:out value="${lap.brand}" /></p>
    <p>Preț: <c:out value="${lap.price}" /> RON</p>
    <p>RAM: <c:out value="${lap.ram}" /> GB</p>
</body>
</html>
