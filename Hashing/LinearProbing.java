package Hashing;
import java.util.Random;
import java.util.Scanner;

class HashTable {
    private int[] hashTable;
    private int size = 20;

    public HashTable() {
        hashTable = new int[size];
        // Initialize the array with -1 to indicate empty spots
        for (int i = 0; i < size; i++) {
            hashTable[i] = -1;
        }
    }

    // Hash function H(x) = (x mod 18) + 2
    private int hashFunction(int value) {
        return (value % 18) + 2;
    }

    // Insert a value into the hash table using linear probing
    public void insert(int value) {
        int hashIndex = hashFunction(value);
        int originalIndex = hashIndex;

        // Handle collisions with linear probing
        while (hashTable[hashIndex] != -1) {
            hashIndex = (hashIndex + 1) % size;
            if (hashIndex == originalIndex) {
                System.out.println("Hash table is full, can't insert value: " + value);
                return;
            }
        }
        hashTable[hashIndex] = value;
    }

    public void display(){
        System.out.println("Hash Tale:");
        for(int i = 0; i < size; i++){
            if (hashTable[i] != -1) {
                System.out.println("Index " + i + ": " + hashTable[i]);
            }else{
                System.out.println("Index " + i + ": Empty");
            }
        }
    }
}

public class LinearProbing {
    public static void main(String[] args) {
        Random rand = new Random();
        HashTable table = new HashTable();

        for (int i = 0; i < 15; i++) {
            int randomValue = 100000 + rand.nextInt(900000);
            System.out.println("Inserting value: " + randomValue);
            table.insert(randomValue);
        }
        
         // Display the final values in the array
        table.display();
    }
}
