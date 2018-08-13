package com.fernandoim.abbapark;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CardAdapter extends ArrayAdapter<Card> {

    private int mColorResourceId;

    public CardAdapter(Activity context, ArrayList<Card> cards, int colorResourceId ){
        super(context, 0, cards);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        // Get the word object located at this position in the list
        Card currentCard = getItem(position);

        //Find the TextView in the list_item.xml layout the ID version_name
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);

        //Get the Version Name from the current AndroidFlavor object and set this text on the v
        titleTextView.setText(currentCard.getDescription());

        //Find the TextView in the list_item.xml with the ID version_number
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        //Get the Version Number from the current AndroidFlavor object and set this on the
        descriptionTextView.setText(currentCard.getTitle());

        ImageView imageResourceId = (ImageView) listItemView.findViewById(R.id.imageResource);

        if(currentCard.hasImage()){
            imageResourceId.setImageResource(currentCard.getImageResourceId());
            imageResourceId.setVisibility(View.VISIBLE);

        }
        else {
            imageResourceId.setVisibility(View.GONE);
        }

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        //Find the color that the resoruce ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        //Set the background color of ghe text container View
        textContainer.setBackgroundColor(color);

        //Return the whole list item layout (containing 2 TextViews) so that
        return listItemView;

    }




}