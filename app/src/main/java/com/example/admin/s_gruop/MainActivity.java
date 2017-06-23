package com.example.admin.s_gruop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout manhinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manhinh = (LinearLayout) findViewById(R.id.manhinh);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation);
        animation.reset();
        manhinh.clearAnimation();
        manhinh.setAnimation(animation);

        manhinh.getAnimation();

        Intent mh = new Intent(MainActivity.this, Login.class);
        startActivity(mh);
    }
}
