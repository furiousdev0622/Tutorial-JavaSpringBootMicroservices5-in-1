package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {
	users.add(new User(1, "Lawrence", LocalDate.now().minusYears(30)));
	users.add(new User(2, "Jennie", LocalDate.now().minusYears(25)));
	users.add(new User(3, "Kayden", LocalDate.now().minusYears(10)));
    }

    public List<User> findAll() {
	return users;
    }

    public User findOne(int id) {
	Predicate<? super User> predicate = user -> user.getId() == id;
	return users.stream().filter(predicate).findFirst().get();
    }

}
