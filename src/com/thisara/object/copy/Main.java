package com.thisara.object.copy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        ObjectCopyService objectCopyService = new ObjectCopyService();
        
        /* Initialize ShoppingCart */
        ShoppingCart sourceShoppingCart = new ShoppingCart("MyCart", new ArrayList<String>(List.of("Bread")));

        print(String.format("Source Shopping Cart : %s", sourceShoppingCart));

        /* Shallow Copy of ShoppingCart */
        print("Shallow Copy Of Shopping Cart:...");

        sourceShoppingCart = new ShoppingCart("MyCart", new ArrayList<String>(List.of("Bread")));
        ShoppingCart shallowCopy = objectCopyService.shallowCopy(sourceShoppingCart, "ShallowCopy");
        shallowCopy.getItems().add("Butter");
        
        print(String.format("Source Shopping Cart : %s", sourceShoppingCart));
        print(String.format("Shallow Copy of Shopping Cart : %s", shallowCopy));
        
        /* Deep Copy of ShoppingCart */
        System.out.println("Deep Copy Of Shopping Cart:...");

        sourceShoppingCart = new ShoppingCart("MyCart", new ArrayList<String>(List.of("Bread")));
        ShoppingCart deepCopy = objectCopyService.deepCopy(sourceShoppingCart, "DeepCopy");
        deepCopy.getItems().add("Butter");
        
        print(String.format("Source Shopping Cart : %s", sourceShoppingCart));
        print(String.format("Deep Copy of Shopping Cart : %s", deepCopy));

        /* Clone ShoppingCart */
        print("Copy Of Shopping Cart By Cloning:...");

        sourceShoppingCart = new ShoppingCart("MyCart", new ArrayList<String>(List.of("Bread")));
        ShoppingCart cloneCopy = objectCopyService.cloneCopy(sourceShoppingCart, "CloneCopy");
        cloneCopy.getItems().add("Butter");

        print(String.format("Source Shopping Cart : %s", sourceShoppingCart));
        print(String.format("Clone of Shopping Cart : %s", cloneCopy));

        /* Deep Clone ShoppingCart */
        print("Deep Clone Copy Of Shopping Cart By Cloning:...");

        sourceShoppingCart = new ShoppingCart("MyCart", new ArrayList<String>(List.of("Bread")));
        ShoppingCart deepClone = objectCopyService.deepCloneCopy(sourceShoppingCart, "DeepCloneCopy");
        deepClone.getItems().add("Butter");

        print(String.format("Source Shopping Cart : %s", sourceShoppingCart));
        print(String.format("Deep Copy By Cloning : %s", deepClone));
        
    }

    private static void print(String printText) {
        System.out.println(printText);
    }
}
