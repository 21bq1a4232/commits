import java.util.Scanner;
class Binary{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n= sc.nextInt(),a[]= new int[n],l=0,mid=0,h=a.length-1;
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println("enter the element to be found :");
        int key = sc.nextInt();
        while(l<=h){
            mid=(l+h)/2;
            if(a[mid]==key){
                System.out.println("element found at "+mid);
                System.exit(1);}
            else if(a[mid]<key) l=mid+1;
            else h=mid-1;}
        if(l>h)  System.out.println("element not found");}}