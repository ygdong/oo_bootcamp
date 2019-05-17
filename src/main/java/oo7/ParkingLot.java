package oo7;

import java.util.Arrays;

public class ParkingLot {
    private  Car[] carPositions;


    public ParkingLot(int capacity) {
        carPositions = new Car[capacity];
    }

    public void in(Car car){
        for (int i=0;i<carPositions.length;i++){
            if (carPositions[i]==null)
                carPositions[i]=car;
        }
    }

    public Car out(String carNumber){
        Car car=null;
        for (int i=0;i<carPositions.length;i++){
            if (carPositions[i].getNumber().equals(carNumber)){
                car = carPositions[i];
                carPositions[i]=null;
                break;
            }
        }
        return car;
    }

    public int getAvailable(){
        return (int)Arrays.stream(carPositions).filter(car -> car==null).count();
    }

    public float getAvailablePercentage(){
        return getAvailable()/carPositions.length;
    }
}
