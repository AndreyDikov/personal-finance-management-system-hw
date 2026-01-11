package ru.sf.personalfinancemanagementsystem.exceptions;

public class CategoryAlreadyExistsException extends RuntimeException {

    public CategoryAlreadyExistsException() {
        super("Категория с таким именем уже существует");
    }

}
