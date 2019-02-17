package com.mycompany.app;

import org.springframework.stereotype.Component;

@Component
public class Shevchenko implements Poem{
    private static String[] LINES = {
            "Садок вишневий коло хати,",
            "Хрущі над вишнями гудуть..."
    };

    public Shevchenko(){}

    public void recite() {
        for (String line : LINES) {
            System.out.println(line);
        }
    }
}
