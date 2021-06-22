
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String args[])
    {

        car c=new  car();
        c.setCtoy1("Tires ");
        c.setCtoy2("bike seats");
        c.setCtoy3("Braking system");
        c.setCtoyv1(5000);
        c.setCtoyv2(20000);
        c.setCtoyv3(30000);
        c.setcDress1("Suspension and steering systems");
        c.setcDress2("Transmission system");
        c.setcDress1v(4000);
        c.setcDress2v(3000);

        car cdcf = new  car(
                "Engine Replacement",
                "Engine Repair",
                "Engine Performance Check",
                5000.0, 10000.0, 6000.0);

        car cwcf = new  car(
                "Fuel Injection Repair & Service",
                "Fuel System Repair & Maintenance",
                "Engine Oil Changes",
                "Ignition System Repair & Maintenance",
                12000.0, 3530.0, 4730.0, 6030.0);
        car cbcf = new  car(
                "full body paint job",
                "dent paint job",
                "per part paint job",
                25000, 5000f, 4059f
        );
        car cpcf = new  car(
                "Auto Electrical Services",
                "Transmission Services",
                "Exhaust Services",
                "Heating & Air Conditioner Repair",
                15000, 3500, 10500, 5800
        );


        bike d = new bike();
        d.setDtoy1("Tires");
        d.setDtoy2("Car seats");
        d.setDtoy3("Braking system");
        d.setDtoyv1(9000);
        d.setDtoyv2(90000);
        d.setDtoyv3(1000);
        d.setdDress1("Suspension and steering systems");
        d.setdDress2("Air conditioning system (A/C)");
        d.setdDress1v(1850);
        d.setdDress2v(1550);

        bike ddcf = new bike(
                "Engine Replacement",
                "Engine Repair",
                "Engine Performance Check",
                5000.0, 10000.0, 6000.0);

        bike dwcf = new bike(
                "Fuel Injection Repair & Service",
                "Fuel System Repair & Maintenance",
                "Engine Oil Changes",
                "Ignition System Repair & Maintenance",
                12000.0, 3530.0, 4730.0, 6030.0);
        bike dbcf = new bike(
                "full body paint job",
                "dent paint job",
                "per part paint job",
                25000, 5000f, 4059f
        );
        bike dpcf = new bike(
                "Auto Electrical Services",
                "Transmission Services",
                "Exhaust Services",
                "Heating & Air Conditioner Repair",
                15000, 3500, 10500, 5800
        );

        System.out.println("welcome to  vscms ");
        System.out.println("The vehicle service center management system:-\n");
        System.out.println("For which vehicle you want services for");
        boolean done = false;
        loop : while (done == false)
        {
            System.out.println("Please select one:"+
                    "\n\t1.Car services  "+
                    "\n\t2.bike services."+
                    "\n\t3.oil services."+
                    "\n\t4.Checkout");
            Scanner sObj = new Scanner(System.in);
            int i = sObj.nextInt();
            switch(i)
            {

                case 1:
                    System.out.println("What kind of car services would you want ?");
                    System.out.println("Please select one:"+
                            "\n\t1.Engine services."+
                            "\n\t2.oil services."+
                            "\n\t3.paint services"+
                            "\n\t4.other services"+
                            "\n\t5.Available parts"+
                            "\n\t6.Available accessories"+
                            "\n\t7.other services"+
                            "\n\t8.Quit");
                    System.out.println("Enter: ");
                    Scanner sc1 = new Scanner(System.in);
                    int i1 = sc1.nextInt();
                    switch(i1)
                    {
                        case 1:
                            cdcf.engineService();
                            break;
                        case 2:
                            cwcf.oilService();
                            break;
                        case 3:
                            cbcf.paintService();
                            break;
                        case 4:
                            cpcf.otherService();
                            break;
                        case 5:
                            c.parts();
                            break;
                        case 6:
                            c.Accessories();
                            break;
                        case 7:
                            c.miscellaneous();
                            break;
                        default:
                            System.out.println("Please enter a number from 1 to 7");
                    }
                    break;

                case 2:
                    System.out.println("What kind of bike services would you want ?");
                    System.out.println("Please select one:"+
                            "\n\t1.Engine services."+
                            "\n\t2.oil services."+
                            "\n\t3.paint services"+
                            "\n\t4.other services"+
                            "\n\t5.Available parts"+
                            "\n\t6.Available accessories"+
                            "\n\t7.other services"+
                            "\n\t8.Quit");
                    System.out.println("Enter: ");
                    Scanner sc2 = new Scanner(System.in);
                    int i2 = sc2.nextInt();
                    switch(i2)
                    {
                        case 1:
                            ddcf.engineService();
                            break;
                        case 2:
                            dwcf.oilService();
                            break;
                        case 3:
                            dbcf.paintService();
                            break;
                        case 4:
                            dpcf.otherService();
                            break;
                        case 5:
                            d.parts();
                            break;
                        case 6:
                            d.Accessories();
                            break;
                        case 7:
                            d.miscellaneous();
                            break;
                        default:
                            System.out.println("Please enter a number from 1 to 7 ");
                    }
                    break;
                case 3:
                    System.out.println("Sorry! We're currently giving only car and bike services We're looking forward to expanding our services. Stay tuned");
                    break;
                case 4:
                    System.out.println("Enter your full name and address");
                    try{
                        FileWriter writer = new FileWriter("customerlist.txt");
                        Scanner s = new Scanner(System.in);
                        String ii = s.nextLine();
                        writer.write(ii);
                        writer.close();
                    }catch(IOException e)
                    {System.out.println(e);}
                    try{
                        FileReader reader = new FileReader("customerlist.txt");
                        int fileCharacters;
                        System.out.println("Customer details: ");
                        while((fileCharacters = reader.read()) != -1)
                        {

                            System.out.print((char)fileCharacters);
                        }
                        reader.close();
                    }
                    catch(IOException e)
                    {System.out.println(e);}
                    System.out.println(" ");
                    System.out.println("Thank you ! You will recieve a confirmation email regarding your purchase very soon.");
                    break loop;
                default:
                    System.out.println("Please select 1 or 2 or 3");
                    break;

            }
        }



    }

}