package com.rohfl.mvp.di;

import com.rohfl.mvp.interfaces.Mvp;
import com.rohfl.mvp.presenter.Presenter;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class PresenterModule {

    @Binds
    public abstract Mvp.Presenter getPresenter(Presenter presenter);

}
