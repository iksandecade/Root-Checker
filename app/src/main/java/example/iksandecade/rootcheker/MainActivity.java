package example.iksandecade.rootcheker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import example.iksandecade.libs.RootChecker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(RootChecker.isRooted()){
            Toast.makeText(this, "rooted", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "!rooted", Toast.LENGTH_SHORT).show();
        }

    }
}
