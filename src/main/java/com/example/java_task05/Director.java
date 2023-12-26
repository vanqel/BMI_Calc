package com.example.java_task05;
import javafx.scene.paint.Color;

public class Director {
    BuilderIndicator builder = new BuilderIndicator();
    public Indicator Constr(double centerX){

        builder.Bounds1(15);
        builder.Bounds2(15);
        builder.Bounds3(15);
        builder.Bounds4(15);
        builder.Bounds5(15);
        builder.Bounds6(15);
        builder.lineCircle(11, centerX);
        return builder.Build();
    }

}
