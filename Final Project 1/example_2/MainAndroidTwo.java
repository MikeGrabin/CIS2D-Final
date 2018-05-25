package com.example.android.java;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FrameLayout mContainer;
    /*Creates app with the onCreate method and using an XML layout passed to
    * the mContainer variable
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContainer = (FrameLayout) findViewById(R.id.frameLayout);
    }

    public void onRunBtnClick(View v) {
    /*The contructor will automatically the circle to the display once onCreate
    * method has been executed
    */
        View circle = new CircleView(this, Color.CYAN);
        mContainer.addView(circle);
    }

    public void displayMessage(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    class CircleView extends View {

        private int color;

        public CircleView(Context context, int color) {
            super(context);
            this.color = color;
        }
        /*User will be able to draw with the canvas object, but the paint class
        * already includes a method, which is returned to the View method for display
        */
        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            int x = getWidth();
            int y = getHeight();

            int radius = 300;

            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.GRAY);
            canvas.drawPaint(paint);

            paint.setColor(color);
            canvas.drawCircle(x / 2, y / 2, radius, paint);
        }
    }

}