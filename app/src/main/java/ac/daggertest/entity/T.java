package ac.daggertest.entity;

import javax.inject.Inject;

/**
 * Created by ac on 4/26/17.
 * todo some describe
 */

public class T {

    public String string;

    @Inject
    public T(String string) {
        this.string = string;
    }
}
