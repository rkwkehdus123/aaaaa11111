<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>업로드</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="../resources/js/uploadAjax.js"></script>
</head>
<body>
	<div>
        <input type="file" name="uploadFile" multiple> <!-- 멀티플을 넣으면 파일을 선택할때 여러개를 선택할 수 있음 -->
    </div>
    <input type="submit" value="전송">
    <div id="uploadResult">
		<ul></ul>
    </div>
</body>
</html>
<!-- 파일업로드에서 고려해야 할 점
1. 파일 크기 및 파일 확장자 제한
2. 동일한 이름으로 파일 업로드 되었을 때 기존 파일이 사라지는 문제
	-다른 이름으로 파일 업로드
		1)abc.jpg -> 20220118092021_abc.jpg(현재시간으로 구분해서 파일이름 생성)
		2)abc.jpg -> f39i8jf398jsdf_abc.jpg(중복이 발생할 가능성이 없는 문자열을 생성)UUID
	-한 폴더에 파일이 많은 경우 속도저하, 갯수 제한 문제가 생길 수 있음
		1)년/월/일 단위의 폴더를 생성하여 파일 저장
3. 섬네일 이미지를 생성해야 할때 원본 이미지 파일의 용량이 큰 경우 문제 
	-Thumbnailator라이브러리를 이용해서 썸네일


-->