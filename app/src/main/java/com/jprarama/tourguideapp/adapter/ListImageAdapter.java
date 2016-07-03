package com.jprarama.tourguideapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jprarama.tourguideapp.R;
import com.jprarama.tourguideapp.model.ListImageItem;

import java.util.List;

/**
 * Created by joshua on 3/7/16.
 */
public class ListImageAdapter extends ArrayAdapter<ListImageItem> {

    private static class ViewHolder {
        ImageView imageView;
        TextView tvDescription;
        ViewGroup viewContainer;
    }

    public ListImageAdapter(Context context, int resource, List<ListImageItem> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListImageItem item = getItem(position);
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_image_list, parent, false);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.listImage);
            viewHolder.tvDescription = (TextView) convertView.findViewById(R.id.listImageTitle);
            viewHolder.viewContainer = (ViewGroup) convertView.findViewById(R.id.listImageLayout);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.imageView.setImageResource(item.getImageResourceId());
        viewHolder.tvDescription.setText(item.getDescription());
        viewHolder.viewContainer.setBackgroundResource(position % 2 == 0 ?
                R.color.colorListEven : R.color.colorListOdd);

        return convertView;
    }
}
