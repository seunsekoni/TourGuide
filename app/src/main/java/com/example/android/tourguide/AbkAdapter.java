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

public class AbkAdapter extends ArrayAdapter<Tour> {

    private int mBackgroundColor;

    public AbkAdapter(@NonNull Activity context, ArrayList<Tour> tour, int backgroundColor) {
        super(context, 0, tour);
        mBackgroundColor = backgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        // if the list_item is null, inflate it with its corresponding texts and images
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // get the position of the item in the array list.
        Tour currentTour = getItem(position);

        // Fill the the textview in the item with its appropriate text details
        TextView textView = listItemView.findViewById(R.id.list_text);
        textView.setText(checkIfEmpty(currentTour.getmTextDetails()));

        // Fill the imageview with its appropriate image
        ImageView images = listItemView.findViewById(R.id.list_image);
        images.setImageResource(currentTour.getmImageResouceId());
        // pop up image whenever image is being clicked
        final ImagePopup popupImage = new ImagePopup(getContext());
        popupImage.initiatePopup(images.getDrawable());

        images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupImage.viewPopup();
            }
        });

        // get the textcontainer id
        // give the text container a background color
        View textContainer = listItemView.findViewById(R.id.list_text);

        int color = ContextCompat.getColor(getContext(), mBackgroundColor);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }

    public String checkIfEmpty(String words) {
        String output = null;
        if (words == "") {
            output = "No Content Available at the moment";
        }
        return output;
    }
}
