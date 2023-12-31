package com.springlearning.commerce.repositories;

import com.springlearning.commerce.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
