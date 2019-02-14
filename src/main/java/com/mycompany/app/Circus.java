package com.mycompany.app;

import java.util.List;

public class Circus {
    private List<Performer> performers;
    public Circus(List<Performer> performers){
        this.performers = performers;
    }
    public void performAll(){
        for(Performer performer:performers){
            performer.perform();
            System.out.println();
        }
    }
}
