package com.example.taqdimot;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;

public class HelloApplication extends Application {
//    Tab va tabpane;
    //@Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
//    }

//    MediaView
    public void start(Stage stage) {

        Text txt = new Text("What a beautiful movie!");

        File f = new File("src/main/resources/com/example/taqdimot/olov.mp4");
        Media m = new Media(f.toURI().toString());
        MediaPlayer mp = new MediaPlayer(m);
        MediaView mv = new MediaView(mp);

        VBox vb = new VBox(txt, mv);
        vb.setSpacing(20);
        vb.setAlignment(Pos.CENTER);
        vb.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(vb, 650, 400);

        stage.setScene(scene);
        stage.setTitle("JavaFX with embedded media player");
        stage.onCloseRequestProperty().setValue(e -> System.out.println("Bye! See you later!"));
        stage.show();

        mp.play();
    }



//    WebView
//    public void start(Stage stage) throws IOException {
//        stage.setTitle("JavaFX WebView Example");
//
//        WebView webView = new WebView();
//
//        webView.getEngine().load("http://google.com");
//        VBox vBox = new VBox(webView);
//        Scene scene = new Scene(vBox, 960, 600);
//
//        stage.setScene(scene);
//        stage.show();
//    }

    public static void main(String[] args) {
        launch();
    }
}