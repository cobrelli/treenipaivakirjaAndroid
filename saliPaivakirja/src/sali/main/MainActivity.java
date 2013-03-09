package sali.main;

//import android.R;
import sali.main.treeniOliot.Treeni;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends Activity {

    public static ArrayAdapter<Treeni> treeniLista;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ListView paasivunLista = (ListView) findViewById(R.id.lista_yleistaen);

        ArrayList treenit = new ArrayList<Treeni>();
        ArrayAdapter aa = new ArrayAdapter<Treeni>(this, R.layout.list_black_text, R.id.list_content, treenit);

        treeniLista = aa;

        paasivunLista.setAdapter(aa);

        paasivunLista.setClickable(true);
        paasivunLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                naytaTreeniTarkemmin(view);
            }
        });

        //täyttää testimielessä ruudun
        for (int i = 0; i < 8; i++) {
            aa.add(new Treeni("Jalat", "6.3.2013"));
        }
    }

    public void siirryLisaysRuutuun(View view) {
        Intent intent = new Intent(this, lisaaUusiTreeni.class);

        startActivity(intent);
    }

    public void naytaTreeniTarkemmin(View view) {
        Intent intent = new Intent(this, TreeniTarkemmin.class);

        startActivity(intent);
    }
}
