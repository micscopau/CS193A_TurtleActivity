package paulygon.turtleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import stanford.androidlib.SimpleActivity;

public class TurtleActivity extends SimpleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turtle);
    }

    public void radioClick(View view) {
        int id = view.getId();
        ImageView img = (ImageView) findViewById(R.id.turtle_image); //img = $(R.id.turtle_image); //Using stanford library

/*
        // SWITCH STATEMENTS DON'T WORK for this type of check. Refer to:  http://tools.android.com/tips/non-constant-fields
        switch (id) {
        //switch(view.getId()){

            case R.id.mike_button:
                img.setImageResource(R.drawable.michaelangelo);

            case R.id.leo_button:
                img.setImageResource(R.drawable.leonardo);

            case R.id.don_button:
                img.setImageResource(R.drawable.donatello);

            case R.id.raph_button:
                img.setImageResource(R.drawable.raphael);

        }*/

        if (id == R.id.mike_button) {
            img.setImageResource(R.drawable.michaelangelo);

        } else if (id == R.id.leo_button){
            img.setImageResource(R.drawable.leonardo);

        } else if (id == R.id.don_button){
            img.setImageResource(R.drawable.donatello);

        } else if (id == R.id.raph_button){
                img.setImageResource(R.drawable.raphael);
        }
    }
}
