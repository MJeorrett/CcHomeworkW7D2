package com.example.user.cchomeworkw7d2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 08/11/2016.
 */

public class CountDisplayActivity extends AppCompatActivity {

    private TextView mCountDisplayView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_count_display );

        mCountDisplayView = (TextView) findViewById( R.id.count_display );
        String countText = getIntent().getStringExtra( "count_text" );
        mCountDisplayView.setText( countText );
    }
}
