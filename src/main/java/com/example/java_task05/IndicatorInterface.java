package com.example.java_task05;
import javafx.scene.Node;
import javafx.scene.layout.Pane;


public interface IndicatorInterface {
    void add    (Node node);
    void remove ();
    void show   (Pane pane);
}
