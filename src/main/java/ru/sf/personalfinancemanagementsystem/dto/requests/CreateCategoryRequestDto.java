package ru.sf.personalfinancemanagementsystem.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import ru.sf.personalfinancemanagementsystem.constants.ValidationMessages;
import ru.sf.personalfinancemanagementsystem.enums.CategoryKind;

import java.math.BigDecimal;


public record CreateCategoryRequestDto(

        @NotBlank(message = ValidationMessages.NOT_BLANK)
        String name,

        @NotNull(message = ValidationMessages.NOT_NULL)
        CategoryKind kind,

        @Positive(message = ValidationMessages.POSITIVE_BUDGET_AMOUNT)
        BigDecimal budgetAmount

) {}
