public class prog10 {
    public static void main(String args[]) {
        int sub1 =Integer.parseInt(args[0]);
        int sub2 = Integer.parseInt(args[1]);
        int sub3 = Integer.parseInt(args[2]);
        int sub4 = Integer.parseInt(args[3]);
        int sem = Integer.parseInt(args[4]);
        int roll = Integer.parseInt(args[5]);
        String fnm="Anshu Joshi", strm="BCA";

        int sum = sub1 + sub2 + sub3 + sub4;
        float avrg = (float)sum / 4;
        float per = (float)sum / 400 * 100;

        System.out.println("\t\t\t+----------------Student Marksheet----------------");
        System.out.println("\t\t\tStudent Name: "+fnm+"\tRoll No.: "+roll);
        System.out.println("\t\t\tSemester: "+sem+"\t\t\tStream: "+strm);
        System.out.println("\t\t\tCollege: Geetanjali College of Computer Science "+"\n\t\t\tand Commerce (BBA), Rajkot-Gujarat\n");

        System.out.println("\t\t\tSubject-wise Marks: \tSubject-wise Grade: \n");

        
        if (sub1>=70){System.out.println("\t\t\tSubject 1: "+sub1+"\t\t\tA+");}
        else if(sub1>=60){System.out.println("\t\t\tSubject 1: "+sub1+"\t\t\tA");}
        else if(sub1>=50){System.out.println("\t\t\tSubject 1: "+sub1+"\t\t\tB");}
        else if(sub1>=40){System.out.println("\t\t\tSubject 1: "+sub1+"\t\t\tC");}
        else if(sub1>=30){System.out.println("\t\t\tSubject 1: "+sub1+"\t\t\tD");}
        else if(sub1>=20){System.out.println("\t\t\tSubject 1: "+sub1+"\t\t\tE");}
        else{System.out.println("\t\t\tSubject 1: "+sub1+"\t\tF");}

        if (sub2>=70){System.out.println("\t\t\tSubject 2: "+sub2+"\t\t\tA+");}
        else if(sub2>=60){System.out.println("\t\t\tSubject 2: "+sub2+"\t\t\tA");}
        else if(sub2>=50){System.out.println("\t\t\tSubject 2: "+sub2+"\t\t\tB");}
        else if(sub2>=40){System.out.println("\t\t\tSubject 2: "+sub2+"\t\t\tC");}
        else if(sub2>=30){System.out.println("\t\t\tSubject 2: "+sub2+"\t\t\tD");}
        else if(sub2>=20){System.out.println("\t\t\tSubject 2: "+sub2+"\t\t\tE");}
        else{System.out.println("\t\t\tSubject 2: "+sub2+"\t\tF");}

        if (sub3>=70){System.out.println("\t\t\tSubject 3: "+sub3+"\t\t\tA+");}
        else if(sub3>=60){System.out.println("\t\t\tSubject 3: "+sub3+"\t\t\tA");}
        else if(sub3>=50){System.out.println("\t\t\tSubject 3: "+sub3+"\t\t\tB");}
        else if(sub3>=40){System.out.println("\t\t\tSubject 3: "+sub3+"\t\t\tC");}
        else if(sub3>=30){System.out.println("\t\t\tSubject 3: "+sub3+"\t\t\tD");}
        else if(sub3>=20){System.out.println("\t\t\tSubject 3: "+sub3+"\t\t\tE");}
        else{System.out.println("\t\t\tSubject 3: "+sub3+"\t\tF");}

        if (sub4>=70){System.out.println("\t\t\tSubject 4: "+sub4+"\t\t\tA+");}
        else if(sub4>=60){System.out.println("\t\t\tSubject 4: "+sub4+"\t\t\tA");}
        else if(sub4>=50){System.out.println("\t\t\tSubject 4: "+sub4+"\t\t\tB");}
        else if(sub4>=40){System.out.println("\t\t\tSubject 4: "+sub4+"\t\t\tC");}
        else if(sub4>=30){System.out.println("\t\t\tSubject 4: "+sub4+"\t\t\tD");}
        else if(sub4>=20){System.out.println("\t\t\tSubject 4: "+sub4+"\t\t\tE");}
        else{System.out.println("\t\t\tSubject 4: "+sub4+"\t\tF");}
        
        System.out.println("\n\t\t\tTotal Marks: "+sum);
        System.out.println("\t\t\tAverage: "+avrg);
        System.out.println("\t\t\tPercentage: "+per);

        if (per>=70){
            System.out.println("\t\t\tOverall Grade: A+");
            System.out.println("\n\t\t\t\tYoo Hoo! You passed with an A+");
        }
        else if(per>=60){
            System.out.println("\t\t\tOverall Grade: A");
            System.out.println("\n\t\t\t\tAwesome! You passed with an A");
        }
        else if(per>=50){
            System.out.println("\t\t\tOverall Grade: B");
            System.out.println("\n\t\t\t\tFabulous! You passed with an B");
        }
        else if(per>=40){
            System.out.println("\t\t\tOverall Grade: C");
            System.out.println("\n\t\t\t\tVery Good! You passed with an C");
        }
        else if(per>=30){
            System.out.println("\t\t\tOverall Grade: D");
            System.out.println("\n\t\t\t\tGreat! You passed with an D");
        }
        else if(per>=20){
            System.out.println("\t\t\tOverall Grade: E");
            System.out.println("\n\t\t\t\tOkay! You passed with an E");
        }   
        else{
            System.out.println("\t\t\tOverall Grade: F");
            System.out.println("\n\t\t\t\tRuh Oh! You failed with an F");
        }
    }
}