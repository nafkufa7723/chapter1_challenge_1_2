
public class Chapter1_Challenge_1_2 {

   public static void main(String[] args) {
        String[] winningNumbers = {
            "12-34-56-78-90",
            "33-44-11-66-22",
            "01-02-03-04-05"
        };

      
        double highestAverage = 0.0;
        String highestTicket = "";

       
        for (String ticket : winningNumbers) {
            System.out.println("Analyzing: " + ticket);

           
            String cleaned = ticket.replace("-", "");

           
            char[] digitsArray = cleaned.toCharArray();

            
            int sum = 0;
            for (char c : digitsArray) {
                sum += Character.getNumericValue(c);
            }

           
            double average = (double) sum / digitsArray.length;

         
            System.out.println("Digit Sum: " + sum + ", Digit Average: " + average);

            
            if (average > highestAverage) {
                highestAverage = average;
                highestTicket = ticket;
            }

            System.out.println(); // Blank line between results
        }

     
        System.out.println("The winning number with the highest average is: " 
                + highestTicket + " with an average of " + highestAverage);
    }
}
   
    

