package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView texview= findViewById(R.id.Id_txt);
        registerForContextMenu(texview);
    }

    //permite mostrar el menu

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.color1,menu);
        menu.setHeaderTitle("::: Select a color :::");
    }

    //acciones de los botones

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.opt_1 :
                Toast.makeText(this, "You've selected yellow color", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opt_2 :
                Toast.makeText(this, "You've selected blue color", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opt_3 :
                Toast.makeText(this, "You've selected red color", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opt_4 :
                Toast.makeText(this, "You've selected green color", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }

    }
}
