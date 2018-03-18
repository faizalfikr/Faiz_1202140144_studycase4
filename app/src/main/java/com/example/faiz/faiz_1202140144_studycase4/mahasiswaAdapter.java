package com.example.faiz.faiz_1202140144_studycase4;

import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Faiz on 3/18/2018.
 */

public class mahasiswaAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<mahasiswa> listview = new ArrayList<mahasiswa>();
    public mahasiswaAdapter(Context context, List<mahasiswa> listview) {
        this.listview = listview;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        mahasiswa emp = (mahasiswa) getItem(position);
        if (view == null) {
            view = inflater.inflate(R.layout.activity_main, null);
        }
        return view;
    }
    @Override
    public Object getItem(int position) {
        return listview.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public int getCount() {
        return listview.size();
    }

}
