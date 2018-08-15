package com.fernandoim.abbapark;

public class Card {

    private static final int NO_IMAGE_PROVIDED = -1;
    //title for the card */
    private String mTitle;
    //Description for the card */
    private String mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    public Card(String title, String description, int imageResourceId) {
        mTitle = title;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    //
    //* Get the title of the card.

    public String getTitle() {
        return mTitle;
    }


    //* Get the description of the word.

    public String getDescription() {
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


    @Override
    public String toString() {
        return "Card{" +
                "mTitle='" + mTitle + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
