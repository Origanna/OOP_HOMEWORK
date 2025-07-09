package HW6.view;

import HW6.model.Person;
import java.util.List;

public interface TreeView extends MessageView, PersonView, InputView {
    void setPresenter(TreePresenter presenter);
}
