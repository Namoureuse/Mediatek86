package com.example.coach.modele;

import android.util.Log;

import com.example.coach.controleur.Controle;
import com.example.coach.outils.AccesHTTP;
import com.example.coach.outils.AsyncResponse;
import com.example.coach.outils.MesOutils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

public class AccesDistant implements AsyncResponse {

    private static final String SERVERADDR = "http://192.168.0.10/coach/serveurcoach.php";
    private Controle controle;

    /**
     * constructeur
     */
    public AccesDistant(){
        controle = Controle.getInstance(null);
    }

    /**
     * retour du serveur distant
     * @param output
     */
    @Override
    public void processFinish(String output) {
        Log.d("serveur", "************" + output);
        String[] message = output.split("%");
        if(message.length > 1){
            if (message[0].equals("enreg")){
                Log.d("enreg", "*********** "+message[1]);
            }else if (message[0].equals(("dernier"))){
                try {
                    JSONObject info = new JSONObject(message[1]);
                    Date dateMesure = MesOutils.convertStringToDate(info.getString("datemesure"),
                            "yyyy-MM-dd hh:mm:ss");
                    Integer poids = info.getInt("poids");
                    Integer taille = info.getInt("taille");
                    Integer age = info.getInt("age");
                    Integer sexe = info.getInt("sexe");
                    Profil profil = new Profil(dateMesure, poids, taille, age, sexe);
                    controle.setProfil(profil);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }else if (message[0].equals("Erreur !")){
                Log.d("erreur", "*********** "+message[1]);
            }
        }
    }

    /**
     * envoi de données vers le serveur distant
     * @param operation
     * @param lesDonneesJSON
     */
    public void envoi(String operation, JSONArray lesDonneesJSON){
        AccesHTTP accesDonnees = new AccesHTTP();
        accesDonnees.delegate = this;
        accesDonnees.addParam("operation", operation);
        accesDonnees.addParam("lesdonnees", lesDonneesJSON.toString());
        accesDonnees.execute(SERVERADDR);
    }
}
