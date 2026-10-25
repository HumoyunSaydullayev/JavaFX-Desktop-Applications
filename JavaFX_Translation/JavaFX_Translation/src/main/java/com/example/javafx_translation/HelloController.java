package com.example.javafx_translation;

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TranslateTransition translate=new TranslateTransition(Duration.seconds(2),rec1);
        translate.setByX(250);
        translate.setByY(0);
        translate.play();
        rec1.setX(250);
        if (rec1.getX()==250) {
            TranslateTransition translate1=new TranslateTransition(Duration.seconds(2),rec1);
            translate1.setByY(250);
            translate1.play();
        }
    }
}