package com.example.EcommerceProject.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
// these are all lombok annotations, they are used to generate boilerplate code such as getters, setters, constructors, and builders.
public class CategoryDTO {
    private String name;
}
