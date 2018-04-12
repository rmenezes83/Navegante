package pa.senac.br.projetonavegante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

import pa.senac.br.projetonavegante.Modelo.Embarcacao;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "EmbarcActivity";
    private EditText destino;
    private List<Embarcacao> minhaLista;
    ListView ListaEmbarc;
    Embarcacao lista;

    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        destino = findViewById(R.id.editDestino);
        iniciarFireBase();
    }

    public void iniciarFireBase() {
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Embarcacao");
    }

    public void buscarDestino(View view) {
        //lista = EmbarcActivity.geraLista();
        myRef.child(lista.getNomeEmbarcacao()).setValue(lista);
        destino.setText(null);
    }
}
