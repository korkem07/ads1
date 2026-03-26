//package org.example;
//import java.util.Scanner;
//
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int min = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//
//        System.out.println(min);
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt(); // количество элементов
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += arr[i];
//        }
//
//        double average = (double) sum / n;
//
//        System.out.println(average);
//    }
//}
//
//public class Main {
//
//    public static boolean isPrime(int n) {
//        if (n <= 1) return false;
//
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        if (isPrime(n)) {
//            System.out.println("Prime");
//        } else {
//            System.out.println("Composite");
//        }
//    }
//}
//
//public class Main {
//
//    public static int fibonacci(int n) {
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        } else {
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int n = sc.nextInt();
//
//        int result = fibonacci(n);
//        System.out.println("F(" + n + ") = " + result);
//    }
//}
//
//public class Main {
//
//    public static long power(int a, int n) {
//        if (n == 0) {
//            return 1;
//        } else if (n > 0) {
//            return a * power(a, n - 1);
//        } else {
//            return 1 / power(a, -n);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int a = sc.nextInt();
//        System.out.print("Answer: ");
//        int n = sc.nextInt();
//
//        long result = power(a, n);
//        System.out.println(a + "^" + n + " = " + result);
//    }
//}
//
//
//public class Main {
//
//    public static void printReverse(int n, Scanner sc) {
//        if (n == 0) {
//            return;
//        }
//        int x = sc.nextInt();
//        printReverse(n - 1, sc);
//        System.out.print(x + " ");
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        printReverse(n, sc);
//    }
//}
//
//
//public class Main {
//
//    public static boolean isAllDigits(String s, int index) {
//        if (index == s.length()) return true;
//        if (!Character.isDigit(s.charAt(index))) return false;
//        return isAllDigits(s, index + 1);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(isAllDigits(s, 0));
//    }
//}
//
//public class Main {
//
//    public static long binomialCoefficient(int n, int k) {
//        if (k == 0 || k == n) {
//            return 1;
//        }
//        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//
//        System.out.println(binomialCoefficient(n, k));
//    }
//}
//
//
//public class Main {
//
//    public static int gcd(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return gcd(b, a % b);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println(gcd(a, b));
//    }
//}
//
//
//public class Main {
//
//    public static int sumOfSquares(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        return n * n + sumOfSquares(n - 1);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(sumOfSquares(n));
//    }
//}
//
//public class Main {
//
//    public static int sumArray(int[] arr, int n) {
//        if (n == 0) {
//            return 0;
//        }
//        return arr[n - 1] + sumArray(arr, n - 1);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println(sumArray(arr, n));
//    }
//}
//
//
//public class Main {
//
//    public static int sumFirstN(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        return n + sumFirstN(n - 1);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(sumFirstN(n));
//    }
//}
//
//public class Main {
//
//    public static int sumPowers(int b, int n) {
//        if (n == 0) {
//            return 1; // b^0 = 1
//        }
//        return (int)Math.pow(b, n) + sumPowers(b, n - 1);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int b = sc.nextInt();
//        int n = sc.nextInt();
//
//        System.out.println(sumPowers(b, n));
//    }
//}
//
//public class Main {
//
//    public static void permute(char[] arr, int l, int r) {
//        if (l == r) {
//            System.out.println(new String(arr));
//        } else {
//            for (int i = l; i <= r; i++) {
//                swap(arr, l, i);
//                permute(arr, l + 1, r);
//                swap(arr, l, i); // backtrack
//            }
//        }
//    }
//
//    public static void swap(char[] arr, int i, int j) {
//        char temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        char[] arr = s.toCharArray();
//        permute(arr, 0, arr.length - 1);
//    }
//}
//
