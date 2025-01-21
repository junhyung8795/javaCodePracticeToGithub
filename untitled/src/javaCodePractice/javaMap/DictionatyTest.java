package javaCodePractice.javaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionatyTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        System.out.println("단어 입력 단계");
        boolean loop1 = true;
        boolean loop2 = false;
        while(loop1){
            Scanner sc = new Scanner(System.in);
            System.out.println("영어 단어를 입력하세요 (종료는 'q'를 누르세요))");
            String englishWord = sc.nextLine();
            if(englishWord.equals("q")){
                loop1 = false;
                loop2 = true;
                break;
            }

            System.out.println("한글 뜻을 입력하세요 (종료는 'q'를 누르세요)");
            String koreanWord = sc.nextLine();
            if(koreanWord.equals("q")){
                loop1 = false;
                loop2 = true;
                break;
            }

            map.put(englishWord, koreanWord);
        }

        while(!loop1 && loop2){
            Scanner sc = new Scanner(System.in);
            System.out.println("찾을 영어 단어를 검색하세요 (종료는 'q'를 누르세요))");
            String englishTarget = sc.nextLine();
            if (englishTarget.equals("q")){
                loop1 = false;
                break;
            }
            System.out.println(englishTarget + "의 뜻 :" + map.get(englishTarget));

        }




    }
}
