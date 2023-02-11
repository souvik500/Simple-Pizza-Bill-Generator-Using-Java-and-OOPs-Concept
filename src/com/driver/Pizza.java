package com.driver;

public class Pizza {

    private int price;
    private int topping;
    private Boolean isVeg;
    private String bill;

    private int basePizzaPrice;

    private int addExtraCheesePrice;
    private int addPaperBagPrice = 20;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraTopingsAdded = false;
    private boolean isPaperBagAdded = false;
    private boolean isBillGenerated = false;

    /*==================Constructor==========================*/
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (this.isVeg) {
            this.price = 300;
            this.topping = 70;
        }
        else {
            this.price = 400;
            this.topping = 120;
        }
        this.addExtraCheesePrice = 80;

        basePizzaPrice = this.price;
        //this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }
    /*==================Constructor End==========================*/

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded) {
            isExtraCheeseAdded = true;
            this.price += addExtraCheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!isExtraTopingsAdded) {
            isExtraTopingsAdded = true;
            this.price += this.topping;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!isPaperBagAdded) {
            isPaperBagAdded = true;
            this.price += addPaperBagPrice;
        }
    }

    public String getBill(){
        // your code goes here
        String bill = "";
        if(!isBillGenerated) {

            this.bill = "Base Price Of The Pizza: " + basePizzaPrice + "\n";

            if (isExtraCheeseAdded) this.bill += "Extra Cheese Added: " + addExtraCheesePrice + "\n";

            if (isExtraTopingsAdded) this.bill += "Extra Toppings Added: " + this.topping + "\n";

            if (isPaperBagAdded) this.bill += "Paperbag Added: " + addPaperBagPrice + "\n";

            this.bill += "Total Price: " + this.price + "\n";

            isBillGenerated = true;
        }

        return this.bill;
    }
}
