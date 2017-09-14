package com.example.devas.lab2;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class Activity_Task5 extends AppCompatActivity {

    float downX,downY;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task5);

       // Toast.makeText(Activity_Task5.this, "In Task2 activity", Toast.LENGTH_SHORT).show();

        final MovieData movieData = new MovieData();
        final int listSize = movieData.getSize();
        final ImageView img = (ImageView)findViewById(R.id.imageView);
        readMovie(0);

        final SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
        seekBar.setMax(100);
        seekBar.setProgress(50);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


                progress = seekBar.getProgress()+100;
                ViewGroup.LayoutParams params = img.getLayoutParams();
                params.width = progress*5;
                params.height = progress*5;
                img.setLayoutParams(params);

            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar.setMax(100);
        img.setOnLongClickListener(new View.OnLongClickListener()
        {
            @Override
            public boolean onLongClick(View view)
            {
                seekBar.setProgress(50);
                return true;
            }
        });

        img.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(Activity_Task5.this, "Image is clicked", Toast.LENGTH_SHORT).show();
                Snackbar snackbar = Snackbar.make(view, "Image is clicked",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });

        findViewById(R.id.activity_task5).setOnTouchListener(new View.OnTouchListener() {
            int i=0;
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        downX = event.getX();
                        downY = event.getY();

                        break;
                    case MotionEvent.ACTION_MOVE:
                        double deltaX = downX - event.getX();
                        double deltaY = downY - event.getY();

                        if (deltaX < 0) {
                            --i;
                            if (i >= 0 && i <= listSize) {

                                readMovie(i);
                            }
                            else
                            {
                                ++i;
                            }
                        }
                            if (deltaX > 0) {
                                ++i;
                                if (i >= 0 && i <= listSize) {

                                    readMovie(i);
                                } else {
                                    --i;
                                }
                            }
                }
                return true;
            }
        });



    }

        private void readMovie(int it)
        {
            final TextView text = (TextView)findViewById(R.id.textView12);
            final TextView text2 = (TextView)findViewById(R.id.textView7);
            final TextView text3 = (TextView)findViewById(R.id.textView8);
            final ImageView img = (ImageView)findViewById(R.id.imageView);

            MovieData movieData = new MovieData();
            text.setText(movieData.getItem(it).get("name").toString());
            text2.setText(movieData.getItem(it).get("overview").toString());
            text3.setText(movieData.getItem(it).get("year").toString());
            img.setImageResource((int) movieData.getItem(it).get("image"));
        }
}