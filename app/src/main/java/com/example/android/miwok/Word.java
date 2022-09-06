package com.example.android.miwok;

public class Word {
    //It holds the miwok translation of object for default language of user of String type and by convention
    //name of variable(state, property, field) data member in camelcase with start (m)
    private String mMiwokTranslation;

    //It holds the default translation of miwok word for object of Word class
    private String mDefaultTranslation;

    //This variable holds the Image resource id of drawable resource type and int type variable
    //for each item of Recycler View List in its corresponding Word class object private for data binding
    private int mImageResource = NO_IMAGE_PROVIDED;//by convention private data start with m and write in camelcase NO_IMAGE_PROVIDED assigned to variable
    //because its static and same for all members and objects of class that's why and by this we can check mImageResource variable have image resource id
    //or not if calling hasImage() boolean method which return true if mImageResource != NO_IMAGE_PROVIDED else false.

    private static final int NO_IMAGE_PROVIDED = -1;

    //getter method return imageResource int type variable so method return type also int it have to public
    //so can accessed from anywhere in package or through package
    public int getImageResource() {
        return mImageResource;
    }

    //It is getter method of Word class and returns the miwok translation of object of Word class
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //It is getter method which returns mDefaultTranslation( default translation of miwok word) of Word class of particular object
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //This hasImage() boolean method return true if imageResource variable of int type is not null else false by this we can set image visibility to GONE
    //final static int type variable of View class so PhrasesActivity can display item without ImageView in it.
    public boolean hasImage() {
        //it only return true if mImageResource variable is not equal to the NO_IMAGE_PROVIDED variable
        return mImageResource != NO_IMAGE_PROVIDED;
    }

    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResource = imageResourceId;
    }
}
