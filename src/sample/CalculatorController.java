package sample;

import java.lang.Math;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;

public class CalculatorController {

    @FXML
    private Label title, screen;

    @FXML
    private Button one,two,three,four,five,six,seven,eight,nine,zero,dot,equals,divide,multi,minus,plus,percent,strong,log,e,c,ce;

    @FXML
    private TableView<calcTable> lastScore;
    @FXML
    private TableColumn<calcTable,Double> history;

    final ObservableList<calcTable> data = FXCollections.observableArrayList();


    private double value1,value2,result;
    private int i = 0;
    private boolean divideFlag = false,multiFlag = false, minusFlag = false, plusFlag = false, percentFlag = false, stronFlag = false, logFlag = false, eFlag = false;

    public void initialize(){

        screen.setText("");
        history.setCellValueFactory(new PropertyValueFactory<calcTable, Double>("rRes"));
        lastScore.setItems(data);
    }

    public void onePress(){
        String currScreen = screen.getText();
        if (currScreen.equals("Infinity") || currScreen.equals("/") || currScreen.equals("*") || currScreen.equals("+") || currScreen.equals("-") || currScreen.equals("%") || currScreen.equals("log") || currScreen.equals("!") || currScreen.equals("e"))
            screen.setText("1");
        else {
            currScreen += "1";
            screen.setText(currScreen);
        }
    }

    public void twoPress(){
        String currScreen = screen.getText();
        if (currScreen.equals("Infinity") || currScreen.equals("/") || currScreen.equals("*") || currScreen.equals("+") || currScreen.equals("-") || currScreen.equals("%") || currScreen.equals("log") || currScreen.equals("!") || currScreen.equals("e"))
            screen.setText("2");
        else {
            currScreen += "2";
            screen.setText(currScreen);
        }
    }

    public void threePress(){
        String currScreen = screen.getText();
        if (currScreen.equals("Infinity") || currScreen.equals("/") || currScreen.equals("*") || currScreen.equals("+") || currScreen.equals("-") || currScreen.equals("%") || currScreen.equals("log") || currScreen.equals("!") || currScreen.equals("e"))
            screen.setText("3");
        else {
            currScreen += "3";
            screen.setText(currScreen);
        }
    }

    public void fourPress(){
        String currScreen = screen.getText();
        if (currScreen.equals("Infinity") || currScreen.equals("/") || currScreen.equals("*") || currScreen.equals("+") || currScreen.equals("-") || currScreen.equals("%") || currScreen.equals("log") || currScreen.equals("!") || currScreen.equals("e"))
            screen.setText("4");
        else {
            currScreen += "4";
            screen.setText(currScreen);
        }
    }

    public void fivePress(){
        String currScreen = screen.getText();
        if (currScreen.equals("Infinity") || currScreen.equals("/") || currScreen.equals("*") || currScreen.equals("+") || currScreen.equals("-") || currScreen.equals("%") || currScreen.equals("log") || currScreen.equals("!") || currScreen.equals("e"))
            screen.setText("5");
        else {
            currScreen += "5";
            screen.setText(currScreen);
        }
    }

    public void sixPress(){
        String currScreen = screen.getText();
        if (currScreen.equals("Infinity") || currScreen.equals("/") || currScreen.equals("*") || currScreen.equals("+") || currScreen.equals("-") || currScreen.equals("%") || currScreen.equals("log") || currScreen.equals("!") || currScreen.equals("e"))
            screen.setText("6");
        else {
            currScreen += "6";
            screen.setText(currScreen);
        }
    }

    public void sevenPress(){
        String currScreen = screen.getText();
        if (currScreen.equals("Infinity") || currScreen.equals("/") || currScreen.equals("*") || currScreen.equals("+") || currScreen.equals("-") || currScreen.equals("%") || currScreen.equals("log") || currScreen.equals("!") || currScreen.equals("e"))
            screen.setText("7");
        else {
            currScreen += "7";
            screen.setText(currScreen);
        }
    }

    public void eightPress(){
        String currScreen = screen.getText();
        if (currScreen.equals("Infinity") || currScreen.equals("/") || currScreen.equals("*") || currScreen.equals("+") || currScreen.equals("-") || currScreen.equals("%") || currScreen.equals("log") || currScreen.equals("!") || currScreen.equals("e"))
            screen.setText("8");
        else {
            currScreen += "8";
            screen.setText(currScreen);
        }
    }

