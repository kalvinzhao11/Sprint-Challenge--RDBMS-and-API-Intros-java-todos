package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todos;
import com.lambdaschool.todos.models.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public interface TodosService
{
//    Todos save(Todos todos);

    void markComplete(long todoid);
}
