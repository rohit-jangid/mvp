package com.rohfl.mvp.interfaces;

/**
 * Created by Rohit Jangid on 08/03/2022
 */
public interface Mvp {

    interface Presenter {
        void takeView(Mvp.View view);
        void showText();
        void hideText();
        void dropView();
    }

    interface View {
        void showText(String s);
        void hideText();
    }
}
