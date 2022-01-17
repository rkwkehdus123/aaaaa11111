<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="../resources/js/uploadAjax.js"></script>
</head>
<body>
	<div>
        <input type="file" name="uploadFile" multiple> <!-- 멀티플을 넣으면 파일을 선택할때 여러개를 선택할 수 있음 -->
    </div>
    <input type="submit" value="전송">
</body>
</html>