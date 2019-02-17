package com.mycompany.app;

import org.springframework.stereotype.Component;

@Component
public class Clown implements Performer{
    private int jokes = 3;
    public Clown(){}
    public Clown(int beanBags){
        this.jokes = beanBags;
    }
    public void perform() {
        System.out.println("Telling "+jokes + " jokes");
    }
}
