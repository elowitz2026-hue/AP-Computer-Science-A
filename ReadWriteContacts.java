/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ELowitz2026
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteContacts {

public static void main(String[] args) {
    

// File path for the Contacts folder
String filePath = "Contacts/contacts.txt";
String outPath = "Contacts/contacts.txt"; // we read the same file we write

// Hard-coded contact info (replace with your info)
String contentToWrite = "Emily Lowitz, elowitz2026@cchsdons.com, 2026, elowitz";

// Write to file
try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
//writer.write(contentToWrite);
    writer.append(contentToWrite + "\n"); // append a new line
    System.out.println("Successfully wrote to the file.");
} catch (IOException e) {
    System.err.println("An error occurred while writing to the file: " + e.getMessage());
}

// Read from file
try (BufferedReader reader = new BufferedReader(new FileReader(outPath))) {
    String line;
    System.out.println("\nReading from the file:");
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    System.err.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}
