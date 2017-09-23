package ac.daggertest.di;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ac on 4/26/17.
 * todo some describe
 */

@Module(subcomponents = ActivityComponent.class)
class ApplicationModule {
    @PreApplication
    @Provides
    Integer provideInteger() {
        return 100;
    }


    @PreApplication
    @Provides
    @Named("application")
    String provideString() {
        System.out.println("ac!!ApplicationModule.provideString");
        String s = new String("provide by application module");
        return s;
    }
}
