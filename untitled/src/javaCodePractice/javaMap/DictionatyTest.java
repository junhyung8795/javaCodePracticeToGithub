package javaCodePractice.javaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionatyTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        System.out.println("단어 입력 단계");

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("영어 단어를 입력하세요 (종료는 'q'를 누르세요))");
            String englishWord = sc.nextLine();
            if(englishWord.equals("q")){
                break;
            }

            System.out.println("한글 뜻을 입력하세요");
            String koreanWord = sc.nextLine();

            map.put(englishWord, koreanWord);
        }

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("찾을 영어 단어를 검색하세요 (종료는 'q'를 누르세요))");
            String englishTarget = sc.nextLine();
            if (englishTarget.equals("q")){
                break;
            }
            if (!map.containsKey(englishTarget)){
                System.out.println(englishTarget + "은 등록되지 않은 단어입니다!");
            } else {
                System.out.println(englishTarget + "의 뜻 :" + map.get(englishTarget));
            }

        }




    }
}
