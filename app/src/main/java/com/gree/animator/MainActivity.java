package com.gree.animator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        Animator animator = AnimatorInflater.loadAnimator(this,R.animator.animator);
        animator.setTarget(tv);
        animator.start();

        /*获取 ValueAnimator 在运动时，当前运动点的值*//*
        float curTranslationX = tv.getTranslationX();
        ObjectAnimator animator = ObjectAnimator.ofFloat(tv,"scaleY",1f,5f,1f);
        ObjectAnimator moveIn = ObjectAnimator.ofFloat(tv,"translationX",curTranslationX,-500,curTranslationX);
        AnimatorSet as = new AnimatorSet();
        animator.setRepeatCount(3);

        as.play(animator).with(moveIn);
        as.setDuration(5000);

        as.start();

        as.addListener(new Animator.AnimatorListener()
        {
            @Override
            public void onAnimationStart(Animator animation)
            {
                Log.i("zxx","开始");
            }

            @Override
            public void onAnimationEnd(Animator animation)
            {
                Log.i("zxx","结束");
            }

            @Override
            public void onAnimationCancel(Animator animation)
            {
                Log.i("zxx","取消");
            }

            @Override
            public void onAnimationRepeat(Animator animation)
            {
                Log.i("zxx","重复");
            }
        });*/
    }
}
