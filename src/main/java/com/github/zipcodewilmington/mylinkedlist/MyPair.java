package com.github.zipcodewilmington.mylinkedlist;

import java.util.Objects;

public class MyPair {

    private String key;
    private Integer value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public MyPair(String key, Integer value){
        this.key = key;
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    //object themselves are stored in different places in java memory
    //equality between objects
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPair myPair = (MyPair) o;
        return Objects.equals(key, myPair.key) && Objects.equals(value, myPair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
