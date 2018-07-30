/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.thinkopen.repository;

import it.thinkopen.orm.MyUser;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 *
 * @author Utente
 */
@RepositoryRestResource
public interface MyUserRepository extends PagingAndSortingRepository  <MyUser, Integer> {
   @RestResource(path = "login")
   MyUser findByNameAndPassword (@Param("name") String name,
                                 @Param("password") String password);
}


