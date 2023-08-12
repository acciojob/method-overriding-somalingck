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
        String resultFromA = b.meth(); // Calling meth() method of class A with object of class B
        System.out.println("Result from method of class A: " + resultFromA);

        // Task 4
        B b1 = new B();
        String resultFromB = b1.meth(); // Calling overridden meth() method from object of class B
        System.out.println("Result from overridden method of class B: " + resultFromB);
    }
}
