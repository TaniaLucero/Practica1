package mx.edu.tesoem.isc.tlgr.practica1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class pantalla2 extends AppCompatActivity {
    EditText val2;
    String v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        Bundle parametros = getIntent().getExtras();
        val2=(EditText) findViewById(R.id.txt2);
        v1=parametros.getString("a");
    }

    public void pasarDato(View v){
        Intent pantalla3 = new Intent(this, pantalla3.class);
        pantalla3.putExtra("b",v1);
        pantalla3.putExtra("c",val2.getText().toString());
        startActivity(pantalla3);
        finish();

    }
}
