public class Student {
    private int id;
    private String name;
    private String surname;

    public Student(int id, String name, String surname) {

        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) throws StudentNameException {
        this.name = name;

        if (name.length() == 0 || name.length() < 2) {
            throw new StudentNameException("This name is not valid!");
        }
    }

    public void setSurname(String surname) throws StudentNameException {
        this.surname = surname;

        if (surname.length() == 0 || surname.length() < 2) {
            throw new StudentNameException("This surname is not valid!");
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


}
