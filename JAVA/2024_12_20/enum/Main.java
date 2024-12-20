package test;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // 1) .values()
        Day[] days = Day.values();
        System.out.println(Arrays.toString(days));

        // 2) .valueOf()
        Day tuesday = Day.valueOf("TUESDAY");
        System.out.println(tuesday);

        // 3) .name()
        Day friday = Day.FRIDAY;
        String fridayName = friday.name();
        System.out.println(fridayName);

        // 4) .ordinal
        int fridayOrdinal = friday.ordinal();
        System.out.println(fridayOrdinal);
    }
    }