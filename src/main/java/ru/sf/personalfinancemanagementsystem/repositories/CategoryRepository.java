package ru.sf.personalfinancemanagementsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.sf.personalfinancemanagementsystem.domains.Category;
import ru.sf.personalfinancemanagementsystem.entities.CategoryEntity;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, UUID> {

    @Query(value = """
        select id
             , user_id
             , name
             , kind
             , budget_amount
        from categories
        where user_id = :userId
              and name = :categoryName
    """, nativeQuery = true)
    Optional<CategoryEntity> findByUserIdAndName(UUID userId, String categoryName);

}
