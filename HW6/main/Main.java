package HW6.main;

import HW6.model.FamilyTree;
import HW6.model.Person;
import HW6.presenter.CommandHandler;
import HW6.presenter.TreePresenter;
import HW6.service.FileOperationsImpl;
import HW6.view.ConsoleTreeView;

public class Main {
    public static void main(String[] args) {
        FamilyTree<Person> familyTree = new FamilyTree<>();
        ConsoleTreeView view = new ConsoleTreeView();
        FileOperationsImpl<Person> fileOperations = new FileOperationsImpl<>();
        TreePresenter presenter = new TreePresenter(familyTree, view, view, view, fileOperations);
        CommandHandler commandHandler = new CommandHandler(presenter, view);
        commandHandler.handleUserInput();
    }
}
