package HW4.main;

import HW4.model.FamilyTree;
import HW4.model.Person;
import HW4.service.FileOperations;
import HW4.service.FileOperationsImpl;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FamilyTree<Person> familyTree = new FamilyTree<>();
        // Создаем людей
        Person john = new Person("John", 1950);
        Person mary = new Person("Mary", 1955);
        Person susan = new Person("Susan", 1980);
        // Устанавливаем родительские связи
        susan.setMother(mary);
        susan.setFather(john);
        john.addChild(susan);
        mary.addChild(susan);
        // Добавляем людей в древо
        familyTree.addMember(john);
        familyTree.addMember(mary);
        familyTree.addMember(susan);
        // Сортируем по имени
        System.out.println("Сортировка по имени:");
        familyTree.sortByName();
        for (Person person : familyTree) {
            System.out.println(person.getName() + " - " + person.getBirthYear());
        }
        // Сортируем по дате рождения
        System.out.println("\nСортировка по дате рождения:");
        familyTree.sortByBirthYear();
        for (Person person : familyTree) {
            System.out.println(person.getName() + " - " + person.getBirthYear());
        }
        // Сохраняем генеалогическое древо в файл
        FileOperations<Person> fileOps = new FileOperationsImpl<>();
        try {
            fileOps.saveToFile(familyTree, "familyTree.dat");
            System.out.println("\nFamily tree saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Загружаем генеалогическое древо из файла
        FamilyTree<Person> loadedFamilyTree = null;
        try {
            loadedFamilyTree = fileOps.loadFromFile("familyTree.dat");
            System.out.println("Family tree loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        // Проверяем, что древо загрузилось правильно
        if (loadedFamilyTree != null) {
            System.out.println("\nLoaded persons:");
            for (Person person : loadedFamilyTree) {
                System.out.println(person.getName() + ", born in " + person.getBirthYear());
            }
        }
    }
}