package ac.daggertest.di;

import android.os.Build;

import ac.daggertest.MainActivity;
import dagger.Subcomponent;

/**
 * Created by ac on 9/22/17.
 */

@Subcomponent(modules = SubModule.class)
public interface SubComponent {
    void inject(MainActivity activity);

    @Subcomponent.Builder
    interface Builder {
        Builder subModule(SubModule module);

        SubComponent build();
    }
}
