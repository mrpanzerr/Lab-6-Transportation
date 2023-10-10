import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SalesCommissions {
    /**
     * This method returns the total salaries for every salesperson
     * @param gross; an array of int objects
     * @return salary; an array of int objects representing salaries
     **/
    public static int[] getTotal(int [] gross) {
        int [] salary = new int[gross.length];
        for (int i = 0; i < gross.length; i++) {
            float temp = gross[i];
            temp *= 1.09F;
            salary[i] = (int) temp;
        }
        return salary;
    }

    /**
     * This method returns the distribution of salaries
     * @param salary: an array of int objects
     * @return ranges: the distribution of salaries
     **/
    public static int[] getRanges(int [] salary) {
        // Initialize array to hold distribution of salaries
        // and fill them all with 0
        int[] ranges = new int[9];
        Arrays.fill(ranges, 0);

        // Put salaries into corresponding range
        for (int j : salary) {
            if (j >= 1000) {
                ranges[8] += 1;
            }
            if (j >= 900 && j <= 999) {
                ranges[7] += 1;
            }
            if (j >= 800 && j <= 899) {
                ranges[6] += 1;
            }
            if (j >= 700 && j <= 799) {
                ranges[5] += 1;
            }
            if (j >= 600 && j <= 699) {
                ranges[4] += 1;
            }
            if (j >= 500 && j <= 599) {
                ranges[3] += 1;
            }
            if (j >= 400 && j <= 499) {
                ranges[2] += 1;
            }
            if (j >= 300 && j <= 399) {
                ranges[1] += 1;
            }
            if (j >= 200 && j <= 299) {
                ranges[0] += 1;
            }
        }
        return ranges;
    }

    /**
     * This method displays the distribution of salaries
     * @param ranges: an array of int objects representing the distribution of salaries
     **/
    public static void displayRanges(int [] ranges) {
        // Display range amounts
        System.out.printf("%19s%15s%15s%15s%15s%15s%15s%15s%15s%n", "$200-$299", "$300-$399",
                "$400-$499", "$500-$599", "$600-$699", "$700-$799", "$800-$899",
                "$900-$999", "\t$1,000 and over");

        // Display distribution of ranges
        for (int range : ranges) {
            System.out.printf("%15d", range);
        }
    }


    public static void main(String[] args) {
        // salespeople get 200 per week
        // + 9% of their gross sales
        // 5000 in sales = 200 + 9% of 5000

        // Write values to test problem with
        int[] gross = new int [] {200, 300, 500, 1000, 1250,
                            900, 400, 484, 299, 850, 575};
        
        // Get total salaries
        int[] salary = getTotal(gross);

        // Get distribution of salaries
        int[] ranges = getRanges(salary);

        // Display distribution of salaries
        displayRanges(ranges);
        }
    }