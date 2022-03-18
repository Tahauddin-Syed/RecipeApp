package com.tahauddin.syed.domain;

import javax.persistence.*;

@Entity
@Table(name="NOTES_TBL")
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @OneToOne
    @Column(name = "RECIPE")
    private Recipe recipe;

    @Lob
    @Column(name = "RECIPE_NOTES")
    private String recipeNotes;

    public Notes() {
    }

    public Notes(Long id, Recipe recipe, String recipeNotes) {
        this.id = id;
        this.recipe = recipe;
        this.recipeNotes = recipeNotes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
