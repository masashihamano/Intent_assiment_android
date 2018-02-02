package edu.misao.intent_assiment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondAction";

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second );

        textView = findViewById( R.id.name2 );




        String b =getIntent().getStringExtra( "AA" );

        textView.setText( b );

    }
}
