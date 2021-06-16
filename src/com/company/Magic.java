package com.company;

public class Magic extends HeroesHealth implements AllHeroes{
    @Override
    public void superAttack() {
        System.out.println("Магическая супер атака самая сильная");
    }
    public void health(){
        healthMagic = 169;
    }
    }

