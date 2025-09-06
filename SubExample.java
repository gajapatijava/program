class SubExample extends Example {
    public void display() {
        // Accessing members of the parent class
        System.out.println("Public Variable: " + publicVariable);      // Accessible
        // System.out.println("Private Variable: " + privateVariable); // Not accessible (Compile-time error)
        System.out.println("Protected Variable: " + protectedVariable); // Accessible (subclass)
        System.out.println("Default Variable: " + defaultVariable);    // Accessible (same package)
    }
}
