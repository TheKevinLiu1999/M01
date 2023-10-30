class Main {
  /** Convert from feet to meters */
  public static double footToMeter(double foot) {
    double meter = 0.305 * foot;
    return meter;
  }

  /** Convert from meters to feet */
  public static double meterToFoot(double meter){
    double foot = 3.279 * meter;
    return foot;
  }
  
  public static void main(String[] args) {
    System.out.println("Feet \t\tMeters\t|\tMeters \t\tFeet");
    System.out.println("------------------------------------------");
    for (int i = 1; i <= 10; i++) {
      double j = i * 1.0;
      double k = 5 * j + 15;
      System.out.printf("%.1f \t\t%.3f\t|\t%.1f \t\t%.3f\n", j, footToMeter(i), k, meterToFoot(5*i+15));
    }
  }

  
}