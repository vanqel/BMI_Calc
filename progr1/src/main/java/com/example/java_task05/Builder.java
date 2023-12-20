package com.example.java_task05;

import javafx.scene.paint.Color;

public interface Builder {

    void lineBounds(int width, int height, Color color);
    void lineCircle(int radix, double CenterX);
    Indicator Build();

}
