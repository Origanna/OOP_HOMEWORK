package HW5.view;

import HW5.model.Person;
import HW5.presenter.TreePresenter;

import java.util.List;

public interface TreeView {
    void displayMessage(String message);

    void displayPersons(List<Person> persons);

    String getUserInput();

    void setPresenter(TreePresenter presenter);
}