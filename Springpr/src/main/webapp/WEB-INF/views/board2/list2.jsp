<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>게시판번호</th>
                <th>제목</th>
                <th>작성자</th>
                <th>작성일</th>
                <th>조회수</th>
                <th>좋아요</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list2}" var="board2">
                <tr>
                    <td>${board2.bno}</td>
                    <td><a href="/board2/detail2?bno=${board2.bno}">${board2.title}</a></td>
                    <td>${board2.writer}</td>
                    <td>${board2.regdate}</td>
                    <td>${board2.cnt}</td>
                    <td>${board2.good}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <div>
        <a href="../board2/write2">글쓰기</a>
    </div>
</body>
</html>