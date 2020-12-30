package com.javagraphql.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.javagraphql.demo.entity.Note;
import com.javagraphql.demo.entity.User;
import com.javagraphql.demo.repo.NoteRepo;
import com.javagraphql.demo.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {
    private UserRepo userRepo;
    private NoteRepo noteRepo;

    public List<User> users(){
        return userRepo.findAll();
    }

    public List<Note> notes(){
        return noteRepo.findAll();
    }

}
