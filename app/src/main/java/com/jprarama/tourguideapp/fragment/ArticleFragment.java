package com.jprarama.tourguideapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jprarama.tourguideapp.R;
import com.jprarama.tourguideapp.model.ArticleItem;

/**
 * Created by joshua on 4/7/16.
 */
public class ArticleFragment extends Fragment {
    private static final String TAG = ArticleFragment.class.getName();

    private TextView tvTitle;
    private ImageView image;
    private TextView tvDescription;

    private ArticleItem articleItem;
    public static final String ARTICLE_KEY = "article";

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putParcelable(ARTICLE_KEY, articleItem);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.w(TAG, "Fragment onCreateView");

        View rootView = inflater.inflate(R.layout.fragment_article, container, false);
        tvTitle = (TextView) rootView.findViewById(R.id.articleTitle);
        image = (ImageView) rootView.findViewById(R.id.articleImage);
        tvDescription = (TextView) rootView.findViewById(R.id.articleDescription);

        if (savedInstanceState != null) {
            articleItem = savedInstanceState.getParcelable(ARTICLE_KEY);
        }

        setArticleItem();
        return rootView;
    }

    private void setArticleItem() {
        Log.w(TAG, "setArticleItem");
        tvTitle.setText(articleItem.getTitle());
        tvDescription.setText(articleItem.getDescription());
        image.setImageResource(articleItem.getImageResourceId());
    }

    public void setArticleItem(ArticleItem articleItem) {
        this.articleItem = articleItem;
    }

}
