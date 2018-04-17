package pa.senac.br.projetonavegante;

import android.util.Log;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pa.senac.br.projetonavegante.BaseAdapter.AdapterEmbarc;
import pa.senac.br.projetonavegante.Modelo.Embarcacao;

public class EmbarcActivity extends AppCompatActivity {

    private static final String TAG = "EmbarcActivity";
    private List<Embarcacao> minhaLista;
    ListView ListaEmbarc;
    Embarcacao lista;

    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embarc);
        ListaEmbarc = findViewById(R.id.lista_embarc);

        iniciarFireBase();
        getLista();

    }

    public void iniciarFireBase() {
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Embarcacao");
    }

    public Embarcacao geraLista() {
        lista = new Embarcacao();
        return lista;
    }

    public void getLista() {
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                minhaLista = new ArrayList<>();
                for (DataSnapshot d : dataSnapshot.getChildren()) {
                    lista = d.getValue(Embarcacao.class);
                    minhaLista.add(lista);
                }
                carregaLista();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(TAG, "Failed to read value", databaseError.toException());
            }
        });
    }

    private void carregaLista() {
        AdapterEmbarc adapter = new AdapterEmbarc(minhaLista, this);
        ListaEmbarc.setAdapter(adapter);
    }


}
