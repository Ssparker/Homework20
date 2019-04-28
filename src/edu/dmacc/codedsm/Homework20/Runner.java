package edu.dmacc.codedsm.Homework20;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Runner {


       public static void main(String[] args) { // Strings
        //map
              List <String> zooAnimals = Arrays.asList("Dog","Cat", "Bird", "Monkey", "Donkey");
                 List<Integer> eachLength = zooAnimals.stream()
                         .map(i -> i.length())
                         .collect(Collectors.toList());
                 System.out.println(eachLength);

       //flatlist
              List<Character> flattenedList = (List<Character>) zooAnimals.stream()
                     .flatMap(x -> x.chars().mapToObj(y -> (char) y))
                     .collect(Collectors.toList());
                 System.out.println("Flattened List: " +flattenedList);

       //filter

       List<String> beginsWithD = zooAnimals.stream()
                    .filter(x -> x.startsWith("D"))
                    .collect(Collectors.toList());
           System.out.println(beginsWithD);


        //reduce

       int sum = zooAnimals.stream()
                    .map(String::length)
                    .reduce (0, (x1, x2) -> x1 + x2);
        System.out.println("sum =" + sum);
    }

   }

//Use the correct higher order function on the provided list of strings to derive the following values
//Provided list: Arrays.asList(“Dog”, “Cat”, “Bird”, “Monkey”, “Donkey”);
//A list of integers that is the length of each individual string
//A list that is all of the characters from all of the strings flattened into one list
//A list of the strings that start with “D”
//An integer that is the sum of all of the lengths of each individual string
//Hint: Use the following function to help you convert a string to a stream
//"string value".chars().mapToObj(x -> String.valueOf((char) x));

//map(Function<T, R> f)
//flatMap(Function<T, Stream<R>> f)
//filter(Predicate<T> f)
//reduce(BiFunction<T, U, R> f)
