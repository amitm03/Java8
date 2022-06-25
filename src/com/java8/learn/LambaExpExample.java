package com.java8.learn;

public class LambaExpExample {
    public static void main(String[] args) {
        LambaExpExample tester = new LambaExpExample();

        MathOperation addition =(int a,int b)->a+b;

        MathOperation subtraction = (a,b)->a-b;

        MathOperation multiplication =(int a,int b)->{
            return a*b;
        };

        MathOperation division =(int a,int b)->a/b;

        System.out.println(tester.operate(10,5,addition));
        System.out.println(tester.operate(10,5,subtraction));
        System.out.println(tester.operate(10,5,multiplication));
        System.out.println(tester.operate(10,5,division));

        GreetingsService greetingsService1  = messsage-> System.out.println("Hello "+messsage);

        GreetingsService greetingsService2 = (message)-> System.out.println("Hello "+message);

        greetingsService1.sayMessage("Mahesh");
        greetingsService2.sayMessage("Suresh");

        final  String salution = "Hello !";

        GreetingsService greetingsService3 = message -> System.out.println(salution+message);
        greetingsService3.sayMessage("test");
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a,b);
    }
}
