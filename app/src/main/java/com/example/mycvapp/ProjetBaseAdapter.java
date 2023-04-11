package com.example.mycvapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ProjetBaseAdapter extends BaseAdapter {

    private ArrayList<Projet> projets;

    private Context context;

    public ProjetBaseAdapter(ArrayList<Projet> projets, Context context) {
        this.projets = projets;
        this.context = context;
    }

    @Override
    public int getCount() {
        return projets.size();
    }

    @Override
    public Object getItem(int position) {
        return projets.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_projet, parent, false);
        }
        TextView nom = convertView.findViewById(R.id.projet_nom);
        nom.setText(projets.get(position).getNom());
        TextView duree = convertView.findViewById(R.id.projet_duree);
        duree.setText(projets.get(position).getDuree());
        TextView description = convertView.findViewById(R.id.projet_description);
        description.setText(projets.get(position).getDescription());
        TextView lien = convertView.findViewById(R.id.projet_link);
        if(projets.get(position).getLien() != null){
            lien.setText(projets.get(position).getLien());
            lien.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri = Uri.parse(projets.get(position).getLien());
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    parent.getContext().startActivity(intent);
                }
            });
        } else {
            lien.setVisibility(View.GONE);
        }

        return convertView;
    }
}
