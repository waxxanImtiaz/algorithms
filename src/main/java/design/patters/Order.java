package design.patters;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Order {
    private String burger;
    private String drink;
    private String sauce;

    public Order(){

    }


    public Order(Builder builder){
        this.burger = builder.burger;
        this.drink = builder.drink;
        this.sauce = builder.sauce;
    }
    public static class Builder{
        private String burger;
        private String drink;
        private String sauce;


        public Order build(){
            return new Order(this);
        }
        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        public Builder burger(String burger) {
            this.burger = burger;
            return this;
        }
        public Builder drink(String drink) {
            this.drink = drink;
            return this;
        }
    }
    public String getBurger() {
        return burger;
    }



    public String getDrink() {
        return drink;
    }



    public String getSauce() {
        return sauce;
    }



}
