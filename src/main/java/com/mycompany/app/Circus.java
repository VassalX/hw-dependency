package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Circus {
    private List<Performer> performers;
    @Autowired
    public Circus(List<Performer> performers){
        this.performers = performers;
    }
    void performAll(){
        for(Performer performer:performers){
            performer.perform();
            System.out.println();
        }
    }
}
