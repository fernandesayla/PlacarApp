package br.com.fiap.placarapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etTimeCasa;
    private EditText etTimeVisitante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTimeCasa = (EditText) findViewById(R.id.etTimeCasa);
        etTimeVisitante = (EditText) findViewById(R.id.etTimeVisitante);
    }

    public void comecarJogo(View v){
        //Activity GamaActivity = new Activity();

        if (etTimeCasa.getText().toString().isEmpty()){
            Toast.makeText(this, R.string.emptyTimeCasa, Toast.LENGTH_SHORT).show();
            return;
        }
        if (etTimeVisitante.getText().toString().isEmpty()){
            Toast.makeText(this, R.string.emptyTimeVisitante, Toast.LENGTH_SHORT).show();
            return;
        }
        Intent pxTela = new Intent(this, GameActivity.class);
        pxTela.putExtra("TIMEVISITANTE", etTimeVisitante.getText().toString());
        pxTela.putExtra("TIMECASA", etTimeCasa.getText().toString());

        startActivity(pxTela);


    }



}
