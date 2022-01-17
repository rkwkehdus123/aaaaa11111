$(document).ready(function(){
	
	//파일의 크기와 확장자를 검사하는 함수 선언
    //서버에서 설정해 놓은 파일 크기 설정
    var maxSize=5242880; //5MB
    //서버에서 허용 불가능한 확장자 설정(정규식)
    var regex = new RegExp("(.*?)\.(exe|sh|zip|alz)$")
    
    function checkExtension(fileSize, fileName){  //(파일의크기, 확장자)
        //사용자가 선택한 파일의 크기가 서버에서 설정해놓은 파일의 크기보다 이상이면
        if(fileSize>=maxSize) { //(사용자가 선택한 파일크기 >= 서버에서 설정해 놓은 파일 크기)
            alert("파일 사이즈 초과");
            return false;
        }
        //사용자가 선택한 파일의 확장자가 서버에서 설정해 놓은 파일의 확장자와 일치하지 않으면
        if(regex.test(fileName)){
            alert("해당 종류의 파일은 업로드 할 수 없습니다.");
            return false;
        }
        return true;

    }
	
	$("input[type='submit']").on("click",function(){
        // alert("aaa")
        //가상의 form태그
        var formData = new FormData();
        var inputFile = $("input[name='uploadFile']");
        var files = inputFile[0].files;
        console.log(files)

        for(var i=0;i<files.length;i++){
            //파일의 크기가 이상이면
            if(!checkExtension(files[i].size,files[i].name)){
                //밑에 있는거 하지마라
                return false
            }
            formData.append("uploadFile",files[i]);
        }
        
        //ajax를 이용해서....
        //formData 자체를 데이터로 전송하고,
        //formData를 데이터로 전송할 때에는
        //processData와 contentType는 반드시 false여야 함.
        $.ajax({
        	url:"uploadAjaxAction",
            type:"post",
            data:formData,
            processData:false,
            contentType:false,
            success:function(result){
                alert("upload성공")
            }
        })
    })
})