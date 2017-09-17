<html>
<head><title>FreeMarker Spring MVC Hello World</title>
<body>
<div id="content">
    <table class="datatable">
        <tr>
            <th>Firstname</th>  <th>Lastname</th>
        </tr>
    <#list model["userList"] as user>
        <tr>
            <td>${user.firstname}</td> <td>${user.lastname}</td>
        </tr>
    </#list>
    </table>

</div>
</body>
</html>