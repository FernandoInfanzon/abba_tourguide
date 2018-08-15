package com.fernandoim.abbapark;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivitiesFragment extends Fragment {

    public ActivitiesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.title_list, container, false);

        // Create a list of Cards
        final ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card(getString(R.string.title_activities_one), getString(R.string.activities_one), R.drawable.dayonthefarm));
        cards.add(new Card(getString(R.string.title_activities_two), getString(R.string.activities_two), R.drawable.mountainbiking));
        cards.add(new Card(getString(R.string.title_activities_three), getString(R.string.activities_three), R.drawable.dayofsongdance));
        cards.add(new Card(getString(R.string.title_activities_four), getString(R.string.activities_four), R.drawable.spaservicemassage));
        // Create an {@link CardAdapter}, whose data source is a list of {@link Card}s. The
        // adapter knows how to create list items for each item in the list.
        CardAdapter adapter = new CardAdapter(getActivity(), cards, R.color.category_activities);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link CardAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Card} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }

}
