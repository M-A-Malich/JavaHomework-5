package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcRestServiceTest {
    @ParameterizedTest
   // @CsvSource({
    //        "10000,3000,20000",
    //       "100000,60000,150000"
   // })
    @CsvFileSource(files="src/test/resources/rest.csv")
    public void  testWithCsv(int income, int expenses, int threshold, int expected) {
        CalcRestService service = new CalcRestService();
        int actual = service.calculate(income, expenses, threshold);
       // int expended = 3;

       Assertions.assertEquals(expected, actual);
    }

    // @Test
    // public void  restServiceTest2() {
    //   CalcRestService service = new CalcRestService();
    //   int actual = service.calculate(100_000, 60_000, 150_000);
    //   int expended = 2;

    //   Assertions.assertEquals(expended, actual);

    //}


}