package com.example.ap011;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
public class CalculatorController {


    @FXML
    private TextField display;

    @FXML
    private void handleButtonClick(javafx.event.ActionEvent event) {
        String buttonText = ((Button) event.getSource()).getText();
        switch (buttonText) {
            case "C":
                display.clear();
                break;
            case "=":
                calculateResult();
                break;
            default:
                display.appendText(buttonText);
                break;
        }
    }

    private void calculateResult() {
        try {
            String result = eval(display.getText());
            display.setText(result);
        } catch (Exception e) {
            display.setText("Error");
        }
    }

    private String eval(String expression) {
        String[] parts = expression.split("\\+");
        double result = 0;
        for (String part : parts) {
            result += Double.parseDouble(part.trim());
        }
        return String.valueOf(result);
    }
}