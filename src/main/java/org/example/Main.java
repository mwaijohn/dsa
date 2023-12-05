package org.example;

public class Main {
    public static void main(String[] args) {
        myLambda myLambda =  () -> System.out.println("Hello World1");
        myLambda myLambda1 = new myLambda() {
            @Override
            public void foo() {
                System.out.println("Hello World2");
            }
        };
        myLambda1.foo();
        myLambda.foo();

        Thread thread = new Thread(() -> System.out.println("Thread running"));
        thread.run();

        // declare a reference to GenericInterface
        // the GenericInterface operates on String data
        // assign a lambda expression to it
        GenericInterface<String> reverse = (str) -> {

            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
                result += str.charAt(i);
            return result;
        };

        System.out.println("Lambda reversed = " + reverse.func("Lambda"));

        // declare another reference to GenericInterface
        // the GenericInterface operates on Integer data
        // assign a lambda expression to it
        GenericInterface<Integer> factorial = (n) -> {

            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };

        System.out.println("factorial of 5 = " + factorial.func(5));
    }
}

@FunctionalInterface
interface myLambda{
    void foo();
}

// GenericInterface.java
@FunctionalInterface
interface GenericInterface<T> {

    // generic method
    T func(T t);
}