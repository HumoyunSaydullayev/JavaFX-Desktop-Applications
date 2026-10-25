package com.example.javafx_transformation;

import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public Rectangle rec1;
    public Rectangle rec2;
    public Rectangle rec3;
    public Rectangle rec4;
    public Rectangle rec5;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TranslateTransition translate1=new TranslateTransition(Duration.seconds(2),rec1);
        translate1.setByX(400);
        translate1.setCycleCount(Timeline.INDEFINITE);
        translate1.setAutoReverse(true);
        translate1.play();

        TranslateTransition translate2=new TranslateTransition(Duration.seconds(4),rec2);
        translate2.setByX(400);
        translate2.setCycleCount(Timeline.INDEFINITE);
        translate2.setAutoReverse(true);
        translate2.play();

        TranslateTransition translate3=new TranslateTransition(Duration.seconds(1),rec3);
        translate3.setByX(400);
        translate3.setCycleCount(Timeline.INDEFINITE);
        translate3.setAutoReverse(true);
        translate3.play();

        TranslateTransition translate4=new TranslateTransition(Duration.seconds(5),rec4);
        translate4.setByX(400);
        translate4.setCycleCount(Timeline.INDEFINITE);
        translate4.setAutoReverse(true);
        translate4.play();

        TranslateTransition translate5=new TranslateTransition(Duration.seconds(3),rec5);
        translate5.setByX(400);
        translate5.setCycleCount(Timeline.INDEFINITE);
        translate5.setAutoReverse(true);
        translate5.play();
    }

}