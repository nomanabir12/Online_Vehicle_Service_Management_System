
import java.util.ArrayList;
import java.util.Scanner;

class bike implements Service, parts_Accessories, carMiscellaneous
{

    String df1, df2, df3;
    double dfv1,dfv2,dfv3;
    public bike(){}
     bike(String df1,String df2,String df3,double dfv1, double dfv2, double dfv3)
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

    String wf1, wf2, wf3, wf4;
    double wfv1,wfv2,wfv3, wfv4; //cost for wet food
    bike(String wf1,String wf2,String wf3, String wf4,double wfv1, double wfv2, double wfv3, double wfv4 )
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
    String bf1, bf2, bf3;
    float bfv1,bfv2,bfv3; //cost for baby food
    bike(String bf1,String bf2,String bf3,float bfv1, float bfv2, float bfv3 )
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
    String pf1, pf2, pf3, pf4;
    int pfv1, pfv2, pfv3, pfv4;
    bike(String pf1,String pf2,String pf3,String pf4, int pfv1,int pfv2,int pfv3, int pfv4)
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
            System.out.println("This is the list bike Engine services we do ");
            System.out.println("1. " + df1 + " - " + dfv1 + "taka");
            System.out.println("2. " + df2 + " - " + dfv2 + "taka");
            System.out.println("3. " + df3 + " - " + dfv3 + "taka");
            System.out.println("Which one would you like to add?");

            int i = sc.nextInt();
            switch(i)
            {
                case 1:
                    System.out.println( df1 + " has been added to your list");
                    cartItems.add(df1);
                    System.out.println("Would you like to continue shopping?");
                    System.out.println("Press 1 to continue shopping");
                    System.out.println("Press 2 to go to main menu");
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
                        System.out.println("Your cart items are" + cartItems );
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
            System.out.println("This is the list oil services we have for bike");
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
            System.out.println("The paint services Available for bike ");
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
                        System.out.println("Your cart items are" + cartItems );
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
            System.out.println("This is the list of other services for bike");
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
                        System.out.println("Your cart items are" + cartItems );
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
                        System.out.println("Your cart items are" + cartItems );
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
                        System.out.println("Your cart items are" + cartItems );
                    }
                    break;
                default:
                    System.out.println("Please enter 1 or 2 or 3 or 4");
                    break;
            }
        }
    }
    protected String dtoy1, dtoy2, dtoy3;
    protected int dtoyv1, dtoyv2, dtoyv3;
    public String getDtoy1() {
        return dtoy1;
    }
    public String getDtoy2() {
        return dtoy2;
    }
    public String getDtoy3() {
        return dtoy3;
    }
    public int getDtoyv1() {
        return dtoyv1;
    }
    public int getDtoyv2() {
        return dtoyv2;
    }
    public int getDtoyv3() {
        return dtoyv3;
    }
    public void setDtoy1(String dtoy1) {
        this.dtoy1 = dtoy1;
    }
    public void setDtoy2(String dtoy2) {
        this.dtoy2 = dtoy2;
    }
    public void setDtoy3(String dtoy3) {
        this.dtoy3 = dtoy3;
    }
    public void setDtoyv1(int dtoyv1) {
        this.dtoyv1 = dtoyv1;
    }
    public void setDtoyv2(int dtoyv2) {
        this.dtoyv2 = dtoyv2;
    }
    public void setDtoyv3(int dtoyv3) {
        this.dtoyv3 = dtoyv3;
    }
  
    public void parts()
    {
        boolean done = false;
        while (done == false)
        {
            System.out.println("This is the collection of bike parts we have");
            System.out.println("1. " + dtoy1 + " - " + dtoyv1 + "taka");
            System.out.println("2. " + dtoy2 + " - " + dtoyv2 + "taka");
            System.out.println("3. " + dtoy3 + " - " + dtoy3 + "taka");
            System.out.println("Which one do you buy?");
            Scanner sc= new Scanner(System.in);
            int i = sc.nextInt();
            switch(i)
            {
                case 1:
                    System.out.println( dtoy1+ " has been added to your list");
                    cartItems.add(dtoy1);
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
                    System.out.println( dtoy2+ " has been added to your list");
                    cartItems.add(dtoy2);
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
                    System.out.println( dtoy3+ " has been added to your list");
                    cartItems.add(dtoy3);
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
                default:
                    System.out.println("Please enter 1 or 2 or 3");
                    break;
            }
        }
    }
    protected String dDress1, dDress2;
    protected int dDress1v, dDress2v;
    public String getdDress1() {
        return dDress1;
    }
    public String getdDress2() {
        return dDress2;
    }
    public int getdDress1v() {
        return dDress1v;
    }
    public int getdDress2v() {
        return dDress2v;
    }
    public void setdDress1(String dDress1) {
        this.dDress1 = dDress1;
    }
    public void setdDress2(String dDress2) {
        this.dDress2 = dDress2;
    }
    public void setdDress1v(int dDress1v) {
        this.dDress1v = dDress1v;
    }
    public void setdDress2v(int dDress2v) {
        this.dDress2v = dDress2v;
    }

    public void Accessories()
    {
        boolean done = false;
        while (done == false)
        {
            System.out.println("This is the list of bike accessories");
            System.out.println("1. " + dDress1 + " - " + dDress1v + "taka");
            System.out.println("2. " + dDress2 + " - " + dDress2v + "taka");
            System.out.println("Which one you want to buy?");
            Scanner sc= new Scanner(System.in);
            int i = sc.nextInt();
            switch(i)
            {
                case 1:
                    System.out.println( dDress1+ " has been added to your list");
                    cartItems.add(dDress1);
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
                    System.out.println( dDress2+ " has been added to your list");
                    cartItems.add(dDress2);
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