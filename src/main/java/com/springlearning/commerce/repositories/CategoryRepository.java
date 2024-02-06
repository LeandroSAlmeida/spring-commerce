package com.springlearning.commerce.repositories;

import com.springlearning.commerce.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
