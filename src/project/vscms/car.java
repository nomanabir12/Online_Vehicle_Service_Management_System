
import java.util.ArrayList;
import java.util.Scanner;

public class car implements Service, parts_Accessories, carMiscellaneous
{

    protected String df1, df2, df3;
    protected double dfv1,dfv2,dfv3;
    public car(){}

    car(String df1,String df2,String df3,double dfv1, double dfv2, double dfv3)
    {
        this.df1=df1;
        this.df2=df2;
        this.df3=df3;
        this.dfv1=dfv1;
        this.dfv2=dfv2;
        this.dfv3=dfv3;
    }
    public String getDf1() {
        return df1;
    }
    public String getDf2() {
        return df2;
    }
    public String getDf3() {
        return df3;
    }
    public double getDfv1() {
        return dfv1;
    }
    public double getDfv2() {
        return dfv2;
    }
    public double getDfv3() {
        return dfv3;
    }

    protected String wf1, wf2, wf3, wf4;
    protected double wfv1,wfv2,wfv3, wfv4;
    car(String wf1,String wf2,String wf3, String wf4,double wfv1, double wfv2, double wfv3, double wfv4 )
    {
        this.wf1=wf1;
        this.wf2=wf2;
        this.wf3=wf3;
        this.wf4=wf4;
        this.wfv1=wfv1;
        this.wfv2=wfv2;
        this.wfv3=wfv3;
        this.wfv4=wfv4;
    }
    public String getWf1() {
        return wf1;
    }
    public String getWf2() {
        return wf2;
    }
    public String getWf3() {
        return wf3;
    }
    public String getWf4() {
        return wf4;
    }
    public double getWfv1() {
        return wfv1;
    }
    public double getWfv2() {
        return wfv2;
    }
    public double getWfv3() {
        return wfv3;
    }
    public double getWfv4() {
        return wfv4;
    }
    protected String bf1, bf2, bf3;
    protected float bfv1,bfv2,bfv3; //cost for baby food
    car(String bf1,String bf2,String bf3,float bfv1, float bfv2, float bfv3 )
    {
        this.bf1=bf1;
        this.bf2=bf2;
        this.bf3=bf3;
        this.bfv1=bfv1;
        this.bfv2=bfv2;
        this.bfv3=bfv3;
    }
    public String getBf1() {
        return bf1;
    }
    public String getBf2() {
        return bf2;
    }
    public String getBf3() {
        return bf3;
    }
    public float getBfv1() {
        return bfv1;
    }
    public float getBfv2() {
        return bfv2;
    }
    public float getBfv3() {
        return bfv3;
    }
    protected String pf1, pf2, pf3, pf4;
    protected int pfv1, pfv2, pfv3, pfv4;
    car(String pf1,String pf2,String pf3,String pf4, int pfv1,int pfv2,int pfv3, int pfv4)
    {
        this.pf1=pf1;
        this.pf2=pf2;
        this.pf3=pf3;
        this.pf4=pf4;
        this.pfv1=pfv1;
        this.pfv2=pfv2;
        this.pfv3=pfv3;
        this.pfv4=pfv4;
    }
    public String getPf1() {
        return pf1;
    }
    public String getPf2() {
        return pf2;
    }
    public String getPf3() {
        return pf3;
    }
    public String getPf4() {
        return pf4;
    }
    public int getPfv1() {
        return pfv1;
    }
    public int getPfv2() {
        return pfv2;
    }
    public int getPfv3() {
        return pfv3;
    }
    public int getPfv4() {
        return pfv4;
    }

    ArrayList<String> cartItems = new ArrayList<String>();
   
    public void engineService()
    {
        Scanner sc= new Scanner(System.in);
        boolean done = false;
        while (done == false)
        {
            System.out.println("This is the list of car Engine services we do");
            System.out.println("1. " + df1 + " - " + dfv1 + "taka");
            System.out.println("2. " + df2 + " - " + dfv2 + "taka");
            System.out.println("3. " + df3 + " - " + dfv3 + "taka");
            System.out.println("Which one would you like to buy?");

            int i = sc.nextInt();
            switch(i)
            {
                case 1:
                    System.out.println( df2 + " has been added to your list");
                    cartItems.add(df1);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");
                    int j = sc.nextInt();
                    if (j == 1)
                    {
                        break;
                    }
                    else
                    {
                        done = true;
                    }
                    break;
                case 2:
                    System.out.println( df2 + " has been added to your list");
                    cartItems.add(df2);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");
                    int k = sc.nextInt();
                    if (k == 1)
                    {
                        break;
                    }
                    else{
                        done = true;
                        System.out.println("Your cart items are" + cartItems);
                    }
                    break;
                case 3:
                    System.out.println( df2 + " has been added to your list");
                    cartItems.add(df3);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");
                    int l = sc.nextInt();
                    if (l == 1)
                    {
                        break;
                    }
                    else
                    {
                        done = true;
                    }
                    break;
                default:
                    System.out.println("Please enter 1 or 2 or 3");
                    break;
            }

        }
    }
    
