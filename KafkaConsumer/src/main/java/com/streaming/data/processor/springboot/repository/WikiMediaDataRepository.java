package com.streaming.data.processor.springboot.repository;

import com.streaming.data.processor.springboot.entity.WikiMediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikiMediaDataRepository  extends JpaRepository<WikiMediaData,Long> {

}
