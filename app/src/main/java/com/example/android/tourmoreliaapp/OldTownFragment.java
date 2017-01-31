package com.example.android.tourmoreliaapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class OldTownFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the tour_list.xml layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of places. Source of information
        final ArrayList<Sightseeing> oldTown = new ArrayList<Sightseeing>();
        oldTown.add(new Sightseeing(R.drawable.tarascas,
                getResources().getString(R.string.tarascas_name) ,
                getResources().getString(R.string.tarascas_address),
                getResources().getString(R.string.tarascas_opening)) ) ;
        oldTown.add(new Sightseeing(R.drawable.catedral,
                getResources().getString(R.string.cathedral_name),
                getResources().getString(R.string.cathedral_address),
                getResources().getString(R.string.cathedral_opening)) ) ;
        oldTown.add(new Sightseeing(R.drawable.clavijero,
                getResources().getString(R.string.clavijero_name) ,
                getResources().getString(R.string.clavijero_address),
                getResources().getString(R.string.clavijero_opening)) ) ;
        oldTown.add(new Sightseeing(R.drawable.morelos,
                getResources().getString(R.string.morelos_name),
                getResources().getString(R.string.morelos_address),
                getResources().getString(R.string.morelos_opening)) ) ;
        oldTown.add(new Sightseeing(R.drawable.callejon,
                getResources().getString(R.string.romance_name) ,
                getResources().getString(R.string.romance_address),
                getResources().getString(R.string.romance_opening)) ) ;

        //Instantiate an adapter object and pass the context and source of information
        TourAdapter adapter = new TourAdapter( getActivity(), oldTown);

        //Cast the listView from the recycleView within list_tour_item.xml file and set adapter to the list
        ListView list = (ListView) rootView.findViewById(R.id.list_tour_options);
        list.setAdapter(adapter);

        return rootView ;
    }

}
