package com.example.mycvapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ExperienceBaseAdapter extends BaseAdapter {
    private ArrayList<Experience> experiences;
    private Context context;

    public ExperienceBaseAdapter(ArrayList<Experience> experiences, Context context) {
        this.experiences = experiences;
        this.context = context;
    }

    @Override
    public int getCount() {
        return experiences.size();
    }

    @Override
    public Object getItem(int position) {
        return experiences.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView ==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_experience,parent,false);
        }
        TextView textViewDateDebut = convertView.findViewById(R.id.date_debut);
        textViewDateDebut.setText(experiences.get(position).getDebut());
        TextView textViewDateFin = convertView.findViewById(R.id.date_fin);
        textViewDateFin.setText(experiences.get(position).getFin());
        TextView textViewEntreprise = convertView.findViewById(R.id.entreprise);
        textViewEntreprise.setText(experiences.get(position).getEntreprise());
        TextView textViewDescription = convertView.findViewById(R.id.description);
        textViewDescription.setText(experiences.get(position).getDescription());

        return convertView;
    }
}
