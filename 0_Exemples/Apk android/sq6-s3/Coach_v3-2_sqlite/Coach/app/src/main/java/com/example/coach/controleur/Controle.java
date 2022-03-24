package com.example.coach.controleur;

import android.content.Context;

import com.example.coach.modele.AccesLocal;
import com.example.coach.modele.Profil;
import com.example.coach.outils.Serializer;

import java.util.Date;

/**
 * Controleur
 */
public final class Controle {

    private static Controle instance = null ;
    private static Profil profil;
    private static String nomFic = "saveprofil";
    private static AccesLocal accesLocal;

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
            accesLocal = new AccesLocal(context);
            profil = accesLocal.recupDernier();
//            recupSerialize(context);
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
    public void creerProfil(Integer poids, Integer taille, Integer age, Integer sexe, Context context){
        profil = new Profil(new Date(), poids, taille, age, sexe);
//        Serializer.serialize(nomFic, profil, context);
        accesLocal.ajout(profil);
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
}
