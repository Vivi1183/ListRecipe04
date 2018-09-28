package com.example.android.listrecipe04;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class RecipeName {

    @PrimaryKey(autoGenerate = true) //поле, явл.ключом в таблице
    private int rnid;

    @ColumnInfo(name = "recipe_name")
    private String recipeName;

    @ColumnInfo(name = "recipe_tag")
    private String recipeTag;

    public int getRnid() {
        return rnid;
    }

    public void setRnid(int rnid) {
        this.rnid = rnid;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeTag() {
        return recipeTag;
    }

    public void setRecipeTag(String recipeTag) {
        this.recipeTag = recipeTag;
    }

    @Override
    public String toString() {
        return "Name: " + recipeName + " Tag: " + recipeTag ;
    }
}
