package com.rozkmin.flavorshowcase;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import javax.inject.Inject;

/**
 * Created by jaroslawmichalik on 11.09.2017
 */

public class GlideImageManager implements ImageManager {

    @Inject GlideImageManager(){}

    @Override
    public void loadImage(String imageUrl, ImageView target, Context context) {
        Glide.with(context).load(imageUrl).into(target);
    }
}
