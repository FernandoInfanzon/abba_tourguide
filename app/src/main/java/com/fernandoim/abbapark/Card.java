package com.fernandoim.abbapark;

public class Card {

    //Default translation for the word */
    private String mTitle;

    //Miwok translation for the word */
    private String mDescription;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Card(String title, String description, int imageResourceId) {
        mTitle = title;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    //
    //* Get the default translation of the word.

    public String getTitle() {
        return mTitle;
    }


    //* Get the Miwok translation of the word.

    public String getDescription() {
        return mDescription;
    }

    public int getImageResourceId() { return mImageResourceId;}

    public boolean hasImage(){
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
