package gt.tx.jefsportafolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    public Toolbar mActionBarToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mActionBarToolbar = (Toolbar) findViewById(R.id.toolbar);
        if (mActionBarToolbar != null) {
            setSupportActionBar(mActionBarToolbar);
//            getSupportActionBar().setHomeButtonEnabled(true);
//            getSupportActionBar().setHomeButtonEnabled(false);
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }else{
        }

        Button firstAppBtn = (Button) findViewById(R.id.firstAppBtn);
        firstAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printMessage("Launch SPOTIFY STREAMER APP");
            }
        });

        Button secondAppBtn = (Button) findViewById(R.id.secondAppBtn);
        secondAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printMessage("Launch SCORES APP");
            }
        });

        Button thirdAppBtn = (Button) findViewById(R.id.thirdAppBtn);
        thirdAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printMessage("Launch LIBRARY APP");
            }
        });

        Button fourthAppBtn = (Button) findViewById(R.id.fourthAppBtn);
        fourthAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printMessage("Launch BUILD IT BETTER APP");
            }
        });

        Button fifthAppBtn = (Button) findViewById(R.id.fifthAppBtn);
        fifthAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printMessage("Launch XYZ READER APP");
            }
        });

        Button sixthAppBtn = (Button) findViewById(R.id.sixthAppBtn);
        sixthAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printMessage("Launch CAPSTONE: MY OWN APP");
            }
        });
    }

    protected void printMessage(String s){
        Toast.makeText(getBaseContext(), s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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
