package Bench;

public class Fibuna {

    public static void main(String args[]) {
        System.out.println("Sum of even terms less then 4 million: " + fibEvenSum());
    }

    public static int fibEvenSum() {

        int sum = 0;
        int currentFib = 0;
        int i = 1;

        while(currentFib < 4000000) {

            if(currentFib % 2 == 0) {
                sum += currentFib;
            }

            currentFib = fib(i);
            i++;
        }

        return sum;
    }

    public static int fib(int term) {

        if(term == 0) { return 0; }
        if(term <= 2) { return 1; }
        
        return fib(term - 2) + fib(term - 1);
    }
}

/*def fib(max):
f1, f2 = 0, 1
while f1 < max:
    yield f1
    f1, f2 = f2, f1 + f2

print(sum(filter(lambda n: n % 2 == 0, fib(4000000))))

To cOmpute the n-th fibonacci number, you can use the Binet formula!

*/