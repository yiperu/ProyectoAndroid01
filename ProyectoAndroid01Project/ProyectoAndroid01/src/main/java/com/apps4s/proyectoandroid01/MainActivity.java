package com.apps4s.proyectoandroid01;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mio = (TextView)findViewById(R.id.textView);
        mio.setBackgroundColor(0x0000FF);
        mio.setText(R.string.htmls);
        //mio.setText("Para que estan los Chofere..");

        Button btn = (Button)findViewById(R.id.boton001);
        btn.setText(R.string.cadenaBoton);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
    
}
