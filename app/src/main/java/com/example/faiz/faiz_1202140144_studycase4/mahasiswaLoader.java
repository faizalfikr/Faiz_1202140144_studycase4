package com.example.faiz.faiz_1202140144_studycase4;

import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

/**
 * Created by Faiz on 3/18/2018.
 */

public class mahasiswaLoader extends AsyncTaskLoader<List<mahasiswa>> {

    public mahasiswaLoader(Context context) {
        super(context);
    }
    @Override
    public List<mahasiswa> loadInBackground() {
        List<mahasiswa> list = new ArrayList<mahasiswa>();
        list.add(new mahasiswa("Brahma"));
        list.add(new mahasiswa("Vishnu"));
        list.add(new mahasiswa("Mahesh"));
        return list;
    }

}
