package com.rozkmin.flavorshowcase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.rozkmin.flavorshowcase.di.DaggerMainComponent;
import com.rozkmin.flavorshowcase.di.MainComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    MainComponent mainComponent;

    @Inject
    ImageManager imageManager;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainComponent = DaggerMainComponent.builder().imageManagerModule(new ImageManagerModule()).build();
        mainComponent.inject(this);

        setContentView(R.layout.activity_main);
        loadImage();
        loadFlavorData();
    }

    private void loadFlavorData() {
        TextView text = findViewById(R.id.activity_main_flavor);
        text.setText("Loaded with "+BuildConfig.FLAVOR);
    }

    private void loadImage() {
        imageView = findViewById(R.id.activity_main_image);
        imageManager.loadImage("http://lorempixel.com/1024/1366/cats", imageView, this);
    }
}
