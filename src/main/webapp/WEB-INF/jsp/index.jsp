<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Percoski Eric HW3</title>

    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2>HTML Table</h2>

<table>
    <tr>
        <th>ID</th>
        <th>Product Description</th>
        <th>Price</th>
        <th>Color</th>
    </tr>
    <c:forEach var = "listitem" items = "${productList}">
        <tr>

            <td>${listitem.id}</td>
            <td>${listitem.description}</td>
            <td>${listitem.price}</td>
            <td>${listitem.color}</td>

            <td></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>