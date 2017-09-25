package com.common;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Month january = Month.JANUARY;
        Month february = Month.FEBRUARY;
        Month march = Month.MARCH;
        Month april = Month.APRIL;
        Month may = Month.MAY;
        Month june = Month.JUNE;
        Month july = Month.JULY;
        Month august = Month.AUGUST;
        Month september = Month.SEPTEMBER;
        Month october = Month.OCTOBER;
        Month november = Month.NOVEMBER;
        Month december = Month.DECEMBER;

        Month[] months = {january,february,march,april,may,
        june,july,august,september,october,november,december};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one of the months of the year: ");

        String response = scanner.nextLine().toUpperCase();

        String engMonthResponse = Month.valueOf(response).getEnglishName();
        System.out.println("You Chose : " + engMonthResponse + ".");

        Month responseMonth = Month.valueOf(response);
        responseMonth.remainingMonths(months, Month.valueOf(response).ordinal());

    }

}
