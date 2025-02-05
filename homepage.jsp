<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Movie Ticket Management</title>
</head>
<body>
    <h1>Welcome to Movie Ticket Management System</h1>

    <h2>Available Movies:</h2>
    <ul>
        <c:forEach var="movie" items="${movies}">
            <li>${movie.name} - ${movie.showTime}</li>
        </c:forEach>
    </ul>

    <p>
        <fmt:formatDate value="${currentDate}" pattern="yyyy-MM-dd HH:mm:ss" />
    </p>

    <footer>
        <p>&copy; 2025 Movie Ticket Management</p>
    </footer>
</body>
</html>
