package com.example.sancatour.Adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.sancatour.R;
import com.example.sancatour.modelo.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class Adpter extends ArrayAdapter<Tarefa> {


    private Context context;
    private List<Tarefa> tarefas;



    public  Adpter(Context context, ArrayList<Tarefa> tarefas){

        super(context,0,tarefas);

        this.context = context;
        this.tarefas = tarefas;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listaItem = convertView;

        if(listaItem == null){

            listaItem = LayoutInflater.from(context).inflate(R.layout.layout_list,parent,false);


        }

        Tarefa tarefaAtual = tarefas.get(position);

        TextView nome = listaItem.findViewById(R.id.text_view_nome);
        nome.setText(tarefaAtual.getNome());

        TextView distancia = listaItem.findViewById(R.id.text_view_distancia);
        distancia.setText(tarefaAtual.getDistancia().toString());


        return listaItem;














    }
}
