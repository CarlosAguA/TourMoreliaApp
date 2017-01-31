package com.example.android.tourmoreliaapp;

/**
 * Created by Paviliondm4 on 1/27/2017.
 */

public class Sightseeing {

    private int mImageResourceId ;
    private String mDescription ;
    private String mBusinessHours ;
    private String mPlaceName ;

    /*
    Public constructor from Sightseeing object. It encapsulates 4 states.
    @param imageId gets the resource id in order to access to an image from resources
    @param places´s Names within strings folder
    @param name gets a string from places´s Adresses/Locations within strings folder
    @param name gets a string from places´s Opening Hours/Distances within strings folder
     */
    public Sightseeing (int imageId, String name, String workingHours , String description){

        this.mDescription = description ;
        this.mImageResourceId = imageId ;
        this.mBusinessHours = workingHours ;
        this.mPlaceName = name ;

    }

   /*
    @return imageResourceId which contains the image of the item
   */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    /*
    @return mDescription which contains the description of the object
   */
    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    /*
    @return mBusinessHours which contains information of the item
   */
    public String getBusinessHours() {
        return mBusinessHours;
    }

    public void setBusinessHours(String mBusinessHours) {
        this.mBusinessHours = mBusinessHours;
    }

    /*
    @return mPlaceName which contains information of the item
   */
    public String getPlaceName() {
        return mPlaceName;
    }

    public void setPlaceName(String mPlaceName) {
        this.mPlaceName = mPlaceName;
    }

    @Override
    public String toString() {
        return "Sightseeing{" +
                "mImageResourceId=" + mImageResourceId +
                ", mDescription='" + mDescription + '\'' +
                ", mBusinessHours='" + mBusinessHours + '\'' +
                ", mPlaceName='" + mPlaceName + '\'' +
                '}';
    }
}