    public void oilService()
    {
        boolean done = false;
        while (done == false)
        {
            System.out.println("This is the list oil services we have for car");
            System.out.println("1. " + wf1 + " - " + wfv1 + "taka");
            System.out.println("2. " + wf2 + " - " + wfv2 + "taka");
            System.out.println("3. " + wf3 + " - " + wfv3 + "taka");
            System.out.println("4. " + wf3 + " - " + wfv3 + "taka");
            System.out.println("Which one would you like to add ?");
            Scanner sc= new Scanner(System.in);
            int i = sc.nextInt();
            switch(i)
            {
                case 1:
                    System.out.println( wf1 + " has been added to your list");
                    cartItems.add(wf1);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");

                    int j = sc.nextInt();
                    if (j == 1)
                    {
                        break;
                    }
                    else
                    {
                        done = true;
                        System.out.println("Your cart items are" + cartItems );
                    }
                    break;
                case 2:
                    System.out.println( wf2 + " has been added to your list");
                    cartItems.add(wf2);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");
                    int k = sc.nextInt();
                    if (k == 1)
                    {
                        break;
                    }
                    else
                    {
                        done = true;
                        System.out.println("Your cart items are" + cartItems );
                    }
                    break;
                case 3:
                    System.out.println( wf3 + " has been added to your list");
                    cartItems.add(wf3);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");
                    int l = sc.nextInt();
                    if (l == 1)
                    {
                        break;
                    }
                    else
                    {
                        done = true;
                        System.out.println("Your cart items are" + cartItems );
                    }
                    break;
                case 4:
                    System.out.println( wf4 + " has been added to your list");
                    cartItems.add(wf4);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");
                    int m = sc.nextInt();
                    if (m == 1)
                    {
                        break;
                    }
                    else{
                        done = true;
                        System.out.println("Your cart items are" + cartItems);
                    }
                    break;
                default:
                    System.out.println("Please enter 1 or 2 or 3 or 4");
                    break;
            }
        }
    }
   
    public void paintService()
    {
        boolean done = false;
        while(done == false)
        {
            System.out.println("The paint services Available for car");
            System.out.println("1. " + bf1 + " - " + bfv1 + "taka");
            System.out.println("2. " + bf2 + " - " + bfv2 + "taka");
            System.out.println("3. " + bf3 + " - " + bfv3 + "taka");
            System.out.println("Which one would you like to buy?");
            Scanner sc= new Scanner(System.in);
            int i = sc.nextInt();
            switch(i)
            {
                case 1:
                    System.out.println( bf1 + " has been added to your list");
                    cartItems.add(bf1);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");
                    int j = sc.nextInt();
                    if ( j == 1)
                    {
                        break;
                    }
                    else{
                        done = true;
                        System.out.println("Your cart items are" + cartItems );
                    }
                    break;
                case 2:
                    System.out.println( bf2 + " has been added to your list");
                    cartItems.add(bf2);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");;
                    int k = sc.nextInt();
                    if ( k == 1)
                    {
                        break;
                    }
                    else{
                        done = true;
                        System.out.println("Your cart items are" + cartItems );
                    }
                    break;
                case 3:
                    System.out.println( bf3 + " has been added to your list");
                    cartItems.add(bf3);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");
                    int l = sc.nextInt();
                    if ( l == 1)
                    {
                        break;
                    }
                    else{
                        done = true;
                    }
                    break;
                default:
                    System.out.println("Please enter 1 or 2 or 3");
                    break;
            }
        }
    }
  
    public void otherService()
    {
        boolean done = false;
        while(done == false)
        {
            System.out.println("This is the list of other services for car");
            System.out.println("1. " + pf1 + " - " + pfv1 + "taka");
            System.out.println("2. " + pf2 + " - " + pfv2 + "taka");
            System.out.println("3. " + pf3 + " - " + pfv3 + "taka");
            System.out.println("4. " + pf4 + " - " + pfv4 + "taka");
            System.out.println("Which one would you like to buy?");
            Scanner sc= new Scanner(System.in);
            int i = sc.nextInt();
            switch(i)
            {
                case 1:
                    System.out.println( pf1 + " has been added to your list");
                    cartItems.add(pf1);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");
                    int j = sc.nextInt();
                    if ( j == 1)
                    {
                        break;
                    }
                    else{
                        done = true;
                    }
                    break;
                case 2:
                    System.out.println( pf2+ " has been added to your list");
                    cartItems.add(pf2);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");
                    int k = sc.nextInt();
                    if ( k == 1)
                    {
                        break;
                    }
                    else{
                        done = true;
                        System.out.println("Your cart items are" + cartItems );
                    }
                    break;
                case 3:
                    System.out.println( pf3+ " has been added to your list");
                    cartItems.add(pf3);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");
                    int l = sc.nextInt();
                    if ( l == 1)
                    {
                        break;
                    }
                    else{
                        done = true;
                    }
                    break;
                case 4:
                    System.out.println( pf4+ " has been added to your list");
                    cartItems.add(pf4);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");
                    int m = sc.nextInt();
                    if ( m == 1)
                    {
                        break;
                    }
                    else{
                        done = true;
                    }
                    break;
                default:
                    System.out.println("Please enter 1 or 2 or 3 or 4");
                    break;
            }
        }
    }
    protected String ctoy1, ctoy2, ctoy3;
    protected int ctoyv1, ctoyv2, ctoyv3;
    public String getCtoy1() {
        return ctoy1;
    }
    public String getCtoy2() {
        return ctoy2;
    }
    public String getCtoy3() {
        return ctoy3;
    }
    public int getCtoyv1() {
        return ctoyv1;
    }
    public int getCtoyv2() {
        return ctoyv2;
    }
    public int getCtoyv3() {
        return ctoyv3;
    }
    public void setCtoy1(String ctoy1) {
        this.ctoy1 = ctoy1;
    }
    public void setCtoy2(String ctoy2) {
        this.ctoy2 = ctoy2;
    }
    public void setCtoy3(String ctoy3) {
        this.ctoy3 = ctoy3;
    }
    public void setCtoyv1(int ctoyv1) {
        this.ctoyv1 = ctoyv1;
    }
    public void setCtoyv2(int ctoyv2) {
        this.ctoyv2 = ctoyv2;
    }
    public void setCtoyv3(int ctoyv3) {
        this.ctoyv3 = ctoyv3;
    }
   
