package geekbrains_homework;

public class Worker {
    private final String fullName;
    private final String post;
    private final String email;
    private final long telephoneNumber;
    private final int salary;
    public final int age;


    public Worker(String fullName, String post, String email, long telephoneNumber, int salary, int age)
    {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;
        getInfo();
    }

    public void getInfo()
    {
        System.out.println("ФИО: "+ fullName+ "Должность: "+post+ "Email: "+email+ "Номер телефона: "+telephoneNumber+"Зарплата: "+salary+"Возраст: "+age);
        System.out.println();
    }


}
