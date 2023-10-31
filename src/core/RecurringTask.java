package core;

class RecurringTask extends Task {
    private String interval;
    private String startDate;

    public RecurringTask(String title, String description, String creationDate, String interval, String startDate) {
        super(title, description, creationDate);
        this.interval = interval;
        this.startDate = startDate;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
