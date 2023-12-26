package com.example.java_task05;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class BuilderIndicator implements Builder{
    Indicator indicator = new Indicator();

  //  public Color getColor(double imt){
  //      Color color = new Color(1,1,1,1);
  //      if (imt < 18.5){color = Color.rgb(205,255,255);}
  //      if (imt >  18.5 && imt <  25.1){color = Color.rgb(85,255,85);}
  //      if (imt >= 25.1 && imt <= 30  ){color = Color.rgb(255,229,10);}
  //      if (imt >  30   && imt <= 35  ){color = Color.rgb(225,160,120);}
  //      if (imt >  35   && imt <= 40  ){color = Color.rgb(225,140,0);}
  //      if (imt >  40){color = Color.rgb(215,10,10);}
  //      return color;
  //  }


    @Override
    public void Bounds1(int height) {
        Rectangle rect = new Rectangle();
        rect.setHeight(height);
        rect.setFill(Color.rgb(205,255,255));
        rect.setWidth(Math.abs(18.5)*6);
        rect.setLayoutX(0);
        indicator.add(rect);
    }

    @Override
    public void Bounds2(int height) {
        Rectangle rect = new Rectangle();
        rect.setHeight(height);
        rect.setFill(Color.rgb(85,255,85));
        rect.setWidth(Math.abs(18.5-25.1)*6);
        rect.setLayoutX(18.5*6);
        indicator.add(rect);
    }

    @Override
    public void Bounds3(int height) {
        Rectangle rect = new Rectangle();
        rect.setHeight(height);
        rect.setFill(Color.rgb(255,229,10));
        rect.setWidth(Math.abs(25.1-30)*6);
        rect.setLayoutX(21.5*6);
        System.out.println(rect.getBoundsInParent());
        indicator.add(rect);
    }

    @Override
    public void Bounds4(int height) {
        Rectangle rect = new Rectangle();
        rect.setHeight(height);
        rect.setFill(Color.rgb(225,160,120));
        rect.setWidth(Math.abs(30-35)*6);
        rect.setLayoutX(26*6);
        indicator.add(rect);
    }

    @Override
    public void Bounds5(int height) {
        Rectangle rect = new Rectangle();
        rect.setHeight(height);
        rect.setFill(Color.rgb(225,140,0));
        rect.setWidth(Math.abs(35-40)*6);
        rect.setLayoutX(31*6);
        indicator.add(rect);
    }

    @Override
    public void Bounds6(int height) {
        Rectangle rect = new Rectangle();
        rect.setHeight(height);
        rect.setFill(Color.rgb(215,10,10));
        rect.setWidth(Math.abs(14)*6);
        rect.setLayoutX(36*6);
        indicator.add(rect);
    }

    @Override
    public void lineCircle(int radix, double CenterX) {
        Circle circ = new Circle();
        circ.setRadius(radix);
        circ.setCenterX(CenterX);
        circ.setCenterY((double)radix / 2);
        indicator.add(circ);
    }

    @Override
    public Indicator Build() {
        return indicator;
    }


}
