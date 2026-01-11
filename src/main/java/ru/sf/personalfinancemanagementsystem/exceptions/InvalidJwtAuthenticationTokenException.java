package ru.sf.personalfinancemanagementsystem.exceptions;

public class InvalidJwtAuthenticationTokenException extends IllegalStateException {

    public InvalidJwtAuthenticationTokenException() {
        super("Аутентификация не является JwtAuthenticationToken");
    }

}
