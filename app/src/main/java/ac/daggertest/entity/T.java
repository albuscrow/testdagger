package ac.daggertest.entity;

import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;

import ac.daggertest.di.PreActivity;
import dagger.multibindings.IntoSet;

/**
 * Created by ac on 4/26/17.
 * todo some describe
 */

@PreActivity
public class T {

    @Inject
    public String string;

    @Inject
    public Set<String> stringSet;

    @Inject
    public T() {
    }

    @Inject
    void init(String s) {
        System.out.println("T.initac!!" + string);
        System.out.println("T.init ac!!!!" + (string == s));
    }
}
