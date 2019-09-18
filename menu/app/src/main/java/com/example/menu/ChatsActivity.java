package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class ChatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);
    }

    //mostrar menu de opciones
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.color2,menu);
        return true;
    }

    //acciones de los botones del menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()) {
            case R.id.op_1:
                Toast.makeText(this, "You've selected option 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.op_2:
                Toast.makeText(this, "You've selected option 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.op_3:
                Toast.makeText(this, "You've selected option 3", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.op_uno:
                Toast.makeText(this, "You've selected suboption 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.op_dos:
                Toast.makeText(this, "You've selected suboption 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.op_tres:
                Toast.makeText(this, "You've selected suboption 3", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }
}
