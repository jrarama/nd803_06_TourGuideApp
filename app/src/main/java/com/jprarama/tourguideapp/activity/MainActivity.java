package com.jprarama.tourguideapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.jprarama.tourguideapp.R;
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
        final List<ListImageItem> imageItems = getImageList();
        ListImageAdapter adapter = new ListImageAdapter(this, R.layout.item_image_list, imageItems);
        gridView.setAdapter(adapter);

        final Activity activity = this;

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListImageItem item = imageItems.get(position);
                Intent intent = new Intent(activity, item.getTargetActivity());
                activity.startActivity(intent);
            }
        });
    }

    private List<ListImageItem> getImageList() {
        return Arrays.asList(
                new ListImageItem(R.drawable.baguio, getString(R.string.baguio_city), BaguioActivity.class),
                new ListImageItem(R.drawable.boracay, getString(R.string.boracay), BoracayActivity.class),
                new ListImageItem(R.drawable.cebu, getString(R.string.cebu_city), CebuActivity.class),
                new ListImageItem(R.drawable.palawan, getString(R.string.palawan), PalawanActivity.class)
        );
    }
}
