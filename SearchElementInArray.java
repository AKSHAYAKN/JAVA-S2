import java.util.Scanner;
public class SearchElementInArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array");
        int n = scanner.nextInt();
        System.out.println("Enter the elements in the array:");
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        } 

        System.out.print("Enter the element to search for:");
        int target = scanner.nextInt();

        boolean found = false;
        for(int i = 0; i < n; i++){
            if (arr[i] == target){
                found = true;
                System.out.println("Element " + target + " found at index " + i);
                break;
        

            }
        }
        if(!found){
            System.out.println("Element" + target + " not found in the array.");
        }
        scanner.close();
    }
}

