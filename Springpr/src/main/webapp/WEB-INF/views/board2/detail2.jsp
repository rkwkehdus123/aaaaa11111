<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="/board2/write2" method="post">
        <h1>${detail2.title}</h1>
        <div>작성자 : ${detail2.writer}</div>
        <div>조회수 : ${detail2.cnt}</div>
        <div>${detail2.content}</div>
    </form>
    <a href="../board2/list2">목록으로</a>
    <a href="../board2/modify2">수정</a>
    <a href="../board2/remeve2">삭제</a>
</body>
</html>