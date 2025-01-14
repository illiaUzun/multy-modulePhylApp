package com.android.philosophy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater lInflater;
    private ArrayList<GridElement> gridElements;

    ImageAdapter(Context context) {
        mContext = context;
        lInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        gridElements = fillArray(gridElements);
    }

    private ArrayList<GridElement> fillArray(ArrayList<GridElement> gridElements) {
        gridElements = new ArrayList<>();
        gridElements.add(new GridElement(R.drawable.grid_guk, "ОНПУ"));
        gridElements.add(new GridElement(R.drawable.grid_gov, "Мэрия"));
        gridElements.add(new GridElement(R.drawable.grid_kirha, "Лютеранская церковь"));
        gridElements.add(new GridElement(R.drawable.grid_opera, "Оперный"));
        return gridElements;
    }

    @Override
    public int getCount() {
        return gridElements.size();
    }

    @Override
    public Object getItem(int position) {
        return gridElements.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private GridElement getGridElement(int position) {
        return ((GridElement) getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = lInflater.inflate(R.layout.grid_element, parent, false);
        }

        GridElement p = getGridElement(position);
        ((TextView) view.findViewById(R.id.grid_item_text)).setText(p.getName());
        ((ImageView) view.findViewById(R.id.grid_item_image)).setImageResource(p.getImage());

        return view;
    }

}
