package com.rozkmin.flavorshowcase.di;

import com.rozkmin.flavorshowcase.ImageManagerModule;
import com.rozkmin.flavorshowcase.MainActivity;

import dagger.Component;

/**
 * Created by jaroslawmichalik on 11.09.2017
 */
@Component(modules = ImageManagerModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
