package Task1;

public class Task1 {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        worker1.name = "Erik";
        worker2.name = "Erika";
        int resultOfWorker1 = worker1.earnMoney();
        int resultOfWorker2 = worker2.earnMoney();
        System.out.println(worker1.name + " заробив(ла): " + resultOfWorker1 + " грошей," +
                "а " + worker2.name + " заробив(ла) " + resultOfWorker2 + " грошей.\nЗагальна сума грошей - " +
                (resultOfWorker1 + resultOfWorker2));
    }
}
