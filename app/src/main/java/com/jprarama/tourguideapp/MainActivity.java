package com.jprarama.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.jprarama.tourguideapp.adapter.ListImageAdapter;
import com.jprarama.tourguideapp.model.ListImageItem;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.gridView);
        ListImageAdapter adapter = new ListImageAdapter(this, R.layout.item_image_list, getImageList());
        gridView.setAdapter(adapter);
    }

    private List<ListImageItem> getImageList() {
        return Arrays.asList(
                new ListImageItem(R.drawable.baguio, getString(R.string.baguio_city), null),
                new ListImageItem(R.drawable.boracay, getString(R.string.boracay), null),
                new ListImageItem(R.drawable.cebu, getString(R.string.cebu_city), null),
                new ListImageItem(R.drawable.palawan, getString(R.string.palawan), null)
        );
    }
}
