package com.example.careerguideapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    ListView lvUniversity;
    String [] universityNameList = {"DUT", "RHODES", "TUT", "UCT", "UFH", "UFS", "UJ", "UKZN", "UL",
    "UNISA", "UNW", "UP", "USU", "UV", "UWC", "UZ", "WITS"};

    String [] universityLocationList = {"Durban, RSA", "Grahamstown, RSA", "Pretoria, RSA", "Cape Town, RSA",
            "Alice, RSA", "Bloemfontein, RSA", "Johannesburg, RSA", "Durban, RSA", "Polokwane, RSA",
            "Pretoria, RSA", "Potchefstroom, RSA", "Pretoria, RSA", "Stellenbosch, RSA",
            "Thohoyandou, RSA", "Bellville, RSA", "Richards Bay, RSA", "Johannesburg, RSA"};

    int [] universityImages = {R.drawable.dut, R.drawable.rhodes, R.drawable.tut,
            R.drawable.uct, R.drawable.ufh, R.drawable.ufs, R.drawable.uj, R.drawable.ukzn,
            R.drawable.ul, R.drawable.unisa, R.drawable.unw, R.drawable.up, R.drawable.usu,
            R.drawable.uv, R.drawable.uwc, R.drawable.uz, R.drawable.wits};
   String [] urls = {"https://www.dut.ac.za", "https://www.ru.ac.za", "https://www.tut.ac.za", "https://www.uct.ac.za",
           "https://www.ufh.ac.za", "https://www.ufs.ac.za", "https://www.uj.ac.za", "https://ukzn.ac.za",
           "https://www.ul.ac.za", "https://www.unisa.ac.za", "https://www.unw.ac.za", "https://www.up.ac.za",
           "https://www.sun.ac.za", "https://www.uiven.ac.za", "https://www.uwc.ac.za",
           "https://www.unizulu.ac.za", "https://www.wits.ac.za"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvUniversity = findViewById(R.id.lvUniversity);

        UniversityAdapter universityAdapter = new UniversityAdapter(this, universityNameList,
                universityImages, universityLocationList, urls);
        lvUniversity.setAdapter (universityAdapter);

    }



}