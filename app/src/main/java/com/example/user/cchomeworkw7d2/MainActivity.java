package com.example.user.cchomeworkw7d2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 08/11/2016.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mTheTextInput;
    private Button mSubmitButtonInput;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTheTextInput = (EditText) findViewById(R.id.the_text);
        mSubmitButtonInput = (Button) findViewById(R.id.submit_button);

        mSubmitButtonInput.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        String theText = mTheTextInput.getText().toString();

        Intent intent = new Intent( this, SimpleCountActivity.class );
        intent.putExtra( "the_text", theText );

        startActivity( intent );
    }
}
