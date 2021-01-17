package geekbrains_homework;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Акакий Акакьевич Акакьев", "Руководитель рабов", "godrabs999@godmail.god", 79999999999l, 1000000, 47);//хахаха, простите))
        workers[1] = new Worker("Афродита Афродитовна Гольцман","Надзиратель","createrofthisprojectiscrazy@mail.ru",78888888888l,244112,22);
        workers[2] = new Worker("Фидот Икотович Переходилкин","Перехватчик икоты","ikotahater@ik.com",79123322255l, 235235, 46);
        workers[3] = new Worker("Александр Родионович Бородач", "Охранник", "ponyatiprostit@mail.ru",78955555555l,22000,39);
        workers[4] = new Worker("Хабар Хабарович Хабаров", "Хабаровчание", "khabarovsk@mail.ru", 79999999999l,1000000,1);

        for (int i =0; i< workers.length; i++)
        {
            if (workers[i].age >=40)
            {
                workers[i].getInfo();
            }
        }
    }
}
