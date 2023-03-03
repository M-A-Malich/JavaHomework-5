package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcRestServiceTest {
    @Test
    public void  restServiceTest() {
        CalcRestService service = new CalcRestService();
        int actual = service.calculate(10_000, 3_000, 20_000);
        int expended = 3;

       Assertions.assertEquals(expended, actual);
    }

    @Test
    public void  restServiceTest2() {
        CalcRestService service = new CalcRestService();
        int actual = service.calculate(100_000, 60_000, 150_000);
        int expended = 2;

        Assertions.assertEquals(expended, actual);

    }


}