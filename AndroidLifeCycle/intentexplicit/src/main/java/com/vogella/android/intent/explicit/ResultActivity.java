package com.vogella.android.intent.explicit;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        Bundle extras = getIntent().getExtras();
        String inputString = extras.getString("yourkey");
        TextView view = (TextView) findViewById(R.id.displayintentextra);
        view.setText(inputString);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_result, menu);
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

    @Override
    public void finish() {

        // TODO 1 create new Intent
        Intent intent = new Intent();

        // TODO 2 read the data of the EditText field
        // with the id returnValue
        EditText editText= (EditText) findViewById(R.id.returnValue);
        String string = editText.getText().toString();

        // TODO 3 put the text from EditText
        // as String extra into the intent
        // use editText.getText().toString();
        intent.putExtra("returnkey", string);

        // TODO 4 use setResult(RESULT_OK, intent);
        // to return the Intent to the application
        setResult(RESULT_OK, intent);

        super.finish();
    }
}
