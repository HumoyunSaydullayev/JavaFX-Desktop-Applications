package com.example.javafx_effects;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.effect.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.net.URISyntaxException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Circle circle1;
    @FXML
    private Circle circle2;
    public Text text1;
    public Text text2;
    public Text text3;
    public Text text4;
    public Text text5;
    public ImageView rasm1;

    public ImageView rasm2;

    public ImageView rasm4;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        1-topshiriq
        ColorAdjust c=new ColorAdjust();
        c.setBrightness(0.3);
        c.setContrast(0.4);
        c.setHue(0.2);
        c.setSaturation(0.5);
        rasm2.setEffect(c);

        Image resource= null;
        try {
            resource = new Image(Objects.requireNonNull(getClass().getResource("IMG_20210913_230957_954.PNG")).toURI().toString());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        Rectangle rect = new Rectangle();
        ImageInput img= new ImageInput();
        img.setSource(resource);
        img.setX(293);
        img.setY(527);
        rect.setEffect(img);

        Glow glow=new Glow();
        glow.setLevel(5);
        rasm4.setEffect(glow);
//        2-topshiriq
        circle1.setFill(Color.YELLOW);
        circle1.setLayoutX(150);
        circle1.setLayoutY(100);
        circle2.setFill(Color.GREEN);
        circle2.setLayoutX(150);
        circle1.setLayoutY(150);
        Blend blend = new Blend();
        ColorInput color= new ColorInput();
        color.setX(-40);
        color.setY(-10);
        color.setWidth(80);
        color.setHeight(80);
        color.setPaint(Color.LIMEGREEN);
        blend.setTopInput(color);
        blend.setMode(BlendMode.ADD);
        circle2.setEffect(blend);

        //3-topshiriq
        BoxBlur boxBlur = new BoxBlur();
        boxBlur.setWidth(10);
        boxBlur.setHeight(3);
        boxBlur.setIterations(1);
        text1.setEffect(boxBlur);

        text2.setEffect(new GaussianBlur());

        MotionBlur motionBlur = new MotionBlur();
        motionBlur.setRadius(10);
        motionBlur.setAngle(-5.0);
        text3.setEffect(motionBlur);


//        4-topshiriq
        Reflection reflection = new Reflection();
        reflection.setFraction(0.5);
        text4.setEffect(reflection);

        Reflection reflection2 = new Reflection();
        reflection2.setFraction(0.7);
        rasm1.setEffect(reflection2);

        //5-topshiriq
        Shadow shadow = new Shadow(5,Color.RED);
        text5.setEffect(shadow);


    }
}