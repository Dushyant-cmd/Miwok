package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.os.Bundle;
import android.widget.ListView;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //After every changes in layout with programming set layout on activity using inflating view to object hierarchy
        setContentView(R.layout.words_list);
        //Create ArrayList(class of List interface use to store list of same type(Integer, Boolean, Double or any other class object or non-primitive data type.) objects in
        //Our case type of ArrayList is Word class object which have to state one for miwok and second for default translation.
        ArrayList<Word> numbersList = new ArrayList<>();
        numbersList.add(new Word("one", "lutti", R.drawable.number_one));
        numbersList.add(new Word("two", "otiiko", R.drawable.number_two));
        numbersList.add(new Word("three", "tolooksu", R.drawable.number_three));
        numbersList.add(new Word("four", "oyyisa", R.drawable.number_four));
        numbersList.add(new Word("five", "massokka", R.drawable.number_five));
        numbersList.add(new Word("six", "tammokka", R.drawable.number_six));
        numbersList.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        numbersList.add(new Word("eight", "kawinta", R.drawable.number_eight));
        numbersList.add(new Word("nine", "wo'e", R.drawable.number_nine));
        numbersList.add(new Word("ten", "na'aacha", R.drawable.number_ten));

        //Initialize ArrayAdapter(Adapter that is convert data(words(ArrayList)) to a view(item_layout) object
        /**WordAdapter is custom class use to create custom adapter which inherit ArrayAdapter<Word> and override getView method of ArrayAdapter
         * and give instruction to convert data for corresponding view object(position) return view object hierarchy root element and
         * this is custom adapter (WordAdapter) class which set to AdapterView(ListView, GridView, etc.) which called getView method with 3 input parameter
         * on the Adapter that is set on that using setAdapter(here is Adapter of ListAdapter type) position of View that come on-screen of int type
         * currentView view object of which list item goes off-screen also called as ScrabView of View type, parent ViewGroup for inflation of each item in Recycler View List that is displayed in AdapterView*/
        WordAdapter numbersAdapter = new WordAdapter(this, numbersList, R.color.category_numbers);

        //Create object for ListView(that implements the recycle views method(keep tracks of every views(item) on,off screen calling getView() method
        //of Adapter that is set to ListView with position of view that come on screen and scrab views if any. when list items goes off screen
        //store them in scrab views
        ListView numbersListView = (ListView) findViewById(R.id.words_list);
        //Set adapter(ArrayAdapter) to an ListView to convert each word from words data source to an view object or item of list
        numbersListView.setAdapter(numbersAdapter);
    }
}
