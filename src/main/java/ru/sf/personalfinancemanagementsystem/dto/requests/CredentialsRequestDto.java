package ru.sf.personalfinancemanagementsystem.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import ru.sf.personalfinancemanagementsystem.constants.ValidationMessages;


public record CredentialsRequestDto(

        @NotBlank(message = ValidationMessages.NOT_BLANK)
        @Size(max = 128, message = ValidationMessages.SIZE_MAX)
        String login,

        @NotBlank(message = ValidationMessages.NOT_BLANK)
        @Size(min = 8, max = 72, message = ValidationMessages.SIZE_MIN_MAX)
        String password

) {}
