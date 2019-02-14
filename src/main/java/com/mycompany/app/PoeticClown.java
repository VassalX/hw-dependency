package com.mycompany.app;

public class PoeticClown extends Clown {
    private Poem poem;
    public PoeticClown(Poem poem){
        super();
        this.poem = poem;
    }
    public PoeticClown(int jokes, Poem poem){
        super(jokes);
        this.poem = poem;
    }
    public void perform(){
        super.perform();
        System.out.println("While reciting ...");
        poem.recite();
    }
}
