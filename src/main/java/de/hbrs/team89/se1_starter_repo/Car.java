package de.hbrs.team89.se1_starter_repo;

import java.util.Arrays;
import java.util.Scanner;

// ToDo replace 0 by correct values read from this.params
public class Car implements CarIF {
    String[] params;
    public Car( String[] params ){
        this.params = params;
    }

    @Override
    public int nr() {
        return 0;
    }

    @Override
    public long begin() {
        return 0;
    }

    @Override
    public long end() {
        return 0;
    }

    @Override
    public int duration() {
        return 0;
    }

    @Override
    public int price() {
        //Vorläufige Implementation. Sollte eigentlich im Servlet sein.
        double price = 0.0d;
        if ( params.length > 4 ){
            String priceString = params[3];
            if ( ! "_".equals( priceString ) ){
                price = (double)new Scanner( priceString ).useDelimiter("\\D+").nextInt();
            }
        }
        int priceInt = (int) price;
        return priceInt;
    }

    @Override
    public String toString(){
        return Arrays.toString( params );
    }
}
