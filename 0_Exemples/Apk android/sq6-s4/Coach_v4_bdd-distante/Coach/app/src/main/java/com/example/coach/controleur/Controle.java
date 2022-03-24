package com.example.coach.controleur;

import android.content.Context;

import com.example.coach.modele.AccesDistant;
import com.example.coach.modele.AccesLocal;
import com.example.coach.modele.Profil;
import com.example.coach.outils.Serializer;
import com.example.coach.vue.MainActivity;

import org.json.JSONArray;

import java.util.Date;

/**
 * Controleur
 */
public final class Controle {

    private static Controle instance = null ;
    private static Profil profil;
    private static String nomFic = "saveprofil";
    private static AccesDistant accesDistant;
    private static Context context;

    /**
     * constructeur privé
     */
    private Controle(){
        super();
    }

    /**
     * récupération de l'instance unique de Controle
     * @return instance
     */
    public static final Controle getInstance(Context context){
        if(Controle.instance == null){
            Controle.instance = new Controle();
            if(context != null) {
                Controle.context = context;
            }
            accesDistant = new AccesDistant();
            accesDistant.envoi("dernier", new JSONArray());
        }
        return Controle.instance;
    }

    /**
     * Création du profil
     * @param poids
     * @param taille en cm
     * @param age
     * @param sexe 1 pour homme, 0 pour femme
     */
    public void creerProfil(Integer poids, Integer taille, Integer age, Integer sexe){
        profil = new Profil(new Date(), poids, taille, age, sexe);
        accesDistant.envoi("enreg", profil.convertToJSONArray());
    }

    /**
     * getter sur l'img du profil
     * @return img
     */
    public float getImg(){
        return profil.getImg();
    }

    /**
     * getter sur le message du profil
     * @return message
     */
    public String getMessage(){
        return profil.getMessage();
    }

    /**
     * getter sur le poids du profil
     * @return poids
     */
    public Integer getPoids(){
        if(profil != null){
            return profil.getPoids();
        }
        return null;
    }

    /**
     * getter sur la taille du profil
     * @return taille
     */
    public Integer getTaille(){
        if(profil != null){
            return profil.getTaille();
        }
        return null;
    }

    /**
     * getter sur l'age du profil
     * @return age
     */
    public Integer getAge(){
        if(profil != null){
            return profil.getAge();
        }
        return null;
    }
    /**
     * getter sur le sexe du profil
     * @return sexe
     */
    public Integer getSexe(){
        if(profil != null){
            return profil.getSexe();
        }
        return null;
    }

    /**
     * récupération du profil sérialisé et affichage des informations
     * @param context
     */
    private static void recupSerialize(Context context){
        profil = (Profil)Serializer.deSerialize(nomFic, context);
    }

    /**
     * setter sur le profil et demande d'affichage du profil
     * @param profil
     */
    public void setProfil(Profil profil){
        Controle.profil = profil;
        ((MainActivity)context).recupProfil();
    }
}
