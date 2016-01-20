  

    public class Course {
        String title; 
        String subtitle;
        String promoVideoLink;
        String description;
        User instructor;
        double price;
        String faq;
 //       Comment[] comments;
        int progress;
 //       Testimonial[] testimonials;

	public Course(String title, String description, double price, 
		      User instructor) {
	    this.title = title;
	    this.description = description;
	    this.price = price;
	    this.instructor = instructor;
	}

	public String getTitle() {
	    return title;
	}

	public String getDescription() {
	    return description;
	}

	public double getPrice() {
	    return price;
	}

	public User getInstructor() {
	    return instructor;
	}

    }
