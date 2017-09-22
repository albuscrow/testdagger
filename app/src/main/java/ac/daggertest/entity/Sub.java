package ac.daggertest.entity;

import javax.inject.Inject;

/**
 * Created by ac on 4/26/17.
 * todo some describe
 */

public class Sub extends Base {
    @Inject
    public Integer i;

    @Inject
    Sub() {
    }
}
