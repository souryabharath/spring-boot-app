package com.sample.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.app.model.ApplicationModel;
import com.sample.app.repository.ApplicationRepository;

@Service
@Transactional
public class ApplicationService {

	@Autowired
	private ApplicationRepository repository;
	
	public ApplicationModel getUser(String userName) {
		return repository.findById(userName).get();
	}
	
	public ApplicationModel saveUser(ApplicationModel user) {
		return repository.save(user);
	}
	
	public ApplicationModel updateUser(ApplicationModel user) {
		return repository.save(user);
	}

	public ApplicationModel deleteUser(String userName) {
		final ApplicationModel user = getUser(userName);
		repository.deleteById(userName);
		return user;
	}
}
