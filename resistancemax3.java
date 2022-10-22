package com.example.practicecodescourse;
import java.util.Scanner;

public class resistancemax3 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("                      \uD83D\uDE4F WELCOME  \uD83D\uDE4F");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("              EQUIVALENT RESISTOR CALCULATOR "); // main heading
        System.out.println("----------------------------------------------------------------------");

// --------------------------------------------------------------------------------------------------------------------------------------------------------------


        Scanner permit = new Scanner(System.in);
        System.out.println("                    * INSTRUCTIONS         ");
        System.out.println("• IT IS PROGRAMMED TO CALCULATE ONLY MAXIMUM 6 RESISTOR");
        System.out.println("• TOTAL NUMBER OF RESISTANCE SHOULD NOT EXCEED 6 ");
        System.out.println("----------------------------------------------------------------------");


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


        System.out.print("TOTAL NUMBER OF RESISTANCE  = ");
        int CT = permit.nextInt();
        System.out.println("----------------------------------------------------------------------");


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


        if (CT == 1) {
            System.out.print("ENTER VALUE OF RESISTOR = ");
            float c11 = permit.nextFloat();
            System.out.println("----------------------------------------------------------------------");
            System.out.println("• EQUIVALENT RESISTANCE = " + c11);
        }


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


        if (CT == 2) {
            System.out.print("ENTER VALUE OF 1ST RESISTOR = ");
            float c21 = permit.nextFloat();
            System.out.print("ENTER VALUE OF 2ND RESISTOR = ");
            float c22 = permit.nextFloat();
            System.out.print("----------------------------------------------------------------------");
            System.out.println(

            );
            System.out.print("NUMBER OF PACKET OF SERIES = ");
            int cs2 = permit.nextInt();// combination in parallel = sp2
            System.out.print("NUMBER OF PACKET OF PARALLEL = ");
            int cp2 = permit.nextInt();// combination in series = cs2
            System.out.println("----------------------------------------------------------------------");

// --------------------------------------------------------------------------------------------------------------------------------------------------------------

            if (cs2 == 2 && cp2 == 0) {
                float sum = c21 + c22;

                System.out.println("•EQUIVALENT RESISTANCE = " + sum);
            }

            if (cp2 == 1 && cs2 == 0) {
                float sump2 = (c21 * c22) / (c21 + c22);
                System.out.println("• EQUIVALENT RESISTANCE = " + sump2);
            }
        }
// --------------------------------------------------------------------------------------------------------------------------------------------------------------


