package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean ischeese = false;
    private boolean istoppings = false;
    private boolean ispaperbag = false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
            this.price = 300;
        else
            this.price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(this.ischeese == false){
            this.ischeese = true;
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (isVeg && this.istoppings == false){
            this.istoppings = true;
            this.price += 70;}
        else if (!isVeg && this.istoppings ==false){
            this.istoppings = true;
            this.price += 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (this.ispaperbag == false){
            this.ispaperbag = true;
            this.price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill =("Base Price Of The Pizza: "+(isVeg?300:400)+"\nExtra Cheese Added: 80\nExtra Toppings Added: "+(isVeg?70:120)+(ispaperbag?"\nPaperbag Added: 20":"")+"\nTotal Price: "+this.price+"\n");
        return this.bill;

    }
}
