package com.example.careerguideapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class UniversityAdapter extends ArrayAdapter<String> {
    Context context;
    int[] universityImages;
    String[] universityNameList;
    String[] universityLocationList;
    String[] urls;

    public UniversityAdapter(Context context, String[] universityNameList,
                             int[] universityImages, String[] universityLocationList, String[] urls) {
        super(context, R.layout.first_item, R.id.tV1, universityNameList);
        this.context = context;
        this.universityImages = universityImages;
        this.universityNameList = universityNameList;
        this.universityLocationList = universityLocationList;
        this.urls = urls;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View firstItem = convertView;
        UniversityViewHolder holder = null;
        if (firstItem == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            firstItem = layoutInflater.inflate(R.layout.first_item, parent, false);
            holder = new UniversityViewHolder(firstItem);
            firstItem.setTag(holder);
        }
        else{
            holder = (UniversityViewHolder) firstItem.getTag();
        }
        holder.itemImage.setImageResource(universityImages[position]);
        holder.universityName.setText(universityNameList[position]);
        holder.universityLocation.setText(universityLocationList[position]);
        firstItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(), "You Clicked:" + universityNameList[position], Toast.LENGTH_SHORT).show();
                Intent openLinksIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                context.startActivity(openLinksIntent);
            }
        });
        return firstItem;


    }
}