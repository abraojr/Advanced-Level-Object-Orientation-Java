package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	 /*A Brazilian car rental company charges an hourly rate for rentals of up to 12 hours. However, if the duration of the rental exceeds 12 hours,
     *the rental will be charged on a daily basis.In addition to the value of the lease, the value of the tax is added to the price according to the
     *rules of the country which, in the case of Brazil, is 20% for values up to 100.00, or 15% for values above 100.00.Make a program that reads the
     *rental data (car model, initial and final instant of the rental), as well as the value per hour and the daily rental value.The program must
     *then generate the payment slip (containing rental value, tax amount and total payment amount) and inform the data on the screen.*/
	
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		System.out.println("Enter rental data:");
		System.out.print("Car model: ");
		String model = sc.nextLine();
		System.out.print("Pickup (dd/MM/yyyy HH:mm): ");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Return (dd/MM/yyyy HH:mm): ");
		Date finish = sdf.parse(sc.nextLine());

		CarRental cr = new CarRental(start, finish, new Vehicle(model));

		System.out.print("Enter price per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter price per day: ");
		double pricePerDay = sc.nextDouble();

		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		rentalService.processInvoice(cr);

		System.out.println("\nINVOICE:");
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

		sc.close();
	}
}