//-------------------------------------------NEW START FOR MAXIMUM 3---------------------------------------------------------------------------------------------------------------
        if (CT == 3) {
            System.out.print("NUMBER OF BRANCHES OF MAIN WIRE = ");
            int no_of_branches = permit.nextInt();
            System.out.println("----------------------------------------------------------------------");


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


            if (no_of_branches == 1) {
                System.out.println("• LET THE MAIN BRANCH :-");
                System.out.println("• BRANCH-A");
                System.out.println("----------------------------------------------------------------------");

// --------------------------------------------------------------------------------------------------------------------------------------------------------------
                System.out.print("TOTAL NUMBER OF PARALLEL PACKET IN BRANCH-A = ");
                int no_of_parallel_packet_in_A = permit.nextInt();
                System.out.print("TOTAL NUMBER OF SERIES PACKET IN BRANCH-A = ");
                int no_of_series_packet_in_A = permit.nextInt();
                System.out.println("----------------------------------------------------------------------");


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                if (no_of_series_packet_in_A == 1 && no_of_parallel_packet_in_A == 1) {


                    System.out.print("VALUE OF 1ST RESISTOR IN PARALLEL IN BRANCH-A = ");
                    float v_of_1st_in_parallel_in_branch_A = permit.nextFloat();
                    System.out.print("VALUE OF 2ND RESISTOR IN PARALLEL IN BRANCH-A = ");
                    float v_of_2st_in_parallel_in_branch_A = permit.nextFloat();


                    System.out.print("VALUE OF 1 ST RESISTOR IN SERIES IN BRANCH-A = ");
                    float v_of_1st_in_series_in_branch_A = permit.nextFloat();

                    float parallelkacaculation = (v_of_1st_in_parallel_in_branch_A * v_of_2st_in_parallel_in_branch_A) / (v_of_1st_in_parallel_in_branch_A + v_of_2st_in_parallel_in_branch_A);

                    float result = parallelkacaculation + v_of_1st_in_series_in_branch_A;
                    System.out.print("• EQUIVALENT RESISTANCE = ");
                    System.out.println(result);
                    System.out.println("----------------------------------------------------------------------");
                }


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                if (no_of_series_packet_in_A == 3 && no_of_parallel_packet_in_A == 0) {
                    System.out.print("VALUE OF 1ST RESISTOR IN SERIES = ");
                    float value_of_1st_resistor_in_series_only = permit.nextFloat();
                    System.out.print("VALUE OF 2ST RESISTOR IN SERIES = ");
                    float value_of_2st_resistor_in_series_only = permit.nextFloat();
                    System.out.print("VALUE OF 3ST RESISTOR IN SERIES = ");
                    float value_of_3st_resistor_in_series_only = permit.nextFloat();

                    float result2 = value_of_1st_resistor_in_series_only + value_of_2st_resistor_in_series_only + value_of_3st_resistor_in_series_only;
                    System.out.println("----------------------------------------------------------------------");

                    System.out.print("• EQUIVALENT RESISTANCE = ");
                    System.out.println(result2);
                }
            }


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


// ---------------------------------------------------------------------THE END-------------------------------------------------------------------------------------


// ---------------------------------------------------------------------THE END-------------------------------------------------------------------------------------
// BRANCH - 2, 3

            if (no_of_branches == 3) {
                System.out.println("• LET THE THREE BRANCHS OF WIRE BE :-");
                System.out.println(" • BRANCH-A");
                System.out.println(" • BRANCH-B");
                System.out.println(" • BRANCH-C");
                System.out.println("----------------------------------------------------------------------");


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                System.out.print("VALUE OF RESISTOR IN BRANCH-A = ");
                float value_of_resistor_in_branch_A_3 = permit.nextFloat();
                System.out.print("VALUE OF RESISTOR IN BRANCH-B = ");
                float value_of_resistor_in_branch_B_3 = permit.nextFloat();
                System.out.print("VALUE OF RESISTOR IN BRANCH-C = ");
                float value_of_resistor_in_branch_c_3 = permit.nextFloat();
                System.out.println("----------------------------------------------------------------------");

// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                float sum_of_all_3_resistor_when_no_of_branch_3 = (value_of_resistor_in_branch_A_3 * value_of_resistor_in_branch_c_3 * value_of_resistor_in_branch_B_3) / (value_of_resistor_in_branch_B_3 * value_of_resistor_in_branch_c_3 + value_of_resistor_in_branch_A_3 * value_of_resistor_in_branch_c_3 + value_of_resistor_in_branch_A_3 * value_of_resistor_in_branch_B_3);
                float result3 = sum_of_all_3_resistor_when_no_of_branch_3;
                System.out.print("• EQUIVALENT RESISTOR = ");
                System.out.println(result3);
                System.out.println("----------------------------------------------------------------------");
            }
            if (no_of_branches == 2) {
                System.out.println("• LET THE TWO BRANCHS OF WIRE BE :-");
                System.out.println(" • BRANCH-A");
                System.out.println(" • BRANCH-B");

// --------------------------------------------------------------------------------------------------------------------------------------------------------------

                System.out.println("----------------------------------------------------------------------");
                System.out.println("                              BRANCH-A");
                System.out.println("----------------------------------------------------------------------");
                System.out.print("NUMBER OF PARALLEL PACKET IN BRANCH-A = ");
                int no_of_parallel_packet_in_branch_A_2 = permit.nextInt();
                System.out.print("NUMBER OF SERIES PACKET IN BRANCH-A = ");
                int no_of_series_packet_in_branch_A_2 = permit.nextInt();
                System.out.println("----------------------------------------------------------------------");
                System.out.println("                              BRANCH-B");
                System.out.println("----------------------------------------------------------------------");
                System.out.print("NUMBER OF PARALLEL PACKET IN BRANCH-B = ");
                int no_of_parallel_packet_in_branch_B_2 = permit.nextInt();
                System.out.print("NUMBER OF SERIES PACKET IN BRANCH-B = ");
                int no_of_series_packet_in_branch_B_2 = permit.nextInt();


                // --------------------------------------------------------------------------------------------------------------------------------------------------------------


                if (no_of_series_packet_in_branch_A_2 == 1 && no_of_series_packet_in_branch_B_2 == 2 && no_of_parallel_packet_in_branch_A_2 == 0 && no_of_parallel_packet_in_branch_B_2 == 0) {
                    System.out.println("----------------------------------------------------------------------");
                    System.out.print("ENTER VALUE OF RESISTOR IN BRANCH-A = ");
                    float only_resistor_in_branch_A_2ND_ka_C_1 = permit.nextFloat();
                    System.out.print("ENTER VALUE OF 1ST  RESISTOR IN BRANCH-B = ");
                    float resistor_in_branch_B_paralleL_ka_1st_2ND_ka_C_1 = permit.nextFloat();
                    System.out.print("ENTER VALUE OF 2ND RESISTOR IN BRANCH -B = ");
                    float resistor_in_branch_B_paralleL_ka_2st_2ND_ka_C_1 = permit.nextFloat();


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                    float sum_branch_2_case_1 = resistor_in_branch_B_paralleL_ka_1st_2ND_ka_C_1 + resistor_in_branch_B_paralleL_ka_2st_2ND_ka_C_1;

                    float result3 = (sum_branch_2_case_1 * only_resistor_in_branch_A_2ND_ka_C_1) / (sum_branch_2_case_1 + only_resistor_in_branch_A_2ND_ka_C_1);
                    System.out.println("----------------------------------------------------------------------");
                    System.out.print("• EQUIVALENT RESISTANCE = ");
                    System.out.println(result3);


                }
            }
        }
    }
}

// -----------------------------------------------------------------THE END FOR MAX 3 RESISTOR---------------------------------------------------------------------------------------------

