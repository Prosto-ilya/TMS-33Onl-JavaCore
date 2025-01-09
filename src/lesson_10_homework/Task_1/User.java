package lesson_10_homework.Task_1;

class User {
    private final int id;
    private final String name;
    private final String surname;
    private final String email;

    public User(int id, String name,String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname=surname;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(id);
        result = result + name.hashCode();
        result = result + email.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return id == user.id && name.equals(user.name) && surname.equals(user.surname)&& email.equals(user.email);
    }


}