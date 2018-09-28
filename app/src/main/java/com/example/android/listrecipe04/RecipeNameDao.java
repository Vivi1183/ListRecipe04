package com.example.android.listrecipe04;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface RecipeNameDao {
    @Query("SELECT * FROM recipename")
    List<RecipeName> getAll();

    @Query("SELECT * FROM recipename WHERE rnid IN (:userIds)")
    List<RecipeName> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM recipename WHERE recipe_name LIKE :first AND "
            + "recipe_tag LIKE :last LIMIT 1")
    RecipeName findByName(String first, String last);

    @Insert
    void insertAll(RecipeName... users);

    @Delete
    void delete(RecipeName user);

}