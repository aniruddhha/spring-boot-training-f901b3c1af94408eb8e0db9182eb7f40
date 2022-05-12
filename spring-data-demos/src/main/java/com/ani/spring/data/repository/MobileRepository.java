package com.ani.spring.data.repository;

import com.ani.spring.data.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepository extends JpaRepository<Mobile, Long> {
}
