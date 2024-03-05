package com.devspring.springbootrest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devspring.springbootrest.model.JobPost;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> { //<class,primary key>

	List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);


}
