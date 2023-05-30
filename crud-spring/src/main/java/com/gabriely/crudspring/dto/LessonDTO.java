package com.gabriely.crudspring.dto;

public record LessonDTO(
        Long id, 
        String name, 
        String youtubeUrl){
    
}
/*
 * @JsonProperty("_id") Long id, 
        @NotBlank @NotNull @Length(min = 5, max = 100) String name, 
        @NotNull @Length(max = 10) String youtubeUrl
 */