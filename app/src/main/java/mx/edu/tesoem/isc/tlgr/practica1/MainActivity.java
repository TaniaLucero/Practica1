package mx.edu.tesoem.isc.tlgr.practica1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText val1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val1=(EditText) findViewById(R.id.txt1);
    }

    public void pasarDato(View v){
        Intent pantalla2 = new Intent(this,pantalla2.class);
        pantalla2.putExtra("a",val1.getText().toString());
        startActivity(pantalla2);
        finish();

    }
}
