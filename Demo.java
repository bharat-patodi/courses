import java.util.*;

public class Demo {

    static List<Course> courses;
    static List<Course> featured;

    private static void initDummyCourses() {
	courses = new ArrayList<Course>();

	User bharat = new User("Bharat Patodi");
	User john = new User("John Fennesy");
	User freeman = new User("Freeman Murray");

	courses.add(new Course("Farming For Beginners", "lots and lots of farming", 300.00, john));
	courses.add(new Course("Hand Tools", "more tools", 300.00, john));
	courses.add(new Course("Projection maintenance", "lots and lots of farming", 300.00, john));
	courses.add(new Course("Tunneling", "dig deep", 300.00, john));
	courses.add(new Course("Video production", "moving pictures and more", 150.00, freeman));
	courses.add(new Course("Finance in the Future", "BitCoin, AltCoin, and everything else", 1150.00, freeman));
	courses.add(new Course("Free Singing", "use your voice, go with the flow", 150.00, freeman));
	courses.add(new Course("small motor repair", "fix dont trash", 1150.00, freeman));
	courses.add(new Course("Electrical maintenance", "don't die", 150.00, freeman));
	courses.add(new Course("Create Pulp Fiction", "super readable get rich", 1150.00, freeman));
	courses.add(new Course("Find Geocache", "GPS and find stuff", 150.00, freeman));
	courses.add(new Course("Get Funded", "Other Peoples Money", 1150.00, freeman));
    }

    private static void initFeaturedCourses() {
	featured = new ArrayList<Course>();
	featured.add(courses.get(0));	
	featured.add(courses.get(1));	
	featured.add(courses.get(2));	
    }


    public static List<Course> getAllCourses() {
	return courses;
    }

    public static List<Course> getFeaturedCourses() {
	return featured;
    }

    public static List<Course> getCoursesByInstructor(String name) {
	ArrayList<Course> iCourses = new ArrayList<Course>();
	for (Course c : courses) {
	    if (c.getInstructor().getName().equals(name)) {
		iCourses.add(c);
	    }
	}
	return iCourses;
    }

    public static void main(String[] argv) {
	initDummyCourses();
	initFeaturedCourses();

	if (argv[0].equals("all")) {
	    showCourses(getAllCourses());
	} else if (argv[0].equals("featured")) {
	    showCourses(getFeaturedCourses());
	} else if (argv[0].equals("instructor")) {
	    showCourses(getCoursesByInstructor(argv[1] + " " + argv[2]));
	}
    }

    private static void showCourses(List<Course> courseList) {
	for (Course course : courseList) {
	    System.out.println("title: "+course.getTitle());
	    System.out.println("description: "+course.getDescription());
	    System.out.println("price: "+course.getPrice());
	    System.out.println("instructor: "+course.getInstructor().getName());
	    System.out.println();
	}
    }
}	
