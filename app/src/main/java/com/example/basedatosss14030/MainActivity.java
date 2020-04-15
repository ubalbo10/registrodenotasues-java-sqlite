package com.example.basedatosss14030;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.basedatosss14030.clases.ControladoraBaseDatos;

public class MainActivity extends ListActivity {

    String[] menu = {"Tabla Alumno", "Tabla Nota", "Tabla Materia", "LLenar Base de Datos"};
    String[] activities = {"AlumnoMenuActivity", "NotaMenuActivity", "MateriaMenuActivity"};
    ControladoraBaseDatos BDhelper;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, menu));
    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        if (position != 3) {

            String nombreValue = activities[position];

            try {
                Class<?>
                        clase = Class.forName("com.example.basedatosss14030." + nombreValue);
                Intent inte = new Intent(this, clase);
                this.startActivity(inte);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }else{
            BDhelper.abrir();
            String tost=BDhelper.llenarBDCarnet();
            BDhelper.cerrar();
            Toast.makeText(this, tost, Toast.LENGTH_SHORT).show();

            //Toast.makeText(this,"llenando la base de datos",Toast.LENGTH_LONG).show();
//CODIGO PARA LLENAR BASE DE DATOS
        }
    }


}


