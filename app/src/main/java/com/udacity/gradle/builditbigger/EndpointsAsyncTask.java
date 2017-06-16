package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.example.andjoker.JokeActivity;
import com.example.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

/**
 * Created by i57198 on 6/15/17.
 */

public class EndpointsAsyncTask extends AsyncTask<Context, Void, String> {
    private static MyApi myApiService = null;
    private Context context;

    @Override
    protected String doInBackground(Context... params) {
        if (myApiService == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://build-it-bigger-170823.appspot.com/_ah/api/");
            myApiService = builder.build();
        }

        context = params[0];

        try {
            return myApiService.tellJoke().execute().getJoke();
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {
        Intent intent = new Intent(context, JokeActivity.class);
        intent.putExtra(JokeActivity.INTENT_EXTRA_JOKE, result);
        context.startActivity(intent);
    }
}
