package com.tahauddin.syed.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Table(name = "RECIPE_TBL")
@Entity
public class Recipe implements Serializable {

    private static final long serialVersionUID = -960336907225300498L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "IDESCRIPTIOND")
    private String description;
    @Column(name = "PREP_TIME")
    private Integer prepTime;
    @Column(name = "COOK_TIME")
    private Integer cookTime;
    @Column(name = "SERVINGS")
    private Integer servings;
    @Column(name = "SOURCE")
    private String source;
    @Column(name = "URL")
    private String url;
    @Column(name = "DIRECTIONS")
    private String directions;

    @Lob
    @Column(name = "IMAGE")
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "recipe", cascade = CascadeType.ALL)
    private Set<Ingredient> ingredientSet = new HashSet<>();

    public void setIngredientSet(Set<Ingredient> ingredientSet) {
        this.ingredientSet = ingredientSet;
    }

    public Set<Ingredient> getIngredientSet() {
        return ingredientSet;
    }

    public Recipe() {
    }

    public Recipe(Long id, String description, Integer prepTime, Integer cookTime, Integer servings, String source, String url, String directions, Byte[] image, Notes notes, Set<Ingredient> ingredientSet) {
        this.id = id;
        this.description = description;
        this.prepTime = prepTime;
        this.cookTime = cookTime;
        this.servings = servings;
        this.source = source;
        this.url = url;
        this.directions = directions;
        this.image = image;
        this.notes = notes;
        this.ingredientSet = ingredientSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }
}
