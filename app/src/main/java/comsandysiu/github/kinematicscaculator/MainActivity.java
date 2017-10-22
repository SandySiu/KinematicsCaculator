package comsandysiu.github.kinematicscaculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

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
                EditText ini = (EditText) findViewById(R.id.ini_e);
                double ini_s = Double.parseDouble(ini.getText().toString());
                double ini_f = ini_s / 3.6;
                String ini_s_s= Double.toString(ini_s);
                String ini_f_s= Double.toString(ini_f);
                EditText finalv = (EditText) findViewById(R.id.final_e);
                double final_s = Double.parseDouble(finalv.getText().toString());
                double final_f = final_s / 3.6;
                String final_s_s= Double.toString(final_s);
                String final_f_s= Double.toString(final_f);
                EditText a = (EditText) findViewById(R.id.acceleration_e);
                double a_s = Double.parseDouble(a.getText().toString());
                double a_f = a_s / 3.6;
                String a_s_s= Double.toString(a_s);
                String a_f_s= Double.toString(a_f);
                Intent result = new Intent(MainActivity.this,ResultActivity.class);
                result.putExtra("ini1",ini_s_s);
                result.putExtra("ini2",ini_f_s);
                result.putExtra("final1",final_s_s);
                result.putExtra("final2",final_f_s);
                result.putExtra("a1",a_s_s);
                result.putExtra("a2",a_f_s);
                startActivity(result);
            }
        });
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
            Intent settings = new Intent(this,SettingsActivity.class);
            startActivity(settings);
        }

        return super.onOptionsItemSelected(item);
    }

    }
