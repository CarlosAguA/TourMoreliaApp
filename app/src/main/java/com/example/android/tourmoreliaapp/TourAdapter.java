package com.example.android.tourmoreliaapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Paviliondm4 on 1/27/2017.
 */

public class TourAdapter extends ArrayAdapter<Sightseeing> {

    private Sightseeing currentPlace;

    //Public class that gets the context and the source which is an arrayList
    public TourAdapter(Context context, ArrayList<Sightseeing> place) {
        super(context, 0, place);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_tour_item, parent, false);
        }

        currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID im_view
        ImageView featureImageView = (ImageView) listItemView.findViewById(R.id.im_view);
        featureImageView.setImageResource(currentPlace.getImageResourceId());

        // Find the TextView in the list_item.xml layout with the ID place_name
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_name);
        placeTextView.setText(currentPlace.getPlaceName());

        // Find the TextView in the list_item.xml layout with the ID business_name
        TextView businessTextView = (TextView) listItemView.findViewById(R.id.business_name);
        businessTextView.setText(currentPlace.getBusinessHours());

        // Find the TextView in the list_item.xml layout with the ID description_name
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_name);
        descriptionTextView.setText(currentPlace.getDescription());

        return listItemView;

    }

}
