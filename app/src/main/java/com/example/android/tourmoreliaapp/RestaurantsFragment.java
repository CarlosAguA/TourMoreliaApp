package com.example.android.tourmoreliaapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the tour_list.xml layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of places. Source of information
        final ArrayList<Sightseeing> restaurants = new ArrayList<Sightseeing>();
        restaurants.add(new Sightseeing(R.drawable.elmago,
                getResources().getString(R.string.mago_name) ,
                getResources().getString(R.string.mago_address),
                getResources().getString(R.string.mago_opening)) ) ;
        restaurants.add(new Sightseeing(R.drawable.infierno,
                getResources().getString(R.string.infierno_name),
                getResources().getString(R.string.infierno_address),
                getResources().getString(R.string.infierno_opening)) ) ;
        restaurants.add(new Sightseeing(R.drawable.carmelo,
                getResources().getString(R.string.carnitas_name) ,
                getResources().getString(R.string.carnitas_address),
                getResources().getString(R.string.carnitas_opening) ) ) ;
        restaurants.add(new Sightseeing(R.drawable.localito,
                getResources().getString(R.string.localito_name) ,
                getResources().getString(R.string.localito_address),
                getResources().getString(R.string.localito_opening) ) ) ;

        //Instantiate an adapter object and pass the context and source of information
        TourAdapter adapter = new TourAdapter( getActivity(), restaurants);

        //Cast the listView from the recycleView within list_tour_item.xml file and set adapter to the list
        ListView list = (ListView) rootView.findViewById(R.id.list_tour_options);
        list.setAdapter(adapter);

        return rootView ;
    }

}
