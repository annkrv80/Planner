import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WritingToFile {
    public void writingToFile(List<Task> listTask) {
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
    }

}
