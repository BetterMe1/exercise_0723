package exercise.exercise_0723;

/*
庆祝61
 */
/*
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = in.nextInt();
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        int max = 0;
        for(int i=2; i<n; i+=1){
            max = Math.max(max,num[i]-num[i-2]);
        }
        max = Math.max(Math.max(max,num[n-1]-num[n-2]),num[1]-num[0]);
        System.out.println(max);
    }
}*/

/*
骆驼命名法
 */
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String[] strs = in.next().split("_");
            String result = strs[0];;
            for(int i=1; i<strs.length; i++){
                result += String.valueOf(strs[i].charAt(0)).toUpperCase() + strs[i].substring(1);
            }
            System.out.println(result);
        }
    }
}*/

/*
中级：单词倒排
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            StringBuilder sb = new StringBuilder(in.nextLine());
            for(int i=0; i<sb.length(); i++){
                char a = sb.charAt(i);
                if(!(('a'<=a&&a<='z')||('A'<=a&&a<='Z')) && a!=' '){
                    sb.replace(i,i+1," ");
                }
            }
            String[] strs = sb.toString().split(" ");
            for(int i=strs.length-1; i>=0; i--){
                System.out.print(strs[i]);
                if(i!=0){
                    System.out.print(" ");
                }else{
                    System.out.println();
                }
            }

        }
    }
}
