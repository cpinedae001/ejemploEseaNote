package com.guatex2.easynotes.repository;
import com.guatex2.easynotes.medel.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