    public void ninePress(){
        String currScreen = screen.getText();
        if (currScreen.equals("Infinity") || currScreen.equals("/") || currScreen.equals("*") || currScreen.equals("+") || currScreen.equals("-") || currScreen.equals("%") || currScreen.equals("log") || currScreen.equals("!") || currScreen.equals("e"))
            screen.setText("9");
        else {
            currScreen += "9";
            screen.setText(currScreen);
        }
    }

    public void zeroPress(){
        String currScreen = screen.getText();
        if (currScreen.equals("Infinity") || currScreen.equals("/") || currScreen.equals("*") || currScreen.equals("+") || currScreen.equals("-") || currScreen.equals("%") || currScreen.equals("log") || currScreen.equals("!") || currScreen.equals("e"))
            screen.setText("0");
        else {
            currScreen += "0";
            screen.setText(currScreen);
        }
    }

    public void dotPress(){
        String currScreen = screen.getText();
        if (currScreen.equals("Infinity"))
            screen.setText("1");
        else {
            currScreen += ".";
            screen.setText(currScreen);
        }
    }

    public void equalsPress(){

        if(divideFlag)
        {
           if(screen.getText().trim().isEmpty() || screen.getText().equals("/"))
               value2 = 0;
           else
               value2 = Double.parseDouble(screen.getText());
            result = value1/value2;
            screen.setText(String.valueOf(result));
        }
        else if(multiFlag)
        {
            if(screen.getText().trim().isEmpty() || screen.getText().equals("*"))
                value2 = 1;
            else
                value2 = Double.parseDouble(screen.getText());
            value2 = Double.parseDouble(screen.getText());
            result = value1*value2;
            screen.setText(String.valueOf(result));
        }
        else if(minusFlag)
        {
            if(screen.getText().trim().isEmpty() || screen.getText().equals("-"))
                value2 = 0;
            else
                value2 = Double.parseDouble(screen.getText());
            value2 = Double.parseDouble(screen.getText());
            result = value1-value2;
            screen.setText(String.valueOf(result));
        }
        else if(plusFlag)
        {
            if(screen.getText().trim().isEmpty() || screen.getText().equals("+"))
                value2 = 0;
            else
                value2 = Double.parseDouble(screen.getText());
            value2 = Double.parseDouble(screen.getText());
            result = value1+value2;
            screen.setText(String.valueOf(result));
        }
        else if(percentFlag)
        {
            if(screen.getText().trim().isEmpty() || screen.getText().equals("%"))
                value2 = 0;
            else
                value2 = Double.parseDouble(screen.getText());
            value2 = Double.parseDouble(screen.getText());
            result = (int)value1 % (int)value2;
            screen.setText(String.valueOf(result));
        }
        else if(stronFlag)
        {
            if(!screen.getText().equals("!") && !screen.getText().trim().isEmpty())
            {
                value1 = Double.parseDouble(screen.getText());
            }
            result = strong((int)value1);
            screen.setText(String.valueOf(result));
        }
        else if(logFlag)
        {
            if(screen.getText().trim().isEmpty())
                value2 = 0;
            else if(screen.getText().equals("log"))
            {
                result = Math.log(value1);
                screen.setText(String.valueOf(result));
            }
            else {
                value2 = Double.parseDouble(screen.getText());
                result = Math.log(value2);
                screen.setText(String.valueOf(result));
            }
        }
        else if(eFlag)
        {
            if(!screen.getText().equals("e"))
                value1 = Double.parseDouble(screen.getText());
            else if(screen.getText().trim().isEmpty())
                value1 = 0;

            result = value1 * 2.71828182846;
            screen.setText(String.valueOf(result));
        }
        else
        {
            if(screen.getText().trim().isEmpty())
                result = 0;
            else
                result = Double.parseDouble(screen.getText());

            screen.setText(String.valueOf(result));
        }
        divideFlag = false;
        multiFlag = false;
        minusFlag = false;
        plusFlag = false;
        percentFlag = false;
        stronFlag = false;
        logFlag = false;
        eFlag = false;
        data.add(new calcTable(result));
        lastScore.setItems(data);
        i++;
    }

