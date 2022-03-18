package com.tahauddin.syed.domain;

import javax.persistence.*;
import java.math.BigDecimal;

import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name = "INGREDIENT")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="AMOUNT")
    private BigDecimal amount;
    
    @ManyToOne
    @JoinColumn()
    private Recipe recipe;

    @OneToOne(fetch = EAGER)
    private UnitOfMeasure unitOfMeasure;

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Ingredient() {
    }

    public Ingredient(Long id, String description, BigDecimal amount, Recipe recipe) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.recipe = recipe;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}