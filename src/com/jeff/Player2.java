package com.jeff;

public class Player2  extends Player1{

    private int health;
    private  boolean armour;
    public Player2(String name, String weapon, int health) {
        super(name, weapon, health);
        this.health=health;
        this.armour=armour;
    }

    @Override
    public void damageByGun1() {
      if (armour){
          this.health-=20;
          if (this.health<=0)
              this.health=0;
              System.out.println("Armour is on. Got git by gun 1. Health is reduced by 20."+
                      "new health"+ this.health);
           if (!armour){
              this.health-=30;
              this.health=0;
              System.out.println("Armour is off. Got git by gun 1. Health is reduced by 30."+
                      "new health"+ this.health);

          }
      }
    }
    @Override
    public  void  damageByGun2(){
        if (armour){
            this.health-=40;
            if (this.health<=0)
                this.health=0;
                System.out.println("Armour is on. Got git by gun 1. Health is reduced by 40."+
                        "new health"+ this.health);
             if (!armour){
                this.health-=50;
                this.health=0;
                System.out.println("Armour is off. Got git by gun 1. Health is reduced by 50."+
                        "new health"+ this.health);

            }
        }
    }
}
