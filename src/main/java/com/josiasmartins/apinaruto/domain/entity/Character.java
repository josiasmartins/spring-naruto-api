package com.josiasmartins.apinaruto.domain.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "character")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Character {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotEmpty(message = "{campo.login.obrigatorio}")
    private String name;

    @Column
    @NotEmpty(message = "{campo.login.obrigatorio}")
    private String clan;

    @Column
    // @ElementCollection
    @NotEmpty(message = "{campo.login.obrigatorio}")
    private String elements;
    
    
}
