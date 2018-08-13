package com.fernandoim.abbapark;

public class Card {

    //Default translation for the word */
    private String mTitle;

    //Miwok translation for the word */
    private String mDescription;

    //Audio resource ID for the word */
    private int mAudioResourceId;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    //Create a new Word object.

    //@param defaultTranslation is the word in a language that the user is already familiar with
    //                          (such as English)
    //@param miwokTranslation is the word in the Miwok language

    public Card(String defaultTranslation, String miwokTranslation,  int audioResourceId) {
        mTitle = defaultTranslation;
        mDescription = miwokTranslation;
        mAudioResourceId = audioResourceId;

    }

    public Card(String title, String description, int imageResourceId, int audioResourceId) {
        mTitle = title;
        mDescription = description;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Card{" +
                "mTitle='" + mTitle + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
