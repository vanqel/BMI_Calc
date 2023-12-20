package com.example.java_task05;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Director {
    BuilderIndicator builder = new BuilderIndicator();
    public Indicator Constr(Color color, double centerX){
        builder.lineBounds(300, 15, color);
        builder.lineCircle(11, centerX);
        return builder.Build();
    }
}
