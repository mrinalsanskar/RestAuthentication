package com.cg.fms.authenticate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.fms.authenticate.entity.UserEntity;

/*
 *  @Repository annotation is used to indicate that the class provides the mechanism for 
 *  storage, retrieval, search, update and delete operation on objects.
 * 
 *  JpaRepository is JPA specific extension of Repository . It contains the full API of CrudRepository and PagingAndSortingRepository.
 *  Java Persistence API (JPA) is one possible approach to ORM. 
 *  Via JPA the developer can map, store, update and retrieve data from relational databases to Java objects and vice versa.
 *  
 *  author sanskar.
 *  
 */
@Repository
public interface LoginDao extends JpaRepository<UserEntity, String> {
	
	/*
	 * @Query is used to define a query that we can execute & its value attribute contains the JPQL or SQL to execute.
	 * This query is for fetching user with their userId & password & is later used for validation purposes.
	 */
	@Query("SELECT p from UserEntity p  where p.userId= :userId AND p.password= :password")
    UserEntity validateUser(Long userId,String password);

	//This query is used for fetching a user of specific userId
	@Query("SELECT p from UserEntity p  where p.userId= :userId")
	UserEntity findByUserId(Long userId);
}

