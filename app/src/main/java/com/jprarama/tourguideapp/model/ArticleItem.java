package com.jprarama.tourguideapp.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by joshua on 3/7/16.
 */
public class ArticleItem implements Parcelable {

    private String title;

    private int imageResourceId;

    private String description;

    public ArticleItem(String title, int imageResourceId, String description) {
        this.title = title;
        this.imageResourceId = imageResourceId;
        this.description = description;
    }

    protected ArticleItem(Parcel in) {
        title = in.readString();
        imageResourceId = in.readInt();
        description = in.readString();
    }

    public static final Creator<ArticleItem> CREATOR = new Creator<ArticleItem>() {
        @Override
        public ArticleItem createFromParcel(Parcel in) {
            return new ArticleItem(in);
        }

        @Override
        public ArticleItem[] newArray(int size) {
            return new ArticleItem[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeInt(imageResourceId);
        parcel.writeString(description);
    }

    @Override
    public String toString() {
        return "ArticleItem{" +
                "title='" + title + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", description='" + description + '\'' +
                '}';
    }
}
