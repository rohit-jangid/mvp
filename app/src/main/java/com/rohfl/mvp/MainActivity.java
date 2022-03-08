package com.rohfl.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rohfl.mvp.interfaces.Mvp;
import com.rohfl.mvp.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements Mvp.View{

    Mvp.Presenter presenter;
    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter();
        presenter.takeView(this);

        tv = findViewById(R.id.tv);
        tv.setVisibility(View.GONE);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(v -> {
            if(tv.getVisibility() == View.VISIBLE) {
                presenter.hideText();
            } else presenter.showText();
        });
    }

    @Override
    public void showText(String s) {
        tv.setText(s);
        tv.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideText() {
        tv.setVisibility(View.GONE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.dropView();
    }
}