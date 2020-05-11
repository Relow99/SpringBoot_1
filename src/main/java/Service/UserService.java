package Service;

public interface UserService {
//    void addUser(String name, String surname);

    void removeUser(long Id);

    void addUser(long id, String name, String surname);

    void getUser(long Id);
}
