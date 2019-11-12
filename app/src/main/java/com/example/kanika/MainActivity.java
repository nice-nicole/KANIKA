package com.example.kanika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.ViewSwitcher;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ((ViewSwitcher) findViewById(R.id.switcher)).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ViewSwitcher switcher = (ViewSwitcher) v;

                if (switcher.getDisplayedChild() == 0) {
                    switcher.showNext();
                } else {
                    switcher.showPrevious();
                }
            }
        });
    }

}


