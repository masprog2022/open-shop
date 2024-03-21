package com.masprogtechs.openshop.controllers;

import com.masprogtechs.openshop.dtos.category.CategoryRequestDTO;
import com.masprogtechs.openshop.dtos.category.CategoryResponseDTO;
import com.masprogtechs.openshop.mappers.CategoryMapper;
import com.masprogtechs.openshop.models.Category;
import com.masprogtechs.openshop.services.CategoryService;
import com.masprogtechs.openshop.utils.BuildCategoryURL;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;


    @PostMapping
    public ResponseEntity<CategoryResponseDTO> create(@RequestBody CategoryRequestDTO categoryRequestDTO){
        Category category = CategoryMapper.toCategory(categoryRequestDTO);
        categoryService.save(category);

        URI categoryUri = buildCategoryURL(category);

        return ResponseEntity.created(categoryUri).body(CategoryMapper.toDto(category));
    }

    private URI buildCategoryURL(Category category){
        String categoryPath = "/" + category.getId();
        return ServletUriComponentsBuilder.
                fromCurrentRequestUri().
                path(categoryPath).build().toUri();
    }
}
