<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
    
    <link rel="icon" href="./img/favicon_hu.png" type="image/x-icon">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;500;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../resources/HuggiesCss/header.css">
    <link rel="stylesheet" href="../resources/HuggiesCss/join.css">
    <link rel="stylesheet" href="../resources/HuggiesCss/footer.css">
</head>

<body>
    <div id="wrap">
        <header id="header">
            <div class="header_in">
                <h1 class="logo"><a href="index.html">하기스로고</a></h1>
                <nav class="gnb">
                    <ul>
                        <li><a href="#">브랜드스토리</a></li>
                        <li><a href="#">제품별리스트</a></li>
                        <li><a href="#">이벤트</a></li>
                        <li><a href="board_list.html">고객지원 </a></li>
                    </ul>
                </nav>
                <div class="util">
                    <ul>
                        <li class="login"><a href="./login.html">로그인</a></li>
                        <li class="cart">
                            <a href="#">장바구니</a>
                            <span class="count">0</span>
                        </li>
                    </ul>
                </div>
            </div> <!-- .header_in -->
        </header> <!-- #header -->  
    
    
    
        <div id="join_container">   
            <div class="join_title">
                <h1>회원가입</h1>
                <h2>정보입력</h2>
            </div>
            <div class="join_title_sub">
                <h2>사이트 이용정보 입력</h2>
                <h3>* 표시는 필수 입력항목입니다</h3>
            </div>
            <table class="join_table">
                <tr>
                    <th class="left">*회원명</th>
                    <th class="right">
                        <input type="text" class="input">
                        <p>실명을 입력해주세요</p>
                    </th>
                </tr>
                <tr>
                    <th class="left">*아이디</th>
                    <th class="right">
                        <input type="text" class="input">&nbsp&nbsp&nbsp<button>중복체크</button>
                        <p>영문자, 숫자만 입력가능, 최소 4자이상 입력하세요</p>
                    </th>
                </tr>
                <tr>
                    <th class="left">*비밀번호</th>
                    <th class="right">
                        <input type="password" name="" id="" class="input">
                        <p>8자 이상 입력하세요</p>
                    </th>
                </tr>
                <tr>
                    <th class="left">*비밀번호 확인</th>
                    <th class="right"><input type="password" name="" id="" class="input"></th>
                </tr>
                <tr>
                    <th class="left">*이메일</th>
                    <th class="right">
                        <input type="email" class="input">&nbsp&nbsp&nbsp<button>중복체크</button>&nbsp&nbsp&nbsp
                        <input type="checkbox" name="" id=""> &nbsp&nbspE-mail을 수신합니다.
                    </th>
                </tr>
                <tr>
                    <th class="left">*휴대전화</th>
                    <th class="right">
                        <input type="password" name="" id="" class="input">&nbsp&nbsp&nbsp
                        <input type="checkbox" name="" id=""> &nbspSMS을 수신합니다.
                    </th>
                </tr>
                <tr>
                    <th class="left">가입경로</th>
                    <th class="right">
                        <input type="radio" name="path" class="radio"> 검색
                        <input type="radio" name="path" class="radio"> 지인
                        <input type="radio" name="path" class="radio"> 광고
                        <input type="radio" name="path" class="radio"> 맘카페
                        <input type="radio" name="path" class="radio"> 기타
                    </th>
                </tr>
            </table>
            <div class="lastBtn">
                <button type="submit" class="submit">확인</button>
                <button><a href="login.html">취소</a></button>
            </div>
        </div>

        <footer id="footer">
            <div class="footerIn">
                <div class="footer1">
                    <div class="f_logo">유한킴벌리로고</div>
                    <div class="f_sc">
                        <ul>
                            <li class="f_scQ">제품관련 문의</li>
                            <li class="f_scT">080-022-7007</li>
                            <li class="f_scQ">회사관련 문의</li>
                            <li class="f_scT">02-6411-0100</li>
                        </ul>
                    </div>
                    <div class="f_info">
                        <div class="f_info1">  
                            대표자 : 진재승 <br>
                            주소 : 서울시 송파구 올림픽로 300 롯데월드타워 29층<br> 
                            (우)05551 <span class="bar"></span>사업자번호 : 120-81-11436
                        </div>  
                        <div>
                            <span class="etc1"><a href="#">찾아오시는 길</a></span>
                            <span class="etc2"><a href="#">개인정보 처리방침</a></span>
                        </div>
                    </div><!--f_info-->
                    
                </div>
                <div class="footer2">
                    <div class="f_sns">
                        <ul>
                            <li class="sns_f"><a href="#">페이스북</a></li>
                            <li class="sns_i"><a href="#">인스타그램</a></li>
                            <li class="sns_y"><a href="#">유튜브</a></li>
                            <li class="sns_b"><a href="#">블로그</a></li>
                        </ul>
                    </div>
                    <div class="copyright">Copyright © Yuhan-Kimberly. All right Reserved.</div>
                </div>
            </div> <!-- .footerIn -->
        </footer> <!-- #footer -->
    </div><!--#wrap-->
</div>