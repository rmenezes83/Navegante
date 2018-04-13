package pa.senac.br.projetonavegante.BaseAdapter;

import pa.senac.br.projetonavegante.Modelo.Embarcacao;
import pa.senac.br.projetonavegante.R;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterEmbarc extends BaseAdapter {

    private final List<Embarcacao> minhaLista;
    private final Activity act;

    public AdapterEmbarc(List<Embarcacao> minhaLista, Activity act) {
        this.minhaLista = minhaLista;
        this.act = act;
    }

    @Override
    public int getCount() {
        return minhaLista.size();
    }

    @Override
    public Object getItem(int position) {
        return minhaLista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater()
                .inflate(R.layout.item_embarcacao, parent, false);
        Embarcacao embarcacao = minhaLista.get(position);

        TextView nome = (TextView)
                view.findViewById(R.id.lista_embarc_personalizada_nome);
        TextView destino = (TextView)
                view.findViewById(R.id.lista_embarc_personalizada_destino);
        TextView empresa = (TextView)
                view.findViewById(R.id.lista_embarc_personalizada_empresa);
        TextView tipo = (TextView)
                view.findViewById(R.id.lista_embarc_personalizada_tipo);
        ImageView imagem = (ImageView)
                view.findViewById(R.id.lista_embarc_personalizada_imagem);

        nome.setText(embarcacao.getNomeEmbarcacao());
        destino.setText(embarcacao.getDestinoEmbarcacao());
        empresa.setText(embarcacao.getEmpresaEmbarcacao());
        tipo.setText(embarcacao.getTipoEmbarcacao());
        imagem.setImageResource(R.drawable.barcarena);
        return view;
    }
}
