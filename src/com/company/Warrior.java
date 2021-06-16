package com.company;

public class Warrior extends HeroesHealth implements AllHeroes{
    @Override
    public void superAttack() {
        System.out.println("Magic Superattack not the best");
    }
    public void health(){
        healthWarrior = 300;
    }
  }

