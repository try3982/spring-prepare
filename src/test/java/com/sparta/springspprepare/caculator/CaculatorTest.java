package com.sparta.springspprepare.caculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaculatorTest {

    @Test
    @DisplayName("더하기 테스트")
    void addTest() {
        Caculator caculator = new Caculator();
        Double result = caculator.operate(8, "+", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("나누기 테스트")
    void divideTest() {
        Caculator caculator = new Caculator();
        Double result = caculator.operate(8, "/", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(4, result);
    }

}