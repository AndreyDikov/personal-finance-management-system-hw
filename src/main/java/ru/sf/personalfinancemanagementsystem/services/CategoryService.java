package ru.sf.personalfinancemanagementsystem.services;

import ru.sf.personalfinancemanagementsystem.domains.Category;
import ru.sf.personalfinancemanagementsystem.domains.CategoryDataForCreate;

import java.util.UUID;

public interface CategoryService {

    Category createCategory(UUID userId, CategoryDataForCreate data);

}
