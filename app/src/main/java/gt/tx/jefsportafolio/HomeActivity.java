package gt.tx.jefsportafolio;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    protected Toolbar mActionBarToolbar;
    protected Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mActionBarToolbar = (Toolbar) findViewById(R.id.toolbar);
        if (mActionBarToolbar != null) {
            setSupportActionBar(mActionBarToolbar);
        }

        final Resources resources = getResources();
        mToast = Toast.makeText(getApplicationContext(), null, Toast.LENGTH_SHORT);

        Button firstAppBtn = (Button) findViewById(R.id.firstAppBtn);
        firstAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printMessage(resources.getString(R.string.launch, resources.getString(R.string.first_app_name)));
            }
        });

        Button secondAppBtn = (Button) findViewById(R.id.secondAppBtn);
        secondAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printMessage(resources.getString(R.string.launch, resources.getString(R.string.second_app_name)));
            }
        });

        Button thirdAppBtn = (Button) findViewById(R.id.thirdAppBtn);
        thirdAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printMessage(resources.getString(R.string.launch, resources.getString(R.string.third_app_name)));
            }
        });

        Button fourthAppBtn = (Button) findViewById(R.id.fourthAppBtn);
        fourthAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printMessage(resources.getString(R.string.launch, resources.getString(R.string.fourth_app_name)));
            }
        });

        Button fifthAppBtn = (Button) findViewById(R.id.fifthAppBtn);
        fifthAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printMessage(resources.getString(R.string.launch, resources.getString(R.string.fifth_app_name)));
            }
        });

        Button sixthAppBtn = (Button) findViewById(R.id.sixthAppBtn);
        sixthAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printMessage(resources.getString(R.string.launch, resources.getString(R.string.sixth_app_name)));
            }
        });
    }

    protected void printMessage(String s){
        mToast.cancel();
//        mToast.setText("Veamos");
//        mToast.setDuration(Toast.LENGTH_SHORT);
        mToast = Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT);
        mToast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_home, menu);
        return false;
    }
}
