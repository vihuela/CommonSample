package com.hadlink.commonsample;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * @author Created by lyao on 2015/12/3.
 * @update
 * @description
 */
public class TTextView extends TextView {
    public TTextView(Context context) {
        super(context);
    }

    public TTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.d(getText().toString(), "width " + getMode(MeasureSpec.getMode(widthMeasureSpec)) + " " + MeasureSpec.getSize(widthMeasureSpec));
        Log.d(getText().toString(), "height " + getMode(MeasureSpec.getMode(heightMeasureSpec)) + " " + MeasureSpec.getSize(heightMeasureSpec));

        if (MeasureSpec.getMode(widthMeasureSpec) == MeasureSpec.AT_MOST)
            widthMeasureSpec = MeasureSpec.makeMeasureSpec(250, MeasureSpec.getMode(widthMeasureSpec));
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(250, MeasureSpec.getMode(heightMeasureSpec));

        super.setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
    }

    public String getMode(int i) {
        switch (i) {
            case MeasureSpec.AT_MOST:
                return "AT_MOST";
            case MeasureSpec.EXACTLY:
                return "EXACTLY";
            case MeasureSpec.UNSPECIFIED:
                return "UNSPECIFIED";
        }
        return "";
    }
}
