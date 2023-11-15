package com.example.springboot.repositories;

import com.example.springboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

/**
 * Nao precisaria dessa anotation
 * porque como ja extendemos o JpaRepository
 * por default ele ja se torna um Repository
 * **/
@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
