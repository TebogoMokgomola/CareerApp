package com.example.careerguideapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class UniversityViewHolder {
    ImageView itemImage;
    TextView universityName;
    TextView universityLocation;
    UniversityViewHolder(View v) {
        itemImage = v.findViewById(R.id.imageView);
        universityName = v.findViewById(R.id.tV1);
        universityLocation = v.findViewById(R.id.tV2);
    }
}
