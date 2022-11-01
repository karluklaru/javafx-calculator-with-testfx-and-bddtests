package com.example.calculatora;

public interface CalculatorView {
    /**
     * Отображает результат вычисления
     */
    void printResult(double result);

    /**
     * Показывает ошибку, например деление на 0, пустые аргументы и прочее
     */
    void displayError(String message);

    /**
     * Выводит любое сообщение в поле
     */
    void printMessage(String message);

    /**
     * Возвращает значение поля Label
     */
    String getValue();
}
