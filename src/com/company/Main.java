package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        round();
    }
    public static void round()
    {
        System.out.println("Список A: ");
        ArrayList<Name> arrA;
        arrA = ListAandB();
        System.out.println("Список A создан!");
        print(arrA);

        System.out.println("Список Б: ");
        ArrayList<Name> arrB;
        arrB = ListAandB();
        System.out.println("Список Б создан!");
        print(arrB);


        Collections.sort(arrA);
        Collections.sort(arrB);
        Collections.reverse(arrB);


        ArrayList<Name> arrC;
        arrC = CreateListC(arrA, arrB);
        System.out.println("Список С создан!");
        print(arrC);

        sortLength(arrC);
        System.out.println("Список C отсортирован по длине слова(сначало наименьшие)!");
        System.out.println("Список С: ");
        print(arrC);

    }
    public static void sortLength(ArrayList<Name> arrC)
    {
        List<String> stringList = new ArrayList<String>();
        Comparator<Name> stringLengthComparator = new Comparator<Name>()
        {
            @Override
            public int compare(Name o1, Name o2) {
                return Integer.compare(o1.getName().length(),o2.getName().length());
            }
        };

        Collections.sort(arrC, stringLengthComparator);
    }
    public static ArrayList<Name> CreateListC(ArrayList<Name> arrA, ArrayList<Name> arrB)
    {
        ArrayList<Name> listC = new ArrayList<>();
        Iterator<Name> iterator1 = arrA.iterator();
        Iterator<Name> iterator2 = arrB.iterator();
        while (iterator2.hasNext())
        {
            Name nameA = iterator1.next();
            Name nameB = iterator2.next();
//            System.out.println(nameA.getName());
//            System.out.println(nameB.getName());
            listC.add(new Name(nameA.getName()));
            listC.add(new Name(nameB.getName()));
        }
        return listC;
    }
    public static void print(ArrayList<Name> arr)
    {
        int i = 0;
        Iterator<Name> iterator = arr.iterator();
        while (iterator.hasNext())
        {
            i++;
            Name name = iterator.next();
            System.out.println("№ " + i + " " + name.getName());
        }
    }
    public static ArrayList<Name> ListAandB()
    {
        int f = 0;
        String variableString;
        ArrayList<Name> arrAandB = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (f < 5) {
            System.out.print("№ " + (f+1) + " Input: ");
            variableString = in.next();



            //  if (variableString.equals("0") || f > 5){break;}

            arrAandB.add(new Name(variableString));
            f++;
        }
        return arrAandB;
    }
}
