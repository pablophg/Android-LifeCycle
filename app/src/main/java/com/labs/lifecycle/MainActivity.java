package com.labs.lifecycle;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {

    private static String LOG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(LOG_TAG + ".onCreate", "Entrando en 'onCreate'");

        setContentView(R.layout.activity_main);

        Button btn_finalizar = (Button) findViewById(R.id.btn_finalizar);
        btn_finalizar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(LOG_TAG + ".onRestart", "Entrando en 'onRestart'");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(LOG_TAG + ".onStop", "Entrando en 'onStop'");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(LOG_TAG + ".onDestroy", "Entrando en 'onDestroy'");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(LOG_TAG + ".onResume", "Entrando en 'onResume'");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(LOG_TAG + ".onPause", "Entrando en 'onPause'");
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
