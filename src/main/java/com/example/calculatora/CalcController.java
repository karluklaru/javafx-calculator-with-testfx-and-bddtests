package com.example.calculatora;

import javafx.fxml.FXML;

import java.util.Objects;
import java.util.regex.*;

public class CalcController extends MyCalculatorView {
    MyCalculator myCalculator;

    String operator = "";

    public CalcController() {
        myCalculator = new MyCalculator();
    }

    @FXML
    public void oneButtonClicked() {
        if (getValue().equals("Введите выражение") || getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль")) {
            printMessage("");
        }
        printMessage(getValue() + "1");
    }

    @FXML
    public void twoButtonClicked() {
        if (getValue().equals("Введите выражение") || getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль")) {
            printMessage("");
        }
        printMessage(getValue() + "2");
    }

    @FXML
    public void threeButtonClicked() {
        if (getValue().equals("Введите выражение") || getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль")) {
            printMessage("");
        }
        printMessage(getValue() + "3");
    }

    @FXML
    public void fourButtonClicked() {
        if (getValue().equals("Введите выражение") || getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль")) {
            printMessage("");
        }
        printMessage(getValue() + "4");
    }

    @FXML
    public void fiveButtonClicked() {
        if (getValue().equals("Введите выражение") || getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль")) {
            printMessage("");
        }
        printMessage(getValue() + "5");
    }

    @FXML
    public void sixButtonClicked() {
        if (getValue().equals("Введите выражение") || getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль")) {
            printMessage("");
        }
        printMessage(getValue() + "6");
    }

    @FXML
    public void sevenButtonClicked() {
        if (getValue().equals("Введите выражение") || getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль")) {
            printMessage("");
        }
        printMessage(getValue() + "7");
    }

    @FXML
    public void eightButtonClicked() {
        if (getValue().equals("Введите выражение") || getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль")) {
            printMessage("");
        }
        printMessage(getValue() + "8");
    }

    @FXML
    public void nineButtonClicked() {
        if (getValue().equals("Введите выражение") || getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль")) {
            printMessage("");
        }
        printMessage(getValue() + "9");
    }

    @FXML
    public void zeroButtonClicked() {
        if (getValue().equals("Введите выражение") || getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль")) {
            printMessage("");
        }
        printMessage(getValue() + "0");
    }

    @FXML
    public void addButtonClicked() {
        if (getValue().equals("Введите выражение") || getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль")) {
            printMessage("");
            printMessage(getValue() + "+");
        }
        else {
            if (!Objects.equals(operator, "")) {
                String regex = "^((-)?)([0-9]+)((.?[0-9]+)?)(\\+|-|\\*|/)$";
                Pattern pattern = Pattern.compile(regex);
                if (!pattern.matcher(getValue()).find()) {
                    equalsButtonClicked();
                }
            }
            if (!(getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль"))) {
                operator = "\\+";
                printMessage(getValue() + "+");
            }
        }
    }

    @FXML
    public void subtractButtonClicked() {
        if (getValue().equals("Введите выражение") || getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль")) {
            printMessage("");
            printMessage(getValue() + "-");
        }
        else {
            if (!Objects.equals(operator, "")) {
                String regex = "^((-)?)([0-9]+)((.?[0-9]+)?)(\\+|-|\\*|/)$";
                Pattern pattern = Pattern.compile(regex);
                if (!pattern.matcher(getValue()).find()) {
                    equalsButtonClicked();
                }
            }
            if (!(getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль"))) {
                operator = "-";
                printMessage(getValue() + "-");
            }
        }
    }

    @FXML
    public void multiplyButtonClicked() {
        if (!(getValue().equals("Введите выражение") || getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль"))) {
            if (!Objects.equals(operator, "")) {
                equalsButtonClicked();
            }
            if (!(getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль"))) {
                operator = "\\*";
                printMessage(getValue() + "*");
            }
        }
    }

    @FXML
    public void divideButtonClicked() {
        if (!(getValue().equals("Введите выражение") || getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль"))) {
            if (!Objects.equals(operator, "")) {
                equalsButtonClicked();
            }
            if (!(getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль"))) {
                operator = "/";
                printMessage(getValue() + "/");
            }
        }
    }

    @FXML
    public void deleteButtonClicked() {
        if (!(getValue().equals("Введите выражение") || getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль"))) {
            if (getValue().length() == 1) {
                printMessage("Введите выражение");
            }
            else {
                String regex = "[0-9](.)?(\\+|-|\\*|/)$";
                Pattern pattern = Pattern.compile(regex);
                if (pattern.matcher(getValue()).find()) {
                    operator = "";
                }
                printMessage(getValue().substring(0, getValue().length() - 1));
            }
        }
    }

    @FXML
    public void pointButtonClicked() {
        if (!(getValue().equals("Введите выражение") || getValue().equals("Неправильное выражение") || getValue().equals("Нельзя делить на ноль"))) {
            printMessage(getValue() + ".");
        }
    }

    @FXML
    public void equalsButtonClicked() {
        String regex = "^((\\+|-)?)([0-9]+)((.?[0-9]+)?)(\\+|-|\\*|/)((\\+|-)?)([0-9]+)((.[0-9]+)?)$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(getValue()).find()) {
            String[] numbers = getValue().split(operator);
            String a = "";
            String b = "";
            for (String number : numbers) {
                if (!Objects.equals(number, "") && b.equals("")) a = number;
                if (!Objects.equals(number, "") && !a.equals("")) b = number;
            }
            double result;
            switch (operator) {
                case "\\+" -> {
                    result = myCalculator.sum(Double.parseDouble(a), Double.parseDouble(b));
                    printMessage(Double.toString(result));

                }
                case "-" -> {
                    if (numbers[0].equals("")) {
                        if (numbers[2].equals("")) {
                            result = myCalculator.subtract(Double.parseDouble("-" + a), Double.parseDouble("-" + b));
                        }
                        else result = myCalculator.subtract(Double.parseDouble("-" + numbers[1]), Double.parseDouble(numbers[2]));
                    }
                    else {
                        if (numbers[1].equals("")) {
                            result = myCalculator.subtract(Double.parseDouble(a), Double.parseDouble("-" + b));
                        }
                        else result = myCalculator.subtract(Double.parseDouble(a), Double.parseDouble(b));
                    }
                    printMessage(Double.toString(result));
                }
                case "\\*" -> {
                    result = myCalculator.multiply(Double.parseDouble(a), Double.parseDouble(b));
                    printMessage(Double.toString(result));
                }
                case "/" -> {
                    try {
                        result = myCalculator.divide(Double.parseDouble(a), Double.parseDouble(b));
                        printMessage(Double.toString(result));
                    }
                    catch (ArithmeticException e) {
                        displayError(e.getMessage());
                    }
                }
            }
        }
        else {
            displayError("Неправильное выражение");
        }
        operator = "";
    }
}