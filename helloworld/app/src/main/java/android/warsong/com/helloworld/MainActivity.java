package android.warsong.com.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView tv;
    private TextView tv2;

    private Button btn;

    private int i = 0;

    private int j = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        tv = (TextView)findViewById(R.id.tv);
        tv2 = (TextView)findViewById(R.id.tv2);
        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MainActivity.this, BActivity.class);
                startActivity(i);
            }
        });
    }

    protected void onResume() {
        super.onResume();
        i ++;
        tv.setText("activity onResume " + i);
    }

    protected void onPause() {
        super.onPause();
        j -- ;
        tv2.setText("activity onPause " + j);
    }

    protected void onDestory() {
        super.onDestroy();
    }

}
