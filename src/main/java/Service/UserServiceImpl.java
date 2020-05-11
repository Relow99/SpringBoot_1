   package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class UserServiceImpl implements UserService {

    @Autowired
    FakeRepoInterface fakeRepoInterface;

     @Override
    public void addUser( long id, String name, String surname) {
        fakeRepoInterface.insertUser(id, name,surname);
    }
    @Override
    public void getUser(long id) {
        fakeRepoInterface.findUserById(id);
    }
    @Override
    public void removeUser(long id) {
        fakeRepoInterface.deleteUser(id);
    }
}
