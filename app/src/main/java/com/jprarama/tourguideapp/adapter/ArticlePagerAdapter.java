package com.jprarama.tourguideapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.jprarama.tourguideapp.fragment.ArticleFragment;
import com.jprarama.tourguideapp.model.ArticleItem;

import java.util.List;

/**
 * Created by joshua on 4/7/16.
 */
public class ArticlePagerAdapter extends FragmentPagerAdapter {

    private List<ArticleItem> articleItems;

    public ArticlePagerAdapter(FragmentManager fm, List<ArticleItem> articleItems) {
        super(fm);
        this.articleItems = articleItems;
    }

    @Override
    public Fragment getItem(int position) {
        ArticleFragment fragment = new ArticleFragment();
        fragment.setArticleItem(articleItems.get(position));
        return fragment;
    }

    @Override
    public int getCount() {
        return articleItems.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return articleItems.get(position).getTitle();
    }
}
