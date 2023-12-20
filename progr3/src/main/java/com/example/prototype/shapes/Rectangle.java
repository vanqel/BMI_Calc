package com.example.prototype.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Rectangle extends Shape implements Cloneable{
    public Rectangle(Color color, double size) {
        super(color, size);
    }
    @Override
    public void draw(GraphicsContext gc, MouseEvent mouseEvent) {
        gc.setLineWidth(2.0);
        gc.setFill(color);
        gc.setStroke(color);
        double wight = 20;
        gc.fillRect((mouseEvent.getX() - wight/2*size), mouseEvent.getY()- wight*size, wight*size, wight*2*size);
    }
    @Override
    public String toString() {
        return "Прямоугольник";
    }

    @Override
    public Rectangle clone() {
        return (Rectangle) super.clone();
    }


}