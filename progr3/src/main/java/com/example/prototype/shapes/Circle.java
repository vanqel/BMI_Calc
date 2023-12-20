package com.example.prototype.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Circle extends Shape implements Cloneable {
    public Circle(Color color, double size) {
        super(color, size);
    }
    @Override
    public void draw(GraphicsContext gc, MouseEvent mouseEvent) {
        gc.setFill(color);
        gc.fillOval(mouseEvent.getX() - 10/2*size, mouseEvent.getY()- 10/2*size, 10*size, 10*size);
    }
    @Override
    public String toString() {
        return "Круг";
    }

    @Override
    public Circle clone() {
        return (Circle) super.clone();
    }
}