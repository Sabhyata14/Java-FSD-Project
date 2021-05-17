package com.simplilearn.looselycoupled;

public class NoodlesService implements FoodService{

    String food = "Noodles";
    @Override
    public void serveFood( String message, String customer) {
        System.out.println("Hello '" +customer +"' your have selected '" + food + "' we are " + message);
    }
}
