package com.gabriely.crudspring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//@Table(name = "cursos") - caso a tabela já tivesse sido criada e não possuísse o mesmo nome da classe
@Data
@Entity
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 200, nullable = false) 
    private String name;

    @Column(length = 10, nullable = false)
    private String category;
}
