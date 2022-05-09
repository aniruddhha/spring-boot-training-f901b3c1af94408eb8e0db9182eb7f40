package com.ani.enterprise.repository;

import com.ani.enterprise.domain.Mobile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Component
@Repository // this will communicate with datasource
public class MobileRepositoryImpl implements MobileRepository {

    private final List<Mobile> mobiles = new ArrayList<>();

    @Override
    public void save(Mobile mobile) {
        // mobile will be saved to database
        mobiles.add(mobile);
    }
}
