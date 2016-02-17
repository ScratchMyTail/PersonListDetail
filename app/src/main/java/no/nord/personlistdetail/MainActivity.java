package no.nord.personlistdetail;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Buliveien 1", "buli@gmail.com", "Nordmann", "Ola", 12345678));
        personList.add(new Person("Buliveien 2", "buli@gmail.com", "Nordmann", "Kari", 12345678));
        personList.add(new Person("Buliveien 3", "buli@gmail.com", "Johansen", "Geir", 12345678));
        personList.add(new Person("Buliveien 4", "buli@gmail.com", "Hansen", "Petter", 12345678));
        personList.add(new Person("Buliveien 5", "buli@gmail.com", "Bakken", "Øystein", 12345678));
        personList.add(new Person("Buliveien 6", "buli@gmail.com", "Bostad", "Rune", 12345678));

        ListView listView = (ListView)findViewById(R.id.listview);
        ListeAdapter adapter = new ListeAdapter(this, R.id.list_item, personList);
        listView.setAdapter(adapter);
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
