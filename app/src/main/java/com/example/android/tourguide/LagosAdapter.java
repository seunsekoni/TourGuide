package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ceylonlabs.imageviewpopup.ImagePopup;

import java.util.ArrayList;

public class LagosAdapter extends ArrayAdapter<Tour> {

    private int mBackgroundColor;


    /**
     * Declaring a constructor for the LagosAdapter class
     *
     * @param context         takes in the activity context.
     * @param tour            takes in the arraylist used in prefilling the array adapter.
     * @param backgroundColor sets the background color of the current item.
     */
    public LagosAdapter(Activity context, ArrayList<Tour> tour, int backgroundColor) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, tour);
        mBackgroundColor = backgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get the current position of the the {@link Tour} object
        Tour currentTour = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID text View
        TextView textView = listItemView.findViewById(R.id.list_text);
        textView.setText(currentTour.getmTextDetails());

        ImageView image = listItemView.findViewById(R.id.list_image);
        image.setImageResource(currentTour.getmImageResouceId());

        // pop up image whenever image is being clicked
        final ImagePopup popupImage = new ImagePopup(getContext());
        popupImage.initiatePopup(image.getDrawable());

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupImage.viewPopup();
            }
        });

        // find the textcontainer of the current textview
        View textContainer = listItemView.findViewById(R.id.list_text);

        // Find the color that the resource id maps to
        int color = ContextCompat.getColor(getContext(), mBackgroundColor);

        //fill each text container with its corresponding colors
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing a TextView and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
