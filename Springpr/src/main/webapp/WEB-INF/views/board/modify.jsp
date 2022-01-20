<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../resources/css/write.css">
<link rel="stylesheet" href="../resources/css/all.css">
<link rel="stylesheet" href="../resources/css/sb-admin-2.css">
<link rel="stylesheet" href="/src/main/webapp/resources/css/dataTables.bootstrap4.css">
<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">
</head>
<body>
<h1>글 수정 화면입니다</h1>
    <form action="/board/modify" method="post">
        <div class="form-group row">
            <div class="col-sm-12 mb-3 mb-sm-0"><!--인풋태그 타입에 히든을 쓰면 숨겨짐 혹은 속성 마지막에 readonly를 쓰면 수정이 불가능해짐-->
                <input type="text" value="${detail.bno}" name="bno" class="form-control form-control-user" id="exampleFirstName" >
            </div>
            <div class="col-sm-12 mb-3 mb-sm-0">
                <input type="text" value="${detail.title}" name="title" class="form-control form-control-user" id="exampleFirstName"
                    placeholder="title">
            </div>
            <div class="col-sm-12 mb-3 mb-sm-0">
                <div><textarea name="content" class="form-control form-control-user" id="" cols="30" rows="20" placeholder="content">${detail.content}</textarea></div>
            </div>
            <div class="btn btn-primary btn-icon-sprit">
                <input type="submit" value="글수정" class="btn btn-primary btn-icon-sprit">
            </div>
        </div>
    </form>
</body>
</html>