// import java.util.*;
// import java.io.*;

// class first {
//     public static void printMaxActivities(int s[], int f[], int n) {
//         int i, j, count = 0;

//         // System.out.print("Following activities are selected : \n");

//         i = 0;
//         count++;
//         // System.out.print(i + " ");

//         for (j = 1; j < n; j++) {
//             if (s[j] >= f[i]) {
//                 count++;
//                 // System.out.print(j + " ");
//                 i = j;
//             }
//         }
//         System.out.print(count);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int s[] = new int[n];
//         int f[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             s[i] = sc.nextInt();
//         }
//         for (int i = 0; i < n; i++) {
//             f[i] = sc.nextInt();
//         }
//         printMaxActivities(s, f, n);
//     }

// }

import java.io.*;
import java.util.*;

class first {

    static class Pair {

        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static void SelectActivities(int s[], int f[]) {
        int count = 0;
        ArrayList<Pair> ans = new ArrayList<>();

        PriorityQueue<Pair> p = new PriorityQueue<>(
                (p1, p2) -> p1.first - p2.first);

        for (int i = 0; i < s.length; i++) {
            p.add(new Pair(f[i], s[i]));
        }

        Pair it = p.poll();
        int start = it.second;
        int end = it.first;
        ans.add(new Pair(start, end));
        count++;

        while (!p.isEmpty()) {
            Pair itr = p.poll();
            if (itr.second >= end) {
                start = itr.second;
                end = itr.first;
                ans.add(new Pair(start, end));
                count++;
            }
        }
        System.out.print(count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s[] = new int[n];
        int f[] = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
        }
        SelectActivities(s, f);
    }
}