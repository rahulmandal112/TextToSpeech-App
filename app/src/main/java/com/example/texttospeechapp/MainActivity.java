package com.example.texttospeechapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button buttonSpeak;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextText);
        buttonSpeak=findViewById(R.id.button);
        textToSpeech=new TextToSpeech(getApplicationContext(), null);
        textToSpeech.setLanguage(Locale.ENGLISH);

        buttonSpeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=editText.getText().toString().trim();
                textToSpeech.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
    }
}