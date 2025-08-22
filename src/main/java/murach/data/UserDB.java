package murach.data;

import murach.business.User;
import java.util.List;
import java.util.ArrayList;

public class UserDB {
    // Giả lập database bằng danh sách tĩnh
    private static final List<User> users = new ArrayList<>();

    // Lưu user vào "database"
    public static void insert(User user) {
        if (user != null) {
            users.add(user);
            System.out.printf("User saved: %s %s (%s)%n",
                    user.getFirstName(),
                    user.getLastName(),
                    user.getEmail());
        }
    }

    // Lấy toàn bộ danh sách user
    public static List<User> getAll() {
        return new ArrayList<>(users); // trả về bản sao để tránh sửa trực tiếp
    }
}
