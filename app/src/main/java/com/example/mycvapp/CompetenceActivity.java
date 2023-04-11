package com.example.mycvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CompetenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.competences);

        ArrayList<Langage> langages = new ArrayList<>();
        langages.add(new Langage("Javascript",80f));
        langages.add(new Langage("Java",70f));
        langages.add(new Langage("php",80f));
        LangageBaseAdapter langageBaseAdapter = new LangageBaseAdapter(langages,this);
        ListView langageList = findViewById(R.id.langs_list);
        langageList.setAdapter(langageBaseAdapter);

        ArrayList<Projet> projets = new ArrayList<>();
        projets.add(new Projet("NovelizeNow","3 mois","Site de lecture en ligne", "https://novelizenow.com"));
        projets.add(new Projet("MyCVApp","2 jours","Application Android de CV"));
        projets.add(new Projet("La Notule","2 mois","Site e-commerce de libraire"));
        ProjetBaseAdapter projetBaseAdapter = new ProjetBaseAdapter(projets,this);
        ListView projetList = findViewById(R.id.projets_list);
        projetList.setAdapter(projetBaseAdapter);
    }
}