package ac.daggertest.di;

import javax.inject.Singleton;

import ac.daggertest.MainActivity;
import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by ac on 4/26/17.
 * todo some describe
 */

@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
    SubComponent provideSubComponent(SubModule subModule);
}
