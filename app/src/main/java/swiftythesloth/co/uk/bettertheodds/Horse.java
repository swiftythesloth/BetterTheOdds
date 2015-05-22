package swiftythesloth.co.uk.bettertheodds;

import java.util.Random;

/**
 * Created by Sam on 21/05/2015.
 */
public class Horse {

    private String mName;
    private int mAge;
    private String mGender;
    private int mRating;

    public Horse(String name) {

        Random rand = new Random();

        mName = name;
        mAge = rand.nextInt((8-2) +1) + 2;              //from 2-8
        mGender = rand.nextInt(2) == 1 ? "F" : "M";     //coin toss
        mRating = rand.nextInt((100-1) +1) + 1;         //from 1-100
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public int getRating() {
        return mRating;
    }

    public void setRating(int rating) {
        mRating = rating;
    }

    @Override
    public String toString() {
        return getName();
    }
}
