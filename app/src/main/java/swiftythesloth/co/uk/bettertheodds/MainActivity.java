package swiftythesloth.co.uk.bettertheodds;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class MainActivity extends ListActivity {

    private CourseAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new CourseAdapter(getApplicationContext(), createCourses());
        setListAdapter(mAdapter);

    }

    private ArrayList<Course> createCourses(){

        ArrayList<Course> courses = new ArrayList<Course>();

        courses.add(new Course("Hedgemead Park", 3));
        courses.add(new Course("Stone Wood", 10));
        courses.add(new Course("Highland", 12));
        courses.add(new Course("Witherlands", 6));
        courses.add(new Course("Middleton Park", 8));
        courses.add(new Course("Wellsway", 2));
        courses.add(new Course("Murray Farm", 4));
        courses.add(new Course("Westwick", 14));
        courses.add(new Course("Victoria Farm", 6));
        courses.add(new Course("Derby Downs", 8));
        courses.add(new Course("Ruskin", 5));
        courses.add(new Course("Parkway", 16));
        courses.add(new Course("Ulwick", 4));
        courses.add(new Course("Rye Green", 7));
        courses.add(new Course("Peasemarsh", 8));
        courses.add(new Course("Iden Woods", 8));

        return courses;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
