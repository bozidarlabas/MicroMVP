package com.bozidar.labas.micromvp.injector;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Bozidar on 05.11.2015..
 */
@Scope
@Retention(RUNTIME)
public @interface ActivityScope {}
