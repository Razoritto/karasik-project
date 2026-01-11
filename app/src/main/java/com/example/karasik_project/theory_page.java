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
import android.widget.ScrollView;

import com.example.karasik_project.databinding.ActivityTheoryPageBinding;

public class theory_page extends AppCompatActivity {

    private ActivityTheoryPageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTheoryPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Button btnTheory = findViewById(R.id.btnTheory);
        ScrollView scrollView = findViewById(R.id.scrollView);

        btnTheory.setOnClickListener(v -> {
            scrollView.smoothScrollTo(0, 0);
        });

        Button btnMainPage = findViewById(R.id.btnMainPage);

        btnMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(theory_page.this, MainActivity.class);


                startActivity(intent);
            }
        });


        Button btnTheoryVariables = findViewById(R.id.butt_theory_variables);

        btnTheoryVariables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(theory_page.this, theory_variables.class);


                startActivity(intent);
            }
        });

        Button btnTheoryIf = findViewById(R.id.butt_theory_if);

        btnTheoryIf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(theory_page.this, theory_if.class);


                startActivity(intent);
            }
        });

        Button btnTheoryElif = findViewById(R.id.butt_theory_elif);

        btnTheoryElif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(theory_page.this, theory_elif.class);


                startActivity(intent);
            }
        });


    }
}