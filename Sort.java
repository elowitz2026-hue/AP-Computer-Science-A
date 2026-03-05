/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sort;

/**
 *
 * @author ELowitz2026
 */
public class Sort {
    
    // Sort by telephone #'s first, name second (alphabetically)

    public static void main(String[] args) {
        
        Contact[] friends = new Contact[9];
        friends[0] = new Contact("John", "Smith", "610-555-7384");
        friends[1] = new Contact("Sarah", "Barnes", "215-555-3827");
        friends[2] = new Contact("Aaron", "Riley", "733-555-2969");
        friends[3] = new Contact("Laura", "Ramone", "663-555-3984");
        friends[4] = new Contact("Larry", "Smith", "464-555-3489");
        friends[5] = new Contact("Frank", "Phelps", "322-555-2284");
        friends[6] = new Contact("Mario", "Guzman", "804-555-9066");
        friends[7] = new Contact("Marsha", "Grant", "464-555-3489");
        friends[8] = new Contact("Joey", "Ramone", "464-555-3489");
        //calling the sort on the array, which implements Comparable

        // Calls selection sort (uses compareTo from Contact class)
        Sorting.selectionSort(friends);
        System.out.println("*** Selection Sort ***");
        for (Contact friend : friends)
            System.out.println(friend);

        // Calls insertion sort
        Sorting.insertionSort(friends);
        System.out.println("*** Insertion Sort ***");
        for (Contact friend : friends)
            System.out.println(friend);
    }
}

class Sorting{
    public static void selectionSort(Comparable[] list)
    {
        int min;
        Comparable temp;

        for (int index = 0; index < list.length-1; index++)
        {
            min = index;

            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0) {
                    min = scan;
                }
            // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    public static void insertionSort(Comparable[] list)
    {
        for (int index = 1; index < list.length; index++)
        {
            Comparable key = list[index];
            int position = index;

            // Shift larger values to the right
            while (position > 0 && key.compareTo(list[position-1]) < 0)
            {
                list[position] = list[position-1]; // fixed shift direction from +1 to -1
                position--; // not ++
            }

            list[position] = key;
        }
    }
}

class Contact implements Comparable
{
    private String firstName, lastName, phone;
    
// Constructor: Sets up this contact with the specified data

    public Contact(String first, String last, String telephone)
    {
        firstName = first;
        lastName = last;
        phone = telephone;
    }

    // Modified to show phone first since we are sorting primarily by phone
    public String toString()
    {
        return phone + "\t" + lastName + ", " + firstName;
        // Switched from return lastName + ", " + firstName + "\t" + phone; 
    }

    // Returns a description of this contact as a string
    public boolean equals(Object other)
    {
        return (lastName.equals(((Contact)other).getLastName()) &&
        firstName.equals(((Contact)other).getFirstName()));
    }

    //-----------------------------------------------------------------
    // MODIFIED compareTo method
    // Now sorts by phone number FIRST
    // If phone numbers are the same, it sorts by last name
    // If last names are also the same, it sorts by first name
    //-----------------------------------------------------------------
    
    public int compareTo(Object other)
    {
        int result;

        // Reorganize from otherFirst & otherLast to getPhone & getFirstName
        String otherPhone = ((Contact)other).getPhone(); // added
        String otherFirst = ((Contact)other).getFirstName();
        String otherLast = ((Contact)other).getLastName();

        // First comparison: phone numbers
        if (phone.equals(otherPhone)) {
            // If phone numbers are the same, compare last names
            if (lastName.equals(otherLast))
                result = firstName.compareTo(otherFirst);
            else
                result = lastName.compareTo(otherLast);
        }
        else {
            result = phone.compareTo(otherPhone);
        }

        return result;
    }

    // First name accessor
    public String getFirstName()
    {
        return firstName;
    }

    // Last name accessor
    public String getLastName()
    {
        return lastName;
    }

    // ADDED accessor method so phone numbers can be compared
    public String getPhone()
    {
        return phone;
    }
}
