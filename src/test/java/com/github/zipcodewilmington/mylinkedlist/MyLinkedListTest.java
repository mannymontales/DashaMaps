package com.github.zipcodewilmington.mylinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void getHead() {
    }

    @Test
    void add() {
        //Given
        MyLinkedList listy = new MyLinkedList("Manny");
        String expectedKey = "brent";
        Integer expectedValue = 6;
        MyNode expected = new MyNode(expectedKey, expectedValue);

        //When
        listy.add(expectedKey, expectedValue);
        MyNode actual = listy.getHead().getNext();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void remove() {
    }

    @Test
    void size() {
        //Given
        MyLinkedList listy = new MyLinkedList("Manny");
        listy.add("shi boi", 1);
        listy.add("shi boi2", 2);
        Integer expected = 3;

        //When
        Integer actual = listy.size();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void find() {
    }
}