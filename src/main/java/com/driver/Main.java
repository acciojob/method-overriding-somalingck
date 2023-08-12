package com.driver;

public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        // Task 3
        B b = new B();
        String result1 = b.meth(); // Store the result of method call

        // Task 4
        A a = new B(); // Polymorphism: Reference of type A, object of type B
        String result2 = a.meth(); // Store the result of method call

        // Output the results (optional)
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
