package com.example.sancatour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.sancatour.Adpter.Adpter;
import com.example.sancatour.modelo.Tarefa;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {


    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private List<Tarefa> tarefas = new ArrayList<Tarefa>();
    private ArrayAdapter<Tarefa> arrayAdapterTarefa;
    private ListView listView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view);
        conectarBanco();
        leituraBanco();
    }

    private void conectarBanco(){

        FirebaseApp.initializeApp(MainActivity.this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

    }
    private void leituraBanco()
    {
        databaseReference.child("lugares").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                tarefas.clear();
                for(DataSnapshot snapshot: dataSnapshot.getChildren()){

                    Tarefa tarefa = snapshot.getValue(Tarefa.class);
                    tarefas.add(tarefa);


                }

                arrayAdapterTarefa = new Adpter(MainActivity.this,
                        (ArrayList<Tarefa>) tarefas);

                listView.setAdapter(arrayAdapterTarefa);



            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });





    }
    public void salvarDado(View v){







    }
}
