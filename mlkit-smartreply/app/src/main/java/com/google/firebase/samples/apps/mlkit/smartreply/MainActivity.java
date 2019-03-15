package com.google.firebase.samples.apps.mlkit.smartreply;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.samples.apps.mlkit.smartreply.ui.chat.ChatFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ChatFragment.newInstance())
                    .commitNow();
        }
    }
}