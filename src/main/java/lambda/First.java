package lambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class First {

    public void use(Action action) {
        action.doSomething();
    }

    public double ca(Calculator caculator) {
        double result = caculator.calculate(10, 2);
        return result;
    }

    public void doSome(Consumer<String> consumer){
        String msg = "PI 的值等于"+Math.PI;
        consumer.accept(msg);
    }

    public void action(Runnable runnable){
        runnable.run();
    }

    public void output(Function<String,String> function){
        String apply = function.apply("this is some message");
        System.out.println(apply);
    }


    public static void main(String[] args) {
        First first = new First();

        first.use(
                new Action() {
                    @Override
                    public void doSomething() {
                        System.out.println(" do some thing");
                    }
                }
        );


        first.use(
                () -> System.out.println(" do some thing")
        );


        first.ca(new Calculator() {
            @Override
            public double calculate(double a, double b) {
                return a+b;
            }
        });


        first.ca((x,y)->x+y);

        first.doSome(System.out::println);

        first.output(String::toUpperCase);


    }
}
