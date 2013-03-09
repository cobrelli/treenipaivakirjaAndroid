/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sali.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import sali.main.treeniOliot.Treeni;

/**
 *
 * @author Cobrelli
 */
public class lisaaUusiTreeni extends Activity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        // ToDo add your GUI initialization code here
        setContentView(R.layout.lisaa_treeni);

        Button talleta = (Button) findViewById(R.id.talletus_nappula_treeni);
        talleta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText pvm = (EditText) findViewById(R.id.paivamaara);
                String paivamaara = pvm.getText().toString();

                EditText tyyppi = (EditText) findViewById(R.id.treenityyppi);
                String treenityyppi = tyyppi.getText().toString();

                if (!paivamaara.isEmpty() && !treenityyppi.isEmpty()) {
                    MainActivity.treeniLista.add(new Treeni(treenityyppi, paivamaara));
                }
            }
        });

    }
}
