package HW6.presenter;

import HW6.view.PresenterView;

public class CommandHandler {
    private TreePresenter presenter;
    private PresenterView view;

    public CommandHandler(TreePresenter presenter, PresenterView view) {
        this.presenter = presenter;
        this.view = view;
    }

    public void handleUserInput() {
        while (true) {
            view.displayMessage("Enter command (add, list, sortByName, sortByBirthYear, save, load, exit):");
            String command = view.getUserInput();
            presenter.handleCommand(command);
        }
    }
}
