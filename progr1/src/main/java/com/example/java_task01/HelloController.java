package com.example.java_task01;

import com.example.java_task05.Director;
import com.example.java_task05.Indicator;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


import java.util.Objects;

public class HelloController {
    private final Imt_class bmi = new Imt_class();
    public TextField massa;
    public TextField rost;
    public Label imt;
    public Rectangle imt_color;
    public Label imt_category;
    public HBox indic;
    public Indicator indicator;
    public boolean indicatorOk = false;



    public void onHelloButtonClick() {
        if (indicatorOk) indicator.remove(indic);
        indicatorOk = true;
        Director director = new Director();
        bmi.setMass_p(massa.getText());
        bmi.setRost_p(rost.getText());
        imt_category.setText(bmi.getCategory());
        imt_color.setFill(bmi.getColor());
        int currentValue = Math.min((int) bmi.getImt(), 50);
        indicator = new Indicator();
        indicator = director.Constr(bmi.getColor(),currentValue*6);
        indicator.show(indic);
    }
}
