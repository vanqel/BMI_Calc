package com.example.prototype.brushs;

import com.example.prototype.shapes.Circle;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Sweet extends Brush implements Cloneable{
    public Sweet(Color color, double size) {
        super(color, size);
    }

    @Override
    public void draw(GraphicsContext gc, MouseEvent mouseEvent) {
        gc.setFill(color);
        gc.fillOval(mouseEvent.getX() - Math.random()*5 - 10/2*size, mouseEvent.getY()-Math.random()*5- 10/2*size, 10*size, 10*size);
    }
    @Override
    public String toString() {
        return "Кисть";
    }

    @Override
    public Sweet clone() {
        return (Sweet) super.clone();
    }

}
