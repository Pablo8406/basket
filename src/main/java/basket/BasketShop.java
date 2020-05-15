package basket;

import produkts.ProductsList;
import produkts.ProduktConstruktor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasketShop {
ProductsList prl = new ProductsList();
    public List<ProduktConstruktor> shopList = new ArrayList<>();

Random random = new Random();
    public List<ProduktConstruktor> basketList = new ArrayList<>();

    public ArrayList createBasketList(){
        //for(int i=0; i<5; i++){

       // }
shopList.size();
         basketList.add(prl.giveProductFromShopList(2));
        return (ArrayList) basketList;
    }

    public int basketListSize(){
        return  basketList.size();
    }
}
