package day11_Switch;

public class NestedIfPractice {
    public static void main(String[] args) {
        String batchType = "US morning";
        boolean isValid = batchType =="US morning" || batchType =="US evening" || batchType =="EU";
        String result ="";

        if(isValid){
            if (batchType == "US morning"){
                result  ="Class times are 10-5 EST. M, T, Th, F";
            }else if (batchType == "US evening"){
                result = "Class times are 7-10 EST. M, T, W, Th";
            }else {
                result = "Class times are  10-5 EST. M, T, W, Th, F";
            }
        }else{
            result = "Invalide Batch";
        }
        System.out.println("result = " + result);
    }
}
/*
4. In Cybertek we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.
        First figure out is is a US batch or EU batch
            - for US batches:
                > Figure out is it a morning batch or evening batch
                    > morning - print: Class times are 10-5 EST. M, T, Th, F.
                    > evening - print: Class times are 7-10 EST. M, T, W, Th, S, S
            - for EU batches:
                > print: Class times are  10-5 EST. M, T, W, Th, F.
              If Batch type is not EU or US, print Invalid Batch
                NOTE: MUST APPLY NESTED IF
 */