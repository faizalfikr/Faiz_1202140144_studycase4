package com.example.faiz.faiz_1202140144_studycase4;

import android.os.AsyncTask;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Faiz on 3/18/2018.
 */

public class SimpleAsyncTask extends AsyncTask<Void, Void, String> {

    private TextView mTextView;
    mahasiswaAdapter mAdapter;

    public SimpleAsyncTask(TextView tv) {
        mTextView = tv;
    }

    @Override
    protected String doInBackground(Void... voids) {
        return null;
    }

    protected void onPostExecute(String result) {
        mTextView.setText(result);
    }

}
