<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">

		<h2>document manager</h2>

		<div>
			<h3>[[${message}]]</h3>
		</div>
		<form action="@{/upload}" method="post" enctype="multipart/form-data">
			<br>
			<td>Upload your files</td> <br> <br>
			<td><input type="file" name="document" required></td> <br>
			<br>
			<td><input type="submit" value="upload"></td>
		</form>
	</div>
</body>
</html>