package com.example.java_task01;

import com.example.java_task05.Director;
import com.example.java_task05.Indicator;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;


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
        bmi.setMass_p(massa.getText());
        bmi.setRost_p(rost.getText());
        double currentValue =  bmi.getImt()>50 ? 50 : bmi.getImt();
        imt_category.setText(bmi.getCategory(currentValue));
        imt_color.setFill(bmi.getColor(currentValue));

        if (indicatorOk) indicator.remove();
        indicatorOk = true;

        Director director = new Director();
        indicator = new Indicator();
        indicator = director.Constr(currentValue*6);
        indicator.show(indic);

    }
}
