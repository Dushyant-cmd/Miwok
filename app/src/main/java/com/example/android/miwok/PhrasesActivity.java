package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        /**ArrayList it is a data structure which store data in the form of object with flexible size in here
         * we store Word class object in ArrayList that holds data for Recycler View List items in activity_phrases.xml */
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinna oyaase'ne"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michekses?"));
        words.add(new Word("i'm feeling good.", "kuchi ahit"));
        words.add(new Word("Are you coming?", "eenes'aa?"));
        words.add(new Word("Yes, i'm coming.", "hee' eenem"));
        words.add(new Word("I'm coming.", "eenem"));
        words.add(new Word("Let's go.", "yoowutis"));
        words.add(new Word("come here.", "anni'nem"));

        /**Instantiation of WordAdapter class object(custom Adapter for Recycler View List in PhrasesActivity layout file using ListView Adapter VIew */
        WordAdapter phrasesAdapter = new WordAdapter(this, words, R.color.category_phrases);

        /**instantiation of ListView class instance by casting of return View type object from layout view hierarchy using findViewById(R.id.phrases_list) */
        ListView phrasesList = (ListView) findViewById(R.id.words_list);
        phrasesList.setAdapter(phrasesAdapter);
    }
}