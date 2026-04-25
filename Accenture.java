public class Accenture{
      private int id;
      private String name;
      private double percentage;
      
      public void setId(int id){
          this.id=id;
      }
      public void setName(String name){
          this.name=name;
      } 
      public void setPercentage(double percentage){
          this.percentage=percentage;
      }
      
      public int getId(){
          return id;
      }
      public String getName(){
          return name;
      }
      public double getPercentage(){
          return percentage;
      }
      public static void main(String args[]){
          Accenture a=new Accenture();
          a.setId(1);
          a.setName("vishal");
          a.setPercentage(99.2);
          System.out.println("Id"+" "+"name"+" "+"percentage");
          System.out.println(a.getId()+" "+a.getName()+" "+a.getPercentage());
      }
}