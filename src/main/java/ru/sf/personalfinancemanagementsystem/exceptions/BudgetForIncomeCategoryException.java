package ru.sf.personalfinancemanagementsystem.exceptions;

public class BudgetForIncomeCategoryException extends RuntimeException {

    public BudgetForIncomeCategoryException() {
        super("Невозможно установить бюджет для доходной категории");
    }

}
