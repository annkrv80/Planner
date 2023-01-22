import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Task> listTask = new ArrayList<>();
        Task task = TaskBuilder.getInstance().priority(3).dateStart(02022023f)
                .descriptionTask("zaplatit nalogi").dateExpiration(10022023f).build();
        Task task2 = TaskBuilder.getInstance().priority(2).dateStart(100032023f).timeStart(1200f)
                .descriptionTask("manikyur").contactPerson("Lena").contactNumber(89515701333l).build();
        Task task3 = TaskBuilder.getInstance().descriptionTask("pozvonit mame").build();
        listTask.add(task);
        listTask.add(task2);
        listTask.add(task3);
        Collections.sort(listTask, new SortPriority());

        String start;
        Scanner in = new Scanner(System.in);
        System.out.println("Записать данные в таблицу, введи '1', Вывести данные на консоль, введи ' 2'");
        start = in.next();
        if (start.equals("1")) {
            WritingToFile wr = new WritingToFile();
            wr.writingToFile(listTask);

        } else if (start.equals("2")) {
            OutputToConsole op = new OutputToConsole();
            op.outputToConcole();

        } else {
            System.out.println("Ошибка выбора");
        }
    }

}
