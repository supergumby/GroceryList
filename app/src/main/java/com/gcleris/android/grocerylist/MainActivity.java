package com.gcleris.android.grocerylist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listOfItemView;

    ArrayList<Item> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        listOfItemView = (ListView) findViewById(R.id.item_list_view);

        Item i = new Item(1, 5, 1, "Moutarde", false, true, true);
        items.add(i);

        i = new Item(2, 5, 2, "Lait", false, false, true);
        items.add(i);

        i = new Item(3, 5, 3, "Poulet", true, true, false);
        items.add(i);

        i = new Item(4, 2, 4, "Porc", true, false, false);
        items.add(i);

        i = new Item(5, 1, 5, "Steak", false, true, false);
        items.add(i);

        i = new Item(6, 4, 6, "Jus", true, false, true);
        items.add(i);

        i = new Item(7, 1, 7, "Pommes", true, true, true);
        items.add(i);

        i = new Item(8, 3, 8, "Liqueur", true, false, false);
        items.add(i);

        i = new Item(9, 4, 9, "Brochettes de poulet", true, true, false);
        items.add(i);

        i = new Item(10, 2, 10, "Brochettes de porc", true, false, false);
        items.add(i);

        i = new Item(4, 2, 11, "Lait de soya au chocolat", true, true, false);
        items.add(i);

        i = new Item(2, 5, 12, "Lait", false, false, false);
        items.add(i);

        i = new Item(3, 5, 13, "Poulet", true, true, false);
        items.add(i);

        i = new Item(4, 2, 14, "Porc", true, false, false);
        items.add(i);

        i = new Item(5, 1, 15, "Steak", false, true, false);
        items.add(i);

        i = new Item(6, 4, 16, "Jus", true, false, true);
        items.add(i);

        i = new Item(7, 1, 17, "Pommes", true, false, true);
        items.add(i);

        i = new Item(8, 3, 18, "Liqueur", true, false, true);
        items.add(i);

        i = new Item(9, 4, 19, "Brochettes de poulet", true, false, false);
        items.add(i);

        i = new Item(10, 2, 20, "Brochettes de porc", true, false, false);
        items.add(i);

        i = new Item(4, 2, 21, "Lait de soya au chocolat", true, false, false);
        items.add(i);

        ItemViewAdapter itemViewAdapter = new ItemViewAdapter(this, R.layout.list_view_item_row, items);
        listOfItemView.setAdapter(itemViewAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
