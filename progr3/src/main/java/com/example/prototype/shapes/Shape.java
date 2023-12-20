package com.example.prototype.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public abstract class Shape {
    protected Color color;
    protected double size;

    public Shape(Color color, double size) {
        this.color = color;
        this.size = size;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setSize(double size){
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
}