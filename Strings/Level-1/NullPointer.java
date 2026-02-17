class NullPointer {
    public static void createException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println("Cannot call method on null");
        }
    }

    public static void main(String[] args) {
        System.out.println("Generating Exception: ");
        try {
            createException();
        } catch (NullPointerException e) {
            System.out.println("Exception occured in createException()");
        }
        System.out.println("Handling Exception: ");
        handleException();
    }
}