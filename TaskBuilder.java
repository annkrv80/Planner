public class TaskBuilder {
    private static TaskBuilder instance;
    Task obj;

    private TaskBuilder() {

    }

    public static TaskBuilder getInstance() {
        if (instance == null)
            instance = new TaskBuilder();
        instance.obj = new Task();

        return instance;
    }

    public TaskBuilder priority(int priority) {
        obj.priority = priority;
        return this;
    }

    public TaskBuilder dateStart(float dateStart) {
        obj.dateStart = dateStart;
        return this;
    }

    public TaskBuilder timeStart(float timeStart) {
        obj.timeStart = timeStart;
        return this;
    }

    public TaskBuilder descriptionTask(String descriptionTask) {
        obj.descriptionTask = descriptionTask;
        return this;
    }

    public TaskBuilder contactPerson(String contactPerson) {
        obj.contactPerson = contactPerson;
        return this;
    }

    public TaskBuilder contactNumber(long contactNumber) {
        obj.contactNumber = contactNumber;
        return this;
    }

    public TaskBuilder dateExpiration(float dateExpiration) {
        obj.dateExpiration = dateExpiration;
        return this;
    }

    public Task build() {
        return obj;
    }

    @Override
    public String toString() {
        return "TaskBuilder{" +
                "obj=" + obj +
                '}';
    }

}
