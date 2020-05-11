package Service;

import Model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeRepo implements FakeRepoInterface {

    private static List<User> DataBase = new ArrayList<>();

@Override
    public void insertUser(long id, String name, String surname) {
        DataBase.add(new User(id,name,surname));
    }
@Override
    public void findUserById(long id) {
        DataBase.get((int) id);
    }
@Override
    public void deleteUser(long id) {
        DataBase.remove(id);
    }
}
