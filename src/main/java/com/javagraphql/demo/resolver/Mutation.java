package com.javagraphql.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.javagraphql.demo.entity.Note;
import com.javagraphql.demo.entity.User;
import com.javagraphql.demo.model.NoteInput;
import com.javagraphql.demo.model.UserInput;
import com.javagraphql.demo.repo.NoteRepo;
import com.javagraphql.demo.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {
    private UserRepo userRepo;
    private NoteRepo noteRepo;

    public User newUser(UserInput userInput){
        User user = new User();
        user.setUsername(userInput.getUsername());
        user.setPassword(userInput.getPassword());
        user.setName(userInput.getName());
        user.setEmail(userInput.getEmail());
        return userRepo.save(user);
    }
    public User updateUser(Integer id,UserInput userInput){
        User user = new User();
        user.setId(id);
        user.setUsername(userInput.getUsername());
        user.setPassword(userInput.getPassword());
        user.setName(userInput.getName());
        user.setEmail(userInput.getEmail());
        return userRepo.save(user);
    }
    public Boolean deleteUser(Integer id){
        userRepo.deleteById(id);
        return true;
    }

    public Note newNote(NoteInput noteInput){
        Note note = new Note();
        note.setUserId( noteInput.getUserId());
        note.setTitle(noteInput.getTitle());
        note.setContent(noteInput.getContent());
        return noteRepo.save(note);
    }
    public Note updateNote(Integer id,NoteInput noteInput){
        Note note = new Note();
        note.setId(id);
        note.setUserId( noteInput.getUserId());
        note.setTitle(noteInput.getTitle());
        note.setContent(noteInput.getContent());
        return noteRepo.save(note);
    }
    public Boolean deleteNote(Integer id){
        noteRepo.deleteById(id);
        return true;
    }

}
