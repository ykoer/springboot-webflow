package de.ykoer.spring.webflow.handler;

import de.ykoer.spring.webflow.model.UserInfo;
import org.springframework.stereotype.Component;

@Component
public class RegisterHandler {
	public UserInfo init(){
		System.out.println("Reg Handler");
		return new UserInfo();
	}
}
