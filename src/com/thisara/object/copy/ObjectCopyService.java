package com.thisara.object.copy;

import java.util.ArrayList;
import java.util.List;

public class ObjectCopyService {

    public ShoppingCart shallowCopy(ShoppingCart shoppingCart, String cartName) {

        ShoppingCart shallowCopy = new ShoppingCart(cartName, shoppingCart.getItems());
        
        return shallowCopy;
    }

    public ShoppingCart deepCopy(ShoppingCart shoppingCart, String cartName) {

        ShoppingCart deepCopy = new ShoppingCart(cartName, shoppingCart.getItems());

        ArrayList<String> itemList = new ArrayList<String>();

        shoppingCart.getItems()
            .stream()
            .forEach(t -> itemList.add(t));

        deepCopy.setItems(itemList);

        return deepCopy;
    }

    public ShoppingCart cloneCopy(ShoppingCart shoppingCart, String cartName) throws CloneNotSupportedException {

        ShoppingCart cloneCopy = (ShoppingCart) shoppingCart.clone();
        
        cloneCopy.setCartName(cartName);
        
        return cloneCopy;
    }
    
    @SuppressWarnings("unchecked")
    public ShoppingCart deepCloneCopy(ShoppingCart shoppingCart, String cartName) throws CloneNotSupportedException {

        ShoppingCart deepCloneCopy = (ShoppingCart) shoppingCart.clone();
        
        ArrayList<String> itemsList = (ArrayList<String>) shoppingCart.getItems();

        deepCloneCopy.setItems((ArrayList<String>)itemsList.clone());
        
        deepCloneCopy.setCartName(cartName);
        
        return deepCloneCopy;
    }
}
