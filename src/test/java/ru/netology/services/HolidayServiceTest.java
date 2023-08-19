package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class HolidayServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/count.csv")
    public void shouldCalcCount(int income, int expenses, int threshold, int expected) {
        HolidayService service = new HolidayService();

        // int income = 10000;
        // int expenses = 3000;
        // int threshold = 20000;
        // int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    //@Test
    //public void shouldCalcCount2() {
    //    HolidayService service = new HolidayService();

    //   int income = 100000;
    //    int expenses = 60000;
    //    int threshold = 150000;
    //    int expected = 2;
    //    int actual = service.calculate(income, expenses, threshold);

    //    Assertions.assertEquals(expected, actual);
}

