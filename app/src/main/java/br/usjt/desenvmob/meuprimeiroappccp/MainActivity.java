package br.usjt.desenvmob.meuprimeiroappccp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public static final String MENSSAGEM ="br.usjt.desenvmob.meuprimeiroappccp.menssagem";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        EditText editText = findViewById(R.id.edit_text);
        String menssagem = editText.getText().toString();
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(MENSSAGEM, menssagem);
        startActivity(intent);
    }

}
