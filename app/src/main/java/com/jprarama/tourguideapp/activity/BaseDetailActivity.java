package com.jprarama.tourguideapp.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.jprarama.tourguideapp.R;
import com.jprarama.tourguideapp.adapter.ArticlePagerAdapter;
import com.jprarama.tourguideapp.model.ArticleItem;

import java.util.List;

/**
 * Created by joshua on 4/7/16.
 */
public abstract class BaseDetailActivity extends AppCompatActivity {

    private static final String TAG = BaseDetailActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_article);

        ArticlePagerAdapter adapter = new ArticlePagerAdapter(getSupportFragmentManager(),
                getArticleItems());
        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(adapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public abstract List<ArticleItem> getArticleItems();
}
