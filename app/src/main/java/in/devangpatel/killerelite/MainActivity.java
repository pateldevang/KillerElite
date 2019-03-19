package in.devangpatel.killerelite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   void doSomething(View view)
    {
        Toast.makeText(MainActivity.this, "Hey, I did something!", Toast.LENGTH_SHORT).show();
    }

}
