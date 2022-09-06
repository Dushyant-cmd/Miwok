package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        /**ArrayList data structure to store Word class object which holds data for Recycler View List item
         * in FamilyActivity */
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("father", "apa", R.drawable.family_father));
        words.add(new Word("mother", "ata", R.drawable.family_mother));
        words.add(new Word("son", "angsi", R.drawable.family_son));
        words.add(new Word("daughter", "tune", R.drawable.family_daughter));
        words.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
        words.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother));
        words.add(new Word("older sister", "tete", R.drawable.family_older_sister));
        words.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister));
        words.add(new Word("grandmother", "ama", R.drawable.family_grandmother));
        words.add(new Word("grandfather", "paapa", R.drawable.family_grandfather));

        /**Instantiation of WordAdapter class object(custom Adapter for Recycler View List in FamilyActivity layout file using ListView Adapter VIew */
        WordAdapter familyAdapter = new WordAdapter(this, words, R.color.category_family);

        /**instantiation of ListView class instance by casting of return View type object from layout view hierarchy using findViewById(R.id.family_list) */
        ListView familyList = (ListView) findViewById(R.id.words_list);
        familyList.setAdapter(familyAdapter);
    }
}