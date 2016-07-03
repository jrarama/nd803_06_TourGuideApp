package com.jprarama.tourguideapp.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by joshua on 3/7/16.
 */
public class ListImageItem implements Parcelable {

    private int imageResourceId;

    private String description;

    private Class<?> targetActivity;

    public ListImageItem(int imageResourceId, String description, Class<?> targetActivity) {
        this.imageResourceId = imageResourceId;
        this.description = description;
        this.targetActivity = targetActivity;
    }

    protected ListImageItem(Parcel in) {
        imageResourceId = in.readInt();
        description = in.readString();
        try {
            targetActivity = Class.forName(in.readString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static final Creator<ListImageItem> CREATOR = new Creator<ListImageItem>() {
        @Override
        public ListImageItem createFromParcel(Parcel in) {
            return new ListImageItem(in);
        }

        @Override
        public ListImageItem[] newArray(int size) {
            return new ListImageItem[size];
        }
    };

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Class<?> getTargetActivity() {
        return targetActivity;
    }

    public void setTargetActivity(Class<?> targetActivity) {
        this.targetActivity = targetActivity;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(imageResourceId);
        parcel.writeString(description);
        parcel.writeString(targetActivity.getName());
    }
}
