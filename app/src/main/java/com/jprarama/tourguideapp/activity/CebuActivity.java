package com.jprarama.tourguideapp.activity;

import com.jprarama.tourguideapp.R;
import com.jprarama.tourguideapp.model.ArticleItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by joshua on 4/7/16.
 */
public class CebuActivity extends BaseDetailActivity {
    private static final String TAG = CebuActivity.class.getName();

    @Override
    public List<ArticleItem> getArticleItems() {
        return new ArrayList<>(Arrays.asList(
                new ArticleItem(getString(R.string.cebu_island_title),
                        R.drawable.cebu_beach, getString(R.string.cebu_island_desc)),
                new ArticleItem(getString(R.string.cebu_magellans_cross_title),
                        R.drawable.cebu_magellans_cross, getString(R.string.cebu_magellans_cross_desc)),
                new ArticleItem(getString(R.string.cebu_sinulog_title),
                        R.drawable.cebu_sinulog, getString(R.string.cebu_sinulog_desc))
        ));
    }
}
