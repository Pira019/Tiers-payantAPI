package ania.projects.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ania.projects.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {

	
}
