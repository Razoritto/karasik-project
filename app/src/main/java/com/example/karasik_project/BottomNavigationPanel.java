package com.example.karasik_project;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.karasik_project.R;
import com.google.android.material.button.MaterialButton;

public class BottomNavigationPanel extends ConstraintLayout {
    private MaterialButton btnAbout, btnHome, btnTheory, btnCreate;

    public BottomNavigationPanel(Context context) {
        super(context);
        init(context);
    }

    public BottomNavigationPanel(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.nav_panel, this, true);

        btnAbout = findViewById(R.id.btnAboutUs);
        btnHome = findViewById(R.id.btn2);
        btnTheory = findViewById(R.id.btnTheory);
    }

    public void setOnAboutClickListener(OnClickListener listener) {
        btnAbout.setOnClickListener(listener);
    }

    public void setOnHomeClickListener(OnClickListener listener) {
        btnHome.setOnClickListener(listener);
    }

    public void setOnTheoryClickListener(OnClickListener listener) {
        btnTheory.setOnClickListener(listener);
    }

    public void setOnCreateClickListener(OnClickListener listener) {
        btnCreate.setOnClickListener(listener);
    }


}