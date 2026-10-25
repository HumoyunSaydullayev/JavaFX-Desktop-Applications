package com.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Objects;

public class HelloController{
    Database db = new Database();
    public TextField login;
    public PasswordField password;
    public Label labell;
    public Label labelp;
    public Button submit;
    public Button clear;

    public void clearDisplay(ActionEvent actionEvent) {
        login.setText("");
        password.setText("");
    }

    public void result(ActionEvent actionEvent) throws Exception {
        if (login.getText().equals("") && password.getText().equals("")) {
            labell.setText("*Login kiritilmadi !!!");
            labelp.setText("*Password kiritilmadi !!!");
        } else if (login.getText().equals("")) {
            labell.setText("*Login kiritilmadi !!!");
        } else if (password.getText().equals("")) {
            labelp.setText("*Password kiritilmadi !!!");
        } else {
            labell.setText("");
            labelp.setText("");
            int sanash = 0;
            int son = 0;

            db.getInformationOperator();
            ArrayList<InformationOperator> InformationOperators = db.getInformationOperators();
            for (InformationOperator item : InformationOperators) {
                if (item.getLogin().equals(login.getText())) {
                    if (item.getParol().equals(password.getText())) {
                        Parent root = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("Calc.fxml")));
                        Stage window = (Stage) submit.getScene().getWindow();
                        window.setTitle("Calculator !");
                        window.setScene(new Scene(root, 358, 366));
                    } else {
                        son++;
                        if (son >= InformationOperators.size()) {
                            labelp.setText("*Password ma'lumotlari nato'g'ri !!!");
                        }
                    }
                } else {
                    sanash++;
                    if (sanash >= InformationOperators.size()) {
                        labell.setText("*Login ma'lumotlari nato'g'ri !!!");
                        labelp.setText("*Password ma'lumotlari nato'g'ri !!!");
                    }
                }

            }
        }
    }
}
