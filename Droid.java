public class Droid{
 String name;
int batteryLevel;

public Droid(String droidName){
name = droidName; 
batteryLevel = 100;
}

public void performTask(String task){

System.out.println(name + " is performing task: dancing " + task);
batteryLevel -= 10;
}

public void energyReport(){
System.out.println("batteryLevel");

System.out.println("batteryLevel");
}

public void energyTransfer(){
 System.out.println("batteryLevel");
 
}

public String toString(){
  return "Hello, I’m the droid: " + name;
}

 public static void main(String[] args){
  Droid codey = new Droid("Codey");

  System.out.println(codey);

  codey.performTask("dacing");
  codey.performTask("task");
 
 
  }
}


