package ru.sf.personalfinancemanagementsystem.dto.responses;

import ru.sf.personalfinancemanagementsystem.enums.CategoryKind;

import java.math.BigDecimal;
import java.util.UUID;


public record CreateCategoryResponseDto(

        UUID id,
        UUID userId,
        String name,
        CategoryKind kind,
        BigDecimal budgetAmount

) {}
