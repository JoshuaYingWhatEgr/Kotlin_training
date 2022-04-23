package com.joshuayingwhat.kotlin;

public class Main {

    public static void main(String[] args) {

        String name = null;

        String a = name;

        B b = new B();

//        b.loading();
    }
}

class A {

    private void loading() {

        System.out.println("loading...");
    }
}

class B extends A {

}