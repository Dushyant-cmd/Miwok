/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        setListeners();
    }

    private void setListeners() {
        //This method to set event listeners is very concise and less time consuming instead of create all
        // new classes.

        //Create object for numbers TextView
        TextView numberTextView = (TextView) findViewById(R.id.numbers);

        //override(@Override) onClick() method of OnClickListener interface by call back
        numberTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentForNumbers = new Intent(getApplicationContext(), NumbersActivity.class);
                startActivity(intentForNumbers);
            }
        });

        //Object for family TextView
        TextView familyTextView = (TextView) findViewById(R.id.family);
        //set click event listener on familyTextView
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentForFamily = new Intent(getApplicationContext(), FamilyActivity.class);
                startActivity(intentForFamily);
            }
        });

        //Object for colors TextView
        TextView colorsTextView = (TextView) findViewById(R.id.colors);
        //set click event listener on colorsTextView
        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentForColors = new Intent(getApplicationContext(), ColorsActivity.class);
                startActivity(intentForColors);
            }
        });

        //Object for phrases TextView
        TextView phrasesTextView = (TextView) findViewById(R.id.phrases);
        //set click event listener on phrasesTextView
        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentForPhrases = new Intent(getApplicationContext(), PhrasesActivity.class);
                startActivity(intentForPhrases);
            }
        });
    }
}
