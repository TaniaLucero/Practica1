package mx.edu.tesoem.isc.tlgr.practica1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class pantalla3 extends AppCompatActivity {
    EditText val3;
    String v1,v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);
        Bundle parametros = getIntent().getExtras();
        val3=(EditText) findViewById(R.id.txt3);
        v1=parametros.getString("b");
        v2=parametros.getString("c");
    }

    public void pasarDato(View v){
        Intent pantalla4 = new Intent(this,pantalla4.class);
        pantalla4.putExtra("d",v1);
        pantalla4.putExtra("e",v2);
        pantalla4.putExtra("f",val3.getText().toString());
        startActivity(pantalla4);
        finish();
    }
}
