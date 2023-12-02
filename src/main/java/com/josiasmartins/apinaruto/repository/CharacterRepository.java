package com.josiasmartins.apinaruto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.josiasmartins.apinaruto.domain.entity.Character;;

public interface CharacterRepository extends JpaRepository<Character, Long> {
    
}
