package org.kdy.controller;


import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
    @GetMapping("upload")
    public void uploadForm() {
        System.out.println("파일 업로드 화면...");
    }
    @GetMapping("uploadAjax")
    public void uploadAjaxForm() {
        System.out.println("파일 업로드 화면...");
    }
    //upload.jsp에서 form문을 사용해서 파일 업로드 컨트롤러
    @PostMapping("uploadAction")
    public void uploadAction(MultipartFile[] uploadFile) {

        //파일업로드 할 경로 지정
        String uploadFolder="D:\\01-STUDY\\upload";

    	for(MultipartFile multipartFile : uploadFile) {
            //사용자가 업로드 한 실제 파일이름
            System.out.println("업로드 파일 이름 = "+multipartFile.getOriginalFilename());
            //사용자가 업로드 한 실제 파일의 크기
            System.out.println("업로드 파일 크기 = "+multipartFile.getSize());
            //사용자가 업로드 한 실제 파일의 형식
            System.out.println("업로드 파일 형식 = "+multipartFile.getContentType());
            /*
            1. 일반적인 for문
                for(int i=;i<score.length;i++){
                    sysout(score[i]);
                }
            2. 향상된 for문(타입이 배열일때만 사용 가능)
                for(int a : score){
                    sysout(a)
                }
            */
            File saveFile=new File(uploadFolder,multipartFile.getOriginalFilename());

            try {
				multipartFile.transferTo(saveFile);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//end try
    	}// for문 end
    }
    //upload ajax를 이용해서 파일 업로드 컨트롤러
    @PostMapping("uploadAjaxAction")
    public void uploadAjaxAction(MultipartFile[] uploadFile) {

        //파일업로드 할 경로 지정
        String uploadFolder="D:\\01-STUDY\\upload";

    	for(MultipartFile multipartFile : uploadFile) {
            //사용자가 업로드 한 실제 파일이름
            System.out.println("업로드 파일 이름 = "+multipartFile.getOriginalFilename());
            //사용자가 업로드 한 실제 파일의 크기
            System.out.println("업로드 파일 크기 = "+multipartFile.getSize());
            //사용자가 업로드 한 실제 파일의 형식
            System.out.println("업로드 파일 형식 = "+multipartFile.getContentType());
            /*
            1. 일반적인 for문
                for(int i=;i<score.length;i++){
                    sysout(score[i]);
                }
            2. 향상된 for문(타입이 배열일때만 사용 가능)
                for(int a : score){
                    sysout(a)
                }
            */
            File saveFile=new File(uploadFolder,multipartFile.getOriginalFilename());

            try {
				multipartFile.transferTo(saveFile);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//end try
    	}// for문 end
    }
}
