public class PhonepeAPI {
    public String createTransaction(String orderId){
        Console.WriteLine("PhonePe API: Creating transaction for " + orderId + "...");
        return "PP" + DateTime.Now.Ticks;
    }

    public int fetchStatus(String transactionId){
        Console.WriteLine("PhonePe API: Checking status for " + transactionId);
        return 200;
    }
}
