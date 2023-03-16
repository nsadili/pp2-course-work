public class Student {
    private int id;
    private String name;
    private String surname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws StudentNameException {
        if (name == null || name.length() < 2)
            throw new StudentNameException("less than 2 symbols");
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws StudentNameException {
        if (surname == null || surname.length() < 2)
            throw new StudentNameException("less than 2 symbols");
        this.surname = surname;
    }


}

class StudentNameException extends Exception {
    public StudentNameException(String message) {
        super(message);
    }
}
