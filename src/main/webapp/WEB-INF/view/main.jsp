<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form id="cwpForm" name="cwpForm"
				enctype="multipart/form-data" action="upload"
				method="post">
		<input type="file" id="upload_thumbnail" name="upload_thumbnail"
			placeholder="파일 선택" />
		<button type="submit" >업로드</button>
	</form>

</body>
</html>