package de.ykoer.spring.webflow.service;

import de.ykoer.spring.webflow.model.User;
import de.ykoer.spring.webflow.repository.UserInfoRepository;
import de.ykoer.spring.webflow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserInfoRepository userInfoRepository;
	public void save(User user){
		userRepository.save(user);
	}
	
}
