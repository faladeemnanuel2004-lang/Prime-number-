public class PrimeNumbers {
        public static void main(String[] args) {

                int sum = 0;

                        for (int num = 2; num <= 500; num++) {
                                    int count = 0;

                                                for (int i = 1; i <= num; i++) {
                                                                if (num % i == 0) {
                                                                                    count++;
                                                                                                    }
                                                                                                                }

                                                                                                                            if (count == 2) {
                                                                                                                                            System.out.println(num);
                                                                                                                                                            sum += num;
                                                                                                                                                                        }
                                                                                                                                                                                }

                                                                                                                                                                                        System.out.println("Sum of prime numbers from 1 to 500 = " + sum);
                                                                                                                                                                                            }
                                                                                                                                                                                            }
}