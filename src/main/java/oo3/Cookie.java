package oo3;

public class Cookie implements GoodOrBadAble<Cookie>{



    private  int chocolate;

    public Cookie(int numberOfChocolate) {
        this.chocolate = numberOfChocolate;
    }




    public int getChocolate() {
        return chocolate;
    }


    public boolean isBetterThan(Cookie another) {

        Cookie another1 = (Cookie) another;
        return this.chocolate>another1.chocolate;
    }

    public void setChocolatorNumber(int i) {
        this.chocolate=i;
    }
}
