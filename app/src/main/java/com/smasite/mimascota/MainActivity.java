package com.smasite.mimascota;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);


        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();

        initializerAdaptor();

    }

    public void initializerAdaptor(){
        MascotaAdaptor adaptor = new MascotaAdaptor(mascotas, this);
        listaMascotas.setAdapter(adaptor);

    }

    public void inicializarListaMascotas(){

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.dog1,"Catty", "1"));
        mascotas.add(new Mascota(R.drawable.dog2,"Hercules", "2"));
        mascotas.add(new Mascota(R.drawable.dog3,"Hachiko", "3"));
        mascotas.add(new Mascota(R.drawable.dog4,"Terry", "4"));
        mascotas.add(new Mascota(R.drawable.dog5,"Canela", "5"));
    }

    public void irFavoritos(View v){
        Intent intent = new Intent(this, Favoritas.class);
        startActivity(intent);
    }
}
