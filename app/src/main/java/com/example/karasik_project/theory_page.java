package com.example.karasik_project;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

import com.example.karasik_project.databinding.ActivityTheoryPageBinding;

public class theory_page extends AppCompatActivity {

    private ActivityTheoryPageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTheoryPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Button btnTheory = findViewById(R.id.btnTheory);

        btnTheory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(theory_page.this, theory_page.class);


                startActivity(intent);
            }
        });

        Button btnMainPage = findViewById(R.id.btn2);

        btnMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(theory_page.this, MainActivity.class);


                startActivity(intent);
            }
        });


    }
}