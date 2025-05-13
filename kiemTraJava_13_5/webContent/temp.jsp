<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Temperature Converter</title>
    </head>
    <body>
        <h2>Temperature Converter</h2>
        <form action="convert" method="post">
            Enter Temperature: <input type="text" name="temperature" required />
            <br />
            Convert:
            <select name="type">
                <option value="CtoF">Celsius to Fahrenheit</option>
                <option value="FtoC">Fahrenheit to Celsius</option>
            </select>
            <br /><br />
            <input type="submit" value="Convert" />
        </form>

        <c:if test="${not empty result}">
            <h3>Result: <c:out value="${result}" /></h3>
        </c:if>

        <c:if test="${not empty error}">
            <p style="color: red"><c:out value="${error}" /></p>
        </c:if>
    </body>
</html>
