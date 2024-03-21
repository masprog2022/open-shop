package com.masprogtechs.openshop.repositories;

import com.masprogtechs.openshop.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
