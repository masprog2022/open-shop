package com.masprogtechs.openshop.services;

import com.masprogtechs.openshop.models.Category;
import com.masprogtechs.openshop.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Transactional
    public Category save(Category category){
        return categoryRepository.save(category);
    }
}
