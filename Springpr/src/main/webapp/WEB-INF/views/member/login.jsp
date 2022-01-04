<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
    
    <link rel="icon" href="./img/favicon_hu.png" type="image/x-icon">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;500;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../resources/HuggiesCss/header.css">
    <link rel="stylesheet" href="../resources/HuggiesCss/login.css">
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
                        <li><a href="board_list.html">고객지원</a></li>
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

        <div id="login_container">
            <h1 class="login_title">로그인</h1>
            <div class="log_in_box">
                <div class="member">
                    <h2>회원 로그인</h2>
                    <div class="member_box1">
                        <div class="id_ps">
                            <div class="id_ps1"><input type="text" name="" id="" placeholder="아이디"></div>
                            <div><input type="password" name="" id="" placeholder="비밀번호"></div>
                        </div>
                        <div class="loginBtn">
                            <a href="">로그인</a>
                        </div>
                    </div>
                    <input type="checkbox" name="" id="" class="id_save"> 아이디 저장
                    <div class="member_box2">
                        <div>
                            <a href="./join.html">&nbsp&nbsp회원가입&nbsp&nbsp&nbsp</a>
                        </div>
                        <div>
                            <a href="">&nbsp아이디 찾기&nbsp</a>
                        </div>
                        <div>
                            <a href="">비밀번호 찾기</a>
                        </div>
                    </div>
                    <div class="member_box3">
                        <ul>
                            <li class="naver_btn"><a href=""></a></li>
                            <li class="kakao_btn"><a href=""></a></li>
                        </ul>
                    </div>
                </div><!--member-->
                <div class="Nmember">
                    <h2>비회원 주문</h2>
                    <div class="NmemberBtn">
                        <a href="">비회원으로 주문하기</a>
                    </div>
                </div><!--Nmember-->
            </div>
        </div><!--container-->


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
</body>
</html>