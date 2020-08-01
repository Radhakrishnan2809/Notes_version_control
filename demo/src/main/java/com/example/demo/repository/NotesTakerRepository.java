package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.NotesTaker;

@Repository
public interface NotesTakerRepository extends JpaRepository<NotesTaker, Integer> {

	@Modifying
	@Transactional
	@Query(value = "insert into notes_taker(title,description,create_ts,update_ts) values(:title,:description,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)", nativeQuery = true)
	void saveNotes(@Param("title") String title, @Param("description") String description);

	@Modifying
	@Transactional
	@Query(value = "insert into notes_taker(title,description,create_ts,update_ts) values(:title,:description,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)", nativeQuery = true)
	void updateNotes(@Param("title") String title, @Param("description") String description);

}
