package com.example.mycvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Experience> experiences = new ArrayList<>();
        experiences.add(new Experience("05/09/2022","en cours","Thales LAS","DSI - apprenti developpeur Symfony Vue.js"));
        experiences.add(new Experience("01/03/2019","01/06/2020","Bü","vendeur papeterie"));
        experiences.add(new Experience("01/07/2017","01/08/2017","Chennevier","agent hospitalier"));
        ListView expList = findViewById(R.id.exp_list);
        ExperienceBaseAdapter arrayAdapter = new ExperienceBaseAdapter(experiences,this);
        expList.setAdapter(arrayAdapter);
        ArrayList<Formation> formations = new ArrayList<>();
        formations.add(new Formation("01/04/2022","Titre RNCP niveau 5 - DWWM","Afpa Créteil"));
        formations.add(new Formation("01/07/2012","Bac STI","René Cassin, Noisiel"));
        ListView formationList = findViewById(R.id.formations_list);
        FormationBaseAdapter formationBaseAdapter = new FormationBaseAdapter(formations,this);
        formationList.setAdapter(formationBaseAdapter);

        Button competences_button = findViewById(R.id.competences_button);
        competences_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities();
            }
        });
    }

    private void switchActivities(){
        Intent intent = new Intent(this, CompetenceActivity.class);
        startActivity(intent);
    }
}