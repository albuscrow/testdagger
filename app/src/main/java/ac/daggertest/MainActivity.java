package ac.daggertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import ac.daggertest.di.DaggerMainComponent;


public class MainActivity extends AppCompatActivity {
    @Inject
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DaggerMainComponent.create().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("MainActivity.onCreateac!!" + s);

    }
}
