import javax.swing.JOptionPane;
/**
 *This program calculates the occupancy rate in a hotel
 * @author chinonsoobidike
 */
public class Rooms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Declare variables
      int floors, rooms = 0, i, vacant, num;
      double rate, occuppied = 0;
      String input;
      
      //Get the number of floors in the hotel
      input = JOptionPane.showInputDialog("How many floors are in this hotel?");
      floors = Integer.parseInt(input);
      
   //iterate to find the number of rooms in each floor and the number of rooms occupied
      while(floors < 1)
      {
       input = JOptionPane.showInputDialog("Please enter a value of 1 or more \n " +
       "How many floors are in this hotel?");
      floors = Integer.parseInt(input);
      }
      for(i = 1; i <= floors; i++)
      {
        input = JOptionPane.showInputDialog("How many rooms are in floor " + i +"?");
        num = Integer.parseInt(input);
           while(num < 10)
           {
             JOptionPane.showMessageDialog(null,"Please enter a value of 10 or more");
             input = JOptionPane.showInputDialog("How many rooms are in floor " + i +"?");
             num = Integer.parseInt(input);
           }
        rooms += num;
        input = JOptionPane.showInputDialog("How many rooms in floor " + i + " are occupied?");
        occuppied += Double.parseDouble(input);
      }
      
    //Calculate the occupancy rate and print outputs
    rate = (occuppied/rooms);
    
    JOptionPane.showMessageDialog(null, "The number of rooms in this hotel is " + rooms +
    "\n The number of rooms occupied is " + occuppied);
    JOptionPane.showMessageDialog(null, String.format("The occupancy rate is %.2f", rate));
   System.exit(0);
   }
}

