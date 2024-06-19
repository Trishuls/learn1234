package _2024;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        //How many male and female employees are there in the organization?
        Map<String, Long> res1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(res1);

        //Print the name of all departments in the organization?
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        //What is the average age of male and female employees?
        Map<String, Double> res2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(res2);

        //Get the details of highest paid employee in the organization?
        Optional<Employee> res3 = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(res3.get());

        //Get the names of all employees who have joined after 2015?
        employeeList.stream().filter(s -> s.getYearOfJoining() > 2015).map(Employee::getName).distinct().forEach(System.out::println);

        //Count the number of employees in each department?
        Map<String, Long> res4 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.counting()));
        System.out.println(res4);

        //What is the average salary of each department?
        Map<String, Double> res5 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(res5);

        //Get the details of youngest male employee in the product development department?
        Optional<Employee> res6 =
                employeeList.stream().filter(s -> s.getGender().equals("Male") && s.getDepartment().equals("Product " +
                        "Development")).min(Comparator.comparing(Employee::getAge));
        System.out.println(res6.get());

        //Who has the most working experience in the organization?
        Optional<Employee> res7 = employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
        System.out.println(res7);

        // What is the average salary of male and female employees?
        Map<String, Double> res8 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
                Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(res8);

        //List down the names of all employees in each department?
        Map<String, List<Employee>> res = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(res);

        //What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics res9 = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("avg = "+res9.getAverage()+" total = "+res9.getSum());

        //Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        Map<Boolean, List<Employee>> res10 = employeeList.stream().collect(Collectors.partitioningBy(s -> s.getAge() > 25));
        for (Map.Entry<Boolean, List<Employee>> entry : res10.entrySet()) {
            if (entry.getKey()) System.out.println("greater than 25 = "+entry.getValue());
            else System.out.println("lesser that 25 = "+entry.getValue());

            //Who is the oldest employee in the organization? What is his age and which department he belongs to?
            System.out.println(employeeList.stream().max(Comparator.comparingInt(Employee::getAge)));
        }
        List<Integer> list = Arrays.asList(1,2,2,3,3,4,5,6,6,7,8);
        Set<Integer> set = new HashSet<>();
        System.out.println("---------------------------> ");
        list.stream().filter(s -> !set.add(s)).forEach(System.out::println);
        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).values().stream().filter(s->s==1).forEach(System.out::print);

        String str = "aababbdgjskjhsgtyud";
        Map<Character, Long> resStrCnt =
                str.chars().mapToObj(c -> (char) Character.toLowerCase(c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(resStrCnt);
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println(decimalList.stream().mapToDouble(Double::doubleValue).sum());
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println(listOfIntegers.stream().max(Comparator.naturalOrder()).get());
        System.out.println(listOfIntegers.stream().reduce(0, Integer::sum));
        List<Integer> listOfIntegers1 = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> resVal = listOfIntegers1.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        listOfIntegers1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        System.out.println(listOfStrings.stream().collect(Collectors.joining(",","{","}")));

        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5, 5};

        int[] ab = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(ab));

        // merge 2 unsorted arrays to sorted array with distinct elements
        System.out.println(Arrays.toString(IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray()));

        //3  max and min number from list
        List<Integer> listOfIntegers12 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers12.stream().sorted(Comparator.naturalOrder()).limit(3).forEach(System.out::println);
        listOfIntegers12.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        //Java 8 program to check if two strings are anagrams or not?
        String s1 = "RaceCar";
        String s2 = "CarRace";
        String sres1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String sres2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if (sres1.equals(sres2)) System.out.println("Strings are anagram");
        else System.out.println("not anagram");

        // Find sum of all digits of a number in Java 8?
        int i = 15623;
        System.out.println((Integer) Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum());

        //Find second largest number in an integer array?
        List<Integer> secondLargest = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println(secondLargest.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

        //Given a list of strings, sort them according to increasing order of their length?
        List<String> listOfStrings2 = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings2.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

        //Given an integer array, find sum and average of all elements?
        int[] a1 = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        System.out.println(Arrays.stream(a1).sum());
        System.out.println(Arrays.stream(a1).average());

        //Given an integer list, find sum and average of all elements?
        List<Integer> iL = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println(iL.stream().mapToInt(Integer::intValue).sum());
        System.out.println(iL.stream().mapToInt(Integer::intValue).average());

        //How do you find common elements between two arrays?
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        list1.stream().filter(list2::contains).forEach(System.out::println);

        //Reverse each word of a string using Java 8 streams?
        String str21 = "Java Concept Of The Day";
        System.out.println("----------> "+Stream.of(str21.split(" ")).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" ")));
        String vaal = Arrays.stream(str21.split(" ")).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(vaal);

        //Given an integer array, find sum and average of all elements?
        int[] a11 = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        System.out.println(IntStream.of(a11).sum());
        System.out.println(IntStream.of(a11).average());

        //How do you find sum of first 10 natural numbers?
        System.out.println(IntStream.rangeClosed(1,10).sum());

        //Reverse an integer array
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        IntStream.rangeClosed(1,array.length).map(i1 -> array[array.length-i1]).forEach(System.out::println);

        //Print first 10 even numbers
        IntStream.rangeClosed(1,10).map(i2->i2*2).forEach(System.out::println);

        //Given a list of strings, find out those strings which start with a number?
        List<String> listOfStrings21 = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        listOfStrings21.stream().filter(s ->Character.isDigit(s.charAt(0))).toList().forEach(System.out::println);

        String reverse = "reverse";
        reverse.chars().mapToObj(c -> (char) Character.toLowerCase(c)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
