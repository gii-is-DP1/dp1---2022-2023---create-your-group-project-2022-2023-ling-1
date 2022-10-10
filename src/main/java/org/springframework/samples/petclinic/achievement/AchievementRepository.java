package org.springframework.samples.petclinic.achievement;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;


public interface AchievementRepository  extends Repository<Achievement, String>{

    /**
	 * Save a <code>Visit</code> to the data store, either inserting or updating it.
	 * @param visit the <code>Visit</code> to save
	 * @see BaseEntity#isNew
	 */
	void save(Achievement achievement) throws DataAccessException;

	// List<Visit> findByPetId(Integer petId);



    
    
}
