package ru.sf.personalfinancemanagementsystem.domains;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import ru.sf.personalfinancemanagementsystem.enums.CategoryKind;

import java.math.BigDecimal;
import java.util.UUID;


@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryDataForCreate {

        String name;
        CategoryKind kind;
        BigDecimal budgetAmount;

}
