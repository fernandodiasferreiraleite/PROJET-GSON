package com.example.diego.jsonproject;

/**
 * Created by Administrador on 15/03/2017.
 */

public class Ingredientes {

    private String nome;
    private int qtda;


    public Ingredientes(){}


    public Ingredientes(String nome,int qtda){
        this.nome=nome;
        this.qtda=qtda;

    }
   public String getNome(){return nome;}
    public void setNome(String nome){this.nome=nome;}

    public int getQtda(){return qtda;}
    public void setQtda(int qtda){this.qtda=qtda;}



}







