package com.example.mediatek86formations.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mediatek86formations.R;
import com.example.mediatek86formations.controleur.Controle;
import com.example.mediatek86formations.modele.Formation;

import java.util.ArrayList;
import java.util.Collections;

public class FormationsActivity extends AppCompatActivity {

    private Controle controle;
    private Button btnFiltrer;
    private EditText txtFiltre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formations);
        init();
    }

    /**
     * initialisations
     */
    private void init(){
        controle = Controle.getInstance();
        btnFiltrer = (Button) findViewById(R.id.btnFiltrer);
        txtFiltre = (EditText) findViewById(R.id.txtFiltre);
        controle.setLesFormations(controle.getLesFormationsCopie());
        ecouteFiltrer();
        creerListe();
    }

    /**
     * création de la liste adapter
     */
    private void creerListe(){
        ArrayList<Formation> lesFormations = controle.getLesFormations();
        if(lesFormations != null){
            Collections.sort(lesFormations, Collections.<Formation>reverseOrder());
            ListView listView = (ListView)findViewById(R.id.lstFormations);
            FormationListAdapter adapter = new FormationListAdapter(lesFormations,FormationsActivity.this);
            listView.setAdapter(adapter);
        }
    }

    /**
     * En cas de clic sur le bouton "filtrer", vérifie si la zone de saisie est vide.
     * Si elle ne l'est pas actualise la liste des formations affichées.
     */
    private void ecouteFiltrer() {
        btnFiltrer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String txt = txtFiltre.getText().toString();
                if(txt.length() > 0) {
                    controle.setLesFormations(controle.getLesFormationFiltre(txt));
                } else {
                    controle.setLesFormations(controle.getLesFormationsCopie());
                }
                creerListe();
            }
        });
    }

}