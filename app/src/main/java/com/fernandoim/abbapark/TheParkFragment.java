package com.fernandoim.abbapark;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
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

        // Create a list of words
        final ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card(getString(R.string.title_activities_one),getString(R.string.activities_one), R.drawable.cover ));
        cards.add(new Card(getString(R.string.title_activities_two),getString(R.string.activities_two), R.drawable.cover));
        cards.add(new Card(getString(R.string.title_activities_three),getString(R.string.activities_three), R.drawable.cover));
        cards.add(new Card(getString(R.string.title_activities_four),getString(R.string.activities_four), R.drawable.cover));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        CardAdapter adapter = new CardAdapter(getActivity(), cards, R.color.category_thePark);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the {@link Word} object at the given position the user clicked on
                Card card = cards.get(position);

            }
        });

        return rootView;
    }

}
