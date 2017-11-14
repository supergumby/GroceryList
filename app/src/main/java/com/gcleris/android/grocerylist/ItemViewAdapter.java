package com.gcleris.android.grocerylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Ghislain on 2017-02-26.
 * "Adapter" pour afficher des items dans la "Listview".
 */

public class ItemViewAdapter extends ArrayAdapter<Item> {

   static class ViewHolderItem {
       TextView tvItemName;
       EditText tvItemQty;
       CheckBox tvItemToBuy;
   }

    ArrayList<Item> items = new ArrayList<>();

    public ItemViewAdapter(Context context, int textViewResourceId, ArrayList<Item> objects) {
        super(context, textViewResourceId, objects);
        items = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolderItem viewHolder;

        if (convertView  == null) {
            //Inflate the layout
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_view_item_row, null);
            viewHolder = new ViewHolderItem();
            viewHolder.tvItemName = (TextView) convertView.findViewById(R.id.textViewItemName);
            viewHolder.tvItemQty = (EditText) convertView.findViewById(R.id.textViewItemQty);
            viewHolder.tvItemToBuy = (CheckBox) convertView.findViewById(R.id.checkboxToBuy);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolderItem) convertView.getTag();
        }

        Item item = getItem(position);

        viewHolder.tvItemName.setText(item.getItemName());
        viewHolder.tvItemQty.setText(String.valueOf(item.getQty()));
        viewHolder.tvItemToBuy.setChecked(item.getItemToBuy());

        return convertView;
    }
}
