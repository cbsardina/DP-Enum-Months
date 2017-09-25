package com.common;

public enum Month {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private String englishName;

    Month(String englishName) {
        this.englishName = englishName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void remainingMonths(Month[] month, int moPos) {
        System.out.println("The remaining months in the year are: ");
        for(int i = moPos+1; i < 12; i++) {
            System.out.println(month[i].getEnglishName());
        }
    }
}
