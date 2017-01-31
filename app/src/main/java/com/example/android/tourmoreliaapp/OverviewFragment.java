package com.example.android.tourmoreliaapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class OverviewFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the tour_list.xml layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        //Source of information
        final ArrayList<Sightseeing> overview = new ArrayList<Sightseeing>();
        overview.add(new Sightseeing(R.drawable.acueducto,
                getResources().getString(R.string.brief_summary) ,
                getResources().getString(R.string.summary1),
                getResources().getString(R.string.summary2) ) ) ;

        //Instantiate an adapter object and pass the context and source of information
        TourAdapter adapter = new TourAdapter( getActivity(), overview);

        //Cast the listView from the recycleView within list_tour_item.xml file and set adapter to the list
        ListView list = (ListView) rootView.findViewById(R.id.list_tour_options);
        list.setAdapter(adapter);

        return rootView ;
    }

}
