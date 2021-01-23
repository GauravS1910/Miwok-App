package com.example.android.miwok;

public class Word
{
    private String mDefaultTranslation;
    private String mMiworkTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;

    public Word(String DefaultTranslation , String MiworkTranslation , int audioResourceId)
    {
        mDefaultTranslation = DefaultTranslation;
        mMiworkTranslation = MiworkTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String DefaultTranslation , String MiworkTranslation , int ImageResourceId , int audioResourceId)
    {
        mDefaultTranslation = DefaultTranslation;
        mMiworkTranslation = MiworkTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getmMiworkTranslation()
    {
        return mMiworkTranslation;
    }

    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiworkTranslation='" + mMiworkTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}



