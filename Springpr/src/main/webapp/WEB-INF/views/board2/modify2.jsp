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
    <form action="/board2/modify2" method="post">
        <input type="text" name="bno" value="${detail2.bno}" readonly>
        <h1><input type="text" name="title" value="${detail2.title}"></h1>
        <div>작성자 : ${detail2.writer}</div>
        <div>조회수 : ${detail2.cnt}</div>
        <div><textarea name="content" id="" cols="30" rows="10">${detail2.content}</textarea></div>
        <button type="submit" value="글수정">글수정</button>
    </form>
    
</body>
</html> 