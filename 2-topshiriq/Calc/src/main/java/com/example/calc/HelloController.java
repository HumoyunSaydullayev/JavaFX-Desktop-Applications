package com.example.calc;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class HelloController {
    public Button btn00;
    public Button btn0;
    public Button btndot;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btnclear;
    public Button btnqoldiq;
    public Button btndel;
    public Button btnbolish;
    public Button btnsub;
    public Button btnplus;
    public Button btnmult;
    public Button btnresult;
    public TextField display;

    private int operand1;
    private int operand2;

    private String oper1 = "";
    private String oper2 = "";

    private int flag;
    private boolean bool=true;


    public void plus(ActionEvent actionEvent) {
        this.operand1 = Integer.parseInt(display.getText());
        this.flag = 0;
        display.setText("");
    }

    public void sub(ActionEvent actionEvent) {
        this.operand1 = Integer.parseInt(display.getText());
        this.flag = 1;
        display.setText("");
    }

    public void mult(ActionEvent actionEvent) {
        this.operand1 = Integer.parseInt(display.getText());
        this.flag = 2;
        display.setText("");
    }

    public void bolish(ActionEvent actionEvent) {
        this.operand1 = Integer.parseInt(display.getText());
        this.flag = 3;
        display.setText("");
    }

    public void qoldiq(ActionEvent actionEvent) {
        this.operand1 = Integer.parseInt(display.getText());
        this.flag = 4;
        display.setText("");
    }

    public void clearDisplay(ActionEvent actionEvent) {
        display.setText("");
    }

    public void del(ActionEvent actionEvent) {
        String str=display.getText();
        StringBuffer sb= new StringBuffer(str);
        sb.deleteCharAt(sb.length()-1);
        display.setText(String.valueOf(sb));
    }

    public void clickBtn00(ActionEvent actionEvent) {
        if (display.getText().equals("")){
            oper1 = "";
        }else{
            oper1 = display.getText()+"00";
        }
        display.setText(oper1);
    }

    public void clickBtn0(ActionEvent actionEvent) {
        if (display.getText().equals("")){
            oper1 = "";
        } else{
            oper1 = display.getText()+"0";
        }
        display.setText(oper1);
    }
    public void clickBtn1(ActionEvent actionEvent) {
        if (display.getText().equals("") || !bool){
            oper1 = "1";
            bool=true;
        }else if(display.getText().equals("0")){
            oper1 = "1";
        }else{
            oper1 = display.getText()+"1";
        }
        display.setText(oper1);
    }

    public void clickBtn2(ActionEvent actionEvent) {
        if (display.getText().equals("") || !bool){
            oper1 = "2";
            bool=true;
        }else if(display.getText().equals("0")){
            oper1 = "2";
        }
        else{
            oper1 = display.getText()+"2";
        }
        display.setText(oper1);
    }

    public void clickBtn3(ActionEvent actionEvent) {
        if (display.getText().equals("") || !bool){
            oper1 = "3";
            bool=true;
        }else if(display.getText().equals("0")){
            oper1 = "3";
        }else{
            oper1 = display.getText()+"3";
        }
        display.setText(oper1);
    }
    public void clickBtn4(ActionEvent actionEvent) {
        if (display.getText().equals("") || !bool){
            oper1 = "4";
            bool=true;
        }else if(display.getText().equals("0")){
            oper1 = "4";
        }else{
            oper1 = display.getText()+"4";
        }
        display.setText(oper1);
    }

    public void clickBtn5(ActionEvent actionEvent) {
        if (display.getText().equals("") || !bool){
            oper1 = "5";
            bool=true;
        }else if(display.getText().equals("0")){
            oper1 = "5";
        }else{
            oper1 = display.getText()+"5";
        }
        display.setText(oper1);
    }

    public void clickBtn6(ActionEvent actionEvent) {
        if (display.getText().equals("") || !bool){
            oper1 = "6";
            bool=true;
        }else if(display.getText().equals("0")){
            oper1 = "6";
        }else{
            oper1 = display.getText()+"6";
        }
        display.setText(oper1);
    }
    public void clickBtn7(ActionEvent actionEvent) {
        if (display.getText().equals("") || !bool){
            oper1 = "7";
            bool=true;
        }else if(display.getText().equals("0")){
            oper1 = "7";
        }else{
            oper1 = display.getText()+"7";
        }
        display.setText(oper1);
    }

    public void clickBtn8(ActionEvent actionEvent) {
        if (display.getText().equals("") || !bool){
            oper1 = "8";
            bool=true;
        }else if(display.getText().equals("0")){
            oper1 = "8";
        }else{
            oper1 = display.getText()+"8";
        }
        display.setText(oper1);
    }

    public void clickBtn9(ActionEvent actionEvent) {
        if (display.getText().equals("") || !bool){
            oper1 = "9";
            bool=true;
        }else if(display.getText().equals("0")){
            oper1 = "9";
        }else{
            oper1 = display.getText()+"9";
        }
        display.setText(oper1);
    }

    public void result(ActionEvent actionEvent) {
        this.operand2 = Integer.parseInt(display.getText());
        switch (flag){
            case 0:
                display.setText(String.valueOf(this.operand1+this.operand2));
                bool=false;
                break;
            case 1:
                display.setText(String.valueOf(this.operand1-this.operand2));
                bool=false;
                break;
            case 2:
                display.setText(String.valueOf(this.operand1*this.operand2));
                bool=false;
                break;
            case 3:
                display.setText(String.valueOf(this.operand1/this.operand2));
                bool=false;
                break;
            case 4:
                display.setText(String.valueOf(this.operand1%this.operand2));
                bool=false;
                break;
            default:
                display.setText("Error operation");
        }
    }
}