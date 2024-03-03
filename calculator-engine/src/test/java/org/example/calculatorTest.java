package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @AfterEach
    void tearDown() {
    }

    @Test
    void add_twoDoubles_returnsSum() {
        //preq-UNIT-TEST-2
        var cal = new calculator();
        //Arrange
        final double A = 2.5;
        final double B = 3.77;
        final double EXPECTED = 6.27 ;

        //Act
        var result = cal.Add(A,B);

        //Assert
        assertEquals(EXPECTED, result,8);


    }

    @Test
    void subtract_twoDoubles_returnsDifference() {
        //preq-UNIT-TEST-3
        var cal = new calculator();
        //Arrange
        final double A = 27.94;
        final double B = 4;
        final double EXPECTED = 23.94;

        //Act
        var result = cal.subtract(A,B);

        //Assert
        assertEquals(EXPECTED, result,8);

    }

    @Test
    void multiplication_twoDoubles_returnsMultiplicationSum() {
        //preq-UNIT-TEST-4
        var cal = new calculator();
        //Arrange
        final double A = 5;
        final double B = 7.1;
        final double EXPECTED = 35.5;

        //Act
        var result = cal.multiplication(A,B);

        //Assert
        assertEquals(EXPECTED, result);
    }

    @Test
    void divison_twoDoubles_returnsDivisonSum() {
        //preq-UNIT-TEST-5
        var cal = new calculator();
        //Arrange
        final double A = 5.0;
        final double B = 0.0;
        final double EXPECTED;

        //Act
        var result = cal.divison(A,B);

        //Assert
        assertEquals(EXPECTED, result);
    }

    @Test
    void divison_twoDoubles_returnsError(){
        //preq-UNIT-TEST-6
    }


    @Test
    void testEquals() {
        //preq-UNIT-TEST-7
        var cal = new calculator();
        //Arrange
        final double A= 0.33333;
        final double B = 0.33333;
        final double EXPECTED = 1;

        //Act
        var result = cal.equals(A,B);

        //Assert
        assertEquals(EXPECTED, result);
    }

    @Test
    void raiseToPower() {
        //preq-UNIT-TEST-8
        var cal = new calculator();
        //Arrange
        final double A = 5;
        final double B = 7;
        final double EXPECTED = 78125;

        //Act
        var result = cal.raiseToPower(A,B);

        //Assert
        assertEquals(EXPECTED, result);

    }

    @Test
    void logarithmOfNumber_twoDouble_returnsLog() {
        //preq-UNIT-TEST-9
        var cal = new calculator();
        //Arrange
        final double A = 56;
        final double B = 8;
        final double EXPECTED = 1.93578497;

        //Act
        var result = cal.logarithmOfNumber(A,B);

        //Assert
        assertEquals(EXPECTED, result,8);
    }

    @Test
    void logarithmOfNumber_twoDouble_returnsError(){
        //preq-UNIT-TEST-10
    }

    @Test
    void logarithmOfNumber_twoDouble_returnsError2(){
        //preq-UNIT-TEST-11
    }

    @Test
    void rootOfPower_twoDoubles_returnsRootOfPower() {
        //preq-UNIT-TEST-12
    }

    @Test
    void rootOfPower_twoDoubles_returnsError(){
        //preq-UNIT-TEST-13
    }

    @Test
    void factorialOfNumber_oneDouble_returnsFactorial() {
        //preq-UNIT-TEST-15
    }

    @Test
    void sineA() {
        //preq-UNIT-TEST-16
        var cal = new calculator();
        //Arrange
        final double A = 1;
        final double EXPECTED = 0.0174524;

        //Act
        var result = cal.sineA(A);

        //Assert
        assertEquals(EXPECTED,result,8);
    }

    @Test
    void cosineA() {
        //preq-UNIT-TEST-17
        var cal = new calculator();
        //Arrange
        final double A = -360;
        final double EXPECTED = 1;

        //Act
        var result = cal.cosineA(A);

        //Assert
        assertEquals(EXPECTED, result,8);
    }

    @Test
    void tangentA() {
        //preq-UNIT-TEST-18
        var cal = new calculator();
        //Arrange
        final double A = 1;
        final double EXPECTED = 0.0174551;

        //Act
        var result = cal.tangentA(A);

        //Assert
        assertEquals(EXPECTED, result,8);
    }

    @Test
    void reciprocalOfA() {
        //preq-UNIT-TEST-19
    }

    @Test
    void reciprocalOfA_oneDouble_returnsError(){}
    //preq-UNIT-TEST-19
}