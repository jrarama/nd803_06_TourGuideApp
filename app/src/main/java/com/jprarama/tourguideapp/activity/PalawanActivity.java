package com.jprarama.tourguideapp.activity;

import com.jprarama.tourguideapp.R;
import com.jprarama.tourguideapp.model.ArticleItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by joshua on 4/7/16.
 */
public class PalawanActivity extends BaseDetailActivity {
    private static final String TAG = PalawanActivity.class.getName();

    @Override
    public List<ArticleItem> getArticleItems() {
        return new ArrayList<>(Arrays.asList(
                new ArticleItem(getString(R.string.palawan_underground_river_title),
                        R.drawable.palawan_underground_river, getString(R.string.palawan_underground_river_desc)),
                new ArticleItem(getString(R.string.palawan_elnido_title),
                        R.drawable.palawan_elnido, getString(R.string.palawan_elnido_desc)),
                new ArticleItem(getString(R.string.palawan_honda_bay_title),
                        R.drawable.palawan_honda_bay, getString(R.string.palawan_honda_bay_desc))
        ));
    }
}
