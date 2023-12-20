package com.example.prototype.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Square extends Shape implements Cloneable{
    public Square(Color color, double size) {
        super(color, size);
    }
    @Override
    public void draw(GraphicsContext gc,MouseEvent mouseEvent) {
        double rebro = 20*size;
        gc.setLineWidth(2.0);
        gc.setFill(color);
        gc.setStroke(color);
        gc.fillRect(mouseEvent.getX()-rebro/2, mouseEvent.getY()-rebro/2, rebro, rebro);
    }
    @Override
    public String toString() {
        return "Квадрат";
    }

    @Override
    public Square clone() {
        return (Square) super.clone();
    }


}
