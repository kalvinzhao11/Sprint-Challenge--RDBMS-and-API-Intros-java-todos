package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todos;
import com.lambdaschool.todos.models.User;
import com.lambdaschool.todos.repository.TodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "todosService")
public class TodosServiceImpl implements TodosService{

    @Autowired
    TodosRepository todosRepos;

//    @Transactional
//    @Override
//    public Todos save(Todos todos) {
////        User newUser = new User();
////
////        newUser.setUsername(user.getUsername()
////                .toLowerCase());
////        newUser.setPassword(user.getPassword());
////        newUser.setPrimaryemail(user.getPrimaryemail()
////                .toLowerCase());
////
////        return userrepos.save(newUser);
////
//        Todos newTodo = new Todos();
//        newTodo.setDescription(todos.getDescription());
//        newTodo.setCompleted(todos.getCompleted());
//        return todosRepos.save(newTodo);
//    }

    @Override
    public void markComplete(long todoid) {
        System.out.println("hi 1");
//        System.out.println(todosRepos.findById(todoid));
        Todos todo = todosRepos.findById(todoid)
                .orElseThrow(() -> new EntityNotFoundException("Todo " + todoid + " Not Found"));
        System.out.println(todo);
        System.out.println("hey 2");
        todo.setCompleted(true);
    }
}
