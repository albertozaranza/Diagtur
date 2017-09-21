package br.edu.ifce.diagtur.formularios;

import android.content.Context;
import android.net.ConnectivityManager;

/**
 * Created by Alberto Zaranza on 12/09/2017.
 */

public class InternetConnection {

    public  boolean verificaConexao(Context context) {
        boolean conectado;
        ConnectivityManager conectivtyManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (conectivtyManager.getActiveNetworkInfo() != null
                && conectivtyManager.getActiveNetworkInfo().isAvailable()
                && conectivtyManager.getActiveNetworkInfo().isConnected()) {
            conectado = true;
        } else {
            conectado = false;
        }
        return conectado;
    }

}
