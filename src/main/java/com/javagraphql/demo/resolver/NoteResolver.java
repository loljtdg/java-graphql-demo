package com.javagraphql.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.javagraphql.demo.entity.Note;
import com.javagraphql.demo.entity.User;
import com.javagraphql.demo.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class NoteResolver implements GraphQLResolver<Note> {
    private UserRepo userRepo;

    public User getUser(Note note){
        return userRepo.findById(note.getUserId()).get();
    }
}
