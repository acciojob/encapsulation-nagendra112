package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
        rwOnly.getName();
        rwOnly.setName("nagendra");
    }
}