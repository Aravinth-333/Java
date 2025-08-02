import java.util.*;
public class prefixsum {
    public static void main(String args[]){
        Scanner Inp=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=Inp.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=Inp.nextInt();
        }
        // int prefixsum[]=new int[n];
        // prefixsum[0]=arr[0];
        // for(int i=1;i<n;i++){
        //     prefixsum[i]=prefixsum[i-1]+arr[i];
        // }
        // for(int i=0;i<n;i++){
        //     System.out.println("Prefixsum "+prefixsum[i]);
        // }

        // using arraylist
        List<Integer> prefixsumList=new ArrayList<>();
        for(int i=0;i<n;i++){
            prefixsumList.add(0);
        }
        System.out.println("Intial List:");
        for(int i:prefixsumList){
            System.out.print(i+" ");
        }
        System.out.println("");
        prefixsumList.set(0,arr[0]);
        for(int i=1;i<n;i++){
            prefixsumList.set(i,prefixsumList.get(i-1)+arr[i]);
        }
        System.out.println("Final List:");
        for(int i:prefixsumList){
            System.out.print(i+" ");
        }
    }
}
