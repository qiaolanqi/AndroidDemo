
package com.yuejiaoliapidemo.app;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.yuejiaoliapidemo.R;

public class DrawableActivity extends Activity {
    private ImageView mImageView;
    private ImageView mImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable);

        mImageView = (ImageView) findViewById(R.id.imageView1);

        // BitmapDrawable -> Bitmap
        BitmapDrawable drawable = (BitmapDrawable) getResources().getDrawable(R.drawable.ic_favor);
        Bitmap bitmap = drawable.getBitmap();
        mImageView.setImageDrawable(drawable);

        mImageView2 = (ImageView) findViewById(R.id.imageView2);
        ClipDrawable clipDrawable = (ClipDrawable) mImageView2.getDrawable();
        clipDrawable.setLevel(5000);
    }
}
