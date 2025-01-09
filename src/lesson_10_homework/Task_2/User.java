package lesson_10_homework.Task_2;

class User implements Cloneable {
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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public User deepClone() {
        return new User(this.id, this.name,this.surname,  this.email);
    }

    public int getId() {
        return id;
    }
}