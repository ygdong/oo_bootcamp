package oo;

public class Printer {


    public void print(ShapeAble able){
        String msg = able.getName()+": area=" + able.getArea() + " perimeter=" + able.getPerimeter();
        System.out.println(msg);
    }
}
