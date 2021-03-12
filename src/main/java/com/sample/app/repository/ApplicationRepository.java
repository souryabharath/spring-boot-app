package com.sample.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.app.model.ApplicationModel;

@Repository
public interface ApplicationRepository extends CrudRepository<ApplicationModel, String> {

}
