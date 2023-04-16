package examples.Generics;

class Passione<P> {
    P obj;
    
    Passione(P obj) {
        this.obj = obj;
    }

    public P getObj() {
        return this.obj;
    }
}

class Company<ID, FullName>{
    ID obj;
    FullName obj2;

    Company(ID obj, FullName obj2) {
        this.obj = obj;
        this.obj2 = obj2;
    }

    public ID getId(){
        return this.obj;
    }

    public FullName getFullName(){
        return this.obj2;
    }

}

class Main {
    public static void main(String[] args) {
        Passione<Integer> EmployerID = new Passione<Integer>(001);
        System.out.println(EmployerID.getObj());

        Passione<String> EmployerName = new Passione<String>("Garib Guluzada");
        System.out.println(EmployerName.getObj());

        Company<Integer, String> Employee = new Company(001, "Garib Guluzada");
        System.out.println(Employee.getId() + " " + Employee.getFullName());
    }
}