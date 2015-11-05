package com.bozidar.labas.micromvp.injector.modules;

import android.content.Context;

import com.bozidar.labas.micromvp.injector.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Bozidar on 06.11.2015..
 */
@Module
public class ActivityModule {
    private final Context context;

    public ActivityModule(Context context) {
        this.context = context;
    }

    @Provides @ActivityScope Context provideActivityContext(){
        return context;
    }
}
