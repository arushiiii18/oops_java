// Custom exception for age too young
class TooYoungException extends RuntimeException {
    public TooYoungException(String message) {
        super(message);
    }
}

// Custom exception for age too old
class TooOldException extends RuntimeException {
    public TooOldException(String message) {
        super(message);
    }
}

// Main class for bootcamp enrollment
public class BootcampEnrollment {

    public static void enroll(String name, int age) throws TooYoungException, TooOldException {
        if (age < 15) {
            throw new TooYoungException("Sorry " + name + ", you're too young to join the bootcamp.");
        } else if (age > 50) {
            throw new TooOldException("Sorry " + name + ", you're too old to join the bootcamp.");
        } else {
            System.out.println("Welcome " + name + "! You have successfully enrolled in the bootcamp.");
        }
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        int[] ages = {12, 25, 55};

        for (int i = 0; i < names.length; i++) {
            try {
                enroll(names[i], ages[i]);
            } catch (TooYoungException | TooOldException e) {
                System.out.println("Enrollment failed: " + e.getMessage());
            }
        }
    }
}
