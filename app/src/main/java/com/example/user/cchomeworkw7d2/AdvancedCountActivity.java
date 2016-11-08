package com.example.user.cchomeworkw7d2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;

/**
 * Created by user on 08/11/2016.
 */

public class AdvancedCountActivity extends AppCompatActivity {

    private TextView mCountDisplayView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_advanced_word_count );

        mCountDisplayView = (TextView) findViewById( R.id.advanced_count_display );

        String output = "";
        String theText = getIntent().getStringExtra( "the_text" );
        HashMap<String, Integer> countData = WordCounter.advancedCountWords( theText );

        for ( String word : countData.keySet() ) {
            int count = countData.get( word );
            output += word + ": " + count + "\n";
        }

        mCountDisplayView.setText( output );
    }
}
