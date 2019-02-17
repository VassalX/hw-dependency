package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PoeticClown extends Clown {
    private Poem poem;

    @Autowired
    public PoeticClown(Poem poem) {
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
