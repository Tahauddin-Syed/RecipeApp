package com.tahauddin.syed.repo;

import com.tahauddin.syed.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
