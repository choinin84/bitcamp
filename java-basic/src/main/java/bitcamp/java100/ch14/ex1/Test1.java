//File System 다루기: File 클래스
//=>OS의 File System이 관리하는 파일에 대한 정보를 다룬다.
package bitcamp.java100.ch14.ex1;

import java.io.File;

public class Test1 {
    
    public static void main(String[] args) throws Exception {
        
        File file = new File(".");
        
        //File 객체를 생성할 때 넘겨준 경로 중에서
        //마지막 파일명(디렉토리라면 마지막 디렉토리명)
        
//        File file = new File("../bicamp-project/build.gradle");
        System.out.printf("파일명: = %s\n", file.getName());
        System.out.printf("절대경로: = %s\n", file.getAbsolutePath());
        System.out.printf("계산된 경로 = %s\n", file.getCanonicalPath());
        
        System.out.printf("부모디렉토리 = %s\n", file.getPath());
        System.out.printf("기준디렉토리 = %s\n", file.getParent());
        
        System.out.printf("전체 용량 = %s\n", file.getTotalSpace());
        System.out.printf("남은 용량 = %s\n", file.getFreeSpace());
        System.out.printf("파일 존재 = %s\n", file.exists());
        
        System.out.printf("파일 존재 = %s\n", file.exists());
        System.out.printf("파일 여부 = %s\n", file.isFile());
        System.out.printf("디렉토리 여부 = %s\n", file.isDirectory());
        
        System.out.printf("파일이나 디렉토리 크기 = %s\n", file.length());
        
        System.out.printf("읽기 = %s\n", file.canRead());
        System.out.printf("쓰기 = %s\n", file.canWrite());
        System.out.printf("실행 = %s\n", file.canExecute());
        
        System.out.printf("마지막 변경일 = %s\n", file.lastModified()); 
        
       
        
    }
}
