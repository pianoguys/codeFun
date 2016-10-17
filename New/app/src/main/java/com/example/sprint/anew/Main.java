package com.example.sprint.anew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Main extends AppCompatActivity {
    //public Button click;
//    public EditText book;
//    public EditText chapter;
//    public EditText verse;
    public final static String EXTRA_MESSAGE = "gymbandit.org.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText book = (EditText)findViewById(R.id.editText);
        final EditText  chapter = (EditText)findViewById(R.id.editText2);
        final EditText  verse = (EditText)findViewById(R.id.editText3);
        Button share = (Button)findViewById(R.id.blink);

        share.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String textOutPut = book.getText().toString() +" "+ chapter.getText().toString() +
                        ":" + verse.getText().toString();



                Intent  intent = new Intent(Main.this, Activity2.class);
                intent.putExtra(EXTRA_MESSAGE, textOutPut);

                startActivity(intent);


            }
        });

    }
}
