<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Brand Info</title></head>
<body>
    <h1>Brand: <c:out value="${brand}" /></h1>
    <p>Număr de caractere: <c:out value="${length}" /> (<c:out value="${parity}" />)</p>
</body>
</html>
