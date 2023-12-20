package com.example.java_task05;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class BuilderIndicator implements Builder{
    Indicator indicator = new Indicator();
    Pane pane = new Pane();


    @Override
    public void lineBounds(int width, int height, Color color) {
        Rectangle rect = new Rectangle();
        rect.setWidth(width);
        rect.setHeight(height);
        rect.setFill(color);
        rect.setStroke(Color.BLACK);
        pane.getChildren().add(rect);
    }

    @Override
    public void lineCircle(int radix, double CenterX) {
        Circle circ = new Circle();
        circ.setRadius(radix);
        circ.setCenterX(CenterX);
        circ.setCenterY((double)radix / 2);
        pane.getChildren().add(circ);
    }

    @Override
    public Indicator Build() {
        indicator.add(pane);
        return indicator;
    }


}
