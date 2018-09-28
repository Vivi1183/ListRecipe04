package com.example.android.listrecipe04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText recipeNameEditText;
    private TextView allRecipeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recipeNameEditText = (EditText) findViewById(R.id.add_recipe_edit_text);
        allRecipeTextView = (TextView) findViewById(R.id.list_recipe_text_view);

    }
}
