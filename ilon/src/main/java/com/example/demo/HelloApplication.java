package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 300);

        HelloController demo=fxmlLoader.getController();

        Rectangle tort=demo.tort;
        scene.addEventHandler(KeyEvent.KEY_PRESSED, e->{
            switch (e.getCode()) {
                case LEFT :
                    tort.setX(tort.getX()-10);
                    break;
                case RIGHT :
                    tort.setX(tort.getX()+10);
                    break;
                case UP :
                    tort.setY(tort.getY()-10);
                    break;
                case DOWN :
                    tort.setY(tort.getY()+10);
                    break;
                default :
                    tort.setX(tort.getX());
                    tort.setY(tort.getY());
                    break;
            };
        });
        stage.setTitle("Harakat");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}