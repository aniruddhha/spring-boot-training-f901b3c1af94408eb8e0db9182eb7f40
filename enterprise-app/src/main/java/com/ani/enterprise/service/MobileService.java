package com.ani.enterprise.service;

import com.ani.enterprise.dto.MobileDto;

import java.util.List;

public interface MobileService {
    String createMobile(MobileDto dto);

    void removeMobile(Long id);

    //TODO: Complete the architecture along with logic
    List<MobileDto> showAllMobiles();
}
