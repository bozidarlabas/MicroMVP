package com.bozidar.labas.micromvp.injector.components;

import android.content.Context;

import com.bozidar.labas.micromvp.injector.ActivityScope;
import com.bozidar.labas.micromvp.injector.modules.ActivityModule;

import dagger.Component;

/**
 * Created by Bozidar on 06.11.2015..
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Context context();
}
