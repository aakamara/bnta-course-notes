import java.util.Scanner;

public class Airport {

    private Scanner scanner;
    private String name;
    private int phoneNumber;
    private int id;

    public Airport(){
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        System.out.println("Enter your name: ");
            String passengerName = scanner.nextLine();

        System.out.println("Enter your phone number: ");
            int passengerNumber = scanner.nextInt();

        System.out.println("Is this correct? " + "Name: " + passengerName + ", " + "Phone No.: " + passengerNumber);
        if(scanner.nextBoolean () == true){
            System.out.println("Thank you, you are booked in!");
        } else {
            System.out.println("Please fix your mistake");
        }

        /*
        public class BookingAgency {
        ArrayList<Flight> flightList = new ArrayList<Flight>();

        public void addFlight(){
                sout("Enter id: ");
                int ID = helper.scan.nextint();

                sout("Enter destination: ");
                Helper.scan.nextLine();

                flightList.add(new Flight(id, destination));

            }
            public void displayFlightList(){
                int index = 1;
                sout(
                    for(Flight flight : flightList){
                        sout(" " + index + "-");
                        flight.DisplayFlightList();index++;
                    }
                )
            }
        }
         */


    }


}
