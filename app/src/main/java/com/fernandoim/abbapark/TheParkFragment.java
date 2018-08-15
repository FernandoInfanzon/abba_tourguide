package com.fernandoim.abbapark;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TheParkFragment extends Fragment {

    public TheParkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.title_list, container, false);

        // Create a list of cards
        final ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card(getString(R.string.title_thePark_one), getString(R.string.thePark_one), R.drawable.skybar));
        cards.add(new Card(getString(R.string.title_thePark_two), getString(R.string.thePark_two), R.drawable.restaurant));
        cards.add(new Card(getString(R.string.title_thePark_three), getString(R.string.thePark_three), R.drawable.zipline));
        cards.add(new Card(getString(R.string.title_thePark_four), getString(R.string.thePark_four), R.drawable.cottages));
        // Create an {@link CardAdapter}, whose data source is a list of {@link Card}s. The
        // adapter knows how to create list items for each item in the list.
        CardAdapter adapter = new CardAdapter(getActivity(), cards, R.color.category_thePark);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // card_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link CardAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

            }
        });

        return rootView;
    }

}
