package com.example.android.miwok;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    //This method override same name method in AppCompatActivity and create layout on screen using setContentView(layout resource name using R class created by aapt tool when app compiled)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //send layout to android to inflate java object hierarchy from layout view hierarchy and set content in launched activity when app icon clicked and intent request pass with ACTION for MAIN and category LAUNCHER
        setContentView(R.layout.words_list);

        /**ArrayList<Word> it is a data source for WordAdapter with Word class objects*/
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("red", "wetetti", R.drawable.color_red));
        words.add(new Word("green", "chokokki", R.drawable.color_green));
        words.add(new Word("brown", "takaakki", R.drawable.color_brown));
        words.add(new Word("gray", "topoppi", R.drawable.color_gray));
        words.add(new Word("black", "kululli", R.drawable.color_black));
        words.add(new Word("white", "kelelli", R.drawable.color_white));
        words.add(new Word("dusty yellow", "topiisa", R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow", "chiwiita", R.drawable.color_mustard_yellow));

        /**Instantiation of WordAdapter class object(custom Adapter for Recycler View List in ColorsActivity layout file using ListView Adapter VIew */
        WordAdapter colorsAdapter = new WordAdapter(this, words, R.color.category_colors);

        /**instantiation of ListView class instance by casting of return View type object from layout view hierarchy using findViewById(R.id.colors_list) */
        ListView colorsList = (ListView) findViewById(R.id.words_list);
        colorsList.setAdapter(colorsAdapter);
    }
}