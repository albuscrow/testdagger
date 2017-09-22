package ac.daggertest;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Scope;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by ac on 9/22/17.
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface CusScope {
}
