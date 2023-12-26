package com.example.java_task05;
import com.example.java_task01.Imt_class;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;


public class Indicator implements IndicatorInterface{
    private Pane panel = new Pane();

    public void add(Node node){
        panel.getChildren().add(node);
    }
    public void remove(){
        this.panel = new Pane();
    }
    public void show(Pane pane){

            if (pane.getChildren().toArray().length > 0) {
                pane.getChildren().set(0,panel);
            }
            else {
                pane.getChildren().add(panel);
            }
        System.out.println(panel.getChildren());
    }
}
