public class Person implements Cloneable {
    private String personName;
    private Family family;
    
    public Person (String personName, Family family) {
        setFamily(family);
        setPersonName(personName);
    }
    public String getPersonName() {
        return personName;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    public void setFamily(Family family) {
        this.family = family;
    }
    public Family getFamily() {
        return family;
    }

    // shallow cloning
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // deep cloning
    public Person cloneDeep() throws CloneNotSupportedException {
        Person clonedPerson = (Person) super.clone();
        clonedPerson.setFamily((Family) family.clone());
        return clonedPerson;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Family family = new Family("Jamila", "Akif", 3);
        Person originalPerson = new Person("Ayla", family);

        // shallow cloning
        Person clonedPerson = (Person) originalPerson.clone();
        
        clonedPerson.getFamily().setMotherName("Nargiz");
    
        System.out.println(originalPerson.getFamily().getMotherName()); // names are the same

        // deep cloning
        Person clonedPerson2 = (Person) originalPerson.cloneDeep();

        clonedPerson2.getFamily().setFatherName("Azad");
        originalPerson.getFamily().setFatherName("Jamil");

        System.out.println(clonedPerson2.getFamily().getFatherName());
        System.out.println(originalPerson.getFamily().getFatherName()); // names are different
    }
}

class Family implements Cloneable {
    private String motherName;
    private String fatherName;
    private int familyMemberCount;

    public Family (String motherName, String fatherName, int familyMemberCount) {
        setFamilyMemberCount(familyMemberCount);
        setFatherName(fatherName);
        setMotherName(motherName);
    }
    public String getMotherName() {
        return motherName;
    }
    public String getFatherName() {
        return fatherName;
    }
    public int getFamilyMemberCount() {
        return familyMemberCount;
    }
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public void setFamilyMemberCount(int familyMemberCount) {
        this.familyMemberCount = familyMemberCount;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
