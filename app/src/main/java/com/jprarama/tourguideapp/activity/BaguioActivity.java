package com.jprarama.tourguideapp.activity;

import android.util.Log;

import com.jprarama.tourguideapp.R;
import com.jprarama.tourguideapp.model.ArticleItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by joshua on 4/7/16.
 */
public class BaguioActivity extends BaseDetailActivity {
    private static final String TAG = BaguioActivity.class.getName();

    @Override
    public List<ArticleItem> getArticleItems() {
        Log.w(TAG, "BaguioActivity getArticleItems");

        return new ArrayList<>(Arrays.asList(
                new ArticleItem(getString(R.string.baguio_panagbenga_title),
                        R.drawable.baguio_panagbenga, getString(R.string.baguio_panagbenga_desc)),
                new ArticleItem(getString(R.string.baguio_the_mansion_title),
                        R.drawable.baguio_the_mansion, getString(R.string.baguio_the_mansion_desc)),
                new ArticleItem(getString(R.string.baguio_burnham_park_title),
                        R.drawable.baguio_burnham_park, getString(R.string.baguio_burnham_park_desc))
        ));
    }
}
