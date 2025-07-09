package HW5.main;

import HW5.model.FamilyTree;
import HW5.model.Person;
import HW5.presenter.TreePresenter;
import HW5.service.FileOperationsImpl;
import HW5.view.ConsoleTreeView;

public class Main {
    public static void main(String[] args) {
        FamilyTree<Person> familyTree = new FamilyTree<>();
        ConsoleTreeView view = new ConsoleTreeView();
        FileOperationsImpl<Person> fileOperations = new FileOperationsImpl<>();
        TreePresenter presenter = new TreePresenter(familyTree, view, fileOperations);
        presenter.handleUserInput();
    }
}