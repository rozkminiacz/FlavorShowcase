package com.rozkmin.flavorshowcase;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import javax.inject.Inject;

/**
 * Created by jaroslawmichalik on 11.09.2017
 */

public class PicassoImageManager implements ImageManager {

    @Inject PicassoImageManager(){}

    @Override
    public void loadImage(String imageUrl, ImageView target, Context context) {
        Picasso.with(context).load(imageUrl).into(target);
    }
}
