package core;

class DeadlineTask extends Task {
    private String deadline;

    public DeadlineTask(String title, String description, String creationDate, String deadline) {
        super(title, description, creationDate);
        this.deadline = deadline;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}

