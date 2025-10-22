package collection.Hashset;

import java.util.HashSet;

public class hashset_ex
{
    public static void main(String[] args)
    {
        // HashSet to store unique roll numbers
        HashSet<Integer> attendance = new HashSet<>();

        // Students marking attendance
        attendance.add(101);
        attendance.add(102);
        attendance.add(103);
        attendance.add(101);  // Duplicate attempt
        attendance.add(104);
        attendance.add(102);  // Duplicate attempt

        // Display the unique students who attended
        System.out.println("Students present today: " + attendance);
        System.out.println("Total unique students: " + attendance.size());

        // Checking if a particular student is present
        int checkRoll = 103;
        if (attendance.contains(checkRoll))
        {
            System.out.println("Student " + checkRoll + " is present.");
        }
        else
        {
            System.out.println("Student " + checkRoll + " is absent.");
        }
    }
}

