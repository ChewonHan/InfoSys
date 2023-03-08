package com.example.myapplicationpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.javaprograms.R;

import java.util.ArrayList;

// Create a new android studio project with Empty Activity

// TODO 1.1 Put in some images in the drawables folder
// TODO 1.2 Go to activity_main.xml and modify the layout

public class MainActivity extends AppCompatActivity{

    // TODO 1.2 Instance Variables are declared for you, please import the libaries
    ArrayList<Integer> images;
    Button charaButton;
    Button newButton;
    ImageView charaImage;
    ImageView newImage;
    int count = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 1.3 Instantiate And ArrayList object
        images = new ArrayList<Integer>();

        // TODO 1.4 Add the image IDs to the ArrayList
        images = new ArrayList<Integer>();
        images.add(R.drawable.ashketchum);
        images.add(R.drawable.nickwilde);
        images.add(R.drawable.anya);
        images.add(R.drawable.bartsimpson);
        images.add(R.drawable.edogawaconan);
        images.add(R.drawable.judyhopps);
        images.add(R.drawable.nemo);

        // TODO 1.5 Get references to the charaButton and charaImage widgets using findViewById
        charaButton = findViewById(R.id.charaButton);
        charaImage = findViewById(R.id.charaImage);

        // TODO 1.6 For charaButton, invoke the setOnClickListener method
        // TODO 1.7 Create an anonymous class which implements View.OnclickListener interface
        // TODO 1.8 Within onClick, write code to randomly select an image ID from the ArrayList and display it in the ImageView
        charaButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int index = (count) % images.size();
                        count += 1;

                        int id = images.get(index);
                        charaImage.setImageResource(id);
                    }
                }
        );


        // TODO 1.9 [On you own] Create another button, which when clicked, will cause one image to always be displayed
        newButton = findViewById(R.id.newButton);
        newImage = findViewById(R.id.newImage);

        newButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        charaImage.setImageResource(images.get(2));
                    }
                }
        );

    }
}