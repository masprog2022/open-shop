package com.masprogtechs.openshop.dtos.category;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CategoryResponseDTO {

    private Long id;
    private String name;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime createdAt;
}
