class Example {
    public int publicVariable = 10;        // Public: Accessible anywhere
    private int privateVariable = 20;     // Private: Accessible only within this class
    protected int protectedVariable = 30; // Protected: Accessible within the same package and subclasses
    int defaultVariable = 40;             // Default: Accessible only within the same package

    public int getProtectedVariable() {
        return protectedVariable; // Public method to access protected variable
    }

    private int getPrivateVariable() {
        return privateVariable; // Private method accessible only within this class
    }
}