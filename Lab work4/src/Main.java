public class Main {
    public static void main(String[] args){
        Employee e1= new Employee("nahid",176121,1000.5);
        e1.setName("Alvi");
        e1.setId(221155760);
        e1.setSalary(2000.50);
        e1.age=22;
        System.out.println(e1.getName());
        System.out.println(e1.getId());
        System.out.println(e1.getSalary());
        System.out.println(e1.age);

    }
}