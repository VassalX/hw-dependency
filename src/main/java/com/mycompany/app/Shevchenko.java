package com.mycompany.app;

public class Shevchenko implements Poem{
    private static String[] LINES = {
            "Садок вишневий коло хати,",
            "Хрущі над вишнями гудуть..."
    };

    public Shevchenko(){}

    public void recite() {
        for (int i=0;i<LINES.length; i++){
            System.out.println(LINES[i]);
        }
    }
}
