package com.github.zipcodewilmington.mylinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPairTest {

    @Test
    void getKey() {
        //Given
        String expected = "benji";
        MyPair string = new MyPair("no", 3);

        //When
       string.setKey(expected);
        String actual = string.getKey();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void setKey() {
        //Given
        Integer expected = 3;
        MyPair pair = new MyPair("no", 3);

        //When
        pair.setValue(expected);
        Integer actual = pair.getValue();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void getValue() {
    }

    @Test
    void setValue() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }
}