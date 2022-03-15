public class AdvancedWeek {
    // Initializing variables
   	private int i = 1;
	private String day_1 = "MONday";
	private String day_2 = "TUEsday";
	private String day_3 = "WEDNESday";
	private String day_4 = "THURSday";
	private String day_5 = "FRIday";
	private String day_6 = "SATURday";
	private String day_7 = "SUNday";
	
    // printing out the days
    public void printDays() {
        System.out.println( i + ": " + day_1 + "\n" +
				 (i+1) + ": " + day_2 + "\n" + (i+2) + 
				": " + day_3 + "\n" + (i+3) + ": " + 
				day_4 + "\n" + (i+4) + ": " + day_5 + "\n" +
				(i+5) + ": " + day_6 + "\n" + (i+6) + ": " + day_7 );
    }
}
