package com.example.blackjack;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PantallaInicio extends AppCompatActivity {
    private EditText usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantallainicio);
        usuario = (EditText) findViewById(R.id.user);
    }
    public void irJuego(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        i.putExtra("user", usuario.getText());
    }
}
