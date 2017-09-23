package ac.daggertest.di;

import android.app.Application;

import ac.daggertest.MainActivity;
import dagger.Component;

/**
 * Created by ac on 4/26/17.
 * todo some describe
 */

@PreApplication
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    ActivityComponent.Builder ActivityComponentBuild();
}
