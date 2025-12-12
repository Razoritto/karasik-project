package com.example.karasik_project; // Должно совпадать с вашим package

import android.content.Context;
import android.util.AttributeSet;

import androidx.constraintlayout.widget.ConstraintLayout;

public class ContactFooterView extends ConstraintLayout {

    public ContactFooterView(Context context) {
        super(context);
        init(context);
    }

    public ContactFooterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ContactFooterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        inflate(context, R.layout.bott_inf, this);
    }
}