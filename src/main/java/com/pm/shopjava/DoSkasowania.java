package com.pm.shopjava;

import produkts.ProduktConstruktor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DoSkasowania {
    public static void main(String[] args) {
       addToList();

    }
    static ArrayList addToList() {
         List<ProduktConstruktor> shopList = new ArrayList<>();
        shopList.add(new ProduktConstruktor("majonez",5));
        shopList.add(new ProduktConstruktor("musztarda", 10));
        shopList.add(new ProduktConstruktor("Tyskie", 20));
        shopList.add(new ProduktConstruktor("kielbasa", 15));
        shopList.add(new ProduktConstruktor("parówki", 6));
        shopList.add(new ProduktConstruktor("papier toaletowy",8));
        shopList.add(new ProduktConstruktor("kabanos",13));
        shopList.add(new ProduktConstruktor("smalec",11));
        shopList.add(new ProduktConstruktor("ocet",2));
        shopList.add(new ProduktConstruktor("marmolada",3));

        return (ArrayList) shopList;

    }
    void wyciągniecie (){

    }
}
