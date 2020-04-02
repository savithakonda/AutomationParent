package mypractice;

public class Villa {
    String name;
    int rooms;
    int furniture;
    boolean appartment;

    public void ownvilla(){
        name = "welcome home";
     }
     public static void main(String[] args){
         Villa myhouse1 = new Villa();
         Villa myhouse2 = new Villa();

         myhouse1.name ="dream villa";
         myhouse1.furniture = 5;
         myhouse1.ownvilla();

         myhouse2.name= "Olives";
         myhouse2.rooms=10;
         myhouse2.furniture= 4;
         myhouse2.appartment = false;

         System.out.println("New villa name" + myhouse1.name);
         System.out.println("no of furniture" + myhouse1.furniture);
         System.out.println("second villa " +  myhouse2.name);
         System.out.println("number of rooms"+ myhouse2.rooms);
         System.out.println("furniture"+ myhouse2.furniture);
         System.out.println("appartment" + myhouse2.appartment);



     }




}
