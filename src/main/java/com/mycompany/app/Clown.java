package com.mycompany.app;

public class Clown implements Performer{
    private int jokes = 3;
    public void setJokes(int jokes){
        this.jokes = jokes;
    }
    public int getJokes(){
        return this.jokes;
    }
    public Clown(){}
    public Clown(int beanBags){
        this.jokes = beanBags;
    }
    public void perform() {
        System.out.println("Telling "+jokes + " jokes");
    }
}
