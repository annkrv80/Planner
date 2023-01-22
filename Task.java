
public class Task {
    int priority;
    float dateStart;
    float timeStart;
    String descriptionTask;
    String contactPerson;
    long contactNumber;
    float dateExpiration;

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Задача{" +
                "приоритет выпорления=" + priority + " " +
                "дата начала=" + dateStart + " " +
                "время начала=" + timeStart + " " +
                "описание задачи=" + descriptionTask + " " +
                "контактное лицо=" + contactPerson + " " +
                "контактный телефон=" + contactNumber + " " +
                "дата окончания=" + dateExpiration + " " +
                "}";

    };
}