    public void dividePress(){
        if(!screen.getText().trim().isEmpty() && (!screen.getText().equals("+") && !screen.getText().equals("-") && !screen.getText().equals("*") && !screen.getText().equals("/") && !screen.getText().equals("!") && !screen.getText().equals("%") && !screen.getText().equals("log") && !screen.getText().equals("e")))
             value1 = Double.parseDouble(screen.getText());

        screen.setText("/");
        divideFlag = true;
        divide.setTextFill(Color.RED);
        multiFlag = false;
        multi.setTextFill(Color.BLACK);
        minusFlag = false;
        minus.setTextFill(Color.BLACK);
        plusFlag = false;
        plus.setTextFill(Color.BLACK);
        percentFlag = false;
        percent.setTextFill(Color.BLACK);
        stronFlag = false;
        strong.setTextFill(Color.BLACK);
        logFlag = false;
        log.setTextFill(Color.BLACK);
        eFlag = false;
        e.setTextFill(Color.BLACK);
    }

    public void multiPress(){
        if(!screen.getText().trim().isEmpty() && (!screen.getText().equals("+") && !screen.getText().equals("-") && !screen.getText().equals("*") && !screen.getText().equals("/") && !screen.getText().equals("!") && !screen.getText().equals("%") && !screen.getText().equals("log") && !screen.getText().equals("e")))
            value1 = Double.parseDouble(screen.getText());

        screen.setText("*");
        divideFlag = false;
        divide.setTextFill(Color.BLACK);
        multiFlag = true;
        multi.setTextFill(Color.RED);
        minusFlag = false;
        minus.setTextFill(Color.BLACK);
        plusFlag = false;
        plus.setTextFill(Color.BLACK);
        percentFlag = false;
        percent.setTextFill(Color.BLACK);
        stronFlag = false;
        strong.setTextFill(Color.BLACK);
        logFlag = false;
        log.setTextFill(Color.BLACK);
        eFlag = false;
        e.setTextFill(Color.BLACK);
    }

    public void minusPress(){
        if(!screen.getText().trim().isEmpty() && (!screen.getText().equals("+") && !screen.getText().equals("-") && !screen.getText().equals("*") && !screen.getText().equals("/") && !screen.getText().equals("!") && !screen.getText().equals("%") && !screen.getText().equals("log") && !screen.getText().equals("e")))
            value1 = Double.parseDouble(screen.getText());

        screen.setText("-");
        divideFlag = false;
        divide.setTextFill(Color.BLACK);
        multiFlag = false;
        multi.setTextFill(Color.BLACK);
        minusFlag = true;
        minus.setTextFill(Color.RED);
        plusFlag = false;
        plus.setTextFill(Color.BLACK);
        percentFlag = false;
        percent.setTextFill(Color.BLACK);
        stronFlag = false;
        strong.setTextFill(Color.BLACK);
        logFlag = false;
        log.setTextFill(Color.BLACK);
        eFlag = false;
        e.setTextFill(Color.BLACK);
    }

    public void plusPress(){
        if(!screen.getText().trim().isEmpty() && (!screen.getText().equals("+") && !screen.getText().equals("-") && !screen.getText().equals("*") && !screen.getText().equals("/") && !screen.getText().equals("!") && !screen.getText().equals("%") && !screen.getText().equals("log") && !screen.getText().equals("e")))
            value1 = Double.parseDouble(screen.getText());

        screen.setText("+");
        divideFlag = false;
        divide.setTextFill(Color.BLACK);
        multiFlag = false;
        multi.setTextFill(Color.BLACK);
        minusFlag = false;
        minus.setTextFill(Color.BLACK);
        plusFlag = true;
        plus.setTextFill(Color.RED);
        percentFlag = false;
        percent.setTextFill(Color.BLACK);
        stronFlag = false;
        strong.setTextFill(Color.BLACK);
        logFlag = false;
        log.setTextFill(Color.BLACK);
        eFlag = false;
        e.setTextFill(Color.BLACK);
    }

    public void percentPress(){
        if(!screen.getText().trim().isEmpty() && (!screen.getText().equals("+") && !screen.getText().equals("-") && !screen.getText().equals("*") && !screen.getText().equals("/") && !screen.getText().equals("!") && !screen.getText().equals("%") && !screen.getText().equals("log") && !screen.getText().equals("e")))
            value1 = Double.parseDouble(screen.getText());

        screen.setText("%");
        divideFlag = false;
        divide.setTextFill(Color.BLACK);
        multiFlag = false;
        multi.setTextFill(Color.BLACK);
        minusFlag = false;
        minus.setTextFill(Color.BLACK);
        plusFlag = false;
        plus.setTextFill(Color.BLACK);
        percentFlag = true;
        percent.setTextFill(Color.RED);
        stronFlag = false;
        strong.setTextFill(Color.BLACK);
        logFlag = false;
        log.setTextFill(Color.BLACK);
        eFlag = false;
        e.setTextFill(Color.BLACK);
    }

