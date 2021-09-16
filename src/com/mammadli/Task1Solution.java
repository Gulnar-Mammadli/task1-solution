package com.mammadli;

import java.util.Arrays;

public  class  Task1Solution {


    static int carParkingRoof(int[] cars, int k) {


        Arrays.sort(cars);
        int parkStart = 0, parkEnd = k - 1, minLength = Integer.MAX_VALUE;
        for (; parkEnd < cars.length; parkStart++, parkEnd++) {

            minLength = Math.min(minLength, cars[parkEnd] - cars[parkStart] + 1);

        }
        return minLength;

    }
    public  static void main(String[] args){
        int[] cars={6,2,12,7};
        int k=3;
        System.out.println(carParkingRoof(cars,k));
    }

}
