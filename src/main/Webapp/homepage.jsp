<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
</head>
<body>
<form action="englishtonepalidateconvert" method="post">

<input type="text" name="engyear">
<input type="text" name="engmonth">
<input type="text" name="engday">
<input type="submit" value="convert">

</form>
${nepalidate}

<br><br><br>
<form action="nepalitoenglishdateconvert" method="post">

<input type="text" name="nepyear">
<input type="text" name="nepmonth">
<input type="text" name="nepday">
<input type="submit" value="convert">

</form>
${englishdate}
</body>
</html>