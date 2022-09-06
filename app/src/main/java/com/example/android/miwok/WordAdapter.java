package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    int itemBackgroundColor;
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        /**Check with control flow state there is any ScrabView(object hierarchy of item layout of Recycler View List if yes then store in listViewItem
         * else inflate one java object hierarchy for layout file and store in variable of View class type using LayoutInflater class */
        View listViewItem = convertView;//listViewItem is refer to root ViewGroup or View in convertView or java object hierarchy of Recycler View List item
        //Name is start with list because the View object eventually listViewItem variable is child View of ListView(AdapterView in java) ViewGroup in xml
        if(convertView == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //get data for current word come on screen by its index which is position passed by AdapterView when it come on screen
        Word currentWord = getItem(position);

        //Set the background color of item layout vertical LinearLayout with two TextView
        LinearLayout linearLayoutForWords = (LinearLayout) listViewItem.findViewById(R.id.words_of_item);
        linearLayoutForWords.setBackgroundResource(itemBackgroundColor);

        //TextView which holds miwok translation change with its text with corresponding state in its Word class object in currentWord variable
        TextView miwokTextView = (TextView) listViewItem.findViewById(R.id.miwok_word);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        //TextView which display the default translation of miwok word in list item of Recycler View List
        TextView defaultTextView = (TextView) listViewItem.findViewById(R.id.default_word);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        //ImageView which display image in item layout for Recycler View List
        ImageView imageOfItem = (ImageView) listViewItem.findViewById(R.id.image_of_item);
        /**@param hasImage() method return true only when image resource state of item object of Word class is -1 means there is no image for item that
         *is only true if the item for PhrasesActivity.java Recycler View list*/
        if(currentWord.hasImage()) {
            //set ImageView of item layout src attribute value
            imageOfItem.setImageResource(currentWord.getImageResource());

            //By the way View in layout resource file have default Visibility with View.VISIBLE(0 value) but still we can declared visibility to VISIBLE
            //for any false or error in layout file.
            imageOfItem.setVisibility(View.VISIBLE);
        } else {
            //if there is no image resource for item view object Adapter View called the getView method on which set on that then simply
            //set visibility of ImageView in the item layout resource file of Recycler View list with View.GONE static, final, int , value 8 variable
            //which make imageOfItem ImageView gone from
            // m layout View hierarchy View.INVISIBLE only disappeared the View.
            imageOfItem.setVisibility(View.GONE);
        }

        //return java object hierarchy for Recycler View List item with new data set by Adapter
        //After ListView get the java View object hierarchy of item layout with new data it add that object as child.
        return listViewItem;//listViewItem is refer to the root ViewGroup or View in the item layout java object hierarchy
    }

    public WordAdapter(Context context, ArrayList<Word> words, int listItemBg) {
        //super constructor function of Super class create object of WordAdapter with words ArrayList data source of Word class object which can accessed using
        //getItem(index of object in data source), @param resource is use by ArrayAdapter for TextView but we use custom Adapter so we pass 0
        super(context, 0, words);
        //initialize itemBackgroundColor variable with the item background color of Recycler View List
        itemBackgroundColor = listItemBg;
    }
}
