package com.simplilearn.looselycoupled;

public class PizzaService implements FoodService{

    String food = "Pizza";
    @Override
    public void serveFood( String message, String customer) {
        System.out.println("Hello '" +customer +"' your have selected '" + food + "' we are " + message);
    }
}
