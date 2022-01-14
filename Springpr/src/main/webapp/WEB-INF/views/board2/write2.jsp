<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>게시판 글쓰기</h1>
    <form action="/board2/write2" method="post">
    	<div>작성자<input type="text" name="writer"></div>
        <div>제목<input type="text" name="title"></div>
        <div>내용<textarea name="content" id="" cols="30" rows="10"></textarea></div>
        <div>
            <button type="submit" value="작성">작성</button>
            <button value="뒤로가기"><a href="../board2/list2">뒤로가기</a></button>
        </div>
    </form>
</body>
</html> 