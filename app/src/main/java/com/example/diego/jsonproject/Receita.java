package com.example.diego.jsonproject;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Administrador on 15/03/2017.
 */

public class Receita extends InputStream {


    private String receita;
    private String tempoPreparo;
    private int rendimento;
    private List<Ingredientes> ingredientes;

    public Receita(){}

    @Override
    public int read() throws IOException {
        return 0;
    }


    public Receita(String receita, String tempoPreparo,int rendimento, List<Ingredientes> ingredientes){
        this.ingredientes=ingredientes;
        this.receita=receita;
        this.rendimento=rendimento;
        this.tempoPreparo=tempoPreparo;

    }


    public String getReceita(){return receita;}

    public void setReceita(String receita){this.receita=receita;}

    public int getRendimento(){return rendimento;}

    public void setRendimento(int rendimento){this.rendimento=rendimento;}

    public String getTempoPreparo(){return tempoPreparo;}

    public void setTempoPreparo(String tempoPreparo){this.tempoPreparo=tempoPreparo;}

    public List<Ingredientes>getIngredientes(){return ingredientes;}

    public void setIngredientes(List<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Receita: \n" +
                "receita=" + receita + "\n" +
                "rendimento=" + rendimento + "\n" +
                "ingredientes=" + ingredientes + "\n" +
                "tempoPreparo=" + tempoPreparo;
    }


}
