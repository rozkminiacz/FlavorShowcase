package com.rozkmin.flavorshowcase;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jaroslawmichalik on 11.09.2017
 */

@Module
public class ImageManagerModule {
    @Provides
    ImageManager provideImageManager(final PicassoImageManager manager){
        return manager;
    }
}
