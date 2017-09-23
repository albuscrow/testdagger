package ac.daggertest;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;
import javax.inject.Named;

import ac.daggertest.di.ActivityComponent;
import ac.daggertest.di.PreActivity;
import ac.daggertest.di.PreApplication;
import ac.daggertest.entity.T;


public class MainActivity extends AppCompatActivity {
    @Named("activity")
    @Inject
    @PreActivity
    String s1;

    @PreApplication
    @Named("application")
    @Inject
    String s2;

    @Inject
    T t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent build = MyApp.INSTANCE.applicationComponent.ActivityComponentBuild().build();
        build.inject(this);

        System.out.println("MainActivity.onCreateac!!" + System.identityHashCode(s1));
        System.out.println("MainActivity.onCreateac!!" + System.identityHashCode(s2));

        build.inject(this);

        System.out.println("MainActivity.onCreateac!!" + System.identityHashCode(s1));
        System.out.println("MainActivity.onCreateac!!" + System.identityHashCode(s2));

        System.out.println("MainActivity.onCreateac!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + t.string);
        for (String s : t.stringSet) {
            System.out.println("MainActivity.onCreateacacac!!" + s);
        }

        startActivity(new Intent(this, AnotherActivity.class));
    }
}
