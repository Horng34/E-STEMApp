package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class ChemistryG9Quiz extends AppCompatActivity {
    public static ArrayList<Modelclass> list;
    Button unit1,unit2,unit3,unit4,unit5,unit6,unit7,unit8,unit9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_g9_quiz);
        unit1 = findViewById(R.id.unit1);
        unit4 = findViewById(R.id.unit4);
        list = new ArrayList<>();



        unit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.add(new Modelclass("តើអាតូមអុកស៊ីសែនមាននិមិត្តសញ្ញាអ្វី?", "O2", "H2", "K2", "Cl", "Mg"));
                list.add(new Modelclass("តើអ៊ីដ្រូសែនពែអុកស៊ីតមានរូបមន្តអ្វី?", "O2", "H2", "K2", "H20", "H2O2"));
                list.add(new Modelclass("តើល្បឿនរបស់ប្រតិកម្មកើនឡើងដោយសារអ្វី??", "រងើកភ្លើង", "ថ្លើមជ្រូកឬម៉ង់កាណែស", "ទឹក", "អុកស៊ីសែន", "Agra"));
                Intent intent = new Intent(ChemistryG9Quiz.this, DashboardActivity.class);
                startActivity(intent);

            }


        });

    }
}