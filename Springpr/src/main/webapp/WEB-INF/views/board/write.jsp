<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
<link rel="stylesheet" href="../resources/css/write.css">
<link rel="stylesheet" href="../resources/css/all.css">
<link rel="stylesheet" href="../resources/css/sb-admin-2.css">
<link rel="stylesheet" href="/src/main/webapp/resources/css/dataTables.bootstrap4.css">
<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="../resources/js/uploadAjax.js"></script>

</head>
<body>
    <h1>게시판 글쓰기</h1>
    <form role="form" action="/board/write" method="post">
        <div class="form-group row">
            <div class="col-sm-12 mb-3 mb-sm-0">
                <input type="text" name="title" class="form-control form-control-user" id="exampleFirstName"
                    placeholder="title">
            </div>
            <div class="col-sm-12 mb-3 mb-sm-0">
                <div><textarea name="content" class="form-control form-control-user" id="" cols="30" rows="20" placeholder="content"></textarea></div>
            </div>
            <div>
                <input type="file" name="uploadFile" multiple>
            </div>
            <div class="btn btn-primary btn-icon-sprit">
                <input type="submit" value="글쓰기" class="btn btn-primary btn-icon-sprit">
            </div>
        </div>
    </form>
    <div id="uploadResult">
        <ul></ul>
    </div>
</body>
</html>