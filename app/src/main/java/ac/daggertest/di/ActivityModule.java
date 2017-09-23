package ac.daggertest.di;

import javax.inject.Named;

import dagger.*;
import dagger.multibindings.IntoSet;

/**
 * Created by ac on 9/22/17.
 */


@Module
public class ActivityModule {

    @Named("activity")
    @Provides
    @PreActivity
    String s() {
        String s = new String("provide by sub module");
        System.out.println("ac!! ActivityModule.s");
        return s;
    }

    @Provides
    @PreActivity
    @IntoSet
    String s2() {
        return "ttt";
    }

    @Provides
    @PreActivity
    String s3() {
        return "ttt";
    }


}
