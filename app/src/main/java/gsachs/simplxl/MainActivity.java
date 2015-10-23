package gsachs.simplxl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public final static String NUMBERS = "com.mycompany.myfirstapp.NUMBERS";
    public final static String OPERATION = "com.mycompany.myfirstapp.OPERATION";
    public final static String ADD = "com.mycompany.myfirstapp.ADD";
    public final static String AVERAGE = "com.mycompany.myfirstapp.AVERAGE";
    public final static String DIVIDE = "com.mycompany.myfirstapp.DIVIDE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /**
     * Called when the user clicks the Send button
     */
    public void addAllNumbers(View view) {

        System.out.print("Inside addAll");

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(NUMBERS, message);
        intent.putExtra(OPERATION, ADD);
        startActivity(intent);
    }

    /**
     * Called when the user clicks the Send button
     */
    public void findAverageOfNumbers(View view) {

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(NUMBERS, message);
        intent.putExtra(OPERATION, AVERAGE);
        startActivity(intent);

    }


    /**
     * Called when the user clicks the Send button
     */
    public void divideByCount(View view) {

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(NUMBERS, message);
        intent.putExtra(OPERATION, DIVIDE);
        startActivity(intent);
    }

}
