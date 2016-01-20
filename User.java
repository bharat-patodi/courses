  

    public class User {
        String name; 
        String email;
        String password;
        String profileImageLink;
        String paymentHistory;
        Course[] courses;
        int creditCardPayments;

	public User(String name) {
	    this.name = name;
	}

	public String getName() {
	    return name;
	}
    }
