package com.aseem.versatileprogressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;

public class ProgBar extends RelativeLayout {

    private Context mContext;
    private AttributeSet attrs;
    private int styleAttr;
    private ImageView imageView;
    private Drawable imageFile;
    private View view;

    public ProgBar(Context context) {
        super(context);
        initView();
    }

    public ProgBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext=context;
        this.attrs=attrs;
        initView();
    }

    public ProgBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        this.attrs=attrs;
        this.styleAttr=defStyleAttr;
        initView();
    }

    private void initView(){
        this.view = this;
        inflate(mContext, R.layout.progress_bar_layout, this);

        TypedArray arr = mContext.obtainStyledAttributes(attrs, R.styleable.ProgBar, styleAttr,0);

        imageFile = arr.getDrawable(R.styleable.ProgBar_barType);

        imageView = findViewById(R.id.progressImg);

        if (imageFile!=null){
            setProgressVector(imageFile);
        }
        arr.recycle();
    }

    public void setScaleType(ImageView.ScaleType scaleType){
        imageView.setScaleType(scaleType);
    }

    public void setProgressVector(Drawable imageFile){
        Glide
                .with(mContext)
                .load(imageFile)
                .into(imageView);
    }

    public void setHeight(int height){
        imageView.getLayoutParams().height = height;
    }



}
