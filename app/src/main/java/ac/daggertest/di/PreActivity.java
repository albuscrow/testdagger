package ac.daggertest.di;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;
import javax.inject.Singleton;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by ac on 9/22/17.
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface PreActivity {
}
