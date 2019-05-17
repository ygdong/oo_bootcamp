package lambda;

import oo3.Cookie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("")).start();


        ArrayList<Cookie> cookieList = new ArrayList<>();
        cookieList.add(new Cookie(5));
        cookieList.add(new Cookie(8));
        cookieList.add(new Cookie(3));

        cookieList.stream().map(x-> {x.setChocolatorNumber(x.getChocolate()*2);return x;}).collect(Collectors.toList());

        Optional<Cookie> optionalCookie = cookieList.stream().min((x, y) -> x.getChocolate() - y.getChocolate());
        optionalCookie.ifPresent(x-> System.out.println(x.getChocolate()));

//        排序
        cookieList.sort(new Comparator<Cookie>() {
            @Override
            public int compare(Cookie o1, Cookie o2) {
                return o1.getChocolate()-o2.getChocolate();
            }
        });

        cookieList.sort((x,y)-> x.getChocolate()-y.getChocolate());


//        遍历
        cookieList.forEach(x -> System.out.println(x.getChocolate()));


        HashMap<String, String> map = new HashMap<>();
//        map.put("huawei","100");

        map.forEach((k,v)-> System.out.println(k+":"+v));

        map.computeIfAbsent("huawei", k ->  "Mate10");

        Exercise exercise = new Exercise();
        exercise.checkCookieChocklate(()->new Cookie(2));


        exercise.translate(e -> "这是桌子");

        exercise.translate(new Function<String, String>() {
            @Override
            public String apply(String e) {
                return "这是桌子";
            }
        });




    }


    public void checkCookieChocklate(Supplier<Cookie> supplier){
        supplier.get().getChocolate();
    }

    String msg="this is table";
    public void translate(Function<String,String> function){
        String chinese = function.apply(msg);
        System.out.println(chinese);
    }
}
