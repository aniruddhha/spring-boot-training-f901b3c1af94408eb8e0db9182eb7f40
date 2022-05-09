package com.ani.enterprise.service;

import com.ani.enterprise.domain.Mobile;
import com.ani.enterprise.dto.MobileDto;
import com.ani.enterprise.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Locale;

//@Component
@Service // this will perform operations on data
public class MobileServiceImpl implements MobileService {

    @Autowired
    private MobileRepository repository;

    @Override
    public String createInvoice(MobileDto dto) {

        Mobile domain = new Mobile(
                dto.getId(),
                dto.getNumber(),
                dto.getCountry(),
                dto.getIsDualSim()
        );

        repository.save(domain);

        return "success";
    }
}
