package com.example.android.tourguide;

public class Tour {

    // get the image id of the list item
    private int mImageResouceId;

    // get the text details of the list item
    private String mTextDetails;

    private String myColour;

    /**
     * constructor to create an object instance for the tour class
     *
     * @param ImageResourceId accepts the image resource ID
     * @param TextDetails     accepts the texts that wsa passed
     */
    public Tour(int ImageResourceId, String TextDetails) {
        mImageResouceId = ImageResourceId;
        mTextDetails = TextDetails;
    }

    /**
     * A second constructor to accept font colors
     *
     * @param ImageResourceId
     * @param TextDetails
     * @param colorName
     */
    public Tour(int ImageResourceId, String TextDetails, String colorName) {
        mImageResouceId = ImageResourceId;
        mTextDetails = TextDetails;
        myColour = colorName;
    }

    /*
     * gets the image id that was passed
     */
    public int getmImageResouceId() {
        return mImageResouceId;
    }

    /**
     * gets the text details that was passed
     */
    public String getmTextDetails() {
        return mTextDetails;
    }

    public String getMyColour(String colorType) {
        return myColour;
    }
}
