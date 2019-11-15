package com.example.kanika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class UploadActivity extends AppCompatActivity {

    Button chF, upF, postB;
    ImageView img;
    EditText comp, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        chF= (Button) findViewById(R.id.chooseF);
        upF= (Button) findViewById(R.id.uploadImg);
        postB= (Button) findViewById(R.id.postbtn);

        img= (ImageView) findViewById(R.id.sparePartImg);
        comp
    }
}
