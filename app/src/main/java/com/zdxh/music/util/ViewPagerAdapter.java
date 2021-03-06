package com.zdxh.music.util;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by huangchuzhou on 2016/5/5.
 */
public class ViewPagerAdapter extends PagerAdapter{
    private Context mContext;
    private List<View> views;
    public ViewPagerAdapter(Context context,List<View> views){
        mContext = context;
        this.views = views;
    }
    @Override
    public int getCount() {
        return views.size();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(views.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(views.get(position));
        return views.get(position);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }
}
