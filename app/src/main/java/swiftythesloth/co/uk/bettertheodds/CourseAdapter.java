package swiftythesloth.co.uk.bettertheodds;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Sam on 21/05/2015.
 */
public class CourseAdapter extends ArrayAdapter<Course> {

    private LayoutInflater mLayoutInflater;

    public CourseAdapter(Context context, ArrayList<Course> courses) {
        super(context, android.R.layout.simple_list_item_2, courses);
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        final View view;
        if (convertView == null) {
            view = mLayoutInflater.inflate(R.layout.layout_course_row, parent, false);
        } else {
            view = convertView;
        }

        final Course course = getItem(position);
        final String name = course.getName();
        final int numRunners = course.getNumRunners();

        ((TextView) view.findViewById(R.id.course_name)).setText(name);
        ((TextView) view.findViewById(R.id.course_num_runners)).setText(Integer.toString(numRunners));

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Horse horse : course.getHorses()) {
                    Toast.makeText(getContext(), "NAME: " + horse.getName() + " AGE: " + Integer.toString(horse.getAge()) + " GENDER: " + horse.getGender() + " RATING: " + Integer.toString(horse.getRating()),Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }

}
