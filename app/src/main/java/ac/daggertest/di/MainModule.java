package ac.daggertest.di;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.inject.Named;
import javax.inject.Singleton;

import ac.daggertest.entity.T;
import dagger.Binds;
import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.Provides;

/**
 * Created by ac on 4/26/17.
 * todo some describe
 */

@Module(subcomponents = SubComponent.class)
class MainModule {
    @Provides
    String provideString() {
        return "provided by main module";
    }
}
