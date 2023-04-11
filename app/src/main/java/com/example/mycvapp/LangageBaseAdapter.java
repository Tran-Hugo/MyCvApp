package com.example.mycvapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class LangageBaseAdapter extends BaseAdapter {

        private ArrayList<Langage> langages;

        private Context context;

        public LangageBaseAdapter(ArrayList<Langage> langages, Context context) {
            this.langages = langages;
            this.context = context;
        }

        @Override
        public int getCount() {
            return langages.size();
        }

        @Override
        public Object getItem(int position) {
            return langages.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

    @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView ==null){
                convertView = LayoutInflater.from(context).inflate(R.layout.item_langage,parent,false);
            }
            TextView textViewNom = convertView.findViewById(R.id.nom);
            textViewNom.setText(langages.get(position).getNom());
            ProgressBar ratingBar = convertView.findViewById(R.id.progressBar);
            ratingBar.setProgress((int) langages.get(position).getNiveau());

            return convertView;
        }
}
