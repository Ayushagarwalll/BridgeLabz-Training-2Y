import java.util.Scanner;

public class MovieTicket {
    
    String movieName;
    String seatNumber;
    double price;

    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    public void displayTicket() {
        System.out.println("\n--- Movie Ticket Details ---");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        MovieTicket ticket = new MovieTicket();

         System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter seat number: ");
        String seatNumber = scanner.nextLine();

        System.out.print("Enter ticket price: ");
        double price = scanner.nextDouble();

         ticket.bookTicket(movieName, seatNumber, price);

        ticket.displayTicket();

        scanner.close();
    }
}
