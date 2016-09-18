
package com.yuejiaoliapidemo.app;

import java.util.ArrayList;

import com.yuejiaoliapidemo.R;
import com.yuejiaoliapidemo.R.drawable;
import com.yuejiaoliapidemo.R.id;
import com.yuejiaoliapidemo.R.layout;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class BitmapConcat extends ActionBarActivity {

    private ArrayList<Bitmap> mNumbers;
    private ArrayList<Bitmap> mConcatArrayList;
    private ImageView mIv;
    private Bitmap num0;
    private Bitmap num1;
    private Bitmap num2;
    private Bitmap num3;
    private Bitmap num4;
    private Bitmap num5;
    private Bitmap num6;
    private Bitmap num7;
    private Bitmap num8;
    private Bitmap num9;
    private Bitmap dot;
    private Bitmap km;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNumbers = new ArrayList<Bitmap>();
        mConcatArrayList = new ArrayList<Bitmap>();
        load();

        float number = 3.14f;
        ArrayList<Bitmap> numDrawableArrayList = parseNumber(number);

        Bitmap resultBitmap = concat(numDrawableArrayList);
        mIv = (ImageView) findViewById(R.id.imageView1);
        mIv.setImageBitmap(resultBitmap);
    }

    private ArrayList<Bitmap> parseNumber(float number) {
        String distanceStr = String.valueOf(number);
        char[] numbers = distanceStr.toCharArray();
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            char num = numbers[i];
            if (num == '.') {
                j = 10;
            } else {
                j = num - '0';
            }
            mConcatArrayList.add(mNumbers.get(j));
        }
        mConcatArrayList.add(mNumbers.get(11));
        return mConcatArrayList;
    }

    public void load() {
        num0 = BitmapFactory.decodeResource(getResources(), R.drawable.s0_n);
        num1 = BitmapFactory.decodeResource(getResources(), R.drawable.s1_n);
        num2 = BitmapFactory.decodeResource(getResources(), R.drawable.s2_n);
        num3 = BitmapFactory.decodeResource(getResources(), R.drawable.s3_n);
        num4 = BitmapFactory.decodeResource(getResources(), R.drawable.s4_n);
        num5 = BitmapFactory.decodeResource(getResources(), R.drawable.s5_n);
        num6 = BitmapFactory.decodeResource(getResources(), R.drawable.s6_n);
        num7 = BitmapFactory.decodeResource(getResources(), R.drawable.s7_n);
        num8 = BitmapFactory.decodeResource(getResources(), R.drawable.s8_n);
        num9 = BitmapFactory.decodeResource(getResources(), R.drawable.s9_n);
        dot = BitmapFactory.decodeResource(getResources(), R.drawable.s_spot_n);
        km = BitmapFactory.decodeResource(getResources(), R.drawable.km);

        mNumbers.add(num0);
        mNumbers.add(num1);
        mNumbers.add(num2);
        mNumbers.add(num3);
        mNumbers.add(num4);
        mNumbers.add(num5);
        mNumbers.add(num6);
        mNumbers.add(num7);
        mNumbers.add(num8);
        mNumbers.add(num9);
        mNumbers.add(dot);
        mNumbers.add(km);
    }

    private Bitmap concat(ArrayList<Bitmap> bitmaps) {
        int width = 0;
        int height = 0;
        for (int i = 0; i < bitmaps.size(); i++) {
            Bitmap bitmap = bitmaps.get(i);
            width += bitmap.getWidth();
            height = Math.max(height, bitmap.getHeight());
        }
        Bitmap result = Bitmap.createBitmap(width + 35, height, Config.ARGB_8888);
        Canvas canvas = new Canvas(result);

        int totalWidth = 0;
        for (int i = 0; i < bitmaps.size(); i++) {
            Bitmap bitmap = bitmaps.get(i);
            canvas.drawBitmap(bitmap, totalWidth, height - bitmap.getHeight(), null);
            totalWidth += bitmap.getWidth() + 5;
        }
        return result;
    }
}
