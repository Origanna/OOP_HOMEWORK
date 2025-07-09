package HW7_MA.view;

import java.time.LocalDateTime;
import java.util.List;

import HW7_MA.model.Note;

public interface NotebookView {
    void showNotes(List<Note> notes);

    void showMessage(String message);

    LocalDateTime getDateTimeInput();

    String getDescriptionInput();

    String getFileNameInput();
}