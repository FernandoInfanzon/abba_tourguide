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
public class BookFragment extends Fragment {

    public BookFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.title_list, container, false);

        // Create a list of cards
        final ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card(getString(R.string.title_book_one), getString(R.string.book_one), R.drawable.standar));
        cards.add(new Card(getString(R.string.title_book_two), getString(R.string.book_two), R.drawable.family));
        cards.add(new Card(getString(R.string.title_book_three), getString(R.string.book_three), R.drawable.master));
        cards.add(new Card(getString(R.string.title_book_four), getString(R.string.book_four), R.drawable.masterplus));
        // Create an {@link CardAdapter}, whose data source is a list of {@link Card}s. The
        // adapter knows how to create list items for each item in the list.
        CardAdapter adapter = new CardAdapter(getActivity(), cards, R.color.category_book);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link CardAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Card} in the list.
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
