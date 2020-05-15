package com.pm.shopjava;

import basket.BasketShop;
import produkts.ProductsList;

public class ShopMain {
    public static void main(String[] args) {
       ProductsList prl= new ProductsList();
        BasketShop basket= new BasketShop();
        prl.printShopList(prl.addToList());
        System.out.println(prl.shopList.size());
        System.out.println(prl.giveProductFromShopList(2));
        System.out.println(basket.basketListSize());
        basket.createBasketList();
        //System.out.println(basket.basketListSize());
    }
}
