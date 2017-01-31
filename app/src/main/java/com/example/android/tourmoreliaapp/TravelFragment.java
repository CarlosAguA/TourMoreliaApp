package com.example.android.tourmoreliaapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TravelFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the tour_list.xml layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of places. Source of information
        final ArrayList<Sightseeing> magicTowns = new ArrayList<Sightseeing>();
        magicTowns.add(new Sightseeing(R.drawable.patzcuaro,
                getResources().getString(R.string.patzcuaro_name) ,
                getResources().getString(R.string.patzcuaro_location),
                getResources().getString(R.string.patzcuaro_distance)) ) ;
        magicTowns.add(new Sightseeing(R.drawable.tzin,
                getResources().getString(R.string.tzin_name),
                getResources().getString(R.string.tzin_location),
                getResources().getString(R.string.tzin_distance)) ) ;
        magicTowns.add(new Sightseeing(R.drawable.tacambaro,
                getResources().getString(R.string.tacambaro_name) ,
                getResources().getString(R.string.tacambaro_location),
                getResources().getString(R.string.tacambaro_distance)) ) ;
        magicTowns.add(new Sightseeing(R.drawable.clara,
                getResources().getString(R.string.clara_name),
                getResources().getString(R.string.clara_location),
                getResources().getString(R.string.clara_distance)) ) ;

        //Instantiate an adapter object and pass the context and source of information
        TourAdapter adapter = new TourAdapter( getActivity(), magicTowns);

        //Cast the listView from the recycleView within list_tour_item.xml file and set adapter to the list
        ListView list = (ListView) rootView.findViewById(R.id.list_tour_options);
        list.setAdapter(adapter);

        return rootView ;
    }

}
