package com.example.diego.jsonproject;

import android.renderscript.ScriptGroup;
import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diego on 12/03/2017.
 */

public class Util {


    public static Receita loadUserFromJSONGson(InputStream jsonString) {
       Gson gson = new Gson();
       Receita receita = gson.fromJson(String.valueOf(jsonString),Receita.class);
        return receita;
   }




}
