public class GPayAPI {
    public String startPayment(String orderId){
        Console.WriteLine("Google Pay API: Starting payment for " + orderId + "...");
        return "GPAY" + DateTime.Now.Ticks;
    }

    public String fetchStatus(String transactionId){
        return "SUCCESS";
    }
}
