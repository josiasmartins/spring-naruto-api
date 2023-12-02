package com.josiasmartins.apinaruto.domain.DTOs;

import java.util.List;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CharacterDTO {

    private String name;
    private String clan;
    private List<String> elements;
    
}
