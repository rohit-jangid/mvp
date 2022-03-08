package com.rohfl.mvp.presenter;

import com.rohfl.mvp.interfaces.Mvp;

/**
 * Created by Rohit Jangid on 08/03/2022
 */
public class Presenter implements Mvp.Presenter{

    Mvp.View view;

    public Presenter(){};

    @Override
    public void takeView(Mvp.View view) {
        this.view = view;
    }

    @Override
    public void showText() {
        view.showText("Hello World");
    }

    @Override
    public void hideText() {
        view.hideText();
    }

    @Override
    public void dropView() {
        view = null;
    }
}