    public void parts()
    {
        boolean done = false;
        while (done == false)
        {
            System.out.println("This is the collection of car parts we have");
            System.out.println("1. " + ctoy1 + " - " + ctoyv1 + "taka");
            System.out.println("2. " + ctoy2 + " - " + ctoyv2 + "taka");
            System.out.println("3. " + ctoy3 + " - " + ctoyv3 + "taka");
            System.out.println("Which one do you buy?");
            Scanner sc= new Scanner(System.in);
            int i = sc.nextInt();
            switch(i)
            {
                case 1:
                    System.out.println( ctoy1+ " has been added to your list");
                    cartItems.add(ctoy1);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");
                    int j = sc.nextInt();
                    if (j == 1)
                    {
                        break;
                    }
                    else
                    {
                        done = true;
                    }
                    break;
                case 2:
                    System.out.println( ctoy2+ " has been added to your list");
                    cartItems.add(ctoy2);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");
                    int k = sc.nextInt();
                    if (k == 1)
                    {
                        break;
                    }
                    else
                    {
                        done = true;
                    }
                    break;
                case 3:
                    System.out.println( ctoy3+ " has been added to your list");
                    cartItems.add(ctoy3);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");
                    int l = sc.nextInt();
                    if (l == 1)
                    {
                        break;
                    }
                    else
                    {
                        done = true;
                    }
                    break;
                default:
                    System.out.println("Please enter 1 or 2 or 3");
                    break;
            }
        }

    }
    protected String cDress1, cDress2;
    protected int cDress1v, cDress2v;
    public String getcDress1() {
        return cDress1;
    }
    public String getcDress2() {
        return cDress2;
    }
    public int getcDress1v() {
        return cDress1v;
    }
    public int getcDress2v() {
        return cDress2v;
    }
    public void setcDress1(String cDress1) {
        this.cDress1 = cDress1;
    }
    public void setcDress2(String cDress2) {
        this.cDress2 = cDress2;
    }
    public void setcDress1v(int cDress1v) {
        this.cDress1v = cDress1v;
    }
    public void setcDress2v(int cDress2v) {
        this.cDress2v = cDress2v;
    }

  
    public void Accessories()
    {
        boolean done = false;
        while (done == false)
        {
            System.out.println("This is the list of car accessories");
            System.out.println("1. " + cDress1 + " - " + cDress1v + "taka");
            System.out.println("2. " + cDress2 + " - " + cDress2v + "taka");
            System.out.println("Which one you want to buy?");
            Scanner sc= new Scanner(System.in);
            int i = sc.nextInt();
            switch(i)
            {
                case 1:
                    System.out.println( cDress1+ " has been added to your list");
                    cartItems.add(cDress1);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");
                    int j = sc.nextInt();
                    if (j == 1)
                    {
                        break;
                    }
                    else
                    {
                        done = true;
                    }
                    break;
                case 2:
                    System.out.println( cDress2+ " has been added to your list");
                    cartItems.add(cDress2);
                    System.out.println("Would you like to continue to add more services?");
                    System.out.println("Enter 1 to continue to add more services?");
                    System.out.println("Enter 2 to go to main menu");
                    int k = sc.nextInt();
                    if (k == 1)
                    {
                        break;
                    }
                    else
                    {
                        done = true;
                        System.out.println("Your cart items are" + cartItems );
                    }
                    break;
                default:
                    System.out.println("Please enter 1 or 2");
                    break;
            }
        }
    }

  
    public void miscellaneous()
    {
        System.out.println("Sorry! currently we don't have this items We will stock up soon");
    }


}