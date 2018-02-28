package br.usjt.desenvmob.meuprimeiroappccp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String menssagem = intent.getStringExtra(MainActivity.MENSSAGEM);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(menssagem);
        ViewGroup layout = findViewById(R.id.activity_display_message);
        layout.addView(textView);

    }


}
