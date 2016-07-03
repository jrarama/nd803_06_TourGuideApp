package com.jprarama.tourguideapp.activity;

import com.jprarama.tourguideapp.R;
import com.jprarama.tourguideapp.model.ArticleItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by joshua on 4/7/16.
 */
public class BoracayActivity extends BaseDetailActivity {
    private static final String TAG = BoracayActivity.class.getName();

    @Override
    public List<ArticleItem> getArticleItems() {
        return new ArrayList<>(Arrays.asList(
                new ArticleItem(getString(R.string.boracay_island_title),
                        R.drawable.boracay_island, getString(R.string.boracay_island_desc)),
                new ArticleItem(getString(R.string.boracay_helmet_diving_title),
                        R.drawable.boracay_helmet_diving, getString(R.string.boracay_helmet_diving_desc)),
                new ArticleItem(getString(R.string.boracay_parasailing_title),
                        R.drawable.boracay_parasailing, getString(R.string.boracay_parasailing_desc))
        ));
    }
}
