package com.example.prototype.brushs;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public abstract class Brush {
    protected Color color;
    protected double size;
    public Brush(Color color, double size) {
        this.color = color;
        this.size = size;
    }
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
    public abstract void draw(GraphicsContext gc, MouseEvent mouseEvent);
    @Override
    public String toString() {
        return null;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void setSize(double size){
        this.size = size;
    }
}
