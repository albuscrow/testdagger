package ac.daggertest;

import android.app.Application;

import ac.daggertest.di.ApplicationComponent;
import ac.daggertest.di.DaggerApplicationComponent;

/**
 * Created by ac on 9/23/17.
 */

public class MyApp extends Application {
    public static MyApp INSTANCE;
    public ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        applicationComponent = DaggerApplicationComponent.create();
    }


}
