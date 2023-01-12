import java.util.Scanner;
import java.util.UUID;

public class Task {
    
    private UUID uuid=UUID.randomUUID();
    private String data;
    private int priority;

    public Task(String data, int priority){
        
        this.data=data;
        this.priority=priority;
    }

    
    public UUID getUuid() {
       return uuid;
   }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    @Override
    public String toString() {
        
        return this.data;
    }

    
   
    void enterTask() {
        Scanner in=new Scanner(System.in);
        System.out.println("Опишите задачу");
        String t=in.nextLine();
        this.data=t;
        System.out.println("Код приоритете 1-низкий,2-средний,3-высокий");
        int p=in.nextInt();
        if(0<p && p<4){
        this.priority=p;        
        } else{
        System.out.println("Введите число от 1 до 3");
        }                       
    }
    
}
    

