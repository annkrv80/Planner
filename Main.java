import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Task> listTask = new ArrayList<>();
        System.out.println("Хочешь записать задачу, введи 'yes'");
        Scanner in = new Scanner(System.in);
        String start = "yes";
        start = in.next();
        while (start.equals("yes")) {
            Task task = new Task(null, 0);
            task.enterTask();
            listTask.add(task);
            System.out.println("Ввести еще одну?");
            start = in.next();
        }
        Collections.sort(listTask, new SortPriority());
        System.out.println("Записать данные в таблицу, введи '1', Вывести данные на консоль, введи ' 2'");
        System.out.println("Закончить, введи '3'");
        start = in.next();
        if (start.equals("1")) {
            try (FileWriter writer = new FileWriter("plan.cvs")) {
                int size = listTask.size();
                for (int i = 0; i < size; i++) {
                    String str = listTask.get(i).toString();
                    writer.write(str);
                    if (i < size - 1)
                        writer.write("\n");
                }
                writer.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        } else if (start.equals("2")) {
            try (BufferedReader csvReader = new BufferedReader(new FileReader("plan.cvs"))) {
                String row;
                while ((row = csvReader.readLine()) != null) {
                    String[] data = row.split(",");
                    for (int i = 0; i < data.length; i++) {
                        System.out.println(data[i]);
                    }
                }
                csvReader.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        } else if (start.equals("3")) {
            System.out.println("Хорощего дня");
        } else {
            System.out.println("Ошибка выбора");
        }
    }
}
