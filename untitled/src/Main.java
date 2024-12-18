import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] numbers = new int[2];
        for(int i = 0; i< numbers.length ; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int hour = numbers[0];
        int minute = numbers[1];
        if (minute >= 45 ){
            minute = minute - 45;
        }
        else{
            int reduction = 45 - minute;
            minute = 60 - reduction;
            if(hour == 0){
                hour = 23;
            }
            else{
                hour -= 1;
            }
        }
        String hourAnswer = String.valueOf(hour);
        String minuteAnswer = String.valueOf(minute);
        String answer = hourAnswer + " " + minuteAnswer;
        bw.write(answer);
        br.close();
        bw.close();
    }
}