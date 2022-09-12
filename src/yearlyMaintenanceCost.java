public class yearlyMaintenanceCost {
    public static void main(String []args){
        System.out.println("What is the maintenance cost for the summer?");
        int summerCost = 1000; // i put the varibles in the code and not at the top because this is where the input would happen.
        System.out.println("What is the maintenance cost for the fall?");
        int fallCost = 1000;
        System.out.println("What is the maintenance cost for the spring?");
        int springCost = 1000;
        System.out.println("What is the maintenance cost for the winter?");
        int winterCost = 1000;
        int totalCost = summerCost + fallCost + springCost + winterCost;
        System.out.println("The summer cost is $"  + summerCost);
        System.out.println("The fall cost is $"  + fallCost);
        System.out.println("The spring cost is $"  + springCost);
        System.out.println("The winter cost is $"  + winterCost);
        System.out.println("The total cost is $" + totalCost);
    }
}
