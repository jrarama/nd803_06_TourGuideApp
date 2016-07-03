package com.jprarama.tourguideapp.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.jprarama.tourguideapp.R;
import com.jprarama.tourguideapp.adapter.ArticlePagerAdapter;
import com.jprarama.tourguideapp.fragment.ArticleFragment;
import com.jprarama.tourguideapp.model.ArticleItem;

import java.util.List;

/**
 * Created by joshua on 4/7/16.
 */
public abstract class BaseDetailActivity extends AppCompatActivity {

    public static final String ARTICLE_TAG = "article";
    private static final String TAG = BaseDetailActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.w(TAG, "BaseActivity onCreate");
        setContentView(R.layout.activity_article);

        ArticlePagerAdapter adapter = new ArticlePagerAdapter(getSupportFragmentManager(),
                getArticleItems());
        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(adapter);
    }

    public abstract List<ArticleItem> getArticleItems();
}
