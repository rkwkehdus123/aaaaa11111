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
<link rel="stylesheet" href="../resources/css/dataTables.bootstrap4.css">
<link href="../resources/css/bootstrap.css" rel="stylesheet">
<link href="../resources/css/metisMenu.css" rel="stylesheet">
<link href="../resources/css/font-awesome.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="../resources/js/detail.js"></script>
<script src="../resources/js/bootstrap.js"></script>
<script src="../resources/js/metisMenu.js"></script>
<script src="../resources/js/sb-admin-2.js"></script>

</head>
<body>
        <div class="form-group row">
            <div id="bno" class="col-sm-12 mb-3 mb-sm-0">${detail.bno}</div>
            <div class="col-sm-12 mb-3 mb-sm-0">
                ${detail.title}
            </div>
            <div class="col-sm-12 mb-3 mb-sm-0">
                ${detail.content}
            </div>
        </div>
        <div class="col-sm-12 mb-3 mb-sm-0">
            <a href="/board/modify?bno=${detail.bno}">수정</a>
            <a href="/board/remove?bno=${detail.bno}">삭제</a>
        </div>
        <div>
            <button id="addReplyBtn" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">댓글</button>

            <div id="relist"></div>

            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title" id="myModalLabel">댓글</h4>
                        </div>
                        <div class="modal-body">
                        	<div>
                                <input type="text" name="rno">
                            </div>
                        	<div>
                                <label>Replyer</label>
                                <input type="text" name="replyer">
                            </div>
                            <div>
                                <label>Reply</label>
                                <input type="text" name="reply">
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" id="modalRegisterBtn" class="btn btn-primary">댓글 쓰기</button>
                            <button type="button" id="modalModBtn" class="btn btn-primary">댓글 수정</button>
                            <button type="button" id="modalRemoveBtn" class="btn btn-primary">댓글 삭제</button>
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    
</body>
</html>