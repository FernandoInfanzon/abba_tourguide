package com.fernandoim.abbapark;

import android.app.Activity;

import android.support.v4.content.ContextCompat;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CardAdapter extends ArrayAdapter<Card> {

    private int mColorResourceId;

    public CardAdapter(Activity context, ArrayList<Card> cards, int colorResourceId) {
        super(context, 0, cards);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        // Check if an existing view is being reused, otherwise inflate the view

        if (null == convertView) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
            holder = new ViewHolder();
            holder.titleTextView = (TextView) convertView.findViewById(R.id.title_text_view);
            holder.descriptionTextView = (TextView) convertView.findViewById(R.id.description_text_view);
            holder.imageResourceId = (ImageView) convertView.findViewById(R.id.imageResource);
            convertView.setTag(holder);
        } else  {
            holder = (ViewHolder) convertView.getTag();
        }

        // Get the card object located at this position in the list
        Card currentCard = getItem(position);


        holder.titleTextView.setText(currentCard.getTitle());
        holder.descriptionTextView.setText(currentCard.getDescription());
        holder.imageResourceId.setImageResource(currentCard.getImageResourceId());

        if (currentCard.hasImage()) {
            holder.imageResourceId.setImageResource(currentCard.getImageResourceId());
            holder.imageResourceId.setVisibility(View.VISIBLE);

        } else {
            holder.imageResourceId.setVisibility(View.GONE);
        }

        //Set the theme color for the list item
        View textContainer = convertView.findViewById(R.id.text_container);

        //Find the color that the resoruce ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        //Set the background color of ghe text container View
        textContainer.setBackgroundColor(color);

        //Return the whole list item layout (containing 2 TextViews) so that
        return convertView;

    }

    private static class ViewHolder {
        private TextView titleTextView, descriptionTextView;
        private ImageView imageResourceId;
    }


}