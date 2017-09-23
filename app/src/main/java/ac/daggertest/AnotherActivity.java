package ac.daggertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;
import javax.inject.Named;

import ac.daggertest.di.PreActivity;
import ac.daggertest.di.PreApplication;


public class AnotherActivity extends AppCompatActivity {
    @Named("activity")
    @Inject
    @PreActivity
    String s1;

    @Named("application")
    @Inject
    @PreApplication
    String s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApp.INSTANCE.applicationComponent.ActivityComponentBuild().build().inject(this);

        System.out.println("another.onCreateac!!" + System.identityHashCode(s1));
        System.out.println("another.onCreateac!!" + System.identityHashCode(s2));
    }
}
