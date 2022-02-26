package com.gb.base_1919_1_6;

import android.os.Parcel;
import android.os.Parcelable;

public class Notes implements Parcelable {
    private String name;
    private String description;
    private int DateOfCreation;

    protected Notes(Parcel in) {
        name = in.readString();
        description = in.readString();
        DateOfCreation = in.readInt();
    }

    public static final Creator<Notes> CREATOR = new Creator<Notes>() {
        @Override
        public Notes createFromParcel(Parcel in) {
            return new Notes(in);
        }

        @Override
        public Notes[] newArray(int size) {
            return new Notes[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDateOfCreation() {
        return DateOfCreation;
    }

    public void setDateOfCreation(int dateOfCreation) {
        DateOfCreation = dateOfCreation;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(description);
        parcel.writeInt(DateOfCreation);
    }
}
