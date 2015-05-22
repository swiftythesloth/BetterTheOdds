package swiftythesloth.co.uk.bettertheodds;

import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Sam on 21/05/2015.
 */
public class Course {

    private String mName;
    private int mNumRunners;
    private ArrayList<Horse> mHorses = new ArrayList<Horse>();
    private SQLiteDatabase mDb;

    public Course(String name, int numRunners) {
        mName = name;
        mNumRunners = numRunners;
        refreshHorses();
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getNumRunners() {
        return mNumRunners;
    }

    public void setNumRunners(int numRunners) {
        mNumRunners = numRunners;
    }

    public ArrayList<Horse> getHorses() {
        return mHorses;
    }

    public void refreshHorses() {

        ArrayList<Horse> horses = createHorses();

        //need to be in random order to not pick same horses all the time
        Collections.shuffle(horses);

        mHorses.clear();

        //add a horse from the front of the shuffled list
        //to the member variable until correct number is reached
        for (int i = 0; i < getNumRunners(); i++) {
            mHorses.add(horses.remove(i+1));
        }
    }

    private ArrayList<Horse> createHorses(){

        ArrayList<Horse> horses = new ArrayList<Horse>();

        horses.add(new Horse("Shelby"));
        horses.add(new Horse("Stu the Sloth"));
        horses.add(new Horse("Bacon Rasher"));
        horses.add(new Horse("Rustic Filly"));
        horses.add(new Horse("Jasmine Master"));
        horses.add(new Horse("Bellevue Night"));
        horses.add(new Horse("Strawberry Maiden"));
        horses.add(new Horse("Earthly Gatekeeper"));
        horses.add(new Horse("Bright Debt"));
        horses.add(new Horse("Granola Muffin"));
        horses.add(new Horse("Timid Temptation"));
        horses.add(new Horse("Turbulent Baby"));
        horses.add(new Horse("Prevailing Fear"));
        horses.add(new Horse("Poppy Ruffian"));
        horses.add(new Horse("Jelly Lace"));
        horses.add(new Horse("Dozing Hill"));
        horses.add(new Horse("Clover Bubble"));
        horses.add(new Horse("Envy Frank"));
        horses.add(new Horse("Alaskan Cape"));
        horses.add(new Horse("Western Pegasus"));
        horses.add(new Horse("Chocolate Breeze"));
        horses.add(new Horse("Devine Drizzle"));
        horses.add(new Horse("Electric in a Box"));
        horses.add(new Horse("Evil Randy Hussy"));
        horses.add(new Horse("Mangy Tropic"));
        horses.add(new Horse("Mrs Robinson's Dancing Roommate"));
        horses.add(new Horse("Nefarious Humble Thicket"));
        horses.add(new Horse("Loose Bender"));
        horses.add(new Horse("Sugar Binge"));
        horses.add(new Horse("Unfaithful Gristle"));
        horses.add(new Horse("Where is Glamour"));
        horses.add(new Horse("Near Death Rapscallion"));
        horses.add(new Horse("Washed Up Old Lady"));
        horses.add(new Horse("Boxer Glue"));
        horses.add(new Horse("Exceptional Perfection"));
        horses.add(new Horse("Justine's Lumpy Underwear"));
        horses.add(new Horse("Galloping Misunderstanding"));
        horses.add(new Horse("Ugly Trucker"));
        horses.add(new Horse("Droopy Three-Legs"));
        horses.add(new Horse("Marv's Rump Cheese"));
        horses.add(new Horse("Marvellous Raw Apple"));
        horses.add(new Horse("Whistling Mess"));
        horses.add(new Horse("Priceless Imagination"));
        horses.add(new Horse("Justine's Lumpy Underwear"));
        horses.add(new Horse("Memories Showgirl"));
        horses.add(new Horse("Punchline"));
        horses.add(new Horse("See Spot Fly"));
        horses.add(new Horse("Chocolate Martini"));
        horses.add(new Horse("Irresistible"));
        horses.add(new Horse("Pinch Me"));
        horses.add(new Horse("Academic Awards"));
        horses.add(new Horse("Afire"));
        horses.add(new Horse("Silver Blue"));
        horses.add(new Horse("Enchantee"));
        horses.add(new Horse("Watch Out"));
        horses.add(new Horse("Step in Time"));
        horses.add(new Horse("Miss Independent"));
        horses.add(new Horse("Duchess"));
        horses.add(new Horse("Winter's End"));
        horses.add(new Horse("Quiet Knight"));
        horses.add(new Horse("Heyday"));
        horses.add(new Horse("Rush of Glory"));
        horses.add(new Horse("Gold Mine"));
        horses.add(new Horse("Diamonds Sparkle"));
        horses.add(new Horse("Storybook"));
        horses.add(new Horse("Partner in Crime"));
        horses.add(new Horse("Dear Santa"));
        horses.add(new Horse("Worthy"));
        horses.add(new Horse("Silhouette"));
        horses.add(new Horse("Heart of Gold"));
        horses.add(new Horse("Dancing Blues"));
        horses.add(new Horse("Chapter 11"));
        horses.add(new Horse("Peek-a-Boo"));
        horses.add(new Horse("Right Track"));
        horses.add(new Horse("Simply Endearing"));
        horses.add(new Horse("Moon Dancer"));
        horses.add(new Horse("Apple-Teeny"));
        horses.add(new Horse("Kodak Moment"));
        horses.add(new Horse("Lovely"));
        horses.add(new Horse("Gold Mercedes"));
        horses.add(new Horse("Fourteen Carrot"));
        horses.add(new Horse("Try Me"));
        horses.add(new Horse("Endearing"));
        horses.add(new Horse("Prep Squad"));
        horses.add(new Horse("No Foolin'"));
        horses.add(new Horse("Why Not?"));
        horses.add(new Horse("Minion"));
        horses.add(new Horse("Tuck for You"));
        horses.add(new Horse("Daddy's Cash"));
        horses.add(new Horse("Someone Like Me"));
        horses.add(new Horse("Common Sense"));
        horses.add(new Horse("The Journey Begins"));
        horses.add(new Horse("Rise and Shine"));
        horses.add(new Horse("Warm Fuzzy"));
        horses.add(new Horse("Silver Charm"));
        horses.add(new Horse("Heart Deco"));
        horses.add(new Horse("White Sox"));
        horses.add(new Horse("Bedtime Story"));
        horses.add(new Horse("Airborne Express"));
        horses.add(new Horse("Storm Warning"));
        horses.add(new Horse("Custom Eyes"));
        horses.add(new Horse("Fearless"));
        horses.add(new Horse("Bear Flat"));

        return horses;

    }

    @Override
    public String toString() {
        return getName();
    }
}
