package merchant.unopay.techjini.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            findViewById(R.id.button1).setOnClickListener(this);
            findViewById(R.id.button2).setOnClickListener(this);
            findViewById(R.id.button3).setOnClickListener(this);
            findViewById(R.id.button4).setOnClickListener(this);
            findViewById(R.id.button5).setOnClickListener(this);
            findViewById(R.id.button6).setOnClickListener(this);
        }


    @Override
    public void onClick(View v)
        {
            switch (v.getId())
                {
                    case R.id.button1:
                        Toast.makeText(this, "This button will launch my Spotify Streamer app!", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.button2:
                        Toast.makeText(this, "This button will launch my Football Scores app!", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.button3:
                        Toast.makeText(this, "This button will launch my Library app!", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.button4:
                        Toast.makeText(this, "This button will launch my Build it Bigger app!", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.button5:
                        Toast.makeText(this, "This button will launch my XYZ reader app!", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.button6:
                        Toast.makeText(this, "This button will launch my Capstone app!", Toast.LENGTH_LONG).show();
                        break;


                }
        }
}
