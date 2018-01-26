package com.mallowtech.youtubesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.YouTubeScopes;
import com.google.common.collect.Lists;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static GoogleAccountCredential credential;
    private static final HttpTransport transport = AndroidHttp.newCompatibleTransport();
    private static final JsonFactory jsonFactory = new GsonFactory();
    public YouTube youtube;
    List<String> scopes = Lists.newArrayList(YouTubeScopes.YOUTUBE_UPLOAD);
    private static String VIDEO_FILE_FORMAT = "video/*";

    static final int REQUEST_GOOGLE_PLAY_SERVICES = 0;
    static final int REQUEST_AUTHORIZATION = 1;
    static final int REQUEST_ACCOUNT_PICKER = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
