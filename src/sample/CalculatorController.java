package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

public class CalculatorController {

    @FXML
    private Label title, screen;

    @FXML
    private Button one,two,three,four,five,six,seven,eight,nine,zero,dot,equals,divide,multi,minus,plus,percent,strong,log,e,c,ce;

    @FXML
    private TableView lastScore;

    private double value1;
    private boolean divideFlag = false,multiFlag = false, minusFlag = false, plusFlag = false, percentFlag = false, stronFlag = false, logFlag = false, eFlag = false;

    public void initialize(){
        screen.setText("");
    }

    public void onePress(){
        String currScreen = screen.getText();
        currScreen += "1";
        screen.setText(currScreen);
    }

    public void twoPress(){
        String currScreen = screen.getText();
        currScreen += "2";
        screen.setText(currScreen);
    }

    public void threePress(){
        String currScreen = screen.getText();
        currScreen += "3";
        screen.setText(currScreen);
    }

    public void fourPress(){
        String currScreen = screen.getText();
        currScreen += "4";
        screen.setText(currScreen);
    }

    public void fivePress(){
        String currScreen = screen.getText();
        currScreen += "5";
        screen.setText(currScreen);
    }

    public void sixPress(){
        String currScreen = screen.getText();
        currScreen += "6";
        screen.setText(currScreen);
    }

    public void sevenPress(){
        String currScreen = screen.getText();
        currScreen += "7";
        screen.setText(currScreen);
    }

    public void eightPress(){
        String currScreen = screen.getText();
        currScreen += "8";
        screen.setText(currScreen);
    }

    public void ninePress(){
        String currScreen = screen.getText();
        currScreen += "9";
        screen.setText(currScreen);
    }

    public void zeroPress(){
        String currScreen = screen.getText();
        currScreen += "0";
        screen.setText(currScreen);
    }

    public void dotPress(){
        String currScreen = screen.getText();
        currScreen += ".";
        screen.setText(currScreen);
    }

    public void equalsPress(){
        if(divideFlag)
        {
            Double value2 = Double.parseDouble(screen.getText());
            Double result = value1/value2;
            screen.setText(String.valueOf(result));
        }
    }

    public void dividePress(){
        value1 = Double.parseDouble(screen.getText());
        screen.setText("");
        divide.setTextFill(Color.RED);
        divideFlag = true;
        multiFlag = false;
        minusFlag = false;
        plusFlag = false;
        percentFlag = false;
        stronFlag = false;
        logFlag = false;
        eFlag = false;
    }

    public void multiPress(){
        divideFlag = false;
        multiFlag = true;
        minusFlag = false;
        plusFlag = false;
        percentFlag = false;
        stronFlag = false;
        logFlag = false;
        eFlag = false;
    }

    public void minusPress(){
        divideFlag = false;
        multiFlag = false;
        minusFlag = true;
        plusFlag = false;
        percentFlag = false;
        stronFlag = false;
        logFlag = false;
        eFlag = false;
    }

    public void plusPress(){
        divideFlag = false;
        multiFlag = false;
        minusFlag = false;
        plusFlag = true;
        percentFlag = false;
        stronFlag = false;
        logFlag = false;
        eFlag = false;
    }

    public void percentPress(){
        divideFlag = false;
        multiFlag = false;
        minusFlag = false;
        plusFlag = false;
        percentFlag = true;
        stronFlag = false;
        logFlag = false;
        eFlag = false;
    }

    public void strongPress(){
        divideFlag = false;
        multiFlag = false;
        minusFlag = false;
        plusFlag = false;
        percentFlag = false;
        stronFlag = true;
        logFlag = false;
        eFlag = false;
    }

    public void logPress(){
        divideFlag = false;
        multiFlag = false;
        minusFlag = false;
        plusFlag = false;
        percentFlag = false;
        stronFlag = false;
        logFlag = true;
        eFlag = false;
    }

    public void ePress(){
        divideFlag = false;
        multiFlag = false;
        minusFlag = false;
        plusFlag = false;
        percentFlag = false;
        stronFlag = false;
        logFlag = false;
        eFlag = true;
    }

    public void cPress(){
        screen.setText("");

    }

    public void cePress(){
        screen.setText("");
        divideFlag = false;
        multiFlag = false;
        minusFlag = false;
        plusFlag = false;
        percentFlag = false;
        stronFlag = false;
        logFlag = false;
        eFlag = false;
    }

}
