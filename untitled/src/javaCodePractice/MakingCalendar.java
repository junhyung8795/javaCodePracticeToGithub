package javaCodePractice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class MakingCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("년도를 입력해주세요: ");
        int year = sc.nextInt();
        sc.nextLine();
        int month = sc.nextInt();

        printCalendar(year, month);
        MenuRecommend.setPoint();
        System.out.println("MenuRecommend.getPoint() = " + MenuRecommend.getPoint());
    }

    private static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("Su Mo Tu We Th Fr Sa");
        int OffsetDay = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        for (int i = 0; i < OffsetDay; i++) {
            System.out.print("   ");
        }
        while (firstDayOfMonth.isBefore(firstDayOfNextMonth)) {
            System.out.printf( "%2d" , firstDayOfMonth.getDayOfMonth());
            System.out.print(" ");
            firstDayOfMonth = firstDayOfMonth.plus(1, ChronoUnit.DAYS);
            if (firstDayOfMonth.getDayOfWeek().getValue() % 7 == 0 ){
                System.out.println();
            }

        }
    }
}
