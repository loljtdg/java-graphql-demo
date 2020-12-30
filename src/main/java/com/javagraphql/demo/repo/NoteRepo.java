package com.javagraphql.demo.repo;

import com.javagraphql.demo.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepo extends JpaRepository<Note,Integer> {

}
