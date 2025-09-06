public class Main1 {
    public static void main(String[] args) {
      /*  Example example = new Example();

        // Accessing members of Example class
        System.out.println("Public Variable: " + example.publicVariable); // Accessible
        // System.out.println("Private Variable: " + example.privateVariable); // Not accessible (Compile-time error)
        System.out.println("Protected Variable: " + example.getProtectedVariable()); // Accessible through a public method
        System.out.println("Default Variable: " + example.defaultVariable); // Accessible (same package)
		*/
		SubExample obj = new SubExample();
		//obj.display();
		
		System.out.println("Public Variable: " + obj.publicVariable);      // Accessible
        // System.out.println("Private Variable: " obj.privateVariable); // Not accessible (Compile-time error)
        System.out.println("Protected Variable: " + obj.protectedVariable); // Accessible (subclass)
        System.out.println("Default Variable: " + obj.defaultVariable);    // Accessible (same package)
    }
}