package com.ralph.second;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.baidu.tts.client.SpeechSynthesizer;
import com.baidu.tts.client.TtsMode;

/**
 * Created by ${肖岩} on 2016/6/6.
 */
public class Ex35Activity extends BaseActivity {
    EditText txt;

    SpeechSynthesizer speechSynthesizer;

    @Override
    protected void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.ex35_layout);

        txt = (EditText) findViewById(R.id.txt);
        speechSynthesizer = SpeechSynthesizer.getInstance();
        speechSynthesizer.setContext(this);
        speechSynthesizer.setAppId("8224950");
        speechSynthesizer.setApiKey("fe16sHNH4D2kk7S0iIvNGmwB", "8d574d31505574df0d97fc007ff7fe8f");
        speechSynthesizer.initTts(TtsMode.ONLINE);
    }

    public void playSound(View view)
    {
        speechSynthesizer.speak(txt.getText().toString());
    }
}
