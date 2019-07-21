package com.ajsherrell.hbotquiz.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A collection of objects to get from JSON.
 */
public class CategoryContent implements Parcelable {

    private String mCategory;
    private String mId;
    private String mQuestion;
    private String mAnswerA;
    private String mAnswerB;
    private String mAnswerC;
    private String mIsCorrect;
    private String mTitle;
    private String mPhoto;

    public CategoryContent(String category, String id, String question, String answerA,
                           String answerB, String answerC, String isCorrect,
                           String title, String photo) {
        this.mCategory = category;
        this.mId = id;
        this.mQuestion = question;
        this.mAnswerA = answerA;
        this.mAnswerB = answerB;
        this.mAnswerC = answerC;
        this.mIsCorrect = isCorrect;
        this.mTitle = title;
        this.mPhoto = photo;
    }

    protected CategoryContent(Parcel in) {
        mCategory = in.readString();
        mId = in.readString();
        mQuestion = in.readString();
        mAnswerA = in.readString();
        mAnswerB = in.readString();
        mAnswerC = in.readString();
        mIsCorrect = in.readString();
        mTitle = in.readString();
        mPhoto = in.readString();
    }

    public static final Creator<CategoryContent> CREATOR = new Creator<CategoryContent>() {
        @Override
        public CategoryContent createFromParcel(Parcel in) {
            return new CategoryContent(in);
        }

        @Override
        public CategoryContent[] newArray(int size) {
            return new CategoryContent[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mCategory);
        dest.writeString(mId);
        dest.writeString(mQuestion);
        dest.writeString(mAnswerA);
        dest.writeString(mAnswerB);
        dest.writeString(mAnswerC);
        dest.writeString(mIsCorrect);
        dest.writeString(mTitle);
        dest.writeString(mPhoto);
    }

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        this.mCategory = category;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        this.mId = id;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String question) {
        this.mQuestion = question;
    }

    public String getAnswerA() {
        return mAnswerA;
    }

    public void setAnswerA(String answerA) {
        this.mAnswerA = answerA;
    }

    public String getAnswerB() {
        return mAnswerB;
    }

    public void setAnswerB(String answerB) {
        this.mAnswerB = answerB;
    }

    public String getAnswerC() {
        return mAnswerC;
    }

    public void setAnswerC(String answerC) {
        this.mAnswerC = answerC;
    }

    public String getIsCorrect() {
        return mIsCorrect;
    }

    public void setIsCorrect(String isCorrect) {
        this.mIsCorrect = isCorrect;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getPhoto() {
        return mPhoto;
    }

    public void setPhoto(String photo) {
        this.mPhoto = photo;
    }
}
