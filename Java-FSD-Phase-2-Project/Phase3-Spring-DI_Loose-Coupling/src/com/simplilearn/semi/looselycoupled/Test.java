package com.simplilearn.semi.looselycoupled;

public class Test {
    public static void main(String[] args) {

        FoodApplication app = new FoodApplication(new FoodService());
        app.orderFood("We Serve Burger !", "John Smith");
    }
}
