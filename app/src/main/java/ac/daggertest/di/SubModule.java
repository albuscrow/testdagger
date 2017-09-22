package ac.daggertest.di;

import android.support.annotation.IntegerRes;

import java.util.Set;

import ac.daggertest.CusScope;
import dagger.*;
import dagger.multibindings.IntoSet;

/**
 * Created by ac on 9/22/17.
 */


@Module
public class SubModule {
    @Provides
    String s() {
        return "provide by sub module";
    }

}
