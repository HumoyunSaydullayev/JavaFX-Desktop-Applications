package com.example.animation;

import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public Circle cir1;
    public Circle cir2;
    public Circle cir3;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TranslateTransition translate=new TranslateTransition();
        translate.setByX(400);
        translate.setDuration(Duration.millis(500));
        translate.setCycleCount(Timeline.INDEFINITE);
        translate.setAutoReverse(true);
        translate.setNode(cir1);
        translate.play();

        TranslateTransition translate1=new TranslateTransition();
        translate1.setByX(400);
        translate1.setDuration(Duration.millis(2000));
        translate1.setCycleCount(500);
        translate1.setAutoReverse(true);
        translate1.setNode(cir2);
        translate1.play();

        TranslateTransition translate2=new TranslateTransition();
        translate2.setByX(400);
        translate2.setDuration(Duration.millis(1000));
        translate2.setCycleCount(500);
        translate2.setAutoReverse(true);
        translate2.setNode(cir3);
        translate2.play();
    }
}