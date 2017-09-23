package ac.daggertest.di;

import ac.daggertest.AnotherActivity;
import ac.daggertest.MainActivity;
import dagger.Subcomponent;

/**
 * Created by ac on 9/22/17.
 */

@PreActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);

    void inject(AnotherActivity anotherActivity);

    @Subcomponent.Builder
    interface Builder {
        Builder activityModule(ActivityModule module);
        ActivityComponent build();
    }
}
