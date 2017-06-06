package lzm.demos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import com.google.gson.Gson;

import java.io.ObjectStreamException;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gson=new Gson();
        Object o= gson.fromJson("",Object.class);
    }
}
