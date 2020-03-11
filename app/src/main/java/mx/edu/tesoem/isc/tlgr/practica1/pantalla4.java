package mx.edu.tesoem.isc.tlgr.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class pantalla4 extends AppCompatActivity {
    TextView resultado;
    String x,y,z;
    double a,b,c,suma,resta,mult,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla4);
        resultado=(TextView) findViewById(R.id.Res);
        Bundle parametro = getIntent().getExtras();
        x=parametro.getString("d");
        y=parametro.getString("e");
        z=parametro.getString("f");
        a=Double.parseDouble(x);
        b=Double.parseDouble(y);
        c=Double.parseDouble(z);
        suma=a+b+c;
        resta=a-b-c;
        mult=a*b*c;
        div=a/b/c;
        resultado.setText("Suma: "+suma+"\nResta: "+resta+"\nMultiplicacion: "+mult+"\nDivision: "+div);
    }
}
