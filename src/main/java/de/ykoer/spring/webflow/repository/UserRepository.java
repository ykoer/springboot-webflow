package de.ykoer.spring.webflow.repository;

import de.ykoer.spring.webflow.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, String>{
	
}
