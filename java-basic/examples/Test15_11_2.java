package bitcamp.java100;

public class Test15_11_2 {

    public static void main(String[] args) {
        // 임무 : 파일의 정보를 저장하라!
        // -디렉토리여부, 소유주/그룹/기타 사용자 읽기, 쓰기, 실행 권한 정보
        // =>메모리 설계

        boolean[] arr = new boolean[10];

        arr[0] = false;
        arr[1] = true;
        arr[2] = true;
        arr[3] = true;
        arr[4] = true;
        arr[5] = false;
        arr[6] = true;
        arr[7] = true;
        arr[8] = false;
        arr[9] = true;

        System.out.print(arr[0] ? "d" : "-");
        System.out.print(arr[1] ? "r" : "-");
        System.out.print(arr[2] ? "w" : "-");
        System.out.print(arr[3] ? "x" : "-");
        System.out.print(arr[4] ? "r" : "-");
        System.out.print(arr[5] ? "w" : "-");
        System.out.print(arr[6] ? "x" : "-");
        System.out.print(arr[7] ? "r" : "-");
        System.out.print(arr[8] ? "w" : "-");
        System.out.print(arr[9] ? "x" : "-");
        System.out.println();

    }
}
