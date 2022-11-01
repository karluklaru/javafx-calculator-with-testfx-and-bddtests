package com.example.calculatora;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;


public class MyCalculatorView implements CalculatorView {
    @FXML
    private Label expressionLabel;


    @Override
    public void printResult(double result) {
        expressionLabel.setText(Double.toString(result));
    }

    @Override
    public void displayError(String message) {
        expressionLabel.setText(message);
        expressionLabel.setTextFill(Color.web("#FF2E00"));
    }

    @Override
    public void printMessage(String message) {
        expressionLabel.setText(message);
        expressionLabel.setTextFill(Color.web("#aeaeae"));
    }

    @Override
    public String getValue() {
        return expressionLabel.getText();
    }
}
