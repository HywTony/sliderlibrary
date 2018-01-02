package com.daimajia.slider.library.Tricks;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * A {@link ViewPager} that allows pseudo-infinite paging with a wrap-around effect. Should be used with an {@link
 * InfinitePagerAdapter}.
 */
public class InfiniteViewPager extends ViewPagerEx {
    /**
     * 是否可以左右滑动拖拽 by huangyouwei 2015.3.24
     */
    private boolean mIsCanDrag = true;

    public InfiniteViewPager(Context context) {
        super(context);
    }

    public InfiniteViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setAdapter(PagerAdapter adapter) {
        super.setAdapter(adapter);
    }
    @Override
    public boolean onTouchEvent(MotionEvent arg0) {
        if (mIsCanDrag)
            return super.onTouchEvent(arg0);
        else
            return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent arg0) {
        if (mIsCanDrag)
            return super.onInterceptTouchEvent(arg0);
        else
            return false;
    }

//    @Override
//    public boolean onInterceptTouchEvent(MotionEvent ev) {
//        int action = ev.getAction();
//        switch (action) {
//            case MotionEvent.ACTION_DOWN:
//                if (!mIsCanDrag){
//                    return true;
//                }
//        }
//        return super.onInterceptTouchEvent(ev);
//    }
    public void setIsCanDrag(boolean isCanDrag) {
        this.mIsCanDrag = isCanDrag;
    }
}