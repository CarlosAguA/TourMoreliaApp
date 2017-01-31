package com.example.android.tourmoreliaapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ShopFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the tour_list.xml layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of places. Source of information
        final ArrayList<Sightseeing> markets = new ArrayList<Sightseeing>();
        markets.add(new Sightseeing(R.drawable.sanjuan,
                getResources().getString(R.string.juan_name) ,
                getResources().getString(R.string.juan_address),
                getResources().getString(R.string.juan_opening) ) );
        markets.add(new Sightseeing(R.drawable.codemi2,
                getResources().getString(R.string.passion_name),
                getResources().getString(R.string.passion_address),
                getResources().getString(R.string.passion_opening) ) ) ;
        markets.add(new Sightseeing(R.drawable.dulces,
                getResources().getString(R.string.candy_name) ,
                getResources().getString(R.string.candy_address),
                getResources().getString(R.string.candy_opening) ) );

        //Instantiate an adapter object and pass the context and source of information
        TourAdapter adapter = new TourAdapter( getActivity(), markets);

        //Cast the listView from the recycleView within list_tour_item.xml file and set adapter to the list
        ListView list = (ListView) rootView.findViewById(R.id.list_tour_options);
        list.setAdapter(adapter);

        return rootView ;
    }


}
