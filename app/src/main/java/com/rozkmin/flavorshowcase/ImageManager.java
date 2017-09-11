package com.rozkmin.flavorshowcase;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by jaroslawmichalik on 11.09.2017
 */

public interface ImageManager {
    void loadImage(String imageUrl, ImageView target, Context context);
}
