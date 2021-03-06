package be.ti.groupe2.projetintegration;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;


public class GestionDuProfil extends Activity implements View.OnClickListener{

    Button accueil;
    Button event;
    Button profil;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_du_profil);

        accueil = (Button) findViewById(R.id.buttonAccueil);
        event = (Button) findViewById(R.id.buttonEvent);
        profil = (Button) findViewById(R.id.buttonProfil);

        accueil.setOnClickListener(this);
        event.setOnClickListener(this);
        profil.setOnClickListener(this);




    }
    public void onClick(View v) {
        if (v == event) {
            setContentView(R.layout.gestion_evenement);
        }
        if (v == profil) {
            setContentView(R.layout.activity_gestion_du_profil);
        }
        if (v == accueil) {
            setContentView(R.layout.accueil);
        }
    }
}