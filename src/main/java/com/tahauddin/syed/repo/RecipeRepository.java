package com.tahauddin.syed.repo;

import com.tahauddin.syed.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {


}
