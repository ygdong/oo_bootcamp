package oo;


public class Euro {

    private final int value;

    public Euro(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Euro euro = (Euro) o;
        return value == euro.value;
    }

    @Override
    public String toString() {
        return "Euro value = "+value;
    }

    public Euro add(Euro euro1) {
        return new Euro(value+euro1.value);
    }

    public int getValue() {
        return value;
    }
}
