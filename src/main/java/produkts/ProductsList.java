package produkts;

import java.util.ArrayList;
import java.util.List;

public  class ProductsList {
    public List<ProduktConstruktor> shopList = new ArrayList<>();
   public ArrayList addToList() {

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

    public List<ProduktConstruktor> getShopList() {
        return shopList;
    }

public ProduktConstruktor giveProductFromShopList( int index){
       return shopList.get(index);

}

    public static void printShopList(List<ProduktConstruktor> shopList){
        System.out.println("W sklepie są dostępne:");
       for(ProduktConstruktor n: shopList){
           System.out.println(n);
       }
    }

}
