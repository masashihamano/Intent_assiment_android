package edu.misao.intent_assiment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name ;
    Button submit ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        name = findViewById( R.id.etName );
        submit = findViewById( R.id.submit );

        submit.setOnClickListener( this );
    }


    @Override
    public void onClick(View view) {

       // String a = name.getText().toString();

        Intent intent = new Intent( MainActivity.this,SecondActivity.class );
        intent.putExtra( "AA","Masa" );
        startActivity( intent );
    }
}