    public void strongPress(){
        if(!screen.getText().trim().isEmpty() && (!screen.getText().equals("+") && !screen.getText().equals("-") && !screen.getText().equals("*") && !screen.getText().equals("/") && !screen.getText().equals("!") && !screen.getText().equals("%") && !screen.getText().equals("log") && !screen.getText().equals("e")))
            value1 = Double.parseDouble(screen.getText());

        screen.setText("!");
        divideFlag = false;
        divide.setTextFill(Color.BLACK);
        multiFlag = false;
        multi.setTextFill(Color.BLACK);
        minusFlag = false;
        minus.setTextFill(Color.BLACK);
        plusFlag = false;
        plus.setTextFill(Color.BLACK);
        percentFlag = false;
        percent.setTextFill(Color.BLACK);
        stronFlag = true;
        strong.setTextFill(Color.RED);
        logFlag = false;
        log.setTextFill(Color.BLACK);
        eFlag = false;
        e.setTextFill(Color.BLACK);
    }

    public void logPress(){
        if(!screen.getText().trim().isEmpty() && (!screen.getText().equals("+") && !screen.getText().equals("-") && !screen.getText().equals("*") && !screen.getText().equals("/") && !screen.getText().equals("!") && !screen.getText().equals("%") && !screen.getText().equals("log") && !screen.getText().equals("e")))
            value1 = Double.parseDouble(screen.getText());

        screen.setText("log");
        divideFlag = false;
        divide.setTextFill(Color.BLACK);
        multiFlag = false;
        multi.setTextFill(Color.BLACK);
        minusFlag = false;
        minus.setTextFill(Color.BLACK);
        plusFlag = false;
        plus.setTextFill(Color.BLACK);
        percentFlag = false;
        percent.setTextFill(Color.BLACK);
        stronFlag = false;
        strong.setTextFill(Color.BLACK);
        logFlag = true;
        log.setTextFill(Color.RED);
        eFlag = false;
        e.setTextFill(Color.BLACK);
    }

    public void ePress(){
        if(!screen.getText().trim().isEmpty() && (!screen.getText().equals("+") && !screen.getText().equals("-") && !screen.getText().equals("*") && !screen.getText().equals("/") && !screen.getText().equals("!") && !screen.getText().equals("%") && !screen.getText().equals("log") && !screen.getText().equals("e")))
            value1 = Double.parseDouble(screen.getText());

        screen.setText("e");
        divideFlag = false;
        divide.setTextFill(Color.BLACK);
        multiFlag = false;
        multi.setTextFill(Color.BLACK);
        minusFlag = false;
        minus.setTextFill(Color.BLACK);
        plusFlag = false;
        plus.setTextFill(Color.BLACK);
        percentFlag = false;
        percent.setTextFill(Color.BLACK);
        stronFlag = false;
        strong.setTextFill(Color.BLACK);
        logFlag = false;
        log.setTextFill(Color.BLACK);
        eFlag = true;
        e.setTextFill(Color.RED);
    }

    public void cPress(){

        screen.setText("");
    }

    public void cePress(){
        screen.setText("");
        value1 = 0;
        value2 = 0;
        result = 0;
        divideFlag = false;
        multiFlag = false;
        minusFlag = false;
        plusFlag = false;
        percentFlag = false;
        stronFlag = false;
        logFlag = false;
        eFlag = false;
    }

    private static int strong(int i)
    {
        if (i < 1)
            return 1;
        else
            return i * strong(i - 1);
    }

    public void setFlagsAndColor(boolean flag, Button button)
    {
        divideFlag = false;
        divide.setTextFill(Color.BLACK);
        multiFlag = false;
        multi.setTextFill(Color.BLACK);
        minusFlag = false;
        minus.setTextFill(Color.BLACK);
        plusFlag = false;
        plus.setTextFill(Color.BLACK);
        percentFlag = false;
        percent.setTextFill(Color.BLACK);
        stronFlag = false;
        strong.setTextFill(Color.BLACK);
        logFlag = false;
        log.setTextFill(Color.BLACK);

    }
}
