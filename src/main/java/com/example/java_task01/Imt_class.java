package com.example.java_task01;

import javafx.scene.paint.Color;

public class Imt_class {
    private double mass_p;
    private double rost_p;
    private double imt;

    public Imt_class(){
        this.mass_p = 0;
        this.rost_p = 0;
    }
    public Imt_class(double massa,double rost){
        this.mass_p = massa;
        this.rost_p = rost;
    }
    public void setMass_p(String mass){
        mass_p = Double.parseDouble(mass);
    }
    public void setRost_p(String rost){
        rost_p = Double.parseDouble(rost);
    }
    public double getImt(){
        imt = mass_p/(rost_p*rost_p)*10000;
        return (mass_p/(rost_p*rost_p)*10000);
    }

    public String toString(){
        return String.valueOf(getImt());
    }

    public Color getColor(double imt){
        Color color = new Color(1,1,1,1);
        if (imt < 18.5){color = Color.rgb(205,255,255);}
        if (imt >  18.5 && imt <  25.1){color = Color.rgb(85,255,85);}
        if (imt >= 25.1 && imt <= 30  ){color = Color.rgb(255,229,10);}
        if (imt >  30   && imt <= 35  ){color = Color.rgb(225,160,120);}
        if (imt >  35   && imt <= 40  ){color = Color.rgb(225,140,0);}
        if (imt >  40){color = Color.rgb(215,10,10);}
        return color;
    }

    public String getCategory(double imt){
        String category = "";
        if (imt < 18.5)                {category = "Дифицит массы тела";}
        if (imt >  18.5 && imt <  25.1){category = "Нормальный вес";}
        if (imt >= 25.1 && imt <= 30  ){category = "Предожирение";}
        if (imt >  30   && imt <= 35  ){category = "Ожирение 1 степени";}
        if (imt >  35   && imt <= 40  ){category = "Ожирение 2 степени";}
        if (imt >  40)                 {category = "Ожирение 3 степени";}
        return category;
    }

}
