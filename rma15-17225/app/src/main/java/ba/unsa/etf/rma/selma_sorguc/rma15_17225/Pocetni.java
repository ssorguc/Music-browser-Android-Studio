package ba.unsa.etf.rma.selma_sorguc.rma15_17225;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Pocetni extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    ArrayList<String> unosi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pocetni);

        final Button dugme = (Button) findViewById(R.id.button);
        final EditText text = (EditText) findViewById(R.id.editText);
        final ListView lista = (ListView) findViewById(R.id.listaView);

        adapter=new ArrayAdapter<String>(this,R.layout.element_liste,R.id.Itemname,unosi);
        unosi = new ArrayList<String>();
        lista.setAdapter(adapter);

        dugme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unosi.add(0, text.getText().toString());
                adapter.notifyDataSetChanged();
                text.setText("");
            }
        });
        }

    }
