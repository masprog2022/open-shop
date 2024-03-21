package com.masprogtechs.openshop.mapper;

import com.masprogtechs.openshop.dtos.category.CategoryRequestDTO;
import com.masprogtechs.openshop.dtos.category.CategoryResponseDTO;
import com.masprogtechs.openshop.models.Category;
import org.modelmapper.ModelMapper;

public class CategoryMapper {

    public static Category toCategory(CategoryRequestDTO dto){
        return new ModelMapper().map(dto, Category.class);
    }

    public static CategoryResponseDTO toDto(Category category){
        return new ModelMapper().map(category, CategoryResponseDTO.class);
    }
}